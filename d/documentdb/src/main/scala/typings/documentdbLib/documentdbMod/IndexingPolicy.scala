package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexingPolicy extends js.Object {
  /** Represents the paths to be excluded from indexing. */
  var ExcludedPaths: js.Array[ExcludedPath]
  /** Represents the paths to be included for indexing. */
  var IncludedPaths: js.Array[IncludedPath]
  /** Specifies whether automatic indexing is enabled for a collection. */
  var automatic: scala.Boolean
  /** The indexing mode (consistent or lazy) {@link IndexingMode}. */
  var indexingMode: IndexingMode
}

object IndexingPolicy {
  @scala.inline
  def apply(
    ExcludedPaths: js.Array[ExcludedPath],
    IncludedPaths: js.Array[IncludedPath],
    automatic: scala.Boolean,
    indexingMode: IndexingMode
  ): IndexingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ExcludedPaths")(ExcludedPaths)
    __obj.updateDynamic("IncludedPaths")(IncludedPaths)
    __obj.updateDynamic("automatic")(automatic)
    __obj.updateDynamic("indexingMode")(indexingMode)
    __obj.asInstanceOf[IndexingPolicy]
  }
}

