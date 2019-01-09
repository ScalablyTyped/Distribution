package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FaceDetector")
@js.native
object FaceDetectorNs extends js.Object {
  trait DetectFaceResult extends js.Object {
    var faces: js.Array[expoLib.expoMod.FaceFeature]
    var image: expoLib.Anon_HeightOrientation
  }
  
  trait DetectionOptions extends js.Object {
    var detectLandmarks: js.UndefOr[java.lang.String] = js.undefined
    var mode: js.UndefOr[expoLib.expoLibStrings.fast | expoLib.expoLibStrings.accurate] = js.undefined
    var runClassifications: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Mode extends js.Object {
    var accurate: expoLib.expoLibStrings.accurate
    var fast: expoLib.expoLibStrings.fast
  }
  
  trait _Constants extends js.Object {
    var Classifications: Classifications
    var Landmarks: Landmarks
    var Mode: Mode
  }
  
  trait _Shared extends js.Object {
    var all: expoLib.expoLibStrings.all
    var none: expoLib.expoLibStrings.none
  }
  
  val Constants: _Constants = js.native
  def detectFaces(uri: java.lang.String): js.Promise[DetectFaceResult] = js.native
  def detectFaces(uri: java.lang.String, options: DetectionOptions): js.Promise[DetectFaceResult] = js.native
  type Classifications = _Shared
  type Landmarks = _Shared
}

