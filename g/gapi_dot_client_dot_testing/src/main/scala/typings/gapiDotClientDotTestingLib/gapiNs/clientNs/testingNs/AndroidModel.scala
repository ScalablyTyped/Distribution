package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidModel extends js.Object {
  /**
    * The company that this device is branded with.
    * Example: "Google", "Samsung"
    * @OutputOnly
    */
  var brand: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the industrial design.
    * This corresponds to android.os.Build.DEVICE
    * @OutputOnly
    */
  var codename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this device is virtual or physical.
    * @OutputOnly
    */
  var form: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique opaque id for this model.
    * Use this for invoking the TestExecutionService.
    * @OutputOnly
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The manufacturer of this device.
    * @OutputOnly
    */
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The human-readable marketing name for this device model.
    * Examples: "Nexus 5", "Galaxy S5"
    * @OutputOnly
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Screen density in DPI.
    * This corresponds to ro.sf.lcd_density
    * @OutputOnly
    */
  var screenDensity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    * @OutputOnly
    */
  var screenX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    * @OutputOnly
    */
  var screenY: js.UndefOr[scala.Double] = js.undefined
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
  var supportedAbis: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The set of Android versions this device supports.
    * @OutputOnly
    */
  var supportedVersionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default", "preview", "deprecated"
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AndroidModel {
  @scala.inline
  def apply(
    brand: java.lang.String = null,
    codename: java.lang.String = null,
    form: java.lang.String = null,
    id: java.lang.String = null,
    manufacturer: java.lang.String = null,
    name: java.lang.String = null,
    screenDensity: scala.Int | scala.Double = null,
    screenX: scala.Int | scala.Double = null,
    screenY: scala.Int | scala.Double = null,
    supportedAbis: js.Array[java.lang.String] = null,
    supportedVersionIds: js.Array[java.lang.String] = null,
    tags: js.Array[java.lang.String] = null
  ): AndroidModel = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (codename != null) __obj.updateDynamic("codename")(codename)
    if (form != null) __obj.updateDynamic("form")(form)
    if (id != null) __obj.updateDynamic("id")(id)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (name != null) __obj.updateDynamic("name")(name)
    if (screenDensity != null) __obj.updateDynamic("screenDensity")(screenDensity.asInstanceOf[js.Any])
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (supportedAbis != null) __obj.updateDynamic("supportedAbis")(supportedAbis)
    if (supportedVersionIds != null) __obj.updateDynamic("supportedVersionIds")(supportedVersionIds)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[AndroidModel]
  }
}

