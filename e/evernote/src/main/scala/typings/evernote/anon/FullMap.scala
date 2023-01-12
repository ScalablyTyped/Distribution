package typings.evernote.anon

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullMap extends StObject {
  
  var fullMap: js.UndefOr[Map[String, String]] = js.undefined
  
  var keysOnly: js.UndefOr[Set[String]] = js.undefined
}
object FullMap {
  
  inline def apply(): FullMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullMap] (val x: Self) extends AnyVal {
    
    inline def setFullMap(value: Map[String, String]): Self = StObject.set(x, "fullMap", value.asInstanceOf[js.Any])
    
    inline def setFullMapUndefined: Self = StObject.set(x, "fullMap", js.undefined)
    
    inline def setKeysOnly(value: Set[String]): Self = StObject.set(x, "keysOnly", value.asInstanceOf[js.Any])
    
    inline def setKeysOnlyUndefined: Self = StObject.set(x, "keysOnly", js.undefined)
  }
}
