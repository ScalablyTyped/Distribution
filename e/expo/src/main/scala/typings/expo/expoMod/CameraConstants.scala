package typings.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.Anon_Auto
import typings.expo.Anon_AutoCloudy
import typings.expo.Anon_Aztec
import typings.expo.Anon_Back
import typings.expo.Anon_Off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraConstants extends js.Object {
  val AutoFocus: Anon_Off
  val BarCodeType: Anon_Aztec
  val FlashMode: Anon_Auto
  val Type: Anon_Back
  val VideoQuality: StringDictionary[Double]
  val WhiteBalance: Anon_AutoCloudy
}

object CameraConstants {
  @scala.inline
  def apply(
    AutoFocus: Anon_Off,
    BarCodeType: Anon_Aztec,
    FlashMode: Anon_Auto,
    Type: Anon_Back,
    VideoQuality: StringDictionary[Double],
    WhiteBalance: Anon_AutoCloudy
  ): CameraConstants = {
    val __obj = js.Dynamic.literal(AutoFocus = AutoFocus, BarCodeType = BarCodeType, FlashMode = FlashMode, Type = Type, VideoQuality = VideoQuality, WhiteBalance = WhiteBalance)
  
    __obj.asInstanceOf[CameraConstants]
  }
}

