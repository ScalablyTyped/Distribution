package typings
package flatpickrLib.distTypesInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatting extends js.Object {
  var formats: flatpickrLib.distUtilsFormattingMod.Formats
  var revFormat: flatpickrLib.distUtilsFormattingMod.RevFormat
  var tokenRegex: flatpickrLib.distUtilsFormattingMod.TokenRegex
}

object Formatting {
  @scala.inline
  def apply(
    formats: flatpickrLib.distUtilsFormattingMod.Formats,
    revFormat: flatpickrLib.distUtilsFormattingMod.RevFormat,
    tokenRegex: flatpickrLib.distUtilsFormattingMod.TokenRegex
  ): Formatting = {
    val __obj = js.Dynamic.literal(formats = formats, revFormat = revFormat, tokenRegex = tokenRegex)
  
    __obj.asInstanceOf[Formatting]
  }
}

