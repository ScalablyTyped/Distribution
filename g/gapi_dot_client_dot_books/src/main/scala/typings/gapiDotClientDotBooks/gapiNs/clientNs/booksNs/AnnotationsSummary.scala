package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClientDotBooks.Anon_AllowedCharacterCountLayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsSummary extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[Anon_AllowedCharacterCountLayerId]] = js.undefined
}

object AnnotationsSummary {
  @scala.inline
  def apply(kind: String = null, layers: js.Array[Anon_AllowedCharacterCountLayerId] = null): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[AnnotationsSummary]
  }
}

