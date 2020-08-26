package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters that a bot can use to configure how it&#39;s response is posted.
  */
@js.native
trait SchemaActionResponse extends js.Object {
  /**
    * The type of bot response.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * URL for users to auth or config. (Only for REQUEST_CONFIG response
    * types.)
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaActionResponse {
  @scala.inline
  def apply(): SchemaActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionResponse]
  }
  @scala.inline
  implicit class SchemaActionResponseOps[Self <: SchemaActionResponse] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

