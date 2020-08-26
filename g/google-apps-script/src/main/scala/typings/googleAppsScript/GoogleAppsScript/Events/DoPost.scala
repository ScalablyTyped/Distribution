package typings.googleAppsScript.GoogleAppsScript.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoPost extends AppsScriptHttpRequestEvent {
  var postData: AppsScriptHttpRequestEventPostData = js.native
}

object DoPost {
  @scala.inline
  def apply(
    contentLength: Double,
    contextPath: String,
    parameter: js.Object,
    parameters: js.Object,
    postData: AppsScriptHttpRequestEventPostData,
    queryString: String
  ): DoPost = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], contextPath = contextPath.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoPost]
  }
  @scala.inline
  implicit class DoPostOps[Self <: DoPost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPostData(value: AppsScriptHttpRequestEventPostData): Self = this.set("postData", value.asInstanceOf[js.Any])
  }
  
}

