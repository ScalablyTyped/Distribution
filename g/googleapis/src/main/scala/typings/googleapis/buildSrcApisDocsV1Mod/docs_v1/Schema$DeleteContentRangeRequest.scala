package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes content from the document.
  */
@js.native
trait Schema$DeleteContentRangeRequest extends js.Object {
  /**
    * The range of content to delete.  Deleting text that crosses a paragraph
    * boundary may result in changes to paragraph styles, lists, positioned
    * objects and bookmarks as the two paragraphs are merged.  Attempting to
    * delete certain ranges can result in an invalid document structure in
    * which case a 400 bad request error is returned.  Some examples of invalid
    * delete requests include:  * Deleting one code unit of a surrogate pair. *
    * Deleting the last newline character of a Body, Header,   Footer,
    * Footnote, TableCell or TableOfContents. * Deleting the start or end of a
    * Table,   TableOfContents or Equation without deleting the entire element.
    * * Deleting the newline character before a   Table,   TableOfContents or
    * SectionBreak without deleting the   element. * Deleting individual rows
    * or cells of a table. Deleting the content within   a table cell is
    * allowed.
    */
  var range: js.UndefOr[Schema$Range] = js.native
}

object Schema$DeleteContentRangeRequest {
  @scala.inline
  def apply(range: Schema$Range = null): Schema$DeleteContentRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteContentRangeRequest]
  }
}

