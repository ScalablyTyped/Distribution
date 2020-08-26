package typings.devtools.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var isDevTools: Boolean = js.native
  def getPuppeteer(args: js.Any*): js.Any = js.native
}

object ClientOptions {
  @scala.inline
  def apply(getPuppeteer: /* repeated */ js.Any => js.Any, isDevTools: Boolean): ClientOptions = {
    val __obj = js.Dynamic.literal(getPuppeteer = js.Any.fromFunction1(getPuppeteer), isDevTools = isDevTools.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setGetPuppeteer(value: /* repeated */ js.Any => js.Any): Self = this.set("getPuppeteer", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDevTools(value: Boolean): Self = this.set("isDevTools", value.asInstanceOf[js.Any])
  }
  
}

