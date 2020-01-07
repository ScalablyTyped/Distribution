package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rewrite response.
  */
@js.native
trait Schema$RewriteResponse extends js.Object {
  /**
    * true if the copy is finished; otherwise, false if the copy is in
    * progress. This property is always present in the response.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The total size of the object being copied in bytes. This property is
    * always present in the response.
    */
  var objectSize: js.UndefOr[String] = js.native
  /**
    * A resource containing the metadata for the copied-to object. This
    * property is present in the response only when copying completes.
    */
  var resource: js.UndefOr[Schema$Object] = js.native
  /**
    * A token to use in subsequent requests to continue copying data. This
    * token is present in the response only when there is more data to copy.
    */
  var rewriteToken: js.UndefOr[String] = js.native
  /**
    * The total bytes written so far, which can be used to provide a waiting
    * user with a progress indicator. This property is always present in the
    * response.
    */
  var totalBytesRewritten: js.UndefOr[String] = js.native
}

object Schema$RewriteResponse {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    objectSize: String = null,
    resource: Schema$Object = null,
    rewriteToken: String = null,
    totalBytesRewritten: String = null
  ): Schema$RewriteResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (objectSize != null) __obj.updateDynamic("objectSize")(objectSize.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (rewriteToken != null) __obj.updateDynamic("rewriteToken")(rewriteToken.asInstanceOf[js.Any])
    if (totalBytesRewritten != null) __obj.updateDynamic("totalBytesRewritten")(totalBytesRewritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RewriteResponse]
  }
}

