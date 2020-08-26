package typings.formatjsIntlGetcanonicallocales.typesMod

import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PuExtension extends Extension {
  @JSName("type")
  var type_PuExtension: x = js.native
  var value: String = js.native
}

object PuExtension {
  @scala.inline
  def apply(`type`: x, value: String): PuExtension = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PuExtension]
  }
  @scala.inline
  implicit class PuExtensionOps[Self <: PuExtension] (val x: Self) extends AnyVal {
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
    def setType(value: typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.x): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

