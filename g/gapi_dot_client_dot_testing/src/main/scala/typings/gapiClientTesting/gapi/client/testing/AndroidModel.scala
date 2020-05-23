package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidModel extends js.Object {
  /**
    * The company that this device is branded with.
    * Example: "Google", "Samsung"
    * @OutputOnly
    */
  var brand: js.UndefOr[String] = js.undefined
  /**
    * The name of the industrial design.
    * This corresponds to android.os.Build.DEVICE
    * @OutputOnly
    */
  var codename: js.UndefOr[String] = js.undefined
  /**
    * Whether this device is virtual or physical.
    * @OutputOnly
    */
  var form: js.UndefOr[String] = js.undefined
  /**
    * The unique opaque id for this model.
    * Use this for invoking the TestExecutionService.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The manufacturer of this device.
    * @OutputOnly
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  /**
    * The human-readable marketing name for this device model.
    * Examples: "Nexus 5", "Galaxy S5"
    * @OutputOnly
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Screen density in DPI.
    * This corresponds to ro.sf.lcd_density
    * @OutputOnly
    */
  var screenDensity: js.UndefOr[Double] = js.undefined
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    * @OutputOnly
    */
  var screenX: js.UndefOr[Double] = js.undefined
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    * @OutputOnly
    */
  var screenY: js.UndefOr[Double] = js.undefined
  /**
    * The list of supported ABIs for this device.
    * This corresponds to either android.os.Build.SUPPORTED_ABIS (for API level
    * 21 and above) or android.os.Build.CPU_ABI/CPU_ABI2.
    * The most preferred ABI is the first element in the list.
    *
    * Elements are optionally prefixed by "version_id:" (where version_id is
    * the id of an AndroidVersion), denoting an ABI that is supported only on
    * a particular version.
    * @OutputOnly
    */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The set of Android versions this device supports.
    * @OutputOnly
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default", "preview", "deprecated"
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object AndroidModel {
  @scala.inline
  def apply(
    brand: String = null,
    codename: String = null,
    form: String = null,
    id: String = null,
    manufacturer: String = null,
    name: String = null,
    screenDensity: js.UndefOr[Double] = js.undefined,
    screenX: js.UndefOr[Double] = js.undefined,
    screenY: js.UndefOr[Double] = js.undefined,
    supportedAbis: js.Array[String] = null,
    supportedVersionIds: js.Array[String] = null,
    tags: js.Array[String] = null
  ): AndroidModel = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(screenDensity)) __obj.updateDynamic("screenDensity")(screenDensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.get.asInstanceOf[js.Any])
    if (supportedAbis != null) __obj.updateDynamic("supportedAbis")(supportedAbis.asInstanceOf[js.Any])
    if (supportedVersionIds != null) __obj.updateDynamic("supportedVersionIds")(supportedVersionIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidModel]
  }
}

