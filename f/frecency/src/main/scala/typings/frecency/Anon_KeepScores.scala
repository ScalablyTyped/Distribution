package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeepScores[T] extends js.Object {
  var keepScores: js.UndefOr[Boolean] = js.undefined
  var searchQuery: T
  var searchResults: js.Array[T]
}

object Anon_KeepScores {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T], keepScores: js.UndefOr[Boolean] = js.undefined): Anon_KeepScores[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    if (!js.isUndefined(keepScores)) __obj.updateDynamic("keepScores")(keepScores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeepScores[T]]
  }
}

