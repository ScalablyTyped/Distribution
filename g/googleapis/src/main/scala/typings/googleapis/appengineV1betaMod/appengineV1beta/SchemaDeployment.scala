package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeployment extends StObject {
  
  /**
    * Google Cloud Build build information. Only applicable for instances running in the App Engine flexible environment.
    */
  var build: js.UndefOr[SchemaBuildInfo] = js.undefined
  
  /**
    * Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine flexible environment using files or zip.
    */
  var cloudBuildOptions: js.UndefOr[SchemaCloudBuildOptions] = js.undefined
  
  /**
    * The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment.
    */
  var container: js.UndefOr[SchemaContainerInfo] = js.undefined
  
  /**
    * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
    */
  var files: js.UndefOr[StringDictionary[SchemaFileInfo] | Null] = js.undefined
  
  /**
    * The zip file for this deployment, if this is a zip deployment.
    */
  var zip: js.UndefOr[SchemaZipInfo] = js.undefined
}
object SchemaDeployment {
  
  inline def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  
  extension [Self <: SchemaDeployment](x: Self) {
    
    inline def setBuild(value: SchemaBuildInfo): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCloudBuildOptions(value: SchemaCloudBuildOptions): Self = StObject.set(x, "cloudBuildOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildOptionsUndefined: Self = StObject.set(x, "cloudBuildOptions", js.undefined)
    
    inline def setContainer(value: SchemaContainerInfo): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setFiles(value: StringDictionary[SchemaFileInfo]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesNull: Self = StObject.set(x, "files", null)
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setZip(value: SchemaZipInfo): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
