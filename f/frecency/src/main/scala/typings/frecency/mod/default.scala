package typings.frecency.mod

import typings.frecency.anon.ExactQueryMatchWeight
import typings.frecency.anon.FrecencyScore
import typings.frecency.anon.KeepScores
import typings.frecency.anon.SearchQuery
import typings.frecency.anon.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: ExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]), 
    js.Array[(T with FrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: SearchQuery[T]): Unit = js.native
}

