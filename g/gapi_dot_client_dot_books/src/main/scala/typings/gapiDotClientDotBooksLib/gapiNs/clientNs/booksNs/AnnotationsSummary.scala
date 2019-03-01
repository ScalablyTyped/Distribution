package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsSummary extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_AllowedCharacterCountLayerId]] = js.undefined
}

object AnnotationsSummary {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    layers: js.Array[gapiDotClientDotBooksLib.Anon_AllowedCharacterCountLayerId] = null
  ): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[AnnotationsSummary]
  }
}

