package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectReference extends StObject {
  
  /**
    * [Required] ID of the project. Can be either the numeric ID or the
    * assigned ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object SchemaProjectReference {
  
  inline def apply(): SchemaProjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectReference]
  }
  
  extension [Self <: SchemaProjectReference](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
