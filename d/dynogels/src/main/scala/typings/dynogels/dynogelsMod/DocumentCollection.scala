package typings.dynogels.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentCollection extends js.Object {
  var ConsumedCapacity: typings.dynogels.dynogelsMod.ConsumedCapacity
  var Count: Double
  var Items: js.Array[Document]
  var LastEvaluatedKey: js.UndefOr[js.Any] = js.undefined
  var ScannedCount: Double
}

object DocumentCollection {
  @scala.inline
  def apply(
    ConsumedCapacity: ConsumedCapacity,
    Count: Double,
    Items: js.Array[Document],
    ScannedCount: Double,
    LastEvaluatedKey: js.Any = null
  ): DocumentCollection = {
    val __obj = js.Dynamic.literal(ConsumedCapacity = ConsumedCapacity.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ScannedCount = ScannedCount.asInstanceOf[js.Any])
    if (LastEvaluatedKey != null) __obj.updateDynamic("LastEvaluatedKey")(LastEvaluatedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCollection]
  }
}

