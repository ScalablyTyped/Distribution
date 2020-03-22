package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.AnonLayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsSummary extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[AnonLayerId]] = js.undefined
}

object AnnotationsSummary {
  @scala.inline
  def apply(kind: String = null, layers: js.Array[AnonLayerId] = null): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsSummary]
  }
}

