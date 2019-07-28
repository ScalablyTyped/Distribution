package typings.expo.expoMod

import typings.expo.Anon_HeightOrientation
import typings.expo.expoMod.FaceDetectorNs.DetectFaceResult
import typings.expo.expoMod.FaceDetectorNs.DetectionOptions
import typings.expo.expoMod.FaceDetectorNs._Constants
import typings.expo.expoMod.FaceDetectorNs._Shared
import typings.expo.expoStrings.accurate
import typings.expo.expoStrings.fast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FaceDetector")
@js.native
object FaceDetectorNs extends js.Object {
  trait DetectFaceResult extends js.Object {
    var faces: js.Array[FaceFeature]
    var image: Anon_HeightOrientation
  }
  
  trait DetectionOptions extends js.Object {
    var detectLandmarks: js.UndefOr[String] = js.undefined
    var mode: js.UndefOr[fast | accurate] = js.undefined
    var runClassifications: js.UndefOr[String] = js.undefined
  }
  
  trait Mode extends js.Object {
    var accurate: typings.expo.expoStrings.accurate
    var fast: typings.expo.expoStrings.fast
  }
  
  trait _Constants extends js.Object {
    var Classifications: typings.expo.expoMod.FaceDetectorNs.Classifications
    var Landmarks: typings.expo.expoMod.FaceDetectorNs.Landmarks
    var Mode: typings.expo.expoMod.FaceDetectorNs.Mode
  }
  
  trait _Shared extends js.Object {
    var all: typings.expo.expoStrings.all
    var none: typings.expo.expoStrings.none
  }
  
  val Constants: _Constants = js.native
  def detectFaces(uri: String): js.Promise[DetectFaceResult] = js.native
  def detectFaces(uri: String, options: DetectionOptions): js.Promise[DetectFaceResult] = js.native
  type Classifications = _Shared
  type Landmarks = _Shared
}

