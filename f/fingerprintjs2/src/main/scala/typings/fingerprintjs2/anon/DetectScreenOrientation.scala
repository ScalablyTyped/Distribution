package typings.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectScreenOrientation extends js.Object {
  /**
    * To ensure consistent fingerprints when users rotate their mobile devices
    */
  var detectScreenOrientation: Boolean
}

object DetectScreenOrientation {
  @scala.inline
  def apply(detectScreenOrientation: Boolean): DetectScreenOrientation = {
    val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectScreenOrientation]
  }
}

