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

