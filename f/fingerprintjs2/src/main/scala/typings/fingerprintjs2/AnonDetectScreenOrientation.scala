package typings.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectScreenOrientation extends js.Object {
  /**
    * To ensure consistent fingerprints when users rotate their mobile devices
    */
  var detectScreenOrientation: Boolean
}

object AnonDetectScreenOrientation {
  @scala.inline
  def apply(detectScreenOrientation: Boolean): AnonDetectScreenOrientation = {
    val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetectScreenOrientation]
  }
}

