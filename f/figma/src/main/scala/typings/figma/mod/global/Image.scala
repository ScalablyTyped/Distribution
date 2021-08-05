package typings.figma.mod.global

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////////////////////
// Other
trait Image extends StObject {
  
  def getBytesAsync(): js.Promise[Uint8Array]
  
  val hash: String
}
object Image {
  
  inline def apply(getBytesAsync: () => js.Promise[Uint8Array], hash: String): Image = {
    val __obj = js.Dynamic.literal(getBytesAsync = js.Any.fromFunction0(getBytesAsync), hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setGetBytesAsync(value: () => js.Promise[Uint8Array]): Self = StObject.set(x, "getBytesAsync", js.Any.fromFunction0(value))
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
