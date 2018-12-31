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

