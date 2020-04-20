package typings.gaxios

import typings.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShouldRetry extends js.Object {
  var config: GaxiosOptions
  var shouldRetry: Boolean
}

object AnonShouldRetry {
  @scala.inline
  def apply(config: GaxiosOptions, shouldRetry: Boolean): AnonShouldRetry = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldRetry]
  }
}

