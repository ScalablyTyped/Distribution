package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraConstants extends js.Object {
  val AutoFocus: expoLib.Anon_Off
  val BarCodeType: expoLib.Anon_Aztec
  val FlashMode: expoLib.Anon_Auto
  val Type: expoLib.Anon_Back
  val VideoQuality: org.scalablytyped.runtime.StringDictionary[scala.Double]
  val WhiteBalance: expoLib.Anon_AutoCloudy
}

object CameraConstants {
  @scala.inline
  def apply(
    AutoFocus: expoLib.Anon_Off,
    BarCodeType: expoLib.Anon_Aztec,
    FlashMode: expoLib.Anon_Auto,
    Type: expoLib.Anon_Back,
    VideoQuality: org.scalablytyped.runtime.StringDictionary[scala.Double],
    WhiteBalance: expoLib.Anon_AutoCloudy
  ): CameraConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoFocus")(AutoFocus)
    __obj.updateDynamic("BarCodeType")(BarCodeType)
    __obj.updateDynamic("FlashMode")(FlashMode)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("VideoQuality")(VideoQuality)
    __obj.updateDynamic("WhiteBalance")(WhiteBalance)
    __obj.asInstanceOf[CameraConstants]
  }
}

