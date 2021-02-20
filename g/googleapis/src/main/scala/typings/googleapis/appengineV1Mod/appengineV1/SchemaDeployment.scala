package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Code and application artifacts used to deploy a version to App Engine.
  */
@js.native
trait SchemaDeployment extends StObject {
  
  /**
    * Options for any Google Cloud Build builds created as a part of this
    * deployment.These options will only be used if a new build is created,
    * such as when deploying to the App Engine flexible environment using files
    * or zip.
    */
  var cloudBuildOptions: js.UndefOr[SchemaCloudBuildOptions] = js.native
  
  /**
    * The Docker image for the container that runs the version. Only applicable
    * for instances running in the App Engine flexible environment.
    */
  var container: js.UndefOr[SchemaContainerInfo] = js.native
  
  /**
    * Manifest of the files stored in Google Cloud Storage that are included as
    * part of this version. All files must be readable using the credentials
    * supplied with this call.
    */
  var files: js.UndefOr[StringDictionary[SchemaFileInfo]] = js.native
  
  /**
    * The zip file for this deployment, if this is a zip deployment.
    */
  var zip: js.UndefOr[SchemaZipInfo] = js.native
}
object SchemaDeployment {
  
  @scala.inline
  def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  
  @scala.inline
  implicit class SchemaDeploymentMutableBuilder[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudBuildOptions(value: SchemaCloudBuildOptions): Self = StObject.set(x, "cloudBuildOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildOptionsUndefined: Self = StObject.set(x, "cloudBuildOptions", js.undefined)
    
    @scala.inline
    def setContainer(value: SchemaContainerInfo): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setFiles(value: StringDictionary[SchemaFileInfo]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setZip(value: SchemaZipInfo): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
