package typings.fsExtraPromiseEs6.anon

import typings.fsExtraPromiseEs6.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Curr extends js.Object {
  var curr: Stats
  var prev: Stats
}

object Curr {
  @scala.inline
  def apply(curr: Stats, prev: Stats): Curr = {
    val __obj = js.Dynamic.literal(curr = curr.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curr]
  }
}

