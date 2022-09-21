package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSkaffoldVersion extends StObject {
  
  /**
    * Date when this version is expected to no longer be supported.
    */
  var supportEndDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Release version number. For example, "1.20.3".
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaSkaffoldVersion {
  
  inline def apply(): SchemaSkaffoldVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSkaffoldVersion]
  }
  
  extension [Self <: SchemaSkaffoldVersion](x: Self) {
    
    inline def setSupportEndDate(value: SchemaDate): Self = StObject.set(x, "supportEndDate", value.asInstanceOf[js.Any])
    
    inline def setSupportEndDateUndefined: Self = StObject.set(x, "supportEndDate", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
