package typings.devcert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaCertPath extends js.Object {
  var caCertPath: String
  var caKeyPath: String
}

object AnonCaCertPath {
  @scala.inline
  def apply(caCertPath: String, caKeyPath: String): AnonCaCertPath = {
    val __obj = js.Dynamic.literal(caCertPath = caCertPath.asInstanceOf[js.Any], caKeyPath = caKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaCertPath]
  }
}

