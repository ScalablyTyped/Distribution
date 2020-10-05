package typings.expo.anon

import typings.expo.expoStrings.downloadProgress
import typings.expo.expoStrings.downloadStart
import typings.expo.expoStrings.noUpdateAvailable
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable = js.native
}

object `0` {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setType(value: downloadStart | downloadProgress | noUpdateAvailable): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

