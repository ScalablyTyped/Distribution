package typings.fuseJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuseResultWithScore[T] extends js.Object {
  var item: T
  var score: Double
}

object FuseResultWithScore {
  @scala.inline
  def apply[T](item: T, score: Double): FuseResultWithScore[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FuseResultWithScore[T]]
  }
}

