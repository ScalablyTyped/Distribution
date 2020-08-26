package typings.expoConfigureSplashScreen.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceContent extends js.Object {
  var replaceContent: String = js.native
  var replacePattern: String | RegExp = js.native
}

object ReplaceContent {
  @scala.inline
  def apply(replaceContent: String, replacePattern: String | RegExp): ReplaceContent = {
    val __obj = js.Dynamic.literal(replaceContent = replaceContent.asInstanceOf[js.Any], replacePattern = replacePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContent]
  }
  @scala.inline
  implicit class ReplaceContentOps[Self <: ReplaceContent] (val x: Self) extends AnyVal {
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
    def setReplaceContent(value: String): Self = this.set("replaceContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacePattern(value: String | RegExp): Self = this.set("replacePattern", value.asInstanceOf[js.Any])
  }
  
}

