package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts a page break followed by a newline at the specified location.
  */
@js.native
trait Schema$InsertPageBreakRequest extends js.Object {
  /**
    * Inserts the page break at the end of the document body.  Page breaks
    * cannot be inserted inside a footnote, header or footer. Since page breaks
    * can only be inserted inside the body, the segment ID field must be empty.
    */
  var endOfSegmentLocation: js.UndefOr[Schema$EndOfSegmentLocation] = js.native
  /**
    * Inserts the page break at a specific index in the document.  The page
    * break must be inserted inside the bounds of an existing Paragraph. For
    * instance, it cannot be inserted at a table&#39;s start index (i.e.
    * between the table and its preceding paragraph).  Page breaks cannot be
    * inserted inside a table, equation, footnote, header or footer. Since page
    * breaks can only be inserted inside the body, the segment ID field must be
    * empty.
    */
  var location: js.UndefOr[Schema$Location] = js.native
}

object Schema$InsertPageBreakRequest {
  @scala.inline
  def apply(endOfSegmentLocation: Schema$EndOfSegmentLocation = null, location: Schema$Location = null): Schema$InsertPageBreakRequest = {
    val __obj = js.Dynamic.literal()
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertPageBreakRequest]
  }
}

