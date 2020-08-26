package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleStringUrlString extends js.Object {
  /** The new title for the URL. */
  var title: String = js.native
  /** The URL for which the title has changed */
  var url: String = js.native
}

object TitleStringUrlString {
  @scala.inline
  def apply(title: String, url: String): TitleStringUrlString = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleStringUrlString]
  }
  @scala.inline
  implicit class TitleStringUrlStringOps[Self <: TitleStringUrlString] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

