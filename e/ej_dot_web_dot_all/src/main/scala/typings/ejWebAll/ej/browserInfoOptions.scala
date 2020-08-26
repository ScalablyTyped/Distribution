package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait browserInfoOptions extends js.Object {
  var culture: js.Any = js.native
  var isMSPointerEnabled: Boolean = js.native
  var name: String = js.native
  var version: String = js.native
}

object browserInfoOptions {
  @scala.inline
  def apply(culture: js.Any, isMSPointerEnabled: Boolean, name: String, version: String): browserInfoOptions = {
    val __obj = js.Dynamic.literal(culture = culture.asInstanceOf[js.Any], isMSPointerEnabled = isMSPointerEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[browserInfoOptions]
  }
  @scala.inline
  implicit class browserInfoOptionsOps[Self <: browserInfoOptions] (val x: Self) extends AnyVal {
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
    def setCulture(value: js.Any): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMSPointerEnabled(value: Boolean): Self = this.set("isMSPointerEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

