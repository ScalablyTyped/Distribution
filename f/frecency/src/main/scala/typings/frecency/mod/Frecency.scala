package typings.frecency.mod

import typings.frecency.anon.FrecencyScore
import typings.frecency.anon.KeepScores
import typings.frecency.anon.SearchQuery
import typings.frecency.anon.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]), 
    js.Array[(T with FrecencyScore) | T]
  ]
  def save(arg: SearchQuery[T]): Unit
}

object Frecency {
  @scala.inline
  def apply[T](
    save: SearchQuery[T] => Unit,
    sort: (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]) => js.Array[(T with FrecencyScore) | T]
  ): Frecency[T] = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[Frecency[T]]
  }
}

