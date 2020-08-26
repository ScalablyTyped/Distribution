package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a App Engine backend.
  */
@js.native
trait SchemaBackendServiceAppEngineBackend extends js.Object {
  /**
    * Optional. App Engine app service name.
    */
  var appEngineService: js.UndefOr[String] = js.native
  /**
    * Required. Project ID of the project hosting the app. This is the project
    * ID of this project. Reference to another project is not allowed.
    */
  var targetProject: js.UndefOr[String] = js.native
  /**
    * Optional. Version of App Engine app service. When empty, App Engine will
    * do its normal traffic split.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaBackendServiceAppEngineBackend {
  @scala.inline
  def apply(): SchemaBackendServiceAppEngineBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceAppEngineBackend]
  }
  @scala.inline
  implicit class SchemaBackendServiceAppEngineBackendOps[Self <: SchemaBackendServiceAppEngineBackend] (val x: Self) extends AnyVal {
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
    def setAppEngineService(value: String): Self = this.set("appEngineService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineService: Self = this.set("appEngineService", js.undefined)
    @scala.inline
    def setTargetProject(value: String): Self = this.set("targetProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetProject: Self = this.set("targetProject", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

