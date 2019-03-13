package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALLOWFROM extends js.Object {
  var enable: scala.Boolean
  var value: eggLib.eggLibStrings.SAMEORIGIN | eggLib.eggLibStrings.DENY | eggLib.eggLibStrings.`ALLOW-FROM`
}

object Anon_ALLOWFROM {
  @scala.inline
  def apply(
    enable: scala.Boolean,
    value: eggLib.eggLibStrings.SAMEORIGIN | eggLib.eggLibStrings.DENY | eggLib.eggLibStrings.`ALLOW-FROM`
  ): Anon_ALLOWFROM = {
    val __obj = js.Dynamic.literal(enable = enable, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ALLOWFROM]
  }
}

