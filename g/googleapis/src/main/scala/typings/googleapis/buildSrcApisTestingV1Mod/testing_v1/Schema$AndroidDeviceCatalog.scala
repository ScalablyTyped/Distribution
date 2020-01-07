package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently supported Android devices.
  */
@js.native
trait Schema$AndroidDeviceCatalog extends js.Object {
  /**
    * The set of supported Android device models.
    */
  var models: js.UndefOr[js.Array[Schema$AndroidModel]] = js.native
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[Schema$AndroidRuntimeConfiguration] = js.native
  /**
    * The set of supported Android OS versions.
    */
  var versions: js.UndefOr[js.Array[Schema$AndroidVersion]] = js.native
}

object Schema$AndroidDeviceCatalog {
  @scala.inline
  def apply(
    models: js.Array[Schema$AndroidModel] = null,
    runtimeConfiguration: Schema$AndroidRuntimeConfiguration = null,
    versions: js.Array[Schema$AndroidVersion] = null
  ): Schema$AndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidDeviceCatalog]
  }
}

