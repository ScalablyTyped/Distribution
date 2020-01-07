package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts a table at the specified location.  A newline character will be
  * inserted before the inserted table.
  */
@js.native
trait Schema$InsertTableRequest extends js.Object {
  /**
    * The number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Inserts the table at the end of the given header, footer or document
    * body. A newline character will be inserted before the inserted table.
    * Tables cannot be inserted inside a footnote.
    */
  var endOfSegmentLocation: js.UndefOr[Schema$EndOfSegmentLocation] = js.native
  /**
    * Inserts the table at a specific model index.  A newline character will be
    * inserted before the inserted table, therefore the table start index will
    * be at the specified location index + 1.  The table must be inserted
    * inside the bounds of an existing Paragraph. For instance, it cannot be
    * inserted at a table&#39;s start index (i.e. between an existing table and
    * its preceding paragraph).  Tables cannot be inserted inside a footnote or
    * equation.
    */
  var location: js.UndefOr[Schema$Location] = js.native
  /**
    * The number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
}

object Schema$InsertTableRequest {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    endOfSegmentLocation: Schema$EndOfSegmentLocation = null,
    location: Schema$Location = null,
    rows: Int | Double = null
  ): Schema$InsertTableRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertTableRequest]
  }
}

