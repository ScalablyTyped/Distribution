package typings
package fingerprintjs2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectScreenOrientation extends js.Object {
  /**
    * To ensure consistent fingerprints when users rotate their mobile devices
    */
  var detectScreenOrientation: scala.Boolean
}

object Anon_DetectScreenOrientation {
  @scala.inline
  def apply(detectScreenOrientation: scala.Boolean): Anon_DetectScreenOrientation = {
    val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation)
  
    __obj.asInstanceOf[Anon_DetectScreenOrientation]
  }
}

