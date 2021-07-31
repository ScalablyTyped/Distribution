package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1.CreateVersionRequest.
  */
trait SchemaCreateVersionMetadataV1 extends StObject {
  
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.undefined
}
object SchemaCreateVersionMetadataV1 {
  
  @scala.inline
  def apply(): SchemaCreateVersionMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1]
  }
  
  @scala.inline
  implicit class SchemaCreateVersionMetadataV1MutableBuilder[Self <: SchemaCreateVersionMetadataV1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
