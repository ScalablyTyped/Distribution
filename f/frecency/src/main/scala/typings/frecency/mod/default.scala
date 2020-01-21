package typings.frecency.mod

import typings.frecency.AnonExactQueryMatchWeight
import typings.frecency.AnonFrecencyScore
import typings.frecency.AnonKeepScores
import typings.frecency.AnonSearchQuery
import typings.frecency.AnonSearchQuerySearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: AnonExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchQuerySearchResults[T]), 
    js.Array[(T with AnonFrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: AnonSearchQuery[T]): Unit = js.native
}

