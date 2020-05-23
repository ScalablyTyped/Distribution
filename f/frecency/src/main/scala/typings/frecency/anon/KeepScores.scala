package typings.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepScores[T] extends js.Object {
  var keepScores: js.UndefOr[Boolean] = js.undefined
  var searchQuery: T
  var searchResults: js.Array[T]
}

object KeepScores {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T], keepScores: js.UndefOr[Boolean] = js.undefined): KeepScores[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    if (!js.isUndefined(keepScores)) __obj.updateDynamic("keepScores")(keepScores.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepScores[T]]
  }
}

