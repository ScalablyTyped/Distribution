package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectListProjects extends StObject {
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var numericId: js.UndefOr[String] = js.undefined
  
  var projectReference: js.UndefOr[ProjectReference] = js.undefined
}
object ProjectListProjects {
  
  inline def apply(): ProjectListProjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectListProjects]
  }
  
  extension [Self <: ProjectListProjects](x: Self) {
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNumericId(value: String): Self = StObject.set(x, "numericId", value.asInstanceOf[js.Any])
    
    inline def setNumericIdUndefined: Self = StObject.set(x, "numericId", js.undefined)
    
    inline def setProjectReference(value: ProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    inline def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
  }
}
