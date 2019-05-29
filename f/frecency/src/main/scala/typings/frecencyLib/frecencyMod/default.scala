package typings
package frecencyLib.frecencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: frecencyLib.Anon_ExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ frecencyLib.Anon_KeepScores[T]) | (/* arg */ frecencyLib.Anon_SearchQuerySearchResults[T]), 
    js.Array[(T with frecencyLib.Anon_FrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: frecencyLib.Anon_SearchQuery[T]): scala.Unit = js.native
}

