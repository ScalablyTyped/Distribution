package typings.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectScreenOrientation extends js.Object {
  /**
    * To ensure consistent fingerprints when users rotate their mobile devices
    */
  var detectScreenOrientation: Boolean = js.native
}

object DetectScreenOrientation {
  @scala.inline
  def apply(detectScreenOrientation: Boolean): DetectScreenOrientation = {
    val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectScreenOrientation]
  }
  @scala.inline
  implicit class DetectScreenOrientationOps[Self <: DetectScreenOrientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectScreenOrientation(value: Boolean): Self = this.set("detectScreenOrientation", value.asInstanceOf[js.Any])
  }
  
}

