package typings.googleapis.buildSrcApisCloudresourcemanagerV2Mod.cloudresourcemanager_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a long-running operation that is the result of a
  * network API call.
  */
@js.native
trait Schema$Operation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress. If
    * `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * The error result of the operation in case of failure or cancellation.
    */
  var error: js.UndefOr[Schema$Status] = js.native
  /**
    * Service-specific metadata associated with the operation.  It typically
    * contains progress information and common metadata such as create time.
    * Some services might not provide such metadata.  Any method that returns a
    * long-running operation should document the metadata type, if any.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The server-assigned name, which is only unique within the same service
    * that originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `operations/some/unique/name`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The normal response of the operation in case of success.  If the original
    * method returns no data on success, such as `Delete`, the response is
    * `google.protobuf.Empty`.  If the original method is standard
    * `Get`/`Create`/`Update`, the response should be the resource.  For other
    * methods, the response should have the type `XxxResponse`, where `Xxx` is
    * the original method name.  For example, if the original method name is
    * `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$Operation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: Schema$Status = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    response: StringDictionary[js.Any] = null
  ): Schema$Operation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Operation]
  }
}

