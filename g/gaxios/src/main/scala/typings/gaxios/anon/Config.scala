package typings.gaxios.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: js.UndefOr[scala.Nothing] = js.undefined
  var shouldRetry: Boolean
}

object Config {
  @scala.inline
  def apply(shouldRetry: Boolean): Config = {
    val __obj = js.Dynamic.literal(shouldRetry = shouldRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

