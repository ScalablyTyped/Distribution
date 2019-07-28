package typings.flatpickr.distTypesInstanceMod

import typings.flatpickr.distUtilsFormattingMod.Formats
import typings.flatpickr.distUtilsFormattingMod.RevFormat
import typings.flatpickr.distUtilsFormattingMod.TokenRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatting extends js.Object {
  var formats: Formats
  var revFormat: RevFormat
  var tokenRegex: TokenRegex
}

object Formatting {
  @scala.inline
  def apply(formats: Formats, revFormat: RevFormat, tokenRegex: TokenRegex): Formatting = {
    val __obj = js.Dynamic.literal(formats = formats, revFormat = revFormat, tokenRegex = tokenRegex)
  
    __obj.asInstanceOf[Formatting]
  }
}

