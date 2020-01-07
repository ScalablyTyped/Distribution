package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A named style. Paragraphs in the document can inherit their TextStyle and
  * ParagraphStyle from this named style when they have the same named style
  * type.
  */
@js.native
trait Schema$NamedStyle extends js.Object {
  /**
    * The type of this named style.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * The paragraph style of this named style.
    */
  var paragraphStyle: js.UndefOr[Schema$ParagraphStyle] = js.native
  /**
    * The text style of this named style.
    */
  var textStyle: js.UndefOr[Schema$TextStyle] = js.native
}

object Schema$NamedStyle {
  @scala.inline
  def apply(
    namedStyleType: String = null,
    paragraphStyle: Schema$ParagraphStyle = null,
    textStyle: Schema$TextStyle = null
  ): Schema$NamedStyle = {
    val __obj = js.Dynamic.literal()
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType.asInstanceOf[js.Any])
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedStyle]
  }
}

