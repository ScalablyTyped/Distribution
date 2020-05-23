package typings.fingerprintjs2.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeIE extends js.Object {
  var excludeIE: Boolean
  var sortPluginsFor: js.Array[RegExp]
}

object ExcludeIE {
  @scala.inline
  def apply(excludeIE: Boolean, sortPluginsFor: js.Array[RegExp]): ExcludeIE = {
    val __obj = js.Dynamic.literal(excludeIE = excludeIE.asInstanceOf[js.Any], sortPluginsFor = sortPluginsFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeIE]
  }
}

