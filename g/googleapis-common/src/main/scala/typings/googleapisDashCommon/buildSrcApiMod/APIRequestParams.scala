package typings.googleapisDashCommon.buildSrcApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIRequestParams[T] extends js.Object {
  var context: APIRequestContext
  var mediaUrl: js.UndefOr[String | Null] = js.undefined
  var options: MethodOptions
  var params: T
  var pathParams: js.Array[String]
  var requiredParams: js.Array[String]
}

object APIRequestParams {
  @scala.inline
  def apply[T](
    context: APIRequestContext,
    options: MethodOptions,
    params: T,
    pathParams: js.Array[String],
    requiredParams: js.Array[String],
    mediaUrl: String = null
  ): APIRequestParams[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], requiredParams = requiredParams.asInstanceOf[js.Any])
    if (mediaUrl != null) __obj.updateDynamic("mediaUrl")(mediaUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIRequestParams[T]]
  }
}

