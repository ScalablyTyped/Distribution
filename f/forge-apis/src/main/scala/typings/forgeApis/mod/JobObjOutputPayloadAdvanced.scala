package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobObjOutputPayloadAdvanced extends StObject {
  
  var exportFileStructure: js.UndefOr[String] = js.undefined
  
  var modelGuid: js.UndefOr[String] = js.undefined
  
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object JobObjOutputPayloadAdvanced {
  
  inline def apply(): JobObjOutputPayloadAdvanced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobObjOutputPayloadAdvanced]
  }
  
  extension [Self <: JobObjOutputPayloadAdvanced](x: Self) {
    
    inline def setExportFileStructure(value: String): Self = StObject.set(x, "exportFileStructure", value.asInstanceOf[js.Any])
    
    inline def setExportFileStructureUndefined: Self = StObject.set(x, "exportFileStructure", js.undefined)
    
    inline def setModelGuid(value: String): Self = StObject.set(x, "modelGuid", value.asInstanceOf[js.Any])
    
    inline def setModelGuidUndefined: Self = StObject.set(x, "modelGuid", js.undefined)
    
    inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
  }
}
