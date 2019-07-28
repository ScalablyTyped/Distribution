package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessIdGuid extends js.Object {
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

object Anon_BusinessIdGuid {
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
  ): Anon_BusinessIdGuid = {
    val __obj = js.Dynamic.literal()
    if (businessId != null) __obj.updateDynamic("businessId")(businessId.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl)
    if (shardId != null) __obj.updateDynamic("shardId")(shardId)
    if (shareKey != null) __obj.updateDynamic("shareKey")(shareKey)
    if (shareName != null) __obj.updateDynamic("shareName")(shareName)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (username != null) __obj.updateDynamic("username")(username)
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix)
    __obj.asInstanceOf[Anon_BusinessIdGuid]
  }
}

