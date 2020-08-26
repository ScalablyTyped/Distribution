package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFloodlightVariable extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customFloodlightVariable". */
  var kind: js.UndefOr[String] = js.native
  /** The type of custom floodlight variable to supply a value for. These map to the "u[1-20]=" in the tags. */
  var `type`: js.UndefOr[String] = js.native
  /** The value of the custom floodlight variable. The length of string must not exceed 50 characters. */
  var value: js.UndefOr[String] = js.native
}

object CustomFloodlightVariable {
  @scala.inline
  def apply(): CustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFloodlightVariable]
  }
  @scala.inline
  implicit class CustomFloodlightVariableOps[Self <: CustomFloodlightVariable] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

