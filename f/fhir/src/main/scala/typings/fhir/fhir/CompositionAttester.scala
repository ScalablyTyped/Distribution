package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attests to accuracy of composition
  */
@js.native
trait CompositionAttester extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.native
  /**
    * personal | professional | legal | official
    */
  var mode: js.Array[code] = js.native
  /**
    * Who attested the composition
    */
  var party: js.UndefOr[Reference] = js.native
  /**
    * When the composition was attested
    */
  var time: js.UndefOr[dateTime] = js.native
}

object CompositionAttester {
  @scala.inline
  def apply(mode: js.Array[code]): CompositionAttester = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionAttester]
  }
  @scala.inline
  implicit class CompositionAttesterOps[Self <: CompositionAttester] (val x: Self) extends AnyVal {
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
    def setModeVarargs(value: code*): Self = this.set("mode", js.Array(value :_*))
    @scala.inline
    def setMode(value: js.Array[code]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def set_modeVarargs(value: Element*): Self = this.set("_mode", js.Array(value :_*))
    @scala.inline
    def set_mode(value: js.Array[Element]): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def set_time(value: Element): Self = this.set("_time", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_time: Self = this.set("_time", js.undefined)
    @scala.inline
    def setParty(value: Reference): Self = this.set("party", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParty: Self = this.set("party", js.undefined)
    @scala.inline
    def setTime(value: dateTime): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

