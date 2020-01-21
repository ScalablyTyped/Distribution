package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeepScores[T] extends js.Object {
  var keepScores: js.UndefOr[Boolean] = js.undefined
  var searchQuery: T
  var searchResults: js.Array[T]
}

object AnonKeepScores {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T], keepScores: js.UndefOr[Boolean] = js.undefined): AnonKeepScores[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    if (!js.isUndefined(keepScores)) __obj.updateDynamic("keepScores")(keepScores.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepScores[T]]
  }
}

