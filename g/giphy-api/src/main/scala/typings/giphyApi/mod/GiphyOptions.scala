package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiphyOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var https: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object GiphyOptions {
  @scala.inline
  def apply(): GiphyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GiphyOptions]
  }
  @scala.inline
  implicit class GiphyOptionsOps[Self <: GiphyOptions] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

