package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlusCode extends js.Object {
  /** is a 6 character or longer local code with an explicit location (CWC8+R9, Mountain View, CA, USA). */
  var compound_code: String = js.native
  /** is a 4 character area code and 6 character or longer local code (849VCWC8+R9). */
  var global_code: String = js.native
}

object PlusCode {
  @scala.inline
  def apply(compound_code: String, global_code: String): PlusCode = {
    val __obj = js.Dynamic.literal(compound_code = compound_code.asInstanceOf[js.Any], global_code = global_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusCode]
  }
  @scala.inline
  implicit class PlusCodeOps[Self <: PlusCode] (val x: Self) extends AnyVal {
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
    def setCompound_code(value: String): Self = this.set("compound_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal_code(value: String): Self = this.set("global_code", value.asInstanceOf[js.Any])
  }
  
}

