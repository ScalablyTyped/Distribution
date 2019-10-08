package typings.fuseDotJs.fuseDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuseResult[T] extends js.Object {
  var item: T
  var matches: js.UndefOr[js.Any] = js.undefined
  var score: js.UndefOr[Double] = js.undefined
}

object FuseResult {
  @scala.inline
  def apply[T](item: T, matches: js.Any = null, score: Int | Double = null): FuseResult[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuseResult[T]]
  }
}

