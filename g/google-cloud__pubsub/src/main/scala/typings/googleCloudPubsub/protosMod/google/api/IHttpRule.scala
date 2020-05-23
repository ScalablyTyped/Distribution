package typings.googleCloudPubsub.protosMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a HttpRule. */
trait IHttpRule extends js.Object {
  /** HttpRule additionalBindings */
  var additionalBindings: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
  /** HttpRule body */
  var body: js.UndefOr[String | Null] = js.undefined
  /** HttpRule custom */
  var custom: js.UndefOr[ICustomHttpPattern | Null] = js.undefined
  /** HttpRule delete */
  var delete: js.UndefOr[String | Null] = js.undefined
  /** HttpRule get */
  var get: js.UndefOr[String | Null] = js.undefined
  /** HttpRule patch */
  var patch: js.UndefOr[String | Null] = js.undefined
  /** HttpRule post */
  var post: js.UndefOr[String | Null] = js.undefined
  /** HttpRule put */
  var put: js.UndefOr[String | Null] = js.undefined
  /** HttpRule responseBody */
  var responseBody: js.UndefOr[String | Null] = js.undefined
  /** HttpRule selector */
  var selector: js.UndefOr[String | Null] = js.undefined
}

object IHttpRule {
  @scala.inline
  def apply(
    additionalBindings: js.UndefOr[Null | js.Array[IHttpRule]] = js.undefined,
    body: js.UndefOr[Null | String] = js.undefined,
    custom: js.UndefOr[Null | ICustomHttpPattern] = js.undefined,
    delete: js.UndefOr[Null | String] = js.undefined,
    get: js.UndefOr[Null | String] = js.undefined,
    patch: js.UndefOr[Null | String] = js.undefined,
    post: js.UndefOr[Null | String] = js.undefined,
    put: js.UndefOr[Null | String] = js.undefined,
    responseBody: js.UndefOr[Null | String] = js.undefined,
    selector: js.UndefOr[Null | String] = js.undefined
  ): IHttpRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalBindings)) __obj.updateDynamic("additionalBindings")(additionalBindings.asInstanceOf[js.Any])
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (!js.isUndefined(get)) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (!js.isUndefined(post)) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (!js.isUndefined(put)) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (!js.isUndefined(responseBody)) __obj.updateDynamic("responseBody")(responseBody.asInstanceOf[js.Any])
    if (!js.isUndefined(selector)) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpRule]
  }
}

