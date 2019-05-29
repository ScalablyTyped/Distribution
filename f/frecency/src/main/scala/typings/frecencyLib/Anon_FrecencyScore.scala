package typings
package frecencyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrecencyScore extends js.Object {
  var _frecencyScore: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FrecencyScore {
  @scala.inline
  def apply(_frecencyScore: scala.Int | scala.Double = null): Anon_FrecencyScore = {
    val __obj = js.Dynamic.literal()
    if (_frecencyScore != null) __obj.updateDynamic("_frecencyScore")(_frecencyScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrecencyScore]
  }
}

