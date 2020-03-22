package typings.frecency.mod

import typings.frecency.AnonFrecencyScore
import typings.frecency.AnonKeepScores
import typings.frecency.AnonSearchQuery
import typings.frecency.AnonSearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]), 
    js.Array[(T with AnonFrecencyScore) | T]
  ]
  def save(arg: AnonSearchQuery[T]): Unit
}

object Frecency {
  @scala.inline
  def apply[T](
    save: AnonSearchQuery[T] => Unit,
    sort: (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]) => js.Array[(T with AnonFrecencyScore) | T]
  ): Frecency[T] = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Frecency[T]]
  }
}

