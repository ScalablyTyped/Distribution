package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attests to accuracy of composition
  */
trait CompositionAttester extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.undefined
  /**
    * personal | professional | legal | official
    */
  var mode: js.Array[code]
  /**
    * Who attested the composition
    */
  var party: js.UndefOr[Reference] = js.undefined
  /**
    * When the composition was attested
    */
  var time: js.UndefOr[dateTime] = js.undefined
}

object CompositionAttester {
  @scala.inline
  def apply(
    mode: js.Array[code],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: js.Array[Element] = null,
    _time: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    party: Reference = null,
    time: dateTime = null
  ): CompositionAttester = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_time != null) __obj.updateDynamic("_time")(_time)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (party != null) __obj.updateDynamic("party")(party)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[CompositionAttester]
  }
}

