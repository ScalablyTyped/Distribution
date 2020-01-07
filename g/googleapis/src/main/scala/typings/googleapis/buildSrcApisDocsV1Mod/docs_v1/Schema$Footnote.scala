package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document footnote.
  */
@js.native
trait Schema$Footnote extends js.Object {
  /**
    * The contents of the footnote.  The indexes for a footnote&#39;s content
    * begin at zero.
    */
  var content: js.UndefOr[js.Array[Schema$StructuralElement]] = js.native
  /**
    * The ID of the footnote.
    */
  var footnoteId: js.UndefOr[String] = js.native
}

object Schema$Footnote {
  @scala.inline
  def apply(content: js.Array[Schema$StructuralElement] = null, footnoteId: String = null): Schema$Footnote = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footnoteId != null) __obj.updateDynamic("footnoteId")(footnoteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Footnote]
  }
}

