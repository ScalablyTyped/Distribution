package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBusinessIdGuid extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
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

object AnonBusinessIdGuid {
  @scala.inline
  def apply(
    businessId: Int | Double = null,
    guid: String = null,
    noteStoreUrl: String = null,
    shardId: String = null,
    shareKey: String = null,
    shareName: String = null,
    stack: String = null,
    updateSequenceNum: Int | Double = null,
    uri: String = null,
    username: String = null,
    webApiUrlPrefix: String = null
  ): AnonBusinessIdGuid = {
    val __obj = js.Dynamic.literal()
    if (businessId != null) __obj.updateDynamic("businessId")(businessId.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (shardId != null) __obj.updateDynamic("shardId")(shardId.asInstanceOf[js.Any])
    if (shareKey != null) __obj.updateDynamic("shareKey")(shareKey.asInstanceOf[js.Any])
    if (shareName != null) __obj.updateDynamic("shareName")(shareName.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBusinessIdGuid]
  }
}

