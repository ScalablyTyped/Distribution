package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessIdGuid extends js.Object {
  var businessId: js.UndefOr[scala.Double] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var noteStoreUrl: js.UndefOr[java.lang.String] = js.undefined
  var shardId: js.UndefOr[java.lang.String] = js.undefined
  var shareKey: js.UndefOr[java.lang.String] = js.undefined
  var shareName: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BusinessIdGuid {
  @scala.inline
  def apply(
    businessId: scala.Int | scala.Double = null,
    guid: java.lang.String = null,
    noteStoreUrl: java.lang.String = null,
    shardId: java.lang.String = null,
    shareKey: java.lang.String = null,
    shareName: java.lang.String = null,
    stack: java.lang.String = null,
    updateSequenceNum: scala.Int | scala.Double = null,
    uri: java.lang.String = null,
    username: java.lang.String = null,
    webApiUrlPrefix: java.lang.String = null
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

