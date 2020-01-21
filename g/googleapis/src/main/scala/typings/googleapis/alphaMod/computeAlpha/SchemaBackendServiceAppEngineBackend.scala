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
  def apply(appEngineService: String = null, targetProject: String = null, version: String = null): SchemaBackendServiceAppEngineBackend = {
    val __obj = js.Dynamic.literal()
    if (appEngineService != null) __obj.updateDynamic("appEngineService")(appEngineService.asInstanceOf[js.Any])
    if (targetProject != null) __obj.updateDynamic("targetProject")(targetProject.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServiceAppEngineBackend]
  }
}

