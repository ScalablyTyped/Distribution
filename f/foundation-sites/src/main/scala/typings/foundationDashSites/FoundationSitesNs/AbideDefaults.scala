package typings.foundationDashSites.FoundationSitesNs

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
    val __obj = js.Dynamic.literal(formErrorClass = formErrorClass, formErrorSelector = formErrorSelector, inputErrorClass = inputErrorClass, labelErrorClass = labelErrorClass, liveValidate = liveValidate, patterns = patterns, validateOn = validateOn, validateOnBlur = validateOnBlur, validators = validators)
  
    __obj.asInstanceOf[AbideDefaults]
  }
}

