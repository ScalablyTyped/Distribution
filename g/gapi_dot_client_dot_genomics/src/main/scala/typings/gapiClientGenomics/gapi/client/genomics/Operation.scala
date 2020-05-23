package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress.
    * If `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[Status] = js.undefined
  /** An OperationMetadata object. This will always be returned with the Operation. */
  var metadata: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The server-assigned name, which is only unique within the same service that originally returns it. For example&#58;
    * `operations/CJHU7Oi_ChDrveSpBRjfuL-qzoWAgEw`
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If importing ReadGroupSets, an ImportReadGroupSetsResponse is returned. If importing Variants, an ImportVariantsResponse is returned. For pipelines and
    * exports, an Empty response is returned.
    */
  var response: js.UndefOr[Record[String, _]] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: Status = null,
    metadata: Record[String, _] = null,
    name: String = null,
    response: Record[String, _] = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

