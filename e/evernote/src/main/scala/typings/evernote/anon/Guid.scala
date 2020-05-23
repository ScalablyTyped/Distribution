package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guid extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var shardId: js.UndefOr[String] = js.undefined
  var shareKey: js.UndefOr[String] = js.undefined
  var shareName: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object Guid {
  @scala.inline
  def apply(
    businessId: js.UndefOr[Double] = js.undefined,
    guid: typings.evernote.mod.Types.Guid = null,
    noteStoreUrl: String = null,
    shardId: String = null,
    shareKey: String = null,
    shareName: String = null,
    stack: String = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined,
    uri: String = null,
    username: String = null,
    webApiUrlPrefix: String = null
  ): Guid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(businessId)) __obj.updateDynamic("businessId")(businessId.get.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (shardId != null) __obj.updateDynamic("shardId")(shardId.asInstanceOf[js.Any])
    if (shareKey != null) __obj.updateDynamic("shareKey")(shareKey.asInstanceOf[js.Any])
    if (shareName != null) __obj.updateDynamic("shareName")(shareName.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
}

