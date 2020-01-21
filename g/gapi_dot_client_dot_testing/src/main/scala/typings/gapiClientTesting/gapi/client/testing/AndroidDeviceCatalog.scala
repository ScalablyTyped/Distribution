package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidDeviceCatalog extends js.Object {
  /**
    * The set of supported Android device models.
    * @OutputOnly
    */
  var models: js.UndefOr[js.Array[AndroidModel]] = js.undefined
  /**
    * The set of supported runtime configurations.
    * @OutputOnly
    */
  var runtimeConfiguration: js.UndefOr[AndroidRuntimeConfiguration] = js.undefined
  /**
    * The set of supported Android OS versions.
    * @OutputOnly
    */
  var versions: js.UndefOr[js.Array[AndroidVersion]] = js.undefined
}

object AndroidDeviceCatalog {
  @scala.inline
  def apply(
    models: js.Array[AndroidModel] = null,
    runtimeConfiguration: AndroidRuntimeConfiguration = null,
    versions: js.Array[AndroidVersion] = null
  ): AndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidDeviceCatalog]
  }
}

