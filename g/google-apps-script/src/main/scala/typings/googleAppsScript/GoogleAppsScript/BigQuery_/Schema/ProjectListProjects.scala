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
  
  @scala.inline
  def apply(): ProjectListProjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectListProjects]
  }
  
  @scala.inline
  implicit class ProjectListProjectsMutableBuilder[Self <: ProjectListProjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumericId(value: String): Self = StObject.set(x, "numericId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericIdUndefined: Self = StObject.set(x, "numericId", js.undefined)
    
    @scala.inline
    def setProjectReference(value: ProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
  }
}
