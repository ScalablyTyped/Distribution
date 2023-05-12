package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Objects extends StObject {
  
  var objects: js.Array[Object]
  
  var version: String
}
object Objects {
  
  inline def apply(objects: js.Array[Object], version: String): Objects = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Objects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Objects] (val x: Self) extends AnyVal {
    
    inline def setObjects(value: js.Array[Object]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Object*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
