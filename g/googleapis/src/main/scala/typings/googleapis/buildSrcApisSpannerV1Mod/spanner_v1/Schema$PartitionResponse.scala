package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for PartitionQuery or PartitionRead
  */
@js.native
trait Schema$PartitionResponse extends js.Object {
  /**
    * Partitions created by this request.
    */
  var partitions: js.UndefOr[js.Array[Schema$Partition]] = js.native
  /**
    * Transaction created by this request.
    */
  var transaction: js.UndefOr[Schema$Transaction] = js.native
}

object Schema$PartitionResponse {
  @scala.inline
  def apply(partitions: js.Array[Schema$Partition] = null, transaction: Schema$Transaction = null): Schema$PartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (partitions != null) __obj.updateDynamic("partitions")(partitions.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PartitionResponse]
  }
}

