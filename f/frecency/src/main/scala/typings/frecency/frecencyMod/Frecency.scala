package typings.frecency.frecencyMod

import typings.frecency.Anon_FrecencyScore
import typings.frecency.Anon_KeepScores
import typings.frecency.Anon_SearchQuery
import typings.frecency.Anon_SearchQuerySearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ Anon_KeepScores[T]) | (/* arg */ Anon_SearchQuerySearchResults[T]), 
    js.Array[(T with Anon_FrecencyScore) | T]
  ]
  def save(arg: Anon_SearchQuery[T]): Unit
}

object Frecency {
  @scala.inline
  def apply[T](
    save: Anon_SearchQuery[T] => Unit,
    sort: (/* arg */ Anon_KeepScores[T]) | (/* arg */ Anon_SearchQuerySearchResults[T]) => js.Array[(T with Anon_FrecencyScore) | T]
  ): Frecency[T] = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Frecency[T]]
  }
}

