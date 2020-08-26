package typings.dwt.webTwainAcquireMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAndLabel extends js.Object {
  /**
    * Label or name of the item
    */
  var label: String = js.native
  /**
    * Numeric representation of the item
    */
  var value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double = js.native
}

object ValueAndLabel {
  @scala.inline
  def apply(label: String, value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double): ValueAndLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAndLabel]
  }
  @scala.inline
  implicit class ValueAndLabelOps[Self <: ValueAndLabel] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

