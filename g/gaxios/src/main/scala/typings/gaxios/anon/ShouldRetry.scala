package typings.gaxios.anon

import typings.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldRetry extends js.Object {
  var config: GaxiosOptions
  var shouldRetry: Boolean
}

object ShouldRetry {
  @scala.inline
  def apply(config: GaxiosOptions, shouldRetry: Boolean): ShouldRetry = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldRetry]
  }
}

