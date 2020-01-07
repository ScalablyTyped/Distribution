package typings.googleapis

import typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Schema$BooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CfiRangeContentVersion extends js.Object {
  var cfiRange: js.UndefOr[Schema$BooksAnnotationsRange] = js.native
  var contentVersion: js.UndefOr[String] = js.native
  var gbImageRange: js.UndefOr[Schema$BooksAnnotationsRange] = js.native
  var gbTextRange: js.UndefOr[Schema$BooksAnnotationsRange] = js.native
}

object Anon_CfiRangeContentVersion {
  @scala.inline
  def apply(
    cfiRange: Schema$BooksAnnotationsRange = null,
    contentVersion: String = null,
    gbImageRange: Schema$BooksAnnotationsRange = null,
    gbTextRange: Schema$BooksAnnotationsRange = null
  ): Anon_CfiRangeContentVersion = {
    val __obj = js.Dynamic.literal()
    if (cfiRange != null) __obj.updateDynamic("cfiRange")(cfiRange.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (gbImageRange != null) __obj.updateDynamic("gbImageRange")(gbImageRange.asInstanceOf[js.Any])
    if (gbTextRange != null) __obj.updateDynamic("gbTextRange")(gbTextRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CfiRangeContentVersion]
  }
}

