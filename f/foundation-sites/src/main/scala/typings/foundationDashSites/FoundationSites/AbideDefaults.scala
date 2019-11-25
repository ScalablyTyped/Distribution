package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbideDefaults extends js.Object {
  var formErrorClass: String
  var formErrorSelector: String
  var inputErrorClass: String
  var labelErrorClass: String
  var liveValidate: Boolean
  var patterns: IAbidePatterns
  var validateOn: String
  var validateOnBlur: Boolean
  var validators: js.Any
}

object AbideDefaults {
  @scala.inline
  def apply(
    formErrorClass: String,
    formErrorSelector: String,
    inputErrorClass: String,
    labelErrorClass: String,
    liveValidate: Boolean,
    patterns: IAbidePatterns,
    validateOn: String,
    validateOnBlur: Boolean,
    validators: js.Any
  ): AbideDefaults = {
    val __obj = js.Dynamic.literal(formErrorClass = formErrorClass.asInstanceOf[js.Any], formErrorSelector = formErrorSelector.asInstanceOf[js.Any], inputErrorClass = inputErrorClass.asInstanceOf[js.Any], labelErrorClass = labelErrorClass.asInstanceOf[js.Any], liveValidate = liveValidate.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], validateOn = validateOn.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbideDefaults]
  }
}

