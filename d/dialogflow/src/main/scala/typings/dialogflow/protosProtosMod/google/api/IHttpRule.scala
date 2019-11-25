package typings.dialogflow.protosProtosMod.google.api

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
    additionalBindings: js.Array[IHttpRule] = null,
    body: String = null,
    custom: ICustomHttpPattern = null,
    delete: String = null,
    get: String = null,
    patch: String = null,
    post: String = null,
    put: String = null,
    responseBody: String = null,
    selector: String = null
  ): IHttpRule = {
    val __obj = js.Dynamic.literal()
    if (additionalBindings != null) __obj.updateDynamic("additionalBindings")(additionalBindings.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (put != null) __obj.updateDynamic("put")(put.asInstanceOf[js.Any])
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpRule]
  }
}

