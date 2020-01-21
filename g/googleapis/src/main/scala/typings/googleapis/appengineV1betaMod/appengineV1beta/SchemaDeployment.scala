package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Code and application artifacts used to deploy a version to App Engine.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * Google Cloud Build build information. Only applicable for instances
    * running in the App Engine flexible environment.
    */
  var build: js.UndefOr[SchemaBuildInfo] = js.native
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
  def apply(
    build: SchemaBuildInfo = null,
    cloudBuildOptions: SchemaCloudBuildOptions = null,
    container: SchemaContainerInfo = null,
    files: StringDictionary[SchemaFileInfo] = null,
    zip: SchemaZipInfo = null
  ): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (cloudBuildOptions != null) __obj.updateDynamic("cloudBuildOptions")(cloudBuildOptions.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeployment]
  }
}

