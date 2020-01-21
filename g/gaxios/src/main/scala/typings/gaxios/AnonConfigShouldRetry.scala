package typings.gaxios

import typings.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigShouldRetry extends js.Object {
  var config: GaxiosOptions
  var shouldRetry: Boolean
}

object AnonConfigShouldRetry {
  @scala.inline
  def apply(config: GaxiosOptions, shouldRetry: Boolean): AnonConfigShouldRetry = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfigShouldRetry]
  }
}

