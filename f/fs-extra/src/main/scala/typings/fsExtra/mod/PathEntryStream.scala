package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEntryStream extends StObject {
  
  def read(): PathEntry | Null
}
object PathEntryStream {
  
  inline def apply(read: () => PathEntry | Null): PathEntryStream = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[PathEntryStream]
  }
  
  extension [Self <: PathEntryStream](x: Self) {
    
    inline def setRead(value: () => PathEntry | Null): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}
