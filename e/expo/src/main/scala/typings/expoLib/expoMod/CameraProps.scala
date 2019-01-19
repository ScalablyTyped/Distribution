package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraProps
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  var autoFocus: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
  var barCodeTypes: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var faceDetectionClassifications: js.UndefOr[scala.Double] = js.undefined
  var faceDetectionLandmarks: js.UndefOr[scala.Double] = js.undefined
  var faceDetectionMode: js.UndefOr[scala.Double] = js.undefined
  var flashMode: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Distance to plane of sharpest focus. A value between `0` and `1`. `0`: infinity focus, `1`: focus as close as possible. Default: `0`. For Android this is available only for some devices and when `useCamera2Api` is set to `true`. */
  var focusDepth: js.UndefOr[scala.Double] = js.undefined
  var onBarCodeScanned: js.UndefOr[BarCodeScannedCallback] = js.undefined
  var onCameraReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFacesDetected: js.UndefOr[js.Function1[/* options */ expoLib.Anon_Faces, scala.Unit]] = js.undefined
  var onMountError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ratio: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.Ref[CameraObject]] = js.undefined
  var `type`: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var whiteBalance: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** A value between `0` and `1` being a percentage of device's max zoom. `0`: not zoomed, `1`: maximum zoom. Default: `0`. */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

