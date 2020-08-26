package typings.frecency.mod

import typings.frecency.anon.FrecencyScore
import typings.frecency.anon.KeepScores
import typings.frecency.anon.SearchQuery
import typings.frecency.anon.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]), 
    js.Array[(T with FrecencyScore) | T]
  ] = js.native
  def save(arg: SearchQuery[T]): Unit = js.native
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
  @scala.inline
  implicit class FrecencyOps[Self <: Frecency[_], T] (val x: Self with Frecency[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSave(value: SearchQuery[T] => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def setSort(
      value: (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]) => js.Array[(T with FrecencyScore) | T]
    ): Self = this.set("sort", js.Any.fromFunction1(value))
  }
  
}

