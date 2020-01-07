package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_AllowedCharacterCountLayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AnnotationsSummary extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[Anon_AllowedCharacterCountLayerId]] = js.native
}

object Schema$AnnotationsSummary {
  @scala.inline
  def apply(kind: String = null, layers: js.Array[Anon_AllowedCharacterCountLayerId] = null): Schema$AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotationsSummary]
  }
}

