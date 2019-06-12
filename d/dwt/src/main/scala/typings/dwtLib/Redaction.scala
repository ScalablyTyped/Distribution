package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redaction extends js.Object {
  var FindText: java.lang.String
  var FindTextAction: dwtLib.EnumDWT_OCRFindTextAction.OCRFT_MARKFORREDACT
  var FindTextFlags: dwtLib.EnumDWT_OCRFindTextFlags.OCRFT_WHOLEWORD
}

object Redaction {
  @scala.inline
  def apply(
    FindText: java.lang.String,
    FindTextAction: dwtLib.EnumDWT_OCRFindTextAction.OCRFT_MARKFORREDACT,
    FindTextFlags: dwtLib.EnumDWT_OCRFindTextFlags.OCRFT_WHOLEWORD
  ): Redaction = {
    val __obj = js.Dynamic.literal(FindText = FindText, FindTextAction = FindTextAction, FindTextFlags = FindTextFlags)
  
    __obj.asInstanceOf[Redaction]
  }
}

