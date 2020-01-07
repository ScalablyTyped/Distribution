package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information returned for each partition returned in a PartitionResponse.
  */
@js.native
trait Schema$Partition extends js.Object {
  /**
    * This token can be passed to Read, StreamingRead, ExecuteSql, or
    * ExecuteStreamingSql requests to restrict the results to those identified
    * by this partition token.
    */
  var partitionToken: js.UndefOr[String] = js.native
}

object Schema$Partition {
  @scala.inline
  def apply(partitionToken: String = null): Schema$Partition = {
    val __obj = js.Dynamic.literal()
    if (partitionToken != null) __obj.updateDynamic("partitionToken")(partitionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Partition]
  }
}

