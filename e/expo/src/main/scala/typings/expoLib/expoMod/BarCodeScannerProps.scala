package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarCodeScannerProps
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  var barCodeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onBarCodeScanned: js.UndefOr[BarCodeScannedCallback] = js.undefined
  var torchMode: js.UndefOr[expoLib.expoLibStrings.on | expoLib.expoLibStrings.off] = js.undefined
  var `type`: js.UndefOr[expoLib.expoLibStrings.front | expoLib.expoLibStrings.back] = js.undefined
}

