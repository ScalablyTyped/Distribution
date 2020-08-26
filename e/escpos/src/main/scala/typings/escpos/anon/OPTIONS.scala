package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OPTIONS extends js.Object {
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E = js.native
  var OPTIONS: H = js.native
}

object OPTIONS {
  @scala.inline
  def apply(CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E, OPTIONS: H): OPTIONS = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPTIONS]
  }
  @scala.inline
  implicit class OPTIONSOps[Self <: OPTIONS] (val x: Self) extends AnyVal {
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
    def setCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1E): Self = this.set("CMD", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPTIONS(value: H): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
  }
  
}

