package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagbindingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the TagBinding. This is a String of the form: `tagBindings/{id\}` (e.g. `tagBindings/%2F%2Fcloudresourcemanager.googleapis.com%2Fprojects%2F123/tagValues/456`).
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceTagbindingsDelete {
  
  inline def apply(): ParamsResourceTagbindingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagbindingsDelete]
  }
  
  extension [Self <: ParamsResourceTagbindingsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
