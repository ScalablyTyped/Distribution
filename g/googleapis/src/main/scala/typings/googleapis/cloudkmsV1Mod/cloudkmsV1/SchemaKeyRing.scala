package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyRing extends StObject {
  
  /**
    * Output only. The time at which this KeyRing was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name for the KeyRing in the format `projects/x/locations/x/keyRings/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyRing {
  
  inline def apply(): SchemaKeyRing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRing]
  }
  
  extension [Self <: SchemaKeyRing](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
