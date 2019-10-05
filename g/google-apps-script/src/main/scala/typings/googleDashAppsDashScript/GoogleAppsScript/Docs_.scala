package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Collection.DocumentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.AutoText
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Background
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.BatchUpdateDocumentRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Body
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Bullet
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Color
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.ColumnBreak
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.CreateNamedRangeRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.CreateParagraphBulletsRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DeleteContentRangeRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DeleteNamedRangeRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DeleteParagraphBulletsRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DeletePositionedObjectRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DeleteTableColumnRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DeleteTableRowRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Dimension
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.DocumentStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.EndOfSegmentLocation
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Equation
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.FootnoteReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.HorizontalRule
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.InlineObjectElement
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.InsertInlineImageRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.InsertPageBreakRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.InsertTableRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.InsertTableRowRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.InsertTextRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Link
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Location
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.NamedStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.NamedStyles
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.OptionalColor
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.PageBreak
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Paragraph
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.ParagraphBorder
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.ParagraphElement
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.ParagraphStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Range
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.ReplaceAllTextRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Request
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.RgbColor
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.SectionBreak
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.SectionColumnProperties
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.SectionStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Shading
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Size
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.StructuralElement
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.SubstringMatchCriteria
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TabStop
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Table
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableCell
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableCellBorder
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableCellLocation
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableCellStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableColumnProperties
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableOfContents
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableRow
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableRowStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TableStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TextRun
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.TextStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.UpdateParagraphStyleRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.UpdateTextStyleRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.WeightedFontFamily
import typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.WriteControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Docs")
trait Docs_ extends js.Object {
  var Documents: js.UndefOr[DocumentsCollection] = js.undefined
  // Create a new instance of AutoText
  def newAutoText(): AutoText
  // Create a new instance of Background
  def newBackground(): Background
  // Create a new instance of BatchUpdateDocumentRequest
  def newBatchUpdateDocumentRequest(): BatchUpdateDocumentRequest
  // Create a new instance of Body
  def newBody(): Body
  // Create a new instance of Bullet
  def newBullet(): Bullet
  // Create a new instance of Color
  def newColor(): Color
  // Create a new instance of ColumnBreak
  def newColumnBreak(): ColumnBreak
  // Create a new instance of CreateNamedRangeRequest
  def newCreateNamedRangeRequest(): CreateNamedRangeRequest
  // Create a new instance of CreateParagraphBulletsRequest
  def newCreateParagraphBulletsRequest(): CreateParagraphBulletsRequest
  // Create a new instance of DeleteContentRangeRequest
  def newDeleteContentRangeRequest(): DeleteContentRangeRequest
  // Create a new instance of DeleteNamedRangeRequest
  def newDeleteNamedRangeRequest(): DeleteNamedRangeRequest
  // Create a new instance of DeleteParagraphBulletsRequest
  def newDeleteParagraphBulletsRequest(): DeleteParagraphBulletsRequest
  // Create a new instance of DeletePositionedObjectRequest
  def newDeletePositionedObjectRequest(): DeletePositionedObjectRequest
  // Create a new instance of DeleteTableColumnRequest
  def newDeleteTableColumnRequest(): DeleteTableColumnRequest
  // Create a new instance of DeleteTableRowRequest
  def newDeleteTableRowRequest(): DeleteTableRowRequest
  // Create a new instance of Dimension
  def newDimension(): Dimension
  // Create a new instance of Document
  def newDocument(): typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Document
  // Create a new instance of DocumentStyle
  def newDocumentStyle(): DocumentStyle
  // Create a new instance of EndOfSegmentLocation
  def newEndOfSegmentLocation(): EndOfSegmentLocation
  // Create a new instance of Equation
  def newEquation(): Equation
  // Create a new instance of FootnoteReference
  def newFootnoteReference(): FootnoteReference
  // Create a new instance of HorizontalRule
  def newHorizontalRule(): HorizontalRule
  // Create a new instance of InlineObjectElement
  def newInlineObjectElement(): InlineObjectElement
  // Create a new instance of InsertInlineImageRequest
  def newInsertInlineImageRequest(): InsertInlineImageRequest
  // Create a new instance of InsertPageBreakRequest
  def newInsertPageBreakRequest(): InsertPageBreakRequest
  // Create a new instance of InsertTableRequest
  def newInsertTableRequest(): InsertTableRequest
  // Create a new instance of InsertTableRowRequest
  def newInsertTableRowRequest(): InsertTableRowRequest
  // Create a new instance of InsertTextRequest
  def newInsertTextRequest(): InsertTextRequest
  // Create a new instance of Link
  def newLink(): Link
  // Create a new instance of Location
  def newLocation(): Location
  // Create a new instance of NamedStyle
  def newNamedStyle(): NamedStyle
  // Create a new instance of NamedStyles
  def newNamedStyles(): NamedStyles
  // Create a new instance of OptionalColor
  def newOptionalColor(): OptionalColor
  // Create a new instance of PageBreak
  def newPageBreak(): PageBreak
  // Create a new instance of Paragraph
  def newParagraph(): Paragraph
  // Create a new instance of ParagraphBorder
  def newParagraphBorder(): ParagraphBorder
  // Create a new instance of ParagraphElement
  def newParagraphElement(): ParagraphElement
  // Create a new instance of ParagraphStyle
  def newParagraphStyle(): ParagraphStyle
  // Create a new instance of Range
  def newRange(): Range
  // Create a new instance of ReplaceAllTextRequest
  def newReplaceAllTextRequest(): ReplaceAllTextRequest
  // Create a new instance of Request
  def newRequest(): Request
  // Create a new instance of RgbColor
  def newRgbColor(): RgbColor
  // Create a new instance of SectionBreak
  def newSectionBreak(): SectionBreak
  // Create a new instance of SectionColumnProperties
  def newSectionColumnProperties(): SectionColumnProperties
  // Create a new instance of SectionStyle
  def newSectionStyle(): SectionStyle
  // Create a new instance of Shading
  def newShading(): Shading
  // Create a new instance of Size
  def newSize(): Size
  // Create a new instance of StructuralElement
  def newStructuralElement(): StructuralElement
  // Create a new instance of SubstringMatchCriteria
  def newSubstringMatchCriteria(): SubstringMatchCriteria
  // Create a new instance of TabStop
  def newTabStop(): TabStop
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of TableCell
  def newTableCell(): TableCell
  // Create a new instance of TableCellBorder
  def newTableCellBorder(): TableCellBorder
  // Create a new instance of TableCellLocation
  def newTableCellLocation(): TableCellLocation
  // Create a new instance of TableCellStyle
  def newTableCellStyle(): TableCellStyle
  // Create a new instance of TableColumnProperties
  def newTableColumnProperties(): TableColumnProperties
  // Create a new instance of TableOfContents
  def newTableOfContents(): TableOfContents
  // Create a new instance of TableRow
  def newTableRow(): TableRow
  // Create a new instance of TableRowStyle
  def newTableRowStyle(): TableRowStyle
  // Create a new instance of TableStyle
  def newTableStyle(): TableStyle
  // Create a new instance of TextRun
  def newTextRun(): TextRun
  // Create a new instance of TextStyle
  def newTextStyle(): TextStyle
  // Create a new instance of UpdateParagraphStyleRequest
  def newUpdateParagraphStyleRequest(): UpdateParagraphStyleRequest
  // Create a new instance of UpdateTextStyleRequest
  def newUpdateTextStyleRequest(): UpdateTextStyleRequest
  // Create a new instance of WeightedFontFamily
  def newWeightedFontFamily(): WeightedFontFamily
  // Create a new instance of WriteControl
  def newWriteControl(): WriteControl
}

object Docs_ {
  @scala.inline
  def apply(
    newAutoText: () => AutoText,
    newBackground: () => Background,
    newBatchUpdateDocumentRequest: () => BatchUpdateDocumentRequest,
    newBody: () => Body,
    newBullet: () => Bullet,
    newColor: () => Color,
    newColumnBreak: () => ColumnBreak,
    newCreateNamedRangeRequest: () => CreateNamedRangeRequest,
    newCreateParagraphBulletsRequest: () => CreateParagraphBulletsRequest,
    newDeleteContentRangeRequest: () => DeleteContentRangeRequest,
    newDeleteNamedRangeRequest: () => DeleteNamedRangeRequest,
    newDeleteParagraphBulletsRequest: () => DeleteParagraphBulletsRequest,
    newDeletePositionedObjectRequest: () => DeletePositionedObjectRequest,
    newDeleteTableColumnRequest: () => DeleteTableColumnRequest,
    newDeleteTableRowRequest: () => DeleteTableRowRequest,
    newDimension: () => Dimension,
    newDocument: () => typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema.Document,
    newDocumentStyle: () => DocumentStyle,
    newEndOfSegmentLocation: () => EndOfSegmentLocation,
    newEquation: () => Equation,
    newFootnoteReference: () => FootnoteReference,
    newHorizontalRule: () => HorizontalRule,
    newInlineObjectElement: () => InlineObjectElement,
    newInsertInlineImageRequest: () => InsertInlineImageRequest,
    newInsertPageBreakRequest: () => InsertPageBreakRequest,
    newInsertTableRequest: () => InsertTableRequest,
    newInsertTableRowRequest: () => InsertTableRowRequest,
    newInsertTextRequest: () => InsertTextRequest,
    newLink: () => Link,
    newLocation: () => Location,
    newNamedStyle: () => NamedStyle,
    newNamedStyles: () => NamedStyles,
    newOptionalColor: () => OptionalColor,
    newPageBreak: () => PageBreak,
    newParagraph: () => Paragraph,
    newParagraphBorder: () => ParagraphBorder,
    newParagraphElement: () => ParagraphElement,
    newParagraphStyle: () => ParagraphStyle,
    newRange: () => Range,
    newReplaceAllTextRequest: () => ReplaceAllTextRequest,
    newRequest: () => Request,
    newRgbColor: () => RgbColor,
    newSectionBreak: () => SectionBreak,
    newSectionColumnProperties: () => SectionColumnProperties,
    newSectionStyle: () => SectionStyle,
    newShading: () => Shading,
    newSize: () => Size,
    newStructuralElement: () => StructuralElement,
    newSubstringMatchCriteria: () => SubstringMatchCriteria,
    newTabStop: () => TabStop,
    newTable: () => Table,
    newTableCell: () => TableCell,
    newTableCellBorder: () => TableCellBorder,
    newTableCellLocation: () => TableCellLocation,
    newTableCellStyle: () => TableCellStyle,
    newTableColumnProperties: () => TableColumnProperties,
    newTableOfContents: () => TableOfContents,
    newTableRow: () => TableRow,
    newTableRowStyle: () => TableRowStyle,
    newTableStyle: () => TableStyle,
    newTextRun: () => TextRun,
    newTextStyle: () => TextStyle,
    newUpdateParagraphStyleRequest: () => UpdateParagraphStyleRequest,
    newUpdateTextStyleRequest: () => UpdateTextStyleRequest,
    newWeightedFontFamily: () => WeightedFontFamily,
    newWriteControl: () => WriteControl,
    Documents: DocumentsCollection = null
  ): Docs_ = {
    val __obj = js.Dynamic.literal(newAutoText = js.Any.fromFunction0(newAutoText), newBackground = js.Any.fromFunction0(newBackground), newBatchUpdateDocumentRequest = js.Any.fromFunction0(newBatchUpdateDocumentRequest), newBody = js.Any.fromFunction0(newBody), newBullet = js.Any.fromFunction0(newBullet), newColor = js.Any.fromFunction0(newColor), newColumnBreak = js.Any.fromFunction0(newColumnBreak), newCreateNamedRangeRequest = js.Any.fromFunction0(newCreateNamedRangeRequest), newCreateParagraphBulletsRequest = js.Any.fromFunction0(newCreateParagraphBulletsRequest), newDeleteContentRangeRequest = js.Any.fromFunction0(newDeleteContentRangeRequest), newDeleteNamedRangeRequest = js.Any.fromFunction0(newDeleteNamedRangeRequest), newDeleteParagraphBulletsRequest = js.Any.fromFunction0(newDeleteParagraphBulletsRequest), newDeletePositionedObjectRequest = js.Any.fromFunction0(newDeletePositionedObjectRequest), newDeleteTableColumnRequest = js.Any.fromFunction0(newDeleteTableColumnRequest), newDeleteTableRowRequest = js.Any.fromFunction0(newDeleteTableRowRequest), newDimension = js.Any.fromFunction0(newDimension), newDocument = js.Any.fromFunction0(newDocument), newDocumentStyle = js.Any.fromFunction0(newDocumentStyle), newEndOfSegmentLocation = js.Any.fromFunction0(newEndOfSegmentLocation), newEquation = js.Any.fromFunction0(newEquation), newFootnoteReference = js.Any.fromFunction0(newFootnoteReference), newHorizontalRule = js.Any.fromFunction0(newHorizontalRule), newInlineObjectElement = js.Any.fromFunction0(newInlineObjectElement), newInsertInlineImageRequest = js.Any.fromFunction0(newInsertInlineImageRequest), newInsertPageBreakRequest = js.Any.fromFunction0(newInsertPageBreakRequest), newInsertTableRequest = js.Any.fromFunction0(newInsertTableRequest), newInsertTableRowRequest = js.Any.fromFunction0(newInsertTableRowRequest), newInsertTextRequest = js.Any.fromFunction0(newInsertTextRequest), newLink = js.Any.fromFunction0(newLink), newLocation = js.Any.fromFunction0(newLocation), newNamedStyle = js.Any.fromFunction0(newNamedStyle), newNamedStyles = js.Any.fromFunction0(newNamedStyles), newOptionalColor = js.Any.fromFunction0(newOptionalColor), newPageBreak = js.Any.fromFunction0(newPageBreak), newParagraph = js.Any.fromFunction0(newParagraph), newParagraphBorder = js.Any.fromFunction0(newParagraphBorder), newParagraphElement = js.Any.fromFunction0(newParagraphElement), newParagraphStyle = js.Any.fromFunction0(newParagraphStyle), newRange = js.Any.fromFunction0(newRange), newReplaceAllTextRequest = js.Any.fromFunction0(newReplaceAllTextRequest), newRequest = js.Any.fromFunction0(newRequest), newRgbColor = js.Any.fromFunction0(newRgbColor), newSectionBreak = js.Any.fromFunction0(newSectionBreak), newSectionColumnProperties = js.Any.fromFunction0(newSectionColumnProperties), newSectionStyle = js.Any.fromFunction0(newSectionStyle), newShading = js.Any.fromFunction0(newShading), newSize = js.Any.fromFunction0(newSize), newStructuralElement = js.Any.fromFunction0(newStructuralElement), newSubstringMatchCriteria = js.Any.fromFunction0(newSubstringMatchCriteria), newTabStop = js.Any.fromFunction0(newTabStop), newTable = js.Any.fromFunction0(newTable), newTableCell = js.Any.fromFunction0(newTableCell), newTableCellBorder = js.Any.fromFunction0(newTableCellBorder), newTableCellLocation = js.Any.fromFunction0(newTableCellLocation), newTableCellStyle = js.Any.fromFunction0(newTableCellStyle), newTableColumnProperties = js.Any.fromFunction0(newTableColumnProperties), newTableOfContents = js.Any.fromFunction0(newTableOfContents), newTableRow = js.Any.fromFunction0(newTableRow), newTableRowStyle = js.Any.fromFunction0(newTableRowStyle), newTableStyle = js.Any.fromFunction0(newTableStyle), newTextRun = js.Any.fromFunction0(newTextRun), newTextStyle = js.Any.fromFunction0(newTextStyle), newUpdateParagraphStyleRequest = js.Any.fromFunction0(newUpdateParagraphStyleRequest), newUpdateTextStyleRequest = js.Any.fromFunction0(newUpdateTextStyleRequest), newWeightedFontFamily = js.Any.fromFunction0(newWeightedFontFamily), newWriteControl = js.Any.fromFunction0(newWriteControl))
    if (Documents != null) __obj.updateDynamic("Documents")(Documents)
    __obj.asInstanceOf[Docs_]
  }
}

