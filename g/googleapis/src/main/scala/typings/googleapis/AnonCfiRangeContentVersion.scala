package typings.googleapis

import typings.googleapis.booksV1Mod.booksV1.SchemaBooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCfiRangeContentVersion extends js.Object {
  var cfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  var contentVersion: js.UndefOr[String] = js.native
  var gbImageRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  var gbTextRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
}

object AnonCfiRangeContentVersion {
  @scala.inline
  def apply(
    cfiRange: SchemaBooksAnnotationsRange = null,
    contentVersion: String = null,
    gbImageRange: SchemaBooksAnnotationsRange = null,
    gbTextRange: SchemaBooksAnnotationsRange = null
  ): AnonCfiRangeContentVersion = {
    val __obj = js.Dynamic.literal()
    if (cfiRange != null) __obj.updateDynamic("cfiRange")(cfiRange.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (gbImageRange != null) __obj.updateDynamic("gbImageRange")(gbImageRange.asInstanceOf[js.Any])
    if (gbTextRange != null) __obj.updateDynamic("gbTextRange")(gbTextRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCfiRangeContentVersion]
  }
}

