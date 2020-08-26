package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  /** The simple name of this method. */
  var name: js.UndefOr[String] = js.native
  /** Any metadata attached to the method. */
  var options: js.UndefOr[js.Array[Option]] = js.native
  /** If true, the request is streamed. */
  var requestStreaming: js.UndefOr[Boolean] = js.native
  /** A URL of the input message type. */
  var requestTypeUrl: js.UndefOr[String] = js.native
  /** If true, the response is streamed. */
  var responseStreaming: js.UndefOr[Boolean] = js.native
  /** The URL of the output message type. */
  var responseTypeUrl: js.UndefOr[String] = js.native
  /** The source syntax of this method. */
  var syntax: js.UndefOr[String] = js.native
}

object Method {
  @scala.inline
  def apply(): Method = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRequestStreaming(value: Boolean): Self = this.set("requestStreaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestStreaming: Self = this.set("requestStreaming", js.undefined)
    @scala.inline
    def setRequestTypeUrl(value: String): Self = this.set("requestTypeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTypeUrl: Self = this.set("requestTypeUrl", js.undefined)
    @scala.inline
    def setResponseStreaming(value: Boolean): Self = this.set("responseStreaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStreaming: Self = this.set("responseStreaming", js.undefined)
    @scala.inline
    def setResponseTypeUrl(value: String): Self = this.set("responseTypeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTypeUrl: Self = this.set("responseTypeUrl", js.undefined)
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

