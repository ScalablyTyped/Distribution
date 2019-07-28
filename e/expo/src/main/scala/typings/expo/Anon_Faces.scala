package typings.expo

import typings.expo.expoMod.TrackedFaceFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Faces extends js.Object {
  var faces: js.Array[TrackedFaceFeature]
}

object Anon_Faces {
  @scala.inline
  def apply(faces: js.Array[TrackedFaceFeature]): Anon_Faces = {
    val __obj = js.Dynamic.literal(faces = faces)
  
    __obj.asInstanceOf[Anon_Faces]
  }
}

