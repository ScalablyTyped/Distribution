package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container to reference an id for any resource type. A `resource` in
  * Google Cloud Platform is a generic term for something you (a developer) may
  * want to interact with through one of our API&#39;s. Some examples are an
  * App Engine app, a Compute Engine instance, a Cloud SQL database, and so on.
  */
@js.native
trait SchemaResourceId extends StObject {
  
  /**
    * Required field for the type-specific id. This should correspond to the id
    * used in the type-specific API&#39;s.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Required field representing the resource type this id is for. At present,
    * the valid types are: &quot;organization&quot; and &quot;folder&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaResourceId {
  
  @scala.inline
  def apply(): SchemaResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceId]
  }
  
  @scala.inline
  implicit class SchemaResourceIdMutableBuilder[Self <: SchemaResourceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
