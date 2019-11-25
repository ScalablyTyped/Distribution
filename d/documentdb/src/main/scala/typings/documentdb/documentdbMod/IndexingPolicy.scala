package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexingPolicy extends js.Object {
  /** Represents the paths to be excluded from indexing. */
  var ExcludedPaths: js.Array[ExcludedPath]
  /** Represents the paths to be included for indexing. */
  var IncludedPaths: js.Array[IncludedPath]
  /** Specifies whether automatic indexing is enabled for a collection. */
  var automatic: Boolean
  /** The indexing mode (consistent or lazy) {@link IndexingMode}. */
  var indexingMode: IndexingMode
}

object IndexingPolicy {
  @scala.inline
  def apply(
    ExcludedPaths: js.Array[ExcludedPath],
    IncludedPaths: js.Array[IncludedPath],
    automatic: Boolean,
    indexingMode: IndexingMode
  ): IndexingPolicy = {
    val __obj = js.Dynamic.literal(ExcludedPaths = ExcludedPaths.asInstanceOf[js.Any], IncludedPaths = IncludedPaths.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], indexingMode = indexingMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexingPolicy]
  }
}

