package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDefault extends js.Object {
  /** Whether the person's profile photo is the default one */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * The URL of the person's profile photo. To resize the image and crop it to a square, append the query string ?sz=x, where x is the dimension in pixels
    * of each side.
    */
  var url: js.UndefOr[String] = js.native
}

object IsDefault {
  @scala.inline
  def apply(): IsDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDefault]
  }
  @scala.inline
  implicit class IsDefaultOps[Self <: IsDefault] (val x: Self) extends AnyVal {
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
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

