package typings.googleapis.appengineV1Mod.appengineV1

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
  implicit class SchemaDeploymentOps[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloudBuildOptions(value: SchemaCloudBuildOptions): Self = this.set("cloudBuildOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudBuildOptions: Self = this.set("cloudBuildOptions", js.undefined)
    @scala.inline
    def setContainer(value: SchemaContainerInfo): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setFiles(value: StringDictionary[SchemaFileInfo]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setZip(value: SchemaZipInfo): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

