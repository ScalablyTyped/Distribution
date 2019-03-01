package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPartitionKey extends js.Object {
  /**
    * The algorithm used for partitioning. Only Hash is supported.
    */
  var kind: PartitionKind
  /**
    * An array of paths using which data within the collection can be partitioned.
    *
    * Paths must not contain a wildcard or a trailing slash. For example, the JSON property “AccountNumber” is specified as “/AccountNumber”.
    *
    * The array must contain only a single value.
    */
  var paths: js.Array[java.lang.String]
}

object CollectionPartitionKey {
  @scala.inline
  def apply(kind: PartitionKind, paths: js.Array[java.lang.String]): CollectionPartitionKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[CollectionPartitionKey]
  }
}

