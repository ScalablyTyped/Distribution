package typings.gaxios

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigShouldRetry extends js.Object {
  var config: GaxiosOptions
  var shouldRetry: Boolean
}

object Anon_ConfigShouldRetry {
  @scala.inline
  def apply(config: GaxiosOptions, shouldRetry: Boolean): Anon_ConfigShouldRetry = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConfigShouldRetry]
  }
}

