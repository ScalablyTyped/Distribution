package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentCollection extends js.Object {
  var ConsumedCapacity: dynogelsLib.dynogelsMod.ConsumedCapacity
  var Count: scala.Double
  var Items: js.Array[Document]
  var LastEvaluatedKey: js.UndefOr[js.Any] = js.undefined
  var ScannedCount: scala.Double
}

object DocumentCollection {
  @scala.inline
  def apply(
    ConsumedCapacity: ConsumedCapacity,
    Count: scala.Double,
    Items: js.Array[Document],
    ScannedCount: scala.Double,
    LastEvaluatedKey: js.Any = null
  ): DocumentCollection = {
    val __obj = js.Dynamic.literal(ConsumedCapacity = ConsumedCapacity, Count = Count, Items = Items, ScannedCount = ScannedCount)
    if (LastEvaluatedKey != null) __obj.updateDynamic("LastEvaluatedKey")(LastEvaluatedKey)
    __obj.asInstanceOf[DocumentCollection]
  }
}

