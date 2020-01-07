package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a PartitionQueryRequest and PartitionReadRequest.
  */
@js.native
trait Schema$PartitionOptions extends js.Object {
  /**
    * **Note:** This hint is currently ignored by PartitionQuery and
    * PartitionRead requests.  The desired maximum number of partitions to
    * return.  For example, this may be set to the number of workers available.
    * The default for this option is currently 10,000. The maximum value is
    * currently 200,000.  This is only a hint.  The actual number of partitions
    * returned may be smaller or larger than this maximum count request.
    */
  var maxPartitions: js.UndefOr[String] = js.native
  /**
    * **Note:** This hint is currently ignored by PartitionQuery and
    * PartitionRead requests.  The desired data size for each partition
    * generated.  The default for this option is currently 1 GiB.  This is only
    * a hint. The actual size of each partition may be smaller or larger than
    * this size request.
    */
  var partitionSizeBytes: js.UndefOr[String] = js.native
}

object Schema$PartitionOptions {
  @scala.inline
  def apply(maxPartitions: String = null, partitionSizeBytes: String = null): Schema$PartitionOptions = {
    val __obj = js.Dynamic.literal()
    if (maxPartitions != null) __obj.updateDynamic("maxPartitions")(maxPartitions.asInstanceOf[js.Any])
    if (partitionSizeBytes != null) __obj.updateDynamic("partitionSizeBytes")(partitionSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PartitionOptions]
  }
}

