package typings.devcert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaCertPath extends js.Object {
  var caCertPath: String
  var caKeyPath: String
}

object CaCertPath {
  @scala.inline
  def apply(caCertPath: String, caKeyPath: String): CaCertPath = {
    val __obj = js.Dynamic.literal(caCertPath = caCertPath.asInstanceOf[js.Any], caKeyPath = caKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaCertPath]
  }
}

