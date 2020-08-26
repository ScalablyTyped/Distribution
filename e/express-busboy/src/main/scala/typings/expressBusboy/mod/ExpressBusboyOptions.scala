package typings.expressBusboy.mod

import typings.connectBusboy.mod.ConnectBusboyOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressBusboyOptions extends ConnectBusboyOptions {
  var allowedPath: js.UndefOr[String | RegExp | (js.Function1[/* url */ String, Boolean])] = js.native
  var mimeTypeLimit: js.UndefOr[String | js.Array[String]] = js.native
  var path: js.UndefOr[String] = js.native
  var restrictMultiple: js.UndefOr[Boolean] = js.native
  var upload: js.UndefOr[Boolean] = js.native
}

object ExpressBusboyOptions {
  @scala.inline
  def apply(): ExpressBusboyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressBusboyOptions]
  }
  @scala.inline
  implicit class ExpressBusboyOptionsOps[Self <: ExpressBusboyOptions] (val x: Self) extends AnyVal {
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
    def setAllowedPathFunction1(value: /* url */ String => Boolean): Self = this.set("allowedPath", js.Any.fromFunction1(value))
    @scala.inline
    def setAllowedPath(value: String | RegExp | (js.Function1[/* url */ String, Boolean])): Self = this.set("allowedPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedPath: Self = this.set("allowedPath", js.undefined)
    @scala.inline
    def setMimeTypeLimitVarargs(value: String*): Self = this.set("mimeTypeLimit", js.Array(value :_*))
    @scala.inline
    def setMimeTypeLimit(value: String | js.Array[String]): Self = this.set("mimeTypeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeTypeLimit: Self = this.set("mimeTypeLimit", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRestrictMultiple(value: Boolean): Self = this.set("restrictMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictMultiple: Self = this.set("restrictMultiple", js.undefined)
    @scala.inline
    def setUpload(value: Boolean): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
  
}

