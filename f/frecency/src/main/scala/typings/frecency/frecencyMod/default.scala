package typings.frecency.frecencyMod

import typings.frecency.Anon_ExactQueryMatchWeight
import typings.frecency.Anon_FrecencyScore
import typings.frecency.Anon_KeepScores
import typings.frecency.Anon_SearchQuery
import typings.frecency.Anon_SearchQuerySearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: Anon_ExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ Anon_KeepScores[T]) | (/* arg */ Anon_SearchQuerySearchResults[T]), 
    js.Array[(T with Anon_FrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: Anon_SearchQuery[T]): Unit = js.native
}

