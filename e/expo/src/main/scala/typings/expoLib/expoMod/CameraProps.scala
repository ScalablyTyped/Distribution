package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraProps
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  var autoFocus: js.UndefOr[java.lang.String | scala.Boolean | scala.Double] = js.undefined
  var barCodeScannerSettings: js.UndefOr[expoLib.Anon_BarCodeTypes] = js.undefined
  var faceDetectorSettings: js.UndefOr[expoLib.Anon_DetectLandmarks] = js.undefined
  var flashMode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Distance to plane of sharpest focus. A value between `0` and `1`. `0`: infinity focus, `1`: focus as close as possible. Default: `0`. For Android this is available only for some devices and when `useCamera2Api` is set to `true`. */
  var focusDepth: js.UndefOr[scala.Double] = js.undefined
  var onBarCodeScanned: js.UndefOr[BarCodeScannedCallback] = js.undefined
  var onCameraReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFacesDetected: js.UndefOr[js.Function1[/* options */ expoLib.Anon_Faces, scala.Unit]] = js.undefined
  var onMountError: js.UndefOr[js.Function1[/* error */ expoLib.Anon_Message, scala.Unit]] = js.undefined
  var pictureSize: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.Ref[CameraObject]] = js.undefined
  var `type`: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var useCamera2Api: js.UndefOr[scala.Boolean] = js.undefined
  var videoStabilizationMode: js.UndefOr[scala.Double] = js.undefined
  var whiteBalance: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

