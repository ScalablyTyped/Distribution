package typings.fuseDotJs.fuseDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuseResultWithMatches[T] extends js.Object {
  var item: T
  var matches: js.Any
}

object FuseResultWithMatches {
  @scala.inline
  def apply[T](item: T, matches: js.Any): FuseResultWithMatches[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FuseResultWithMatches[T]]
  }
}

