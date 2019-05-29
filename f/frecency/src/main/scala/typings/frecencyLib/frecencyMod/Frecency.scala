package typings
package frecencyLib.frecencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ frecencyLib.Anon_KeepScores[T]) | (/* arg */ frecencyLib.Anon_SearchQuerySearchResults[T]), 
    js.Array[(T with frecencyLib.Anon_FrecencyScore) | T]
  ]
  def save(arg: frecencyLib.Anon_SearchQuery[T]): scala.Unit
}

object Frecency {
  @scala.inline
  def apply[T](
    save: frecencyLib.Anon_SearchQuery[T] => scala.Unit,
    sort: (/* arg */ frecencyLib.Anon_KeepScores[T]) | (/* arg */ frecencyLib.Anon_SearchQuerySearchResults[T]) => js.Array[(T with frecencyLib.Anon_FrecencyScore) | T]
  ): Frecency[T] = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Frecency[T]]
  }
}

