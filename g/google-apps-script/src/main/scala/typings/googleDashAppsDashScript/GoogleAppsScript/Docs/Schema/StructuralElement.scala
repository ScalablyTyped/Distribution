package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuralElement extends js.Object {
  var endIndex: js.UndefOr[Double] = js.undefined
  var paragraph: js.UndefOr[Paragraph] = js.undefined
  var sectionBreak: js.UndefOr[SectionBreak] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var tableOfContents: js.UndefOr[TableOfContents] = js.undefined
}

object StructuralElement {
  @scala.inline
  def apply(
    endIndex: Int | Double = null,
    paragraph: Paragraph = null,
    sectionBreak: SectionBreak = null,
    startIndex: Int | Double = null,
    table: Table = null,
    tableOfContents: TableOfContents = null
  ): StructuralElement = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (sectionBreak != null) __obj.updateDynamic("sectionBreak")(sectionBreak.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableOfContents != null) __obj.updateDynamic("tableOfContents")(tableOfContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuralElement]
  }
}

