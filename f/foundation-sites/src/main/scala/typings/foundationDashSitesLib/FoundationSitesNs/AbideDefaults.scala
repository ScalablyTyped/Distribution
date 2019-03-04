package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbideDefaults extends js.Object {
  var formErrorClass: java.lang.String
  var formErrorSelector: java.lang.String
  var inputErrorClass: java.lang.String
  var labelErrorClass: java.lang.String
  var liveValidate: scala.Boolean
  var patterns: IAbidePatterns
  var validateOn: java.lang.String
  var validateOnBlur: scala.Boolean
  var validators: js.Any
}

object AbideDefaults {
  @scala.inline
  def apply(
    formErrorClass: java.lang.String,
    formErrorSelector: java.lang.String,
    inputErrorClass: java.lang.String,
    labelErrorClass: java.lang.String,
    liveValidate: scala.Boolean,
    patterns: IAbidePatterns,
    validateOn: java.lang.String,
    validateOnBlur: scala.Boolean,
    validators: js.Any
  ): AbideDefaults = {
    val __obj = js.Dynamic.literal(formErrorClass = formErrorClass, formErrorSelector = formErrorSelector, inputErrorClass = inputErrorClass, labelErrorClass = labelErrorClass, liveValidate = liveValidate, patterns = patterns, validateOn = validateOn, validateOnBlur = validateOnBlur, validators = validators)
  
    __obj.asInstanceOf[AbideDefaults]
  }
}

