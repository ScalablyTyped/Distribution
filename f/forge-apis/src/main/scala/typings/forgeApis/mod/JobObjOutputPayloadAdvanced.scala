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
  
  @scala.inline
  def apply(): JobObjOutputPayloadAdvanced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobObjOutputPayloadAdvanced]
  }
  
  @scala.inline
  implicit class JobObjOutputPayloadAdvancedMutableBuilder[Self <: JobObjOutputPayloadAdvanced] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFileStructure(value: String): Self = StObject.set(x, "exportFileStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFileStructureUndefined: Self = StObject.set(x, "exportFileStructure", js.undefined)
    
    @scala.inline
    def setModelGuid(value: String): Self = StObject.set(x, "modelGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelGuidUndefined: Self = StObject.set(x, "modelGuid", js.undefined)
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
  }
}
