package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayInForeground extends js.Object {
  var _displayInForeground: js.UndefOr[Boolean] = js.native
  var sound: js.UndefOr[Boolean] = js.native
}

object DisplayInForeground {
  @scala.inline
  def apply(): DisplayInForeground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayInForeground]
  }
  @scala.inline
  implicit class DisplayInForegroundOps[Self <: DisplayInForeground] (val x: Self) extends AnyVal {
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
    def set_displayInForeground(value: Boolean): Self = this.set("_displayInForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_displayInForeground: Self = this.set("_displayInForeground", js.undefined)
    @scala.inline
    def setSound(value: Boolean): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
  }
  
}

