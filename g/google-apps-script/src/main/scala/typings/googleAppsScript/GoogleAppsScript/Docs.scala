package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Docs.Collection.DocumentsCollection
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.AutoText
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Background
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.BatchUpdateDocumentRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.BatchUpdateDocumentResponse
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Body
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Bullet
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Color
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.ColumnBreak
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.CreateNamedRangeRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.CreateParagraphBulletsRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteContentRangeRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteNamedRangeRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteParagraphBulletsRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DeletePositionedObjectRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteTableColumnRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteTableRowRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Dimension
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.DocumentStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.EndOfSegmentLocation
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Equation
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.FootnoteReference
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.HorizontalRule
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.InlineObjectElement
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertInlineImageRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertPageBreakRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTableRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTableRowRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTextRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Link
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Location
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.NamedStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.NamedStyles
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.OptionalColor
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.PageBreak
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Paragraph
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphBorder
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphElement
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Range
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.ReplaceAllTextRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Request
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.RgbColor
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionBreak
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionColumnProperties
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Shading
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Size
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.StructuralElement
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.SubstringMatchCriteria
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TabStop
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCell
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellBorder
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellLocation
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableColumnProperties
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableOfContents
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableRow
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableRowStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TableStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TextRun
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.TextStyle
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.UpdateParagraphStyleRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.UpdateTextStyleRequest
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.WeightedFontFamily
import typings.googleAppsScript.GoogleAppsScript.Docs.Schema.WriteControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Docs extends StObject {
  
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
  def newDocument(): typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document
  
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
object Docs {
  
  inline def apply(
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
    newDocument: () => typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document,
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
    newWriteControl: () => WriteControl
  ): Docs = {
    val __obj = js.Dynamic.literal(newAutoText = js.Any.fromFunction0(newAutoText), newBackground = js.Any.fromFunction0(newBackground), newBatchUpdateDocumentRequest = js.Any.fromFunction0(newBatchUpdateDocumentRequest), newBody = js.Any.fromFunction0(newBody), newBullet = js.Any.fromFunction0(newBullet), newColor = js.Any.fromFunction0(newColor), newColumnBreak = js.Any.fromFunction0(newColumnBreak), newCreateNamedRangeRequest = js.Any.fromFunction0(newCreateNamedRangeRequest), newCreateParagraphBulletsRequest = js.Any.fromFunction0(newCreateParagraphBulletsRequest), newDeleteContentRangeRequest = js.Any.fromFunction0(newDeleteContentRangeRequest), newDeleteNamedRangeRequest = js.Any.fromFunction0(newDeleteNamedRangeRequest), newDeleteParagraphBulletsRequest = js.Any.fromFunction0(newDeleteParagraphBulletsRequest), newDeletePositionedObjectRequest = js.Any.fromFunction0(newDeletePositionedObjectRequest), newDeleteTableColumnRequest = js.Any.fromFunction0(newDeleteTableColumnRequest), newDeleteTableRowRequest = js.Any.fromFunction0(newDeleteTableRowRequest), newDimension = js.Any.fromFunction0(newDimension), newDocument = js.Any.fromFunction0(newDocument), newDocumentStyle = js.Any.fromFunction0(newDocumentStyle), newEndOfSegmentLocation = js.Any.fromFunction0(newEndOfSegmentLocation), newEquation = js.Any.fromFunction0(newEquation), newFootnoteReference = js.Any.fromFunction0(newFootnoteReference), newHorizontalRule = js.Any.fromFunction0(newHorizontalRule), newInlineObjectElement = js.Any.fromFunction0(newInlineObjectElement), newInsertInlineImageRequest = js.Any.fromFunction0(newInsertInlineImageRequest), newInsertPageBreakRequest = js.Any.fromFunction0(newInsertPageBreakRequest), newInsertTableRequest = js.Any.fromFunction0(newInsertTableRequest), newInsertTableRowRequest = js.Any.fromFunction0(newInsertTableRowRequest), newInsertTextRequest = js.Any.fromFunction0(newInsertTextRequest), newLink = js.Any.fromFunction0(newLink), newLocation = js.Any.fromFunction0(newLocation), newNamedStyle = js.Any.fromFunction0(newNamedStyle), newNamedStyles = js.Any.fromFunction0(newNamedStyles), newOptionalColor = js.Any.fromFunction0(newOptionalColor), newPageBreak = js.Any.fromFunction0(newPageBreak), newParagraph = js.Any.fromFunction0(newParagraph), newParagraphBorder = js.Any.fromFunction0(newParagraphBorder), newParagraphElement = js.Any.fromFunction0(newParagraphElement), newParagraphStyle = js.Any.fromFunction0(newParagraphStyle), newRange = js.Any.fromFunction0(newRange), newReplaceAllTextRequest = js.Any.fromFunction0(newReplaceAllTextRequest), newRequest = js.Any.fromFunction0(newRequest), newRgbColor = js.Any.fromFunction0(newRgbColor), newSectionBreak = js.Any.fromFunction0(newSectionBreak), newSectionColumnProperties = js.Any.fromFunction0(newSectionColumnProperties), newSectionStyle = js.Any.fromFunction0(newSectionStyle), newShading = js.Any.fromFunction0(newShading), newSize = js.Any.fromFunction0(newSize), newStructuralElement = js.Any.fromFunction0(newStructuralElement), newSubstringMatchCriteria = js.Any.fromFunction0(newSubstringMatchCriteria), newTabStop = js.Any.fromFunction0(newTabStop), newTable = js.Any.fromFunction0(newTable), newTableCell = js.Any.fromFunction0(newTableCell), newTableCellBorder = js.Any.fromFunction0(newTableCellBorder), newTableCellLocation = js.Any.fromFunction0(newTableCellLocation), newTableCellStyle = js.Any.fromFunction0(newTableCellStyle), newTableColumnProperties = js.Any.fromFunction0(newTableColumnProperties), newTableOfContents = js.Any.fromFunction0(newTableOfContents), newTableRow = js.Any.fromFunction0(newTableRow), newTableRowStyle = js.Any.fromFunction0(newTableRowStyle), newTableStyle = js.Any.fromFunction0(newTableStyle), newTextRun = js.Any.fromFunction0(newTextRun), newTextStyle = js.Any.fromFunction0(newTextStyle), newUpdateParagraphStyleRequest = js.Any.fromFunction0(newUpdateParagraphStyleRequest), newUpdateTextStyleRequest = js.Any.fromFunction0(newUpdateTextStyleRequest), newWeightedFontFamily = js.Any.fromFunction0(newWeightedFontFamily), newWriteControl = js.Any.fromFunction0(newWriteControl))
    __obj.asInstanceOf[Docs]
  }
  
  object Collection {
    
    @js.native
    trait DocumentsCollection extends StObject {
      
      // Applies one or more updates to the document.
      // Each request is validated before
      // being applied. If any request is not valid, then the entire request will
      // fail and nothing will be applied.
      // Some requests have replies to
      // give you some information about how they are applied. Other requests do
      // not need to return information; these each return an empty reply.
      // The order of replies matches that of the requests.
      // For example, suppose you call batchUpdate with four updates, and only the
      // third one returns information. The response would have two empty replies,
      // the reply to the third request, and another empty reply, in that order.
      // Because other users may be editing the document, the document
      // might not exactly reflect your changes: your changes may
      // be altered with respect to collaborator changes. If there are no
      // collaborators, the document should reflect your changes. In any case,
      // the updates in your request are guaranteed to be applied together
      // atomically.
      def batchUpdate(resource: BatchUpdateDocumentRequest, documentId: String): BatchUpdateDocumentResponse = js.native
      
      // Creates a blank document using the title given in the request. Other fields
      // in the request, including any provided content, are ignored.
      // Returns the created document.
      def create(resource: typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document): typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document = js.native
      
      // Gets the latest version of the specified document.
      def get(documentId: String): typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document = js.native
      // Gets the latest version of the specified document.
      def get(documentId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document = js.native
    }
  }
  
  extension [Self <: Docs](x: Self) {
    
    inline def setDocuments(value: DocumentsCollection): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
    
    inline def setNewAutoText(value: () => AutoText): Self = StObject.set(x, "newAutoText", js.Any.fromFunction0(value))
    
    inline def setNewBackground(value: () => Background): Self = StObject.set(x, "newBackground", js.Any.fromFunction0(value))
    
    inline def setNewBatchUpdateDocumentRequest(value: () => BatchUpdateDocumentRequest): Self = StObject.set(x, "newBatchUpdateDocumentRequest", js.Any.fromFunction0(value))
    
    inline def setNewBody(value: () => Body): Self = StObject.set(x, "newBody", js.Any.fromFunction0(value))
    
    inline def setNewBullet(value: () => Bullet): Self = StObject.set(x, "newBullet", js.Any.fromFunction0(value))
    
    inline def setNewColor(value: () => Color): Self = StObject.set(x, "newColor", js.Any.fromFunction0(value))
    
    inline def setNewColumnBreak(value: () => ColumnBreak): Self = StObject.set(x, "newColumnBreak", js.Any.fromFunction0(value))
    
    inline def setNewCreateNamedRangeRequest(value: () => CreateNamedRangeRequest): Self = StObject.set(x, "newCreateNamedRangeRequest", js.Any.fromFunction0(value))
    
    inline def setNewCreateParagraphBulletsRequest(value: () => CreateParagraphBulletsRequest): Self = StObject.set(x, "newCreateParagraphBulletsRequest", js.Any.fromFunction0(value))
    
    inline def setNewDeleteContentRangeRequest(value: () => DeleteContentRangeRequest): Self = StObject.set(x, "newDeleteContentRangeRequest", js.Any.fromFunction0(value))
    
    inline def setNewDeleteNamedRangeRequest(value: () => DeleteNamedRangeRequest): Self = StObject.set(x, "newDeleteNamedRangeRequest", js.Any.fromFunction0(value))
    
    inline def setNewDeleteParagraphBulletsRequest(value: () => DeleteParagraphBulletsRequest): Self = StObject.set(x, "newDeleteParagraphBulletsRequest", js.Any.fromFunction0(value))
    
    inline def setNewDeletePositionedObjectRequest(value: () => DeletePositionedObjectRequest): Self = StObject.set(x, "newDeletePositionedObjectRequest", js.Any.fromFunction0(value))
    
    inline def setNewDeleteTableColumnRequest(value: () => DeleteTableColumnRequest): Self = StObject.set(x, "newDeleteTableColumnRequest", js.Any.fromFunction0(value))
    
    inline def setNewDeleteTableRowRequest(value: () => DeleteTableRowRequest): Self = StObject.set(x, "newDeleteTableRowRequest", js.Any.fromFunction0(value))
    
    inline def setNewDimension(value: () => Dimension): Self = StObject.set(x, "newDimension", js.Any.fromFunction0(value))
    
    inline def setNewDocument(value: () => typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document): Self = StObject.set(x, "newDocument", js.Any.fromFunction0(value))
    
    inline def setNewDocumentStyle(value: () => DocumentStyle): Self = StObject.set(x, "newDocumentStyle", js.Any.fromFunction0(value))
    
    inline def setNewEndOfSegmentLocation(value: () => EndOfSegmentLocation): Self = StObject.set(x, "newEndOfSegmentLocation", js.Any.fromFunction0(value))
    
    inline def setNewEquation(value: () => Equation): Self = StObject.set(x, "newEquation", js.Any.fromFunction0(value))
    
    inline def setNewFootnoteReference(value: () => FootnoteReference): Self = StObject.set(x, "newFootnoteReference", js.Any.fromFunction0(value))
    
    inline def setNewHorizontalRule(value: () => HorizontalRule): Self = StObject.set(x, "newHorizontalRule", js.Any.fromFunction0(value))
    
    inline def setNewInlineObjectElement(value: () => InlineObjectElement): Self = StObject.set(x, "newInlineObjectElement", js.Any.fromFunction0(value))
    
    inline def setNewInsertInlineImageRequest(value: () => InsertInlineImageRequest): Self = StObject.set(x, "newInsertInlineImageRequest", js.Any.fromFunction0(value))
    
    inline def setNewInsertPageBreakRequest(value: () => InsertPageBreakRequest): Self = StObject.set(x, "newInsertPageBreakRequest", js.Any.fromFunction0(value))
    
    inline def setNewInsertTableRequest(value: () => InsertTableRequest): Self = StObject.set(x, "newInsertTableRequest", js.Any.fromFunction0(value))
    
    inline def setNewInsertTableRowRequest(value: () => InsertTableRowRequest): Self = StObject.set(x, "newInsertTableRowRequest", js.Any.fromFunction0(value))
    
    inline def setNewInsertTextRequest(value: () => InsertTextRequest): Self = StObject.set(x, "newInsertTextRequest", js.Any.fromFunction0(value))
    
    inline def setNewLink(value: () => Link): Self = StObject.set(x, "newLink", js.Any.fromFunction0(value))
    
    inline def setNewLocation(value: () => Location): Self = StObject.set(x, "newLocation", js.Any.fromFunction0(value))
    
    inline def setNewNamedStyle(value: () => NamedStyle): Self = StObject.set(x, "newNamedStyle", js.Any.fromFunction0(value))
    
    inline def setNewNamedStyles(value: () => NamedStyles): Self = StObject.set(x, "newNamedStyles", js.Any.fromFunction0(value))
    
    inline def setNewOptionalColor(value: () => OptionalColor): Self = StObject.set(x, "newOptionalColor", js.Any.fromFunction0(value))
    
    inline def setNewPageBreak(value: () => PageBreak): Self = StObject.set(x, "newPageBreak", js.Any.fromFunction0(value))
    
    inline def setNewParagraph(value: () => Paragraph): Self = StObject.set(x, "newParagraph", js.Any.fromFunction0(value))
    
    inline def setNewParagraphBorder(value: () => ParagraphBorder): Self = StObject.set(x, "newParagraphBorder", js.Any.fromFunction0(value))
    
    inline def setNewParagraphElement(value: () => ParagraphElement): Self = StObject.set(x, "newParagraphElement", js.Any.fromFunction0(value))
    
    inline def setNewParagraphStyle(value: () => ParagraphStyle): Self = StObject.set(x, "newParagraphStyle", js.Any.fromFunction0(value))
    
    inline def setNewRange(value: () => Range): Self = StObject.set(x, "newRange", js.Any.fromFunction0(value))
    
    inline def setNewReplaceAllTextRequest(value: () => ReplaceAllTextRequest): Self = StObject.set(x, "newReplaceAllTextRequest", js.Any.fromFunction0(value))
    
    inline def setNewRequest(value: () => Request): Self = StObject.set(x, "newRequest", js.Any.fromFunction0(value))
    
    inline def setNewRgbColor(value: () => RgbColor): Self = StObject.set(x, "newRgbColor", js.Any.fromFunction0(value))
    
    inline def setNewSectionBreak(value: () => SectionBreak): Self = StObject.set(x, "newSectionBreak", js.Any.fromFunction0(value))
    
    inline def setNewSectionColumnProperties(value: () => SectionColumnProperties): Self = StObject.set(x, "newSectionColumnProperties", js.Any.fromFunction0(value))
    
    inline def setNewSectionStyle(value: () => SectionStyle): Self = StObject.set(x, "newSectionStyle", js.Any.fromFunction0(value))
    
    inline def setNewShading(value: () => Shading): Self = StObject.set(x, "newShading", js.Any.fromFunction0(value))
    
    inline def setNewSize(value: () => Size): Self = StObject.set(x, "newSize", js.Any.fromFunction0(value))
    
    inline def setNewStructuralElement(value: () => StructuralElement): Self = StObject.set(x, "newStructuralElement", js.Any.fromFunction0(value))
    
    inline def setNewSubstringMatchCriteria(value: () => SubstringMatchCriteria): Self = StObject.set(x, "newSubstringMatchCriteria", js.Any.fromFunction0(value))
    
    inline def setNewTabStop(value: () => TabStop): Self = StObject.set(x, "newTabStop", js.Any.fromFunction0(value))
    
    inline def setNewTable(value: () => Table): Self = StObject.set(x, "newTable", js.Any.fromFunction0(value))
    
    inline def setNewTableCell(value: () => TableCell): Self = StObject.set(x, "newTableCell", js.Any.fromFunction0(value))
    
    inline def setNewTableCellBorder(value: () => TableCellBorder): Self = StObject.set(x, "newTableCellBorder", js.Any.fromFunction0(value))
    
    inline def setNewTableCellLocation(value: () => TableCellLocation): Self = StObject.set(x, "newTableCellLocation", js.Any.fromFunction0(value))
    
    inline def setNewTableCellStyle(value: () => TableCellStyle): Self = StObject.set(x, "newTableCellStyle", js.Any.fromFunction0(value))
    
    inline def setNewTableColumnProperties(value: () => TableColumnProperties): Self = StObject.set(x, "newTableColumnProperties", js.Any.fromFunction0(value))
    
    inline def setNewTableOfContents(value: () => TableOfContents): Self = StObject.set(x, "newTableOfContents", js.Any.fromFunction0(value))
    
    inline def setNewTableRow(value: () => TableRow): Self = StObject.set(x, "newTableRow", js.Any.fromFunction0(value))
    
    inline def setNewTableRowStyle(value: () => TableRowStyle): Self = StObject.set(x, "newTableRowStyle", js.Any.fromFunction0(value))
    
    inline def setNewTableStyle(value: () => TableStyle): Self = StObject.set(x, "newTableStyle", js.Any.fromFunction0(value))
    
    inline def setNewTextRun(value: () => TextRun): Self = StObject.set(x, "newTextRun", js.Any.fromFunction0(value))
    
    inline def setNewTextStyle(value: () => TextStyle): Self = StObject.set(x, "newTextStyle", js.Any.fromFunction0(value))
    
    inline def setNewUpdateParagraphStyleRequest(value: () => UpdateParagraphStyleRequest): Self = StObject.set(x, "newUpdateParagraphStyleRequest", js.Any.fromFunction0(value))
    
    inline def setNewUpdateTextStyleRequest(value: () => UpdateTextStyleRequest): Self = StObject.set(x, "newUpdateTextStyleRequest", js.Any.fromFunction0(value))
    
    inline def setNewWeightedFontFamily(value: () => WeightedFontFamily): Self = StObject.set(x, "newWeightedFontFamily", js.Any.fromFunction0(value))
    
    inline def setNewWriteControl(value: () => WriteControl): Self = StObject.set(x, "newWriteControl", js.Any.fromFunction0(value))
  }
  
  object Schema {
    
    trait AutoText extends StObject {
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AutoText {
      
      inline def apply(): AutoText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AutoText]
      }
      
      extension [Self <: AutoText](x: Self) {
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Background extends StObject {
      
      var color: js.UndefOr[OptionalColor] = js.undefined
    }
    object Background {
      
      inline def apply(): Background = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Background]
      }
      
      extension [Self <: Background](x: Self) {
        
        inline def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      }
    }
    
    trait BackgroundSuggestionState extends StObject {
      
      var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object BackgroundSuggestionState {
      
      inline def apply(): BackgroundSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BackgroundSuggestionState]
      }
      
      extension [Self <: BackgroundSuggestionState](x: Self) {
        
        inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
      }
    }
    
    trait BatchUpdateDocumentRequest extends StObject {
      
      var requests: js.UndefOr[js.Array[Request]] = js.undefined
      
      var writeControl: js.UndefOr[WriteControl] = js.undefined
    }
    object BatchUpdateDocumentRequest {
      
      inline def apply(): BatchUpdateDocumentRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateDocumentRequest]
      }
      
      extension [Self <: BatchUpdateDocumentRequest](x: Self) {
        
        inline def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
        
        inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
        
        inline def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value*))
        
        inline def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
        
        inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
      }
    }
    
    trait BatchUpdateDocumentResponse extends StObject {
      
      var documentId: js.UndefOr[String] = js.undefined
      
      var replies: js.UndefOr[js.Array[Response]] = js.undefined
      
      var writeControl: js.UndefOr[WriteControl] = js.undefined
    }
    object BatchUpdateDocumentResponse {
      
      inline def apply(): BatchUpdateDocumentResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateDocumentResponse]
      }
      
      extension [Self <: BatchUpdateDocumentResponse](x: Self) {
        
        inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
        
        inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
        
        inline def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
        
        inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
        
        inline def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value*))
        
        inline def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
        
        inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
      }
    }
    
    trait Body extends StObject {
      
      var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
    }
    object Body {
      
      inline def apply(): Body = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Body]
      }
      
      extension [Self <: Body](x: Self) {
        
        inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
      }
    }
    
    trait Bullet extends StObject {
      
      var listId: js.UndefOr[String] = js.undefined
      
      var nestingLevel: js.UndefOr[Double] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object Bullet {
      
      inline def apply(): Bullet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Bullet]
      }
      
      extension [Self <: Bullet](x: Self) {
        
        inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
        
        inline def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
        
        inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait BulletSuggestionState extends StObject {
      
      var listIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var nestingLevelSuggested: js.UndefOr[Boolean] = js.undefined
      
      var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
    }
    object BulletSuggestionState {
      
      inline def apply(): BulletSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BulletSuggestionState]
      }
      
      extension [Self <: BulletSuggestionState](x: Self) {
        
        inline def setListIdSuggested(value: Boolean): Self = StObject.set(x, "listIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setListIdSuggestedUndefined: Self = StObject.set(x, "listIdSuggested", js.undefined)
        
        inline def setNestingLevelSuggested(value: Boolean): Self = StObject.set(x, "nestingLevelSuggested", value.asInstanceOf[js.Any])
        
        inline def setNestingLevelSuggestedUndefined: Self = StObject.set(x, "nestingLevelSuggested", js.undefined)
        
        inline def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
      }
    }
    
    trait Color extends StObject {
      
      var rgbColor: js.UndefOr[RgbColor] = js.undefined
    }
    object Color {
      
      inline def apply(): Color = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Color]
      }
      
      extension [Self <: Color](x: Self) {
        
        inline def setRgbColor(value: RgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
        
        inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
      }
    }
    
    trait ColumnBreak extends StObject {
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object ColumnBreak {
      
      inline def apply(): ColumnBreak = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColumnBreak]
      }
      
      extension [Self <: ColumnBreak](x: Self) {
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait CreateNamedRangeRequest extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var range: js.UndefOr[Range] = js.undefined
    }
    object CreateNamedRangeRequest {
      
      inline def apply(): CreateNamedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateNamedRangeRequest]
      }
      
      extension [Self <: CreateNamedRangeRequest](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    trait CreateNamedRangeResponse extends StObject {
      
      var namedRangeId: js.UndefOr[String] = js.undefined
    }
    object CreateNamedRangeResponse {
      
      inline def apply(): CreateNamedRangeResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateNamedRangeResponse]
      }
      
      extension [Self <: CreateNamedRangeResponse](x: Self) {
        
        inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
      }
    }
    
    trait CreateParagraphBulletsRequest extends StObject {
      
      var bulletPreset: js.UndefOr[String] = js.undefined
      
      var range: js.UndefOr[Range] = js.undefined
    }
    object CreateParagraphBulletsRequest {
      
      inline def apply(): CreateParagraphBulletsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateParagraphBulletsRequest]
      }
      
      extension [Self <: CreateParagraphBulletsRequest](x: Self) {
        
        inline def setBulletPreset(value: String): Self = StObject.set(x, "bulletPreset", value.asInstanceOf[js.Any])
        
        inline def setBulletPresetUndefined: Self = StObject.set(x, "bulletPreset", js.undefined)
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    trait CropProperties extends StObject {
      
      var angle: js.UndefOr[Double] = js.undefined
      
      var offsetBottom: js.UndefOr[Double] = js.undefined
      
      var offsetLeft: js.UndefOr[Double] = js.undefined
      
      var offsetRight: js.UndefOr[Double] = js.undefined
      
      var offsetTop: js.UndefOr[Double] = js.undefined
    }
    object CropProperties {
      
      inline def apply(): CropProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CropProperties]
      }
      
      extension [Self <: CropProperties](x: Self) {
        
        inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
        
        inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
        
        inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
        
        inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
        
        inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
        
        inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
        
        inline def setOffsetRight(value: Double): Self = StObject.set(x, "offsetRight", value.asInstanceOf[js.Any])
        
        inline def setOffsetRightUndefined: Self = StObject.set(x, "offsetRight", js.undefined)
        
        inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
        
        inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      }
    }
    
    trait CropPropertiesSuggestionState extends StObject {
      
      var angleSuggested: js.UndefOr[Boolean] = js.undefined
      
      var offsetBottomSuggested: js.UndefOr[Boolean] = js.undefined
      
      var offsetLeftSuggested: js.UndefOr[Boolean] = js.undefined
      
      var offsetRightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var offsetTopSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object CropPropertiesSuggestionState {
      
      inline def apply(): CropPropertiesSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CropPropertiesSuggestionState]
      }
      
      extension [Self <: CropPropertiesSuggestionState](x: Self) {
        
        inline def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
        
        inline def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
        
        inline def setOffsetBottomSuggested(value: Boolean): Self = StObject.set(x, "offsetBottomSuggested", value.asInstanceOf[js.Any])
        
        inline def setOffsetBottomSuggestedUndefined: Self = StObject.set(x, "offsetBottomSuggested", js.undefined)
        
        inline def setOffsetLeftSuggested(value: Boolean): Self = StObject.set(x, "offsetLeftSuggested", value.asInstanceOf[js.Any])
        
        inline def setOffsetLeftSuggestedUndefined: Self = StObject.set(x, "offsetLeftSuggested", js.undefined)
        
        inline def setOffsetRightSuggested(value: Boolean): Self = StObject.set(x, "offsetRightSuggested", value.asInstanceOf[js.Any])
        
        inline def setOffsetRightSuggestedUndefined: Self = StObject.set(x, "offsetRightSuggested", js.undefined)
        
        inline def setOffsetTopSuggested(value: Boolean): Self = StObject.set(x, "offsetTopSuggested", value.asInstanceOf[js.Any])
        
        inline def setOffsetTopSuggestedUndefined: Self = StObject.set(x, "offsetTopSuggested", js.undefined)
      }
    }
    
    trait DeleteContentRangeRequest extends StObject {
      
      var range: js.UndefOr[Range] = js.undefined
    }
    object DeleteContentRangeRequest {
      
      inline def apply(): DeleteContentRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteContentRangeRequest]
      }
      
      extension [Self <: DeleteContentRangeRequest](x: Self) {
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    trait DeleteNamedRangeRequest extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var namedRangeId: js.UndefOr[String] = js.undefined
    }
    object DeleteNamedRangeRequest {
      
      inline def apply(): DeleteNamedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteNamedRangeRequest]
      }
      
      extension [Self <: DeleteNamedRangeRequest](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
      }
    }
    
    trait DeleteParagraphBulletsRequest extends StObject {
      
      var range: js.UndefOr[Range] = js.undefined
    }
    object DeleteParagraphBulletsRequest {
      
      inline def apply(): DeleteParagraphBulletsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteParagraphBulletsRequest]
      }
      
      extension [Self <: DeleteParagraphBulletsRequest](x: Self) {
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    trait DeletePositionedObjectRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object DeletePositionedObjectRequest {
      
      inline def apply(): DeletePositionedObjectRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeletePositionedObjectRequest]
      }
      
      extension [Self <: DeletePositionedObjectRequest](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait DeleteTableColumnRequest extends StObject {
      
      var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
    }
    object DeleteTableColumnRequest {
      
      inline def apply(): DeleteTableColumnRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTableColumnRequest]
      }
      
      extension [Self <: DeleteTableColumnRequest](x: Self) {
        
        inline def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
        
        inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
      }
    }
    
    trait DeleteTableRowRequest extends StObject {
      
      var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
    }
    object DeleteTableRowRequest {
      
      inline def apply(): DeleteTableRowRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTableRowRequest]
      }
      
      extension [Self <: DeleteTableRowRequest](x: Self) {
        
        inline def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
        
        inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
      }
    }
    
    trait Dimension extends StObject {
      
      var magnitude: js.UndefOr[Double] = js.undefined
      
      var unit: js.UndefOr[String] = js.undefined
    }
    object Dimension {
      
      inline def apply(): Dimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dimension]
      }
      
      extension [Self <: Dimension](x: Self) {
        
        inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
        
        inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
        
        inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
    
    trait Document extends StObject {
      
      var body: js.UndefOr[Body] = js.undefined
      
      var documentId: js.UndefOr[String] = js.undefined
      
      var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
      
      var footers: js.UndefOr[js.Object] = js.undefined
      
      var footnotes: js.UndefOr[js.Object] = js.undefined
      
      var headers: js.UndefOr[js.Object] = js.undefined
      
      var inlineObjects: js.UndefOr[js.Object] = js.undefined
      
      var lists: js.UndefOr[js.Object] = js.undefined
      
      var namedRanges: js.UndefOr[js.Object] = js.undefined
      
      var namedStyles: js.UndefOr[NamedStyles] = js.undefined
      
      var positionedObjects: js.UndefOr[js.Object] = js.undefined
      
      var revisionId: js.UndefOr[String] = js.undefined
      
      var suggestedDocumentStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var suggestedNamedStylesChanges: js.UndefOr[js.Object] = js.undefined
      
      var suggestionsViewMode: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object Document {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Docs.Schema.Document](x: Self) {
        
        inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
        
        inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
        
        inline def setDocumentStyle(value: DocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
        
        inline def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
        
        inline def setFooters(value: js.Object): Self = StObject.set(x, "footers", value.asInstanceOf[js.Any])
        
        inline def setFootersUndefined: Self = StObject.set(x, "footers", js.undefined)
        
        inline def setFootnotes(value: js.Object): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
        
        inline def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
        
        inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setInlineObjects(value: js.Object): Self = StObject.set(x, "inlineObjects", value.asInstanceOf[js.Any])
        
        inline def setInlineObjectsUndefined: Self = StObject.set(x, "inlineObjects", js.undefined)
        
        inline def setLists(value: js.Object): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
        
        inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
        
        inline def setNamedRanges(value: js.Object): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
        
        inline def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
        
        inline def setNamedStyles(value: NamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
        
        inline def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
        
        inline def setPositionedObjects(value: js.Object): Self = StObject.set(x, "positionedObjects", value.asInstanceOf[js.Any])
        
        inline def setPositionedObjectsUndefined: Self = StObject.set(x, "positionedObjects", js.undefined)
        
        inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
        
        inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
        
        inline def setSuggestedDocumentStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedDocumentStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDocumentStyleChangesUndefined: Self = StObject.set(x, "suggestedDocumentStyleChanges", js.undefined)
        
        inline def setSuggestedNamedStylesChanges(value: js.Object): Self = StObject.set(x, "suggestedNamedStylesChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedNamedStylesChangesUndefined: Self = StObject.set(x, "suggestedNamedStylesChanges", js.undefined)
        
        inline def setSuggestionsViewMode(value: String): Self = StObject.set(x, "suggestionsViewMode", value.asInstanceOf[js.Any])
        
        inline def setSuggestionsViewModeUndefined: Self = StObject.set(x, "suggestionsViewMode", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait DocumentStyle extends StObject {
      
      var background: js.UndefOr[Background] = js.undefined
      
      var defaultFooterId: js.UndefOr[String] = js.undefined
      
      var defaultHeaderId: js.UndefOr[String] = js.undefined
      
      var evenPageFooterId: js.UndefOr[String] = js.undefined
      
      var evenPageHeaderId: js.UndefOr[String] = js.undefined
      
      var firstPageFooterId: js.UndefOr[String] = js.undefined
      
      var firstPageHeaderId: js.UndefOr[String] = js.undefined
      
      var marginBottom: js.UndefOr[Dimension] = js.undefined
      
      var marginLeft: js.UndefOr[Dimension] = js.undefined
      
      var marginRight: js.UndefOr[Dimension] = js.undefined
      
      var marginTop: js.UndefOr[Dimension] = js.undefined
      
      var pageNumberStart: js.UndefOr[Double] = js.undefined
      
      var pageSize: js.UndefOr[Size] = js.undefined
      
      var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
      
      var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
    }
    object DocumentStyle {
      
      inline def apply(): DocumentStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocumentStyle]
      }
      
      extension [Self <: DocumentStyle](x: Self) {
        
        inline def setBackground(value: Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
        
        inline def setDefaultFooterId(value: String): Self = StObject.set(x, "defaultFooterId", value.asInstanceOf[js.Any])
        
        inline def setDefaultFooterIdUndefined: Self = StObject.set(x, "defaultFooterId", js.undefined)
        
        inline def setDefaultHeaderId(value: String): Self = StObject.set(x, "defaultHeaderId", value.asInstanceOf[js.Any])
        
        inline def setDefaultHeaderIdUndefined: Self = StObject.set(x, "defaultHeaderId", js.undefined)
        
        inline def setEvenPageFooterId(value: String): Self = StObject.set(x, "evenPageFooterId", value.asInstanceOf[js.Any])
        
        inline def setEvenPageFooterIdUndefined: Self = StObject.set(x, "evenPageFooterId", js.undefined)
        
        inline def setEvenPageHeaderId(value: String): Self = StObject.set(x, "evenPageHeaderId", value.asInstanceOf[js.Any])
        
        inline def setEvenPageHeaderIdUndefined: Self = StObject.set(x, "evenPageHeaderId", js.undefined)
        
        inline def setFirstPageFooterId(value: String): Self = StObject.set(x, "firstPageFooterId", value.asInstanceOf[js.Any])
        
        inline def setFirstPageFooterIdUndefined: Self = StObject.set(x, "firstPageFooterId", js.undefined)
        
        inline def setFirstPageHeaderId(value: String): Self = StObject.set(x, "firstPageHeaderId", value.asInstanceOf[js.Any])
        
        inline def setFirstPageHeaderIdUndefined: Self = StObject.set(x, "firstPageHeaderId", js.undefined)
        
        inline def setMarginBottom(value: Dimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
        
        inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
        
        inline def setMarginLeft(value: Dimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
        
        inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
        
        inline def setMarginRight(value: Dimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
        
        inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
        
        inline def setMarginTop(value: Dimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
        
        inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
        
        inline def setPageNumberStart(value: Double): Self = StObject.set(x, "pageNumberStart", value.asInstanceOf[js.Any])
        
        inline def setPageNumberStartUndefined: Self = StObject.set(x, "pageNumberStart", js.undefined)
        
        inline def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setUseEvenPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooter", value.asInstanceOf[js.Any])
        
        inline def setUseEvenPageHeaderFooterUndefined: Self = StObject.set(x, "useEvenPageHeaderFooter", js.undefined)
        
        inline def setUseFirstPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooter", value.asInstanceOf[js.Any])
        
        inline def setUseFirstPageHeaderFooterUndefined: Self = StObject.set(x, "useFirstPageHeaderFooter", js.undefined)
      }
    }
    
    trait DocumentStyleSuggestionState extends StObject {
      
      var backgroundSuggestionState: js.UndefOr[BackgroundSuggestionState] = js.undefined
      
      var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
      
      var pageNumberStartSuggested: js.UndefOr[Boolean] = js.undefined
      
      var pageSizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
      
      var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
      
      var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object DocumentStyleSuggestionState {
      
      inline def apply(): DocumentStyleSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocumentStyleSuggestionState]
      }
      
      extension [Self <: DocumentStyleSuggestionState](x: Self) {
        
        inline def setBackgroundSuggestionState(value: BackgroundSuggestionState): Self = StObject.set(x, "backgroundSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setBackgroundSuggestionStateUndefined: Self = StObject.set(x, "backgroundSuggestionState", js.undefined)
        
        inline def setDefaultFooterIdSuggested(value: Boolean): Self = StObject.set(x, "defaultFooterIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setDefaultFooterIdSuggestedUndefined: Self = StObject.set(x, "defaultFooterIdSuggested", js.undefined)
        
        inline def setDefaultHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setDefaultHeaderIdSuggestedUndefined: Self = StObject.set(x, "defaultHeaderIdSuggested", js.undefined)
        
        inline def setEvenPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setEvenPageFooterIdSuggestedUndefined: Self = StObject.set(x, "evenPageFooterIdSuggested", js.undefined)
        
        inline def setEvenPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setEvenPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "evenPageHeaderIdSuggested", js.undefined)
        
        inline def setFirstPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setFirstPageFooterIdSuggestedUndefined: Self = StObject.set(x, "firstPageFooterIdSuggested", js.undefined)
        
        inline def setFirstPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setFirstPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "firstPageHeaderIdSuggested", js.undefined)
        
        inline def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
        
        inline def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
        
        inline def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
        
        inline def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
        
        inline def setPageNumberStartSuggested(value: Boolean): Self = StObject.set(x, "pageNumberStartSuggested", value.asInstanceOf[js.Any])
        
        inline def setPageNumberStartSuggestedUndefined: Self = StObject.set(x, "pageNumberStartSuggested", js.undefined)
        
        inline def setPageSizeSuggestionState(value: SizeSuggestionState): Self = StObject.set(x, "pageSizeSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setPageSizeSuggestionStateUndefined: Self = StObject.set(x, "pageSizeSuggestionState", js.undefined)
        
        inline def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
        
        inline def setUseEvenPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", js.undefined)
        
        inline def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
        
        inline def setUseFirstPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", js.undefined)
      }
    }
    
    trait EmbeddedObject extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var embeddedDrawingProperties: js.UndefOr[Any] = js.undefined
      
      var embeddedObjectBorder: js.UndefOr[EmbeddedObjectBorder] = js.undefined
      
      var imageProperties: js.UndefOr[ImageProperties] = js.undefined
      
      var linkedContentReference: js.UndefOr[LinkedContentReference] = js.undefined
      
      var marginBottom: js.UndefOr[Dimension] = js.undefined
      
      var marginLeft: js.UndefOr[Dimension] = js.undefined
      
      var marginRight: js.UndefOr[Dimension] = js.undefined
      
      var marginTop: js.UndefOr[Dimension] = js.undefined
      
      var size: js.UndefOr[Size] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object EmbeddedObject {
      
      inline def apply(): EmbeddedObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmbeddedObject]
      }
      
      extension [Self <: EmbeddedObject](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEmbeddedDrawingProperties(value: Any): Self = StObject.set(x, "embeddedDrawingProperties", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedDrawingPropertiesUndefined: Self = StObject.set(x, "embeddedDrawingProperties", js.undefined)
        
        inline def setEmbeddedObjectBorder(value: EmbeddedObjectBorder): Self = StObject.set(x, "embeddedObjectBorder", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedObjectBorderUndefined: Self = StObject.set(x, "embeddedObjectBorder", js.undefined)
        
        inline def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
        
        inline def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
        
        inline def setLinkedContentReference(value: LinkedContentReference): Self = StObject.set(x, "linkedContentReference", value.asInstanceOf[js.Any])
        
        inline def setLinkedContentReferenceUndefined: Self = StObject.set(x, "linkedContentReference", js.undefined)
        
        inline def setMarginBottom(value: Dimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
        
        inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
        
        inline def setMarginLeft(value: Dimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
        
        inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
        
        inline def setMarginRight(value: Dimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
        
        inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
        
        inline def setMarginTop(value: Dimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
        
        inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
        
        inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait EmbeddedObjectBorder extends StObject {
      
      var color: js.UndefOr[OptionalColor] = js.undefined
      
      var dashStyle: js.UndefOr[String] = js.undefined
      
      var propertyState: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Dimension] = js.undefined
    }
    object EmbeddedObjectBorder {
      
      inline def apply(): EmbeddedObjectBorder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmbeddedObjectBorder]
      }
      
      extension [Self <: EmbeddedObjectBorder](x: Self) {
        
        inline def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait EmbeddedObjectBorderSuggestionState extends StObject {
      
      var colorSuggested: js.UndefOr[Boolean] = js.undefined
      
      var dashStyleSuggested: js.UndefOr[Boolean] = js.undefined
      
      var propertyStateSuggested: js.UndefOr[Boolean] = js.undefined
      
      var widthSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object EmbeddedObjectBorderSuggestionState {
      
      inline def apply(): EmbeddedObjectBorderSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmbeddedObjectBorderSuggestionState]
      }
      
      extension [Self <: EmbeddedObjectBorderSuggestionState](x: Self) {
        
        inline def setColorSuggested(value: Boolean): Self = StObject.set(x, "colorSuggested", value.asInstanceOf[js.Any])
        
        inline def setColorSuggestedUndefined: Self = StObject.set(x, "colorSuggested", js.undefined)
        
        inline def setDashStyleSuggested(value: Boolean): Self = StObject.set(x, "dashStyleSuggested", value.asInstanceOf[js.Any])
        
        inline def setDashStyleSuggestedUndefined: Self = StObject.set(x, "dashStyleSuggested", js.undefined)
        
        inline def setPropertyStateSuggested(value: Boolean): Self = StObject.set(x, "propertyStateSuggested", value.asInstanceOf[js.Any])
        
        inline def setPropertyStateSuggestedUndefined: Self = StObject.set(x, "propertyStateSuggested", js.undefined)
        
        inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
        
        inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
      }
    }
    
    trait EmbeddedObjectSuggestionState extends StObject {
      
      var descriptionSuggested: js.UndefOr[Boolean] = js.undefined
      
      var embeddedDrawingPropertiesSuggestionState: js.UndefOr[Any] = js.undefined
      
      var embeddedObjectBorderSuggestionState: js.UndefOr[EmbeddedObjectBorderSuggestionState] = js.undefined
      
      var imagePropertiesSuggestionState: js.UndefOr[ImagePropertiesSuggestionState] = js.undefined
      
      var linkedContentReferenceSuggestionState: js.UndefOr[LinkedContentReferenceSuggestionState] = js.undefined
      
      var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
      
      var sizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
      
      var titleSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object EmbeddedObjectSuggestionState {
      
      inline def apply(): EmbeddedObjectSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmbeddedObjectSuggestionState]
      }
      
      extension [Self <: EmbeddedObjectSuggestionState](x: Self) {
        
        inline def setDescriptionSuggested(value: Boolean): Self = StObject.set(x, "descriptionSuggested", value.asInstanceOf[js.Any])
        
        inline def setDescriptionSuggestedUndefined: Self = StObject.set(x, "descriptionSuggested", js.undefined)
        
        inline def setEmbeddedDrawingPropertiesSuggestionState(value: Any): Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedDrawingPropertiesSuggestionStateUndefined: Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", js.undefined)
        
        inline def setEmbeddedObjectBorderSuggestionState(value: EmbeddedObjectBorderSuggestionState): Self = StObject.set(x, "embeddedObjectBorderSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedObjectBorderSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectBorderSuggestionState", js.undefined)
        
        inline def setImagePropertiesSuggestionState(value: ImagePropertiesSuggestionState): Self = StObject.set(x, "imagePropertiesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setImagePropertiesSuggestionStateUndefined: Self = StObject.set(x, "imagePropertiesSuggestionState", js.undefined)
        
        inline def setLinkedContentReferenceSuggestionState(value: LinkedContentReferenceSuggestionState): Self = StObject.set(x, "linkedContentReferenceSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setLinkedContentReferenceSuggestionStateUndefined: Self = StObject.set(x, "linkedContentReferenceSuggestionState", js.undefined)
        
        inline def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
        
        inline def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
        
        inline def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
        
        inline def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
        
        inline def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
        
        inline def setSizeSuggestionState(value: SizeSuggestionState): Self = StObject.set(x, "sizeSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setSizeSuggestionStateUndefined: Self = StObject.set(x, "sizeSuggestionState", js.undefined)
        
        inline def setTitleSuggested(value: Boolean): Self = StObject.set(x, "titleSuggested", value.asInstanceOf[js.Any])
        
        inline def setTitleSuggestedUndefined: Self = StObject.set(x, "titleSuggested", js.undefined)
      }
    }
    
    trait EndOfSegmentLocation extends StObject {
      
      var segmentId: js.UndefOr[String] = js.undefined
    }
    object EndOfSegmentLocation {
      
      inline def apply(): EndOfSegmentLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EndOfSegmentLocation]
      }
      
      extension [Self <: EndOfSegmentLocation](x: Self) {
        
        inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
        
        inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
      }
    }
    
    trait Equation extends StObject {
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object Equation {
      
      inline def apply(): Equation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Equation]
      }
      
      extension [Self <: Equation](x: Self) {
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
      }
    }
    
    trait Footer extends StObject {
      
      var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
      
      var footerId: js.UndefOr[String] = js.undefined
    }
    object Footer {
      
      inline def apply(): Footer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Footer]
      }
      
      extension [Self <: Footer](x: Self) {
        
        inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
        
        inline def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
      }
    }
    
    trait Footnote extends StObject {
      
      var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
      
      var footnoteId: js.UndefOr[String] = js.undefined
    }
    object Footnote {
      
      inline def apply(): Footnote = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Footnote]
      }
      
      extension [Self <: Footnote](x: Self) {
        
        inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
        
        inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
      }
    }
    
    trait FootnoteReference extends StObject {
      
      var footnoteId: js.UndefOr[String] = js.undefined
      
      var footnoteNumber: js.UndefOr[String] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object FootnoteReference {
      
      inline def apply(): FootnoteReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FootnoteReference]
      }
      
      extension [Self <: FootnoteReference](x: Self) {
        
        inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
        
        inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
        
        inline def setFootnoteNumber(value: String): Self = StObject.set(x, "footnoteNumber", value.asInstanceOf[js.Any])
        
        inline def setFootnoteNumberUndefined: Self = StObject.set(x, "footnoteNumber", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait Header extends StObject {
      
      var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
      
      var headerId: js.UndefOr[String] = js.undefined
    }
    object Header {
      
      inline def apply(): Header = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Header]
      }
      
      extension [Self <: Header](x: Self) {
        
        inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
        
        inline def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
      }
    }
    
    trait HorizontalRule extends StObject {
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object HorizontalRule {
      
      inline def apply(): HorizontalRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HorizontalRule]
      }
      
      extension [Self <: HorizontalRule](x: Self) {
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait ImageProperties extends StObject {
      
      var angle: js.UndefOr[Double] = js.undefined
      
      var brightness: js.UndefOr[Double] = js.undefined
      
      var contentUri: js.UndefOr[String] = js.undefined
      
      var contrast: js.UndefOr[Double] = js.undefined
      
      var cropProperties: js.UndefOr[CropProperties] = js.undefined
      
      var sourceUri: js.UndefOr[String] = js.undefined
      
      var transparency: js.UndefOr[Double] = js.undefined
    }
    object ImageProperties {
      
      inline def apply(): ImageProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageProperties]
      }
      
      extension [Self <: ImageProperties](x: Self) {
        
        inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
        
        inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
        
        inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
        
        inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
        
        inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
        
        inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
        
        inline def setCropProperties(value: CropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
        
        inline def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
        
        inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
        
        inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
        
        inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
        
        inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      }
    }
    
    trait ImagePropertiesSuggestionState extends StObject {
      
      var angleSuggested: js.UndefOr[Boolean] = js.undefined
      
      var brightnessSuggested: js.UndefOr[Boolean] = js.undefined
      
      var contentUriSuggested: js.UndefOr[Boolean] = js.undefined
      
      var contrastSuggested: js.UndefOr[Boolean] = js.undefined
      
      var cropPropertiesSuggestionState: js.UndefOr[CropPropertiesSuggestionState] = js.undefined
      
      var sourceUriSuggested: js.UndefOr[Boolean] = js.undefined
      
      var transparencySuggested: js.UndefOr[Boolean] = js.undefined
    }
    object ImagePropertiesSuggestionState {
      
      inline def apply(): ImagePropertiesSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImagePropertiesSuggestionState]
      }
      
      extension [Self <: ImagePropertiesSuggestionState](x: Self) {
        
        inline def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
        
        inline def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
        
        inline def setBrightnessSuggested(value: Boolean): Self = StObject.set(x, "brightnessSuggested", value.asInstanceOf[js.Any])
        
        inline def setBrightnessSuggestedUndefined: Self = StObject.set(x, "brightnessSuggested", js.undefined)
        
        inline def setContentUriSuggested(value: Boolean): Self = StObject.set(x, "contentUriSuggested", value.asInstanceOf[js.Any])
        
        inline def setContentUriSuggestedUndefined: Self = StObject.set(x, "contentUriSuggested", js.undefined)
        
        inline def setContrastSuggested(value: Boolean): Self = StObject.set(x, "contrastSuggested", value.asInstanceOf[js.Any])
        
        inline def setContrastSuggestedUndefined: Self = StObject.set(x, "contrastSuggested", js.undefined)
        
        inline def setCropPropertiesSuggestionState(value: CropPropertiesSuggestionState): Self = StObject.set(x, "cropPropertiesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setCropPropertiesSuggestionStateUndefined: Self = StObject.set(x, "cropPropertiesSuggestionState", js.undefined)
        
        inline def setSourceUriSuggested(value: Boolean): Self = StObject.set(x, "sourceUriSuggested", value.asInstanceOf[js.Any])
        
        inline def setSourceUriSuggestedUndefined: Self = StObject.set(x, "sourceUriSuggested", js.undefined)
        
        inline def setTransparencySuggested(value: Boolean): Self = StObject.set(x, "transparencySuggested", value.asInstanceOf[js.Any])
        
        inline def setTransparencySuggestedUndefined: Self = StObject.set(x, "transparencySuggested", js.undefined)
      }
    }
    
    trait InlineObject extends StObject {
      
      var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInlineObjectPropertiesChanges: js.UndefOr[js.Object] = js.undefined
      
      var suggestedInsertionId: js.UndefOr[String] = js.undefined
    }
    object InlineObject {
      
      inline def apply(): InlineObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InlineObject]
      }
      
      extension [Self <: InlineObject](x: Self) {
        
        inline def setInlineObjectProperties(value: InlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
        
        inline def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInlineObjectPropertiesChanges(value: js.Object): Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInlineObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", js.undefined)
        
        inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
      }
    }
    
    trait InlineObjectElement extends StObject {
      
      var inlineObjectId: js.UndefOr[String] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object InlineObjectElement {
      
      inline def apply(): InlineObjectElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InlineObjectElement]
      }
      
      extension [Self <: InlineObjectElement](x: Self) {
        
        inline def setInlineObjectId(value: String): Self = StObject.set(x, "inlineObjectId", value.asInstanceOf[js.Any])
        
        inline def setInlineObjectIdUndefined: Self = StObject.set(x, "inlineObjectId", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait InlineObjectProperties extends StObject {
      
      var embeddedObject: js.UndefOr[EmbeddedObject] = js.undefined
    }
    object InlineObjectProperties {
      
      inline def apply(): InlineObjectProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InlineObjectProperties]
      }
      
      extension [Self <: InlineObjectProperties](x: Self) {
        
        inline def setEmbeddedObject(value: EmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
      }
    }
    
    trait InlineObjectPropertiesSuggestionState extends StObject {
      
      var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
    }
    object InlineObjectPropertiesSuggestionState {
      
      inline def apply(): InlineObjectPropertiesSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
      }
      
      extension [Self <: InlineObjectPropertiesSuggestionState](x: Self) {
        
        inline def setEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
      }
    }
    
    trait InsertInlineImageRequest extends StObject {
      
      var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
      
      var location: js.UndefOr[Location] = js.undefined
      
      var objectSize: js.UndefOr[Size] = js.undefined
      
      var uri: js.UndefOr[String] = js.undefined
    }
    object InsertInlineImageRequest {
      
      inline def apply(): InsertInlineImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertInlineImageRequest]
      }
      
      extension [Self <: InsertInlineImageRequest](x: Self) {
        
        inline def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
        
        inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
        
        inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setObjectSize(value: Size): Self = StObject.set(x, "objectSize", value.asInstanceOf[js.Any])
        
        inline def setObjectSizeUndefined: Self = StObject.set(x, "objectSize", js.undefined)
        
        inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
    
    trait InsertInlineImageResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object InsertInlineImageResponse {
      
      inline def apply(): InsertInlineImageResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertInlineImageResponse]
      }
      
      extension [Self <: InsertInlineImageResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait InsertInlineSheetsChartResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
    }
    object InsertInlineSheetsChartResponse {
      
      inline def apply(): InsertInlineSheetsChartResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertInlineSheetsChartResponse]
      }
      
      extension [Self <: InsertInlineSheetsChartResponse](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    trait InsertPageBreakRequest extends StObject {
      
      var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
      
      var location: js.UndefOr[Location] = js.undefined
    }
    object InsertPageBreakRequest {
      
      inline def apply(): InsertPageBreakRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertPageBreakRequest]
      }
      
      extension [Self <: InsertPageBreakRequest](x: Self) {
        
        inline def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
        
        inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
        
        inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    trait InsertTableRequest extends StObject {
      
      var columns: js.UndefOr[Double] = js.undefined
      
      var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
      
      var location: js.UndefOr[Location] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
    }
    object InsertTableRequest {
      
      inline def apply(): InsertTableRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTableRequest]
      }
      
      extension [Self <: InsertTableRequest](x: Self) {
        
        inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
        
        inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
        
        inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      }
    }
    
    trait InsertTableRowRequest extends StObject {
      
      var insertBelow: js.UndefOr[Boolean] = js.undefined
      
      var tableCellLocation: js.UndefOr[TableCellLocation] = js.undefined
    }
    object InsertTableRowRequest {
      
      inline def apply(): InsertTableRowRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTableRowRequest]
      }
      
      extension [Self <: InsertTableRowRequest](x: Self) {
        
        inline def setInsertBelow(value: Boolean): Self = StObject.set(x, "insertBelow", value.asInstanceOf[js.Any])
        
        inline def setInsertBelowUndefined: Self = StObject.set(x, "insertBelow", js.undefined)
        
        inline def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
        
        inline def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
      }
    }
    
    trait InsertTextRequest extends StObject {
      
      var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
      
      var location: js.UndefOr[Location] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object InsertTextRequest {
      
      inline def apply(): InsertTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTextRequest]
      }
      
      extension [Self <: InsertTextRequest](x: Self) {
        
        inline def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
        
        inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
        
        inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait Link extends StObject {
      
      var bookmarkId: js.UndefOr[String] = js.undefined
      
      var headingId: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object Link {
      
      inline def apply(): Link = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Link]
      }
      
      extension [Self <: Link](x: Self) {
        
        inline def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
        
        inline def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
        
        inline def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
        
        inline def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait LinkedContentReference extends StObject {
      
      var sheetsChartReference: js.UndefOr[SheetsChartReference] = js.undefined
    }
    object LinkedContentReference {
      
      inline def apply(): LinkedContentReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkedContentReference]
      }
      
      extension [Self <: LinkedContentReference](x: Self) {
        
        inline def setSheetsChartReference(value: SheetsChartReference): Self = StObject.set(x, "sheetsChartReference", value.asInstanceOf[js.Any])
        
        inline def setSheetsChartReferenceUndefined: Self = StObject.set(x, "sheetsChartReference", js.undefined)
      }
    }
    
    trait LinkedContentReferenceSuggestionState extends StObject {
      
      var sheetsChartReferenceSuggestionState: js.UndefOr[SheetsChartReferenceSuggestionState] = js.undefined
    }
    object LinkedContentReferenceSuggestionState {
      
      inline def apply(): LinkedContentReferenceSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkedContentReferenceSuggestionState]
      }
      
      extension [Self <: LinkedContentReferenceSuggestionState](x: Self) {
        
        inline def setSheetsChartReferenceSuggestionState(value: SheetsChartReferenceSuggestionState): Self = StObject.set(x, "sheetsChartReferenceSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setSheetsChartReferenceSuggestionStateUndefined: Self = StObject.set(x, "sheetsChartReferenceSuggestionState", js.undefined)
      }
    }
    
    trait List extends StObject {
      
      var listProperties: js.UndefOr[ListProperties] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionId: js.UndefOr[String] = js.undefined
      
      var suggestedListPropertiesChanges: js.UndefOr[js.Object] = js.undefined
    }
    object List {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Docs.Schema.List = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Docs.Schema.List]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Docs.Schema.List](x: Self) {
        
        inline def setListProperties(value: ListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
        
        inline def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
        
        inline def setSuggestedListPropertiesChanges(value: js.Object): Self = StObject.set(x, "suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedListPropertiesChangesUndefined: Self = StObject.set(x, "suggestedListPropertiesChanges", js.undefined)
      }
    }
    
    trait ListProperties extends StObject {
      
      var nestingLevels: js.UndefOr[js.Array[NestingLevel]] = js.undefined
    }
    object ListProperties {
      
      inline def apply(): ListProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListProperties]
      }
      
      extension [Self <: ListProperties](x: Self) {
        
        inline def setNestingLevels(value: js.Array[NestingLevel]): Self = StObject.set(x, "nestingLevels", value.asInstanceOf[js.Any])
        
        inline def setNestingLevelsUndefined: Self = StObject.set(x, "nestingLevels", js.undefined)
        
        inline def setNestingLevelsVarargs(value: NestingLevel*): Self = StObject.set(x, "nestingLevels", js.Array(value*))
      }
    }
    
    trait ListPropertiesSuggestionState extends StObject {
      
      var nestingLevelsSuggestionStates: js.UndefOr[js.Array[NestingLevelSuggestionState]] = js.undefined
    }
    object ListPropertiesSuggestionState {
      
      inline def apply(): ListPropertiesSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListPropertiesSuggestionState]
      }
      
      extension [Self <: ListPropertiesSuggestionState](x: Self) {
        
        inline def setNestingLevelsSuggestionStates(value: js.Array[NestingLevelSuggestionState]): Self = StObject.set(x, "nestingLevelsSuggestionStates", value.asInstanceOf[js.Any])
        
        inline def setNestingLevelsSuggestionStatesUndefined: Self = StObject.set(x, "nestingLevelsSuggestionStates", js.undefined)
        
        inline def setNestingLevelsSuggestionStatesVarargs(value: NestingLevelSuggestionState*): Self = StObject.set(x, "nestingLevelsSuggestionStates", js.Array(value*))
      }
    }
    
    trait Location extends StObject {
      
      var index: js.UndefOr[Double] = js.undefined
      
      var segmentId: js.UndefOr[String] = js.undefined
    }
    object Location {
      
      inline def apply(): Location = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Location]
      }
      
      extension [Self <: Location](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
        
        inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
      }
    }
    
    trait NamedRange extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var namedRangeId: js.UndefOr[String] = js.undefined
      
      var ranges: js.UndefOr[js.Array[Range]] = js.undefined
    }
    object NamedRange {
      
      inline def apply(): NamedRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedRange]
      }
      
      extension [Self <: NamedRange](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
        
        inline def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
        
        inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
        
        inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      }
    }
    
    trait NamedRanges extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
    }
    object NamedRanges {
      
      inline def apply(): NamedRanges = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedRanges]
      }
      
      extension [Self <: NamedRanges](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNamedRanges(value: js.Array[NamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
        
        inline def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
        
        inline def setNamedRangesVarargs(value: NamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value*))
      }
    }
    
    trait NamedStyle extends StObject {
      
      var namedStyleType: js.UndefOr[String] = js.undefined
      
      var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object NamedStyle {
      
      inline def apply(): NamedStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedStyle]
      }
      
      extension [Self <: NamedStyle](x: Self) {
        
        inline def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
        
        inline def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
        
        inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
        
        inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait NamedStyleSuggestionState extends StObject {
      
      var namedStyleType: js.UndefOr[String] = js.undefined
      
      var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.undefined
      
      var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
    }
    object NamedStyleSuggestionState {
      
      inline def apply(): NamedStyleSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedStyleSuggestionState]
      }
      
      extension [Self <: NamedStyleSuggestionState](x: Self) {
        
        inline def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
        
        inline def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
        
        inline def setParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = StObject.set(x, "paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setParagraphStyleSuggestionStateUndefined: Self = StObject.set(x, "paragraphStyleSuggestionState", js.undefined)
        
        inline def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
      }
    }
    
    trait NamedStyles extends StObject {
      
      var styles: js.UndefOr[js.Array[NamedStyle]] = js.undefined
    }
    object NamedStyles {
      
      inline def apply(): NamedStyles = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedStyles]
      }
      
      extension [Self <: NamedStyles](x: Self) {
        
        inline def setStyles(value: js.Array[NamedStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        inline def setStylesVarargs(value: NamedStyle*): Self = StObject.set(x, "styles", js.Array(value*))
      }
    }
    
    trait NamedStylesSuggestionState extends StObject {
      
      var stylesSuggestionStates: js.UndefOr[js.Array[NamedStyleSuggestionState]] = js.undefined
    }
    object NamedStylesSuggestionState {
      
      inline def apply(): NamedStylesSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedStylesSuggestionState]
      }
      
      extension [Self <: NamedStylesSuggestionState](x: Self) {
        
        inline def setStylesSuggestionStates(value: js.Array[NamedStyleSuggestionState]): Self = StObject.set(x, "stylesSuggestionStates", value.asInstanceOf[js.Any])
        
        inline def setStylesSuggestionStatesUndefined: Self = StObject.set(x, "stylesSuggestionStates", js.undefined)
        
        inline def setStylesSuggestionStatesVarargs(value: NamedStyleSuggestionState*): Self = StObject.set(x, "stylesSuggestionStates", js.Array(value*))
      }
    }
    
    trait NestingLevel extends StObject {
      
      var bulletAlignment: js.UndefOr[String] = js.undefined
      
      var glyphFormat: js.UndefOr[String] = js.undefined
      
      var glyphSymbol: js.UndefOr[String] = js.undefined
      
      var glyphType: js.UndefOr[String] = js.undefined
      
      var indentFirstLine: js.UndefOr[Dimension] = js.undefined
      
      var indentStart: js.UndefOr[Dimension] = js.undefined
      
      var startNumber: js.UndefOr[Double] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object NestingLevel {
      
      inline def apply(): NestingLevel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NestingLevel]
      }
      
      extension [Self <: NestingLevel](x: Self) {
        
        inline def setBulletAlignment(value: String): Self = StObject.set(x, "bulletAlignment", value.asInstanceOf[js.Any])
        
        inline def setBulletAlignmentUndefined: Self = StObject.set(x, "bulletAlignment", js.undefined)
        
        inline def setGlyphFormat(value: String): Self = StObject.set(x, "glyphFormat", value.asInstanceOf[js.Any])
        
        inline def setGlyphFormatUndefined: Self = StObject.set(x, "glyphFormat", js.undefined)
        
        inline def setGlyphSymbol(value: String): Self = StObject.set(x, "glyphSymbol", value.asInstanceOf[js.Any])
        
        inline def setGlyphSymbolUndefined: Self = StObject.set(x, "glyphSymbol", js.undefined)
        
        inline def setGlyphType(value: String): Self = StObject.set(x, "glyphType", value.asInstanceOf[js.Any])
        
        inline def setGlyphTypeUndefined: Self = StObject.set(x, "glyphType", js.undefined)
        
        inline def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
        
        inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
        
        inline def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
        
        inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
        
        inline def setStartNumber(value: Double): Self = StObject.set(x, "startNumber", value.asInstanceOf[js.Any])
        
        inline def setStartNumberUndefined: Self = StObject.set(x, "startNumber", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait NestingLevelSuggestionState extends StObject {
      
      var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.undefined
      
      var glyphFormatSuggested: js.UndefOr[Boolean] = js.undefined
      
      var glyphSymbolSuggested: js.UndefOr[Boolean] = js.undefined
      
      var glyphTypeSuggested: js.UndefOr[Boolean] = js.undefined
      
      var indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined
      
      var indentStartSuggested: js.UndefOr[Boolean] = js.undefined
      
      var startNumberSuggested: js.UndefOr[Boolean] = js.undefined
      
      var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
    }
    object NestingLevelSuggestionState {
      
      inline def apply(): NestingLevelSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NestingLevelSuggestionState]
      }
      
      extension [Self <: NestingLevelSuggestionState](x: Self) {
        
        inline def setBulletAlignmentSuggested(value: Boolean): Self = StObject.set(x, "bulletAlignmentSuggested", value.asInstanceOf[js.Any])
        
        inline def setBulletAlignmentSuggestedUndefined: Self = StObject.set(x, "bulletAlignmentSuggested", js.undefined)
        
        inline def setGlyphFormatSuggested(value: Boolean): Self = StObject.set(x, "glyphFormatSuggested", value.asInstanceOf[js.Any])
        
        inline def setGlyphFormatSuggestedUndefined: Self = StObject.set(x, "glyphFormatSuggested", js.undefined)
        
        inline def setGlyphSymbolSuggested(value: Boolean): Self = StObject.set(x, "glyphSymbolSuggested", value.asInstanceOf[js.Any])
        
        inline def setGlyphSymbolSuggestedUndefined: Self = StObject.set(x, "glyphSymbolSuggested", js.undefined)
        
        inline def setGlyphTypeSuggested(value: Boolean): Self = StObject.set(x, "glyphTypeSuggested", value.asInstanceOf[js.Any])
        
        inline def setGlyphTypeSuggestedUndefined: Self = StObject.set(x, "glyphTypeSuggested", js.undefined)
        
        inline def setIndentFirstLineSuggested(value: Boolean): Self = StObject.set(x, "indentFirstLineSuggested", value.asInstanceOf[js.Any])
        
        inline def setIndentFirstLineSuggestedUndefined: Self = StObject.set(x, "indentFirstLineSuggested", js.undefined)
        
        inline def setIndentStartSuggested(value: Boolean): Self = StObject.set(x, "indentStartSuggested", value.asInstanceOf[js.Any])
        
        inline def setIndentStartSuggestedUndefined: Self = StObject.set(x, "indentStartSuggested", js.undefined)
        
        inline def setStartNumberSuggested(value: Boolean): Self = StObject.set(x, "startNumberSuggested", value.asInstanceOf[js.Any])
        
        inline def setStartNumberSuggestedUndefined: Self = StObject.set(x, "startNumberSuggested", js.undefined)
        
        inline def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
      }
    }
    
    trait ObjectReferences extends StObject {
      
      var objectIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ObjectReferences {
      
      inline def apply(): ObjectReferences = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ObjectReferences]
      }
      
      extension [Self <: ObjectReferences](x: Self) {
        
        inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
        
        inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
        
        inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value*))
      }
    }
    
    trait OptionalColor extends StObject {
      
      var color: js.UndefOr[Color] = js.undefined
    }
    object OptionalColor {
      
      inline def apply(): OptionalColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OptionalColor]
      }
      
      extension [Self <: OptionalColor](x: Self) {
        
        inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      }
    }
    
    trait PageBreak extends StObject {
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object PageBreak {
      
      inline def apply(): PageBreak = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageBreak]
      }
      
      extension [Self <: PageBreak](x: Self) {
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait Paragraph extends StObject {
      
      var bullet: js.UndefOr[Bullet] = js.undefined
      
      var elements: js.UndefOr[js.Array[ParagraphElement]] = js.undefined
      
      var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
      
      var positionedObjectIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedBulletChanges: js.UndefOr[js.Object] = js.undefined
      
      var suggestedParagraphStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var suggestedPositionedObjectIds: js.UndefOr[js.Object] = js.undefined
    }
    object Paragraph {
      
      inline def apply(): Paragraph = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Paragraph]
      }
      
      extension [Self <: Paragraph](x: Self) {
        
        inline def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
        
        inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
        
        inline def setElements(value: js.Array[ParagraphElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
        
        inline def setElementsVarargs(value: ParagraphElement*): Self = StObject.set(x, "elements", js.Array(value*))
        
        inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
        
        inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
        
        inline def setPositionedObjectIds(value: js.Array[String]): Self = StObject.set(x, "positionedObjectIds", value.asInstanceOf[js.Any])
        
        inline def setPositionedObjectIdsUndefined: Self = StObject.set(x, "positionedObjectIds", js.undefined)
        
        inline def setPositionedObjectIdsVarargs(value: String*): Self = StObject.set(x, "positionedObjectIds", js.Array(value*))
        
        inline def setSuggestedBulletChanges(value: js.Object): Self = StObject.set(x, "suggestedBulletChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedBulletChangesUndefined: Self = StObject.set(x, "suggestedBulletChanges", js.undefined)
        
        inline def setSuggestedParagraphStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedParagraphStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedParagraphStyleChangesUndefined: Self = StObject.set(x, "suggestedParagraphStyleChanges", js.undefined)
        
        inline def setSuggestedPositionedObjectIds(value: js.Object): Self = StObject.set(x, "suggestedPositionedObjectIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedPositionedObjectIdsUndefined: Self = StObject.set(x, "suggestedPositionedObjectIds", js.undefined)
      }
    }
    
    trait ParagraphBorder extends StObject {
      
      var color: js.UndefOr[OptionalColor] = js.undefined
      
      var dashStyle: js.UndefOr[String] = js.undefined
      
      var padding: js.UndefOr[Dimension] = js.undefined
      
      var width: js.UndefOr[Dimension] = js.undefined
    }
    object ParagraphBorder {
      
      inline def apply(): ParagraphBorder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParagraphBorder]
      }
      
      extension [Self <: ParagraphBorder](x: Self) {
        
        inline def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        inline def setPadding(value: Dimension): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait ParagraphElement extends StObject {
      
      var autoText: js.UndefOr[AutoText] = js.undefined
      
      var columnBreak: js.UndefOr[ColumnBreak] = js.undefined
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var equation: js.UndefOr[Equation] = js.undefined
      
      var footnoteReference: js.UndefOr[FootnoteReference] = js.undefined
      
      var horizontalRule: js.UndefOr[HorizontalRule] = js.undefined
      
      var inlineObjectElement: js.UndefOr[InlineObjectElement] = js.undefined
      
      var pageBreak: js.UndefOr[PageBreak] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var textRun: js.UndefOr[TextRun] = js.undefined
    }
    object ParagraphElement {
      
      inline def apply(): ParagraphElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParagraphElement]
      }
      
      extension [Self <: ParagraphElement](x: Self) {
        
        inline def setAutoText(value: AutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
        
        inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
        
        inline def setColumnBreak(value: ColumnBreak): Self = StObject.set(x, "columnBreak", value.asInstanceOf[js.Any])
        
        inline def setColumnBreakUndefined: Self = StObject.set(x, "columnBreak", js.undefined)
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setEquation(value: Equation): Self = StObject.set(x, "equation", value.asInstanceOf[js.Any])
        
        inline def setEquationUndefined: Self = StObject.set(x, "equation", js.undefined)
        
        inline def setFootnoteReference(value: FootnoteReference): Self = StObject.set(x, "footnoteReference", value.asInstanceOf[js.Any])
        
        inline def setFootnoteReferenceUndefined: Self = StObject.set(x, "footnoteReference", js.undefined)
        
        inline def setHorizontalRule(value: HorizontalRule): Self = StObject.set(x, "horizontalRule", value.asInstanceOf[js.Any])
        
        inline def setHorizontalRuleUndefined: Self = StObject.set(x, "horizontalRule", js.undefined)
        
        inline def setInlineObjectElement(value: InlineObjectElement): Self = StObject.set(x, "inlineObjectElement", value.asInstanceOf[js.Any])
        
        inline def setInlineObjectElementUndefined: Self = StObject.set(x, "inlineObjectElement", js.undefined)
        
        inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
        
        inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setTextRun(value: TextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
        
        inline def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
      }
    }
    
    trait ParagraphStyle extends StObject {
      
      var alignment: js.UndefOr[String] = js.undefined
      
      var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.undefined
      
      var borderBetween: js.UndefOr[ParagraphBorder] = js.undefined
      
      var borderBottom: js.UndefOr[ParagraphBorder] = js.undefined
      
      var borderLeft: js.UndefOr[ParagraphBorder] = js.undefined
      
      var borderRight: js.UndefOr[ParagraphBorder] = js.undefined
      
      var borderTop: js.UndefOr[ParagraphBorder] = js.undefined
      
      var direction: js.UndefOr[String] = js.undefined
      
      var headingId: js.UndefOr[String] = js.undefined
      
      var indentEnd: js.UndefOr[Dimension] = js.undefined
      
      var indentFirstLine: js.UndefOr[Dimension] = js.undefined
      
      var indentStart: js.UndefOr[Dimension] = js.undefined
      
      var keepLinesTogether: js.UndefOr[Boolean] = js.undefined
      
      var keepWithNext: js.UndefOr[Boolean] = js.undefined
      
      var lineSpacing: js.UndefOr[Double] = js.undefined
      
      var namedStyleType: js.UndefOr[String] = js.undefined
      
      var shading: js.UndefOr[Shading] = js.undefined
      
      var spaceAbove: js.UndefOr[Dimension] = js.undefined
      
      var spaceBelow: js.UndefOr[Dimension] = js.undefined
      
      var spacingMode: js.UndefOr[String] = js.undefined
      
      var tabStops: js.UndefOr[js.Array[TabStop]] = js.undefined
    }
    object ParagraphStyle {
      
      inline def apply(): ParagraphStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParagraphStyle]
      }
      
      extension [Self <: ParagraphStyle](x: Self) {
        
        inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setAvoidWidowAndOrphan(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphan", value.asInstanceOf[js.Any])
        
        inline def setAvoidWidowAndOrphanUndefined: Self = StObject.set(x, "avoidWidowAndOrphan", js.undefined)
        
        inline def setBorderBetween(value: ParagraphBorder): Self = StObject.set(x, "borderBetween", value.asInstanceOf[js.Any])
        
        inline def setBorderBetweenUndefined: Self = StObject.set(x, "borderBetween", js.undefined)
        
        inline def setBorderBottom(value: ParagraphBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
        
        inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
        
        inline def setBorderLeft(value: ParagraphBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
        
        inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
        
        inline def setBorderRight(value: ParagraphBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
        
        inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
        
        inline def setBorderTop(value: ParagraphBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
        
        inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
        
        inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        inline def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
        
        inline def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
        
        inline def setIndentEnd(value: Dimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
        
        inline def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
        
        inline def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
        
        inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
        
        inline def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
        
        inline def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
        
        inline def setKeepLinesTogether(value: Boolean): Self = StObject.set(x, "keepLinesTogether", value.asInstanceOf[js.Any])
        
        inline def setKeepLinesTogetherUndefined: Self = StObject.set(x, "keepLinesTogether", js.undefined)
        
        inline def setKeepWithNext(value: Boolean): Self = StObject.set(x, "keepWithNext", value.asInstanceOf[js.Any])
        
        inline def setKeepWithNextUndefined: Self = StObject.set(x, "keepWithNext", js.undefined)
        
        inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
        
        inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
        
        inline def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
        
        inline def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
        
        inline def setShading(value: Shading): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
        
        inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
        
        inline def setSpaceAbove(value: Dimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
        
        inline def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
        
        inline def setSpaceBelow(value: Dimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
        
        inline def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
        
        inline def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
        
        inline def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
        
        inline def setTabStops(value: js.Array[TabStop]): Self = StObject.set(x, "tabStops", value.asInstanceOf[js.Any])
        
        inline def setTabStopsUndefined: Self = StObject.set(x, "tabStops", js.undefined)
        
        inline def setTabStopsVarargs(value: TabStop*): Self = StObject.set(x, "tabStops", js.Array(value*))
      }
    }
    
    trait ParagraphStyleSuggestionState extends StObject {
      
      var alignmentSuggested: js.UndefOr[Boolean] = js.undefined
      
      var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderBetweenSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderBottomSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderLeftSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderRightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderTopSuggested: js.UndefOr[Boolean] = js.undefined
      
      var directionSuggested: js.UndefOr[Boolean] = js.undefined
      
      var headingIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var indentEndSuggested: js.UndefOr[Boolean] = js.undefined
      
      var indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined
      
      var indentStartSuggested: js.UndefOr[Boolean] = js.undefined
      
      var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.undefined
      
      var keepWithNextSuggested: js.UndefOr[Boolean] = js.undefined
      
      var lineSpacingSuggested: js.UndefOr[Boolean] = js.undefined
      
      var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.undefined
      
      var shadingSuggestionState: js.UndefOr[ShadingSuggestionState] = js.undefined
      
      var spaceAboveSuggested: js.UndefOr[Boolean] = js.undefined
      
      var spaceBelowSuggested: js.UndefOr[Boolean] = js.undefined
      
      var spacingModeSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object ParagraphStyleSuggestionState {
      
      inline def apply(): ParagraphStyleSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParagraphStyleSuggestionState]
      }
      
      extension [Self <: ParagraphStyleSuggestionState](x: Self) {
        
        inline def setAlignmentSuggested(value: Boolean): Self = StObject.set(x, "alignmentSuggested", value.asInstanceOf[js.Any])
        
        inline def setAlignmentSuggestedUndefined: Self = StObject.set(x, "alignmentSuggested", js.undefined)
        
        inline def setAvoidWidowAndOrphanSuggested(value: Boolean): Self = StObject.set(x, "avoidWidowAndOrphanSuggested", value.asInstanceOf[js.Any])
        
        inline def setAvoidWidowAndOrphanSuggestedUndefined: Self = StObject.set(x, "avoidWidowAndOrphanSuggested", js.undefined)
        
        inline def setBorderBetweenSuggested(value: Boolean): Self = StObject.set(x, "borderBetweenSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderBetweenSuggestedUndefined: Self = StObject.set(x, "borderBetweenSuggested", js.undefined)
        
        inline def setBorderBottomSuggested(value: Boolean): Self = StObject.set(x, "borderBottomSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderBottomSuggestedUndefined: Self = StObject.set(x, "borderBottomSuggested", js.undefined)
        
        inline def setBorderLeftSuggested(value: Boolean): Self = StObject.set(x, "borderLeftSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderLeftSuggestedUndefined: Self = StObject.set(x, "borderLeftSuggested", js.undefined)
        
        inline def setBorderRightSuggested(value: Boolean): Self = StObject.set(x, "borderRightSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderRightSuggestedUndefined: Self = StObject.set(x, "borderRightSuggested", js.undefined)
        
        inline def setBorderTopSuggested(value: Boolean): Self = StObject.set(x, "borderTopSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderTopSuggestedUndefined: Self = StObject.set(x, "borderTopSuggested", js.undefined)
        
        inline def setDirectionSuggested(value: Boolean): Self = StObject.set(x, "directionSuggested", value.asInstanceOf[js.Any])
        
        inline def setDirectionSuggestedUndefined: Self = StObject.set(x, "directionSuggested", js.undefined)
        
        inline def setHeadingIdSuggested(value: Boolean): Self = StObject.set(x, "headingIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setHeadingIdSuggestedUndefined: Self = StObject.set(x, "headingIdSuggested", js.undefined)
        
        inline def setIndentEndSuggested(value: Boolean): Self = StObject.set(x, "indentEndSuggested", value.asInstanceOf[js.Any])
        
        inline def setIndentEndSuggestedUndefined: Self = StObject.set(x, "indentEndSuggested", js.undefined)
        
        inline def setIndentFirstLineSuggested(value: Boolean): Self = StObject.set(x, "indentFirstLineSuggested", value.asInstanceOf[js.Any])
        
        inline def setIndentFirstLineSuggestedUndefined: Self = StObject.set(x, "indentFirstLineSuggested", js.undefined)
        
        inline def setIndentStartSuggested(value: Boolean): Self = StObject.set(x, "indentStartSuggested", value.asInstanceOf[js.Any])
        
        inline def setIndentStartSuggestedUndefined: Self = StObject.set(x, "indentStartSuggested", js.undefined)
        
        inline def setKeepLinesTogetherSuggested(value: Boolean): Self = StObject.set(x, "keepLinesTogetherSuggested", value.asInstanceOf[js.Any])
        
        inline def setKeepLinesTogetherSuggestedUndefined: Self = StObject.set(x, "keepLinesTogetherSuggested", js.undefined)
        
        inline def setKeepWithNextSuggested(value: Boolean): Self = StObject.set(x, "keepWithNextSuggested", value.asInstanceOf[js.Any])
        
        inline def setKeepWithNextSuggestedUndefined: Self = StObject.set(x, "keepWithNextSuggested", js.undefined)
        
        inline def setLineSpacingSuggested(value: Boolean): Self = StObject.set(x, "lineSpacingSuggested", value.asInstanceOf[js.Any])
        
        inline def setLineSpacingSuggestedUndefined: Self = StObject.set(x, "lineSpacingSuggested", js.undefined)
        
        inline def setNamedStyleTypeSuggested(value: Boolean): Self = StObject.set(x, "namedStyleTypeSuggested", value.asInstanceOf[js.Any])
        
        inline def setNamedStyleTypeSuggestedUndefined: Self = StObject.set(x, "namedStyleTypeSuggested", js.undefined)
        
        inline def setShadingSuggestionState(value: ShadingSuggestionState): Self = StObject.set(x, "shadingSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setShadingSuggestionStateUndefined: Self = StObject.set(x, "shadingSuggestionState", js.undefined)
        
        inline def setSpaceAboveSuggested(value: Boolean): Self = StObject.set(x, "spaceAboveSuggested", value.asInstanceOf[js.Any])
        
        inline def setSpaceAboveSuggestedUndefined: Self = StObject.set(x, "spaceAboveSuggested", js.undefined)
        
        inline def setSpaceBelowSuggested(value: Boolean): Self = StObject.set(x, "spaceBelowSuggested", value.asInstanceOf[js.Any])
        
        inline def setSpaceBelowSuggestedUndefined: Self = StObject.set(x, "spaceBelowSuggested", js.undefined)
        
        inline def setSpacingModeSuggested(value: Boolean): Self = StObject.set(x, "spacingModeSuggested", value.asInstanceOf[js.Any])
        
        inline def setSpacingModeSuggestedUndefined: Self = StObject.set(x, "spacingModeSuggested", js.undefined)
      }
    }
    
    trait PositionedObject extends StObject {
      
      var objectId: js.UndefOr[String] = js.undefined
      
      var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionId: js.UndefOr[String] = js.undefined
      
      var suggestedPositionedObjectPropertiesChanges: js.UndefOr[js.Object] = js.undefined
    }
    object PositionedObject {
      
      inline def apply(): PositionedObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionedObject]
      }
      
      extension [Self <: PositionedObject](x: Self) {
        
        inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        inline def setPositionedObjectProperties(value: PositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
        
        inline def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
        
        inline def setSuggestedPositionedObjectPropertiesChanges(value: js.Object): Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedPositionedObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", js.undefined)
      }
    }
    
    trait PositionedObjectPositioning extends StObject {
      
      var layout: js.UndefOr[String] = js.undefined
      
      var leftOffset: js.UndefOr[Dimension] = js.undefined
      
      var topOffset: js.UndefOr[Dimension] = js.undefined
    }
    object PositionedObjectPositioning {
      
      inline def apply(): PositionedObjectPositioning = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionedObjectPositioning]
      }
      
      extension [Self <: PositionedObjectPositioning](x: Self) {
        
        inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setLeftOffset(value: Dimension): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
        
        inline def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
        
        inline def setTopOffset(value: Dimension): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
        
        inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      }
    }
    
    trait PositionedObjectPositioningSuggestionState extends StObject {
      
      var layoutSuggested: js.UndefOr[Boolean] = js.undefined
      
      var leftOffsetSuggested: js.UndefOr[Boolean] = js.undefined
      
      var topOffsetSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object PositionedObjectPositioningSuggestionState {
      
      inline def apply(): PositionedObjectPositioningSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionedObjectPositioningSuggestionState]
      }
      
      extension [Self <: PositionedObjectPositioningSuggestionState](x: Self) {
        
        inline def setLayoutSuggested(value: Boolean): Self = StObject.set(x, "layoutSuggested", value.asInstanceOf[js.Any])
        
        inline def setLayoutSuggestedUndefined: Self = StObject.set(x, "layoutSuggested", js.undefined)
        
        inline def setLeftOffsetSuggested(value: Boolean): Self = StObject.set(x, "leftOffsetSuggested", value.asInstanceOf[js.Any])
        
        inline def setLeftOffsetSuggestedUndefined: Self = StObject.set(x, "leftOffsetSuggested", js.undefined)
        
        inline def setTopOffsetSuggested(value: Boolean): Self = StObject.set(x, "topOffsetSuggested", value.asInstanceOf[js.Any])
        
        inline def setTopOffsetSuggestedUndefined: Self = StObject.set(x, "topOffsetSuggested", js.undefined)
      }
    }
    
    trait PositionedObjectProperties extends StObject {
      
      var embeddedObject: js.UndefOr[EmbeddedObject] = js.undefined
      
      var positioning: js.UndefOr[PositionedObjectPositioning] = js.undefined
    }
    object PositionedObjectProperties {
      
      inline def apply(): PositionedObjectProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionedObjectProperties]
      }
      
      extension [Self <: PositionedObjectProperties](x: Self) {
        
        inline def setEmbeddedObject(value: EmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
        
        inline def setPositioning(value: PositionedObjectPositioning): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
        
        inline def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
      }
    }
    
    trait PositionedObjectPropertiesSuggestionState extends StObject {
      
      var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
      
      var positioningSuggestionState: js.UndefOr[PositionedObjectPositioningSuggestionState] = js.undefined
    }
    object PositionedObjectPropertiesSuggestionState {
      
      inline def apply(): PositionedObjectPropertiesSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionedObjectPropertiesSuggestionState]
      }
      
      extension [Self <: PositionedObjectPropertiesSuggestionState](x: Self) {
        
        inline def setEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
        
        inline def setPositioningSuggestionState(value: PositionedObjectPositioningSuggestionState): Self = StObject.set(x, "positioningSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setPositioningSuggestionStateUndefined: Self = StObject.set(x, "positioningSuggestionState", js.undefined)
      }
    }
    
    trait Range extends StObject {
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var segmentId: js.UndefOr[String] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
    }
    object Range {
      
      inline def apply(): Range = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Range]
      }
      
      extension [Self <: Range](x: Self) {
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
        
        inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      }
    }
    
    trait ReplaceAllTextRequest extends StObject {
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
      
      var replaceText: js.UndefOr[String] = js.undefined
    }
    object ReplaceAllTextRequest {
      
      inline def apply(): ReplaceAllTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllTextRequest]
      }
      
      extension [Self <: ReplaceAllTextRequest](x: Self) {
        
        inline def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        inline def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        inline def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
        
        inline def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
      }
    }
    
    trait ReplaceAllTextResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.undefined
    }
    object ReplaceAllTextResponse {
      
      inline def apply(): ReplaceAllTextResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllTextResponse]
      }
      
      extension [Self <: ReplaceAllTextResponse](x: Self) {
        
        inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    trait Request extends StObject {
      
      var createNamedRange: js.UndefOr[CreateNamedRangeRequest] = js.undefined
      
      var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
      
      var deleteContentRange: js.UndefOr[DeleteContentRangeRequest] = js.undefined
      
      var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.undefined
      
      var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
      
      var deletePositionedObject: js.UndefOr[DeletePositionedObjectRequest] = js.undefined
      
      var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
      
      var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
      
      var insertInlineImage: js.UndefOr[InsertInlineImageRequest] = js.undefined
      
      var insertPageBreak: js.UndefOr[InsertPageBreakRequest] = js.undefined
      
      var insertTable: js.UndefOr[InsertTableRequest] = js.undefined
      
      var insertTableRow: js.UndefOr[InsertTableRowRequest] = js.undefined
      
      var insertText: js.UndefOr[InsertTextRequest] = js.undefined
      
      var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
      
      var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
      
      var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
    }
    object Request {
      
      inline def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setCreateNamedRange(value: CreateNamedRangeRequest): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
        
        inline def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
        
        inline def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
        
        inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
        
        inline def setDeleteContentRange(value: DeleteContentRangeRequest): Self = StObject.set(x, "deleteContentRange", value.asInstanceOf[js.Any])
        
        inline def setDeleteContentRangeUndefined: Self = StObject.set(x, "deleteContentRange", js.undefined)
        
        inline def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
        
        inline def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
        
        inline def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
        
        inline def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
        
        inline def setDeletePositionedObject(value: DeletePositionedObjectRequest): Self = StObject.set(x, "deletePositionedObject", value.asInstanceOf[js.Any])
        
        inline def setDeletePositionedObjectUndefined: Self = StObject.set(x, "deletePositionedObject", js.undefined)
        
        inline def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
        
        inline def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
        
        inline def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
        
        inline def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
        
        inline def setInsertInlineImage(value: InsertInlineImageRequest): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
        
        inline def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
        
        inline def setInsertPageBreak(value: InsertPageBreakRequest): Self = StObject.set(x, "insertPageBreak", value.asInstanceOf[js.Any])
        
        inline def setInsertPageBreakUndefined: Self = StObject.set(x, "insertPageBreak", js.undefined)
        
        inline def setInsertTable(value: InsertTableRequest): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
        
        inline def setInsertTableRow(value: InsertTableRowRequest): Self = StObject.set(x, "insertTableRow", value.asInstanceOf[js.Any])
        
        inline def setInsertTableRowUndefined: Self = StObject.set(x, "insertTableRow", js.undefined)
        
        inline def setInsertTableUndefined: Self = StObject.set(x, "insertTable", js.undefined)
        
        inline def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
        
        inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
        
        inline def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
        
        inline def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
        
        inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
        
        inline def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
        
        inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
      }
    }
    
    trait Response extends StObject {
      
      var createNamedRange: js.UndefOr[CreateNamedRangeResponse] = js.undefined
      
      var insertInlineImage: js.UndefOr[InsertInlineImageResponse] = js.undefined
      
      var insertInlineSheetsChart: js.UndefOr[InsertInlineSheetsChartResponse] = js.undefined
      
      var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.undefined
    }
    object Response {
      
      inline def apply(): Response = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setCreateNamedRange(value: CreateNamedRangeResponse): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
        
        inline def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
        
        inline def setInsertInlineImage(value: InsertInlineImageResponse): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
        
        inline def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
        
        inline def setInsertInlineSheetsChart(value: InsertInlineSheetsChartResponse): Self = StObject.set(x, "insertInlineSheetsChart", value.asInstanceOf[js.Any])
        
        inline def setInsertInlineSheetsChartUndefined: Self = StObject.set(x, "insertInlineSheetsChart", js.undefined)
        
        inline def setReplaceAllText(value: ReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
        
        inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
      }
    }
    
    trait RgbColor extends StObject {
      
      var blue: js.UndefOr[Double] = js.undefined
      
      var green: js.UndefOr[Double] = js.undefined
      
      var red: js.UndefOr[Double] = js.undefined
    }
    object RgbColor {
      
      inline def apply(): RgbColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RgbColor]
      }
      
      extension [Self <: RgbColor](x: Self) {
        
        inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
        
        inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
        
        inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
        
        inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
        
        inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
        
        inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      }
    }
    
    trait SectionBreak extends StObject {
      
      var sectionStyle: js.UndefOr[SectionStyle] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object SectionBreak {
      
      inline def apply(): SectionBreak = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SectionBreak]
      }
      
      extension [Self <: SectionBreak](x: Self) {
        
        inline def setSectionStyle(value: SectionStyle): Self = StObject.set(x, "sectionStyle", value.asInstanceOf[js.Any])
        
        inline def setSectionStyleUndefined: Self = StObject.set(x, "sectionStyle", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
      }
    }
    
    trait SectionColumnProperties extends StObject {
      
      var paddingEnd: js.UndefOr[Dimension] = js.undefined
      
      var width: js.UndefOr[Dimension] = js.undefined
    }
    object SectionColumnProperties {
      
      inline def apply(): SectionColumnProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SectionColumnProperties]
      }
      
      extension [Self <: SectionColumnProperties](x: Self) {
        
        inline def setPaddingEnd(value: Dimension): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
        
        inline def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait SectionStyle extends StObject {
      
      var columnProperties: js.UndefOr[js.Array[SectionColumnProperties]] = js.undefined
      
      var columnSeparatorStyle: js.UndefOr[String] = js.undefined
      
      var contentDirection: js.UndefOr[String] = js.undefined
    }
    object SectionStyle {
      
      inline def apply(): SectionStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SectionStyle]
      }
      
      extension [Self <: SectionStyle](x: Self) {
        
        inline def setColumnProperties(value: js.Array[SectionColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
        
        inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
        
        inline def setColumnPropertiesVarargs(value: SectionColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value*))
        
        inline def setColumnSeparatorStyle(value: String): Self = StObject.set(x, "columnSeparatorStyle", value.asInstanceOf[js.Any])
        
        inline def setColumnSeparatorStyleUndefined: Self = StObject.set(x, "columnSeparatorStyle", js.undefined)
        
        inline def setContentDirection(value: String): Self = StObject.set(x, "contentDirection", value.asInstanceOf[js.Any])
        
        inline def setContentDirectionUndefined: Self = StObject.set(x, "contentDirection", js.undefined)
      }
    }
    
    trait Shading extends StObject {
      
      var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
    }
    object Shading {
      
      inline def apply(): Shading = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Shading]
      }
      
      extension [Self <: Shading](x: Self) {
        
        inline def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      }
    }
    
    trait ShadingSuggestionState extends StObject {
      
      var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object ShadingSuggestionState {
      
      inline def apply(): ShadingSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShadingSuggestionState]
      }
      
      extension [Self <: ShadingSuggestionState](x: Self) {
        
        inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
      }
    }
    
    trait SheetsChartReference extends StObject {
      
      var chartId: js.UndefOr[Double] = js.undefined
      
      var spreadsheetId: js.UndefOr[String] = js.undefined
    }
    object SheetsChartReference {
      
      inline def apply(): SheetsChartReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SheetsChartReference]
      }
      
      extension [Self <: SheetsChartReference](x: Self) {
        
        inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    trait SheetsChartReferenceSuggestionState extends StObject {
      
      var chartIdSuggested: js.UndefOr[Boolean] = js.undefined
      
      var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object SheetsChartReferenceSuggestionState {
      
      inline def apply(): SheetsChartReferenceSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SheetsChartReferenceSuggestionState]
      }
      
      extension [Self <: SheetsChartReferenceSuggestionState](x: Self) {
        
        inline def setChartIdSuggested(value: Boolean): Self = StObject.set(x, "chartIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setChartIdSuggestedUndefined: Self = StObject.set(x, "chartIdSuggested", js.undefined)
        
        inline def setSpreadsheetIdSuggested(value: Boolean): Self = StObject.set(x, "spreadsheetIdSuggested", value.asInstanceOf[js.Any])
        
        inline def setSpreadsheetIdSuggestedUndefined: Self = StObject.set(x, "spreadsheetIdSuggested", js.undefined)
      }
    }
    
    trait Size extends StObject {
      
      var height: js.UndefOr[Dimension] = js.undefined
      
      var width: js.UndefOr[Dimension] = js.undefined
    }
    object Size {
      
      inline def apply(): Size = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Size]
      }
      
      extension [Self <: Size](x: Self) {
        
        inline def setHeight(value: Dimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait SizeSuggestionState extends StObject {
      
      var heightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var widthSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object SizeSuggestionState {
      
      inline def apply(): SizeSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SizeSuggestionState]
      }
      
      extension [Self <: SizeSuggestionState](x: Self) {
        
        inline def setHeightSuggested(value: Boolean): Self = StObject.set(x, "heightSuggested", value.asInstanceOf[js.Any])
        
        inline def setHeightSuggestedUndefined: Self = StObject.set(x, "heightSuggested", js.undefined)
        
        inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
        
        inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
      }
    }
    
    trait StructuralElement extends StObject {
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var paragraph: js.UndefOr[Paragraph] = js.undefined
      
      var sectionBreak: js.UndefOr[SectionBreak] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var table: js.UndefOr[Table] = js.undefined
      
      var tableOfContents: js.UndefOr[TableOfContents] = js.undefined
    }
    object StructuralElement {
      
      inline def apply(): StructuralElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StructuralElement]
      }
      
      extension [Self <: StructuralElement](x: Self) {
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
        
        inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
        
        inline def setSectionBreak(value: SectionBreak): Self = StObject.set(x, "sectionBreak", value.asInstanceOf[js.Any])
        
        inline def setSectionBreakUndefined: Self = StObject.set(x, "sectionBreak", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTableOfContents(value: TableOfContents): Self = StObject.set(x, "tableOfContents", value.asInstanceOf[js.Any])
        
        inline def setTableOfContentsUndefined: Self = StObject.set(x, "tableOfContents", js.undefined)
        
        inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      }
    }
    
    trait SubstringMatchCriteria extends StObject {
      
      var matchCase: js.UndefOr[Boolean] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object SubstringMatchCriteria {
      
      inline def apply(): SubstringMatchCriteria = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubstringMatchCriteria]
      }
      
      extension [Self <: SubstringMatchCriteria](x: Self) {
        
        inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
        
        inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait SuggestedBullet extends StObject {
      
      var bullet: js.UndefOr[Bullet] = js.undefined
      
      var bulletSuggestionState: js.UndefOr[BulletSuggestionState] = js.undefined
    }
    object SuggestedBullet {
      
      inline def apply(): SuggestedBullet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedBullet]
      }
      
      extension [Self <: SuggestedBullet](x: Self) {
        
        inline def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
        
        inline def setBulletSuggestionState(value: BulletSuggestionState): Self = StObject.set(x, "bulletSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setBulletSuggestionStateUndefined: Self = StObject.set(x, "bulletSuggestionState", js.undefined)
        
        inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      }
    }
    
    trait SuggestedDocumentStyle extends StObject {
      
      var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
      
      var documentStyleSuggestionState: js.UndefOr[DocumentStyleSuggestionState] = js.undefined
    }
    object SuggestedDocumentStyle {
      
      inline def apply(): SuggestedDocumentStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedDocumentStyle]
      }
      
      extension [Self <: SuggestedDocumentStyle](x: Self) {
        
        inline def setDocumentStyle(value: DocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
        
        inline def setDocumentStyleSuggestionState(value: DocumentStyleSuggestionState): Self = StObject.set(x, "documentStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setDocumentStyleSuggestionStateUndefined: Self = StObject.set(x, "documentStyleSuggestionState", js.undefined)
        
        inline def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
      }
    }
    
    trait SuggestedInlineObjectProperties extends StObject {
      
      var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
      
      var inlineObjectPropertiesSuggestionState: js.UndefOr[InlineObjectPropertiesSuggestionState] = js.undefined
    }
    object SuggestedInlineObjectProperties {
      
      inline def apply(): SuggestedInlineObjectProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedInlineObjectProperties]
      }
      
      extension [Self <: SuggestedInlineObjectProperties](x: Self) {
        
        inline def setInlineObjectProperties(value: InlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
        
        inline def setInlineObjectPropertiesSuggestionState(value: InlineObjectPropertiesSuggestionState): Self = StObject.set(x, "inlineObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setInlineObjectPropertiesSuggestionStateUndefined: Self = StObject.set(x, "inlineObjectPropertiesSuggestionState", js.undefined)
        
        inline def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
      }
    }
    
    trait SuggestedListProperties extends StObject {
      
      var listProperties: js.UndefOr[ListProperties] = js.undefined
      
      var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.undefined
    }
    object SuggestedListProperties {
      
      inline def apply(): SuggestedListProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedListProperties]
      }
      
      extension [Self <: SuggestedListProperties](x: Self) {
        
        inline def setListProperties(value: ListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
        
        inline def setListPropertiesSuggestionState(value: ListPropertiesSuggestionState): Self = StObject.set(x, "listPropertiesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setListPropertiesSuggestionStateUndefined: Self = StObject.set(x, "listPropertiesSuggestionState", js.undefined)
        
        inline def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
      }
    }
    
    trait SuggestedNamedStyles extends StObject {
      
      var namedStyles: js.UndefOr[NamedStyles] = js.undefined
      
      var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.undefined
    }
    object SuggestedNamedStyles {
      
      inline def apply(): SuggestedNamedStyles = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedNamedStyles]
      }
      
      extension [Self <: SuggestedNamedStyles](x: Self) {
        
        inline def setNamedStyles(value: NamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
        
        inline def setNamedStylesSuggestionState(value: NamedStylesSuggestionState): Self = StObject.set(x, "namedStylesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setNamedStylesSuggestionStateUndefined: Self = StObject.set(x, "namedStylesSuggestionState", js.undefined)
        
        inline def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
      }
    }
    
    trait SuggestedParagraphStyle extends StObject {
      
      var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
      
      var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.undefined
    }
    object SuggestedParagraphStyle {
      
      inline def apply(): SuggestedParagraphStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedParagraphStyle]
      }
      
      extension [Self <: SuggestedParagraphStyle](x: Self) {
        
        inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
        
        inline def setParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = StObject.set(x, "paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setParagraphStyleSuggestionStateUndefined: Self = StObject.set(x, "paragraphStyleSuggestionState", js.undefined)
        
        inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
      }
    }
    
    trait SuggestedPositionedObjectProperties extends StObject {
      
      var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
      
      var positionedObjectPropertiesSuggestionState: js.UndefOr[PositionedObjectPropertiesSuggestionState] = js.undefined
    }
    object SuggestedPositionedObjectProperties {
      
      inline def apply(): SuggestedPositionedObjectProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedPositionedObjectProperties]
      }
      
      extension [Self <: SuggestedPositionedObjectProperties](x: Self) {
        
        inline def setPositionedObjectProperties(value: PositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
        
        inline def setPositionedObjectPropertiesSuggestionState(value: PositionedObjectPropertiesSuggestionState): Self = StObject.set(x, "positionedObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setPositionedObjectPropertiesSuggestionStateUndefined: Self = StObject.set(x, "positionedObjectPropertiesSuggestionState", js.undefined)
        
        inline def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
      }
    }
    
    trait SuggestedTableCellStyle extends StObject {
      
      var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
      
      var tableCellStyleSuggestionState: js.UndefOr[TableCellStyleSuggestionState] = js.undefined
    }
    object SuggestedTableCellStyle {
      
      inline def apply(): SuggestedTableCellStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedTableCellStyle]
      }
      
      extension [Self <: SuggestedTableCellStyle](x: Self) {
        
        inline def setTableCellStyle(value: TableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
        
        inline def setTableCellStyleSuggestionState(value: TableCellStyleSuggestionState): Self = StObject.set(x, "tableCellStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setTableCellStyleSuggestionStateUndefined: Self = StObject.set(x, "tableCellStyleSuggestionState", js.undefined)
        
        inline def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
      }
    }
    
    trait SuggestedTableRowStyle extends StObject {
      
      var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
      
      var tableRowStyleSuggestionState: js.UndefOr[TableRowStyleSuggestionState] = js.undefined
    }
    object SuggestedTableRowStyle {
      
      inline def apply(): SuggestedTableRowStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedTableRowStyle]
      }
      
      extension [Self <: SuggestedTableRowStyle](x: Self) {
        
        inline def setTableRowStyle(value: TableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
        
        inline def setTableRowStyleSuggestionState(value: TableRowStyleSuggestionState): Self = StObject.set(x, "tableRowStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setTableRowStyleSuggestionStateUndefined: Self = StObject.set(x, "tableRowStyleSuggestionState", js.undefined)
        
        inline def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
      }
    }
    
    trait SuggestedTextStyle extends StObject {
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
      
      var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
    }
    object SuggestedTextStyle {
      
      inline def apply(): SuggestedTextStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuggestedTextStyle]
      }
      
      extension [Self <: SuggestedTextStyle](x: Self) {
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
        
        inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait TabStop extends StObject {
      
      var alignment: js.UndefOr[String] = js.undefined
      
      var offset: js.UndefOr[Dimension] = js.undefined
    }
    object TabStop {
      
      inline def apply(): TabStop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TabStop]
      }
      
      extension [Self <: TabStop](x: Self) {
        
        inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        inline def setOffset(value: Dimension): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    trait Table extends StObject {
      
      var columns: js.UndefOr[Double] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var tableRows: js.UndefOr[js.Array[TableRow]] = js.undefined
      
      var tableStyle: js.UndefOr[TableStyle] = js.undefined
    }
    object Table {
      
      inline def apply(): Table = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Table]
      }
      
      extension [Self <: Table](x: Self) {
        
        inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setTableRows(value: js.Array[TableRow]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
        
        inline def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
        
        inline def setTableRowsVarargs(value: TableRow*): Self = StObject.set(x, "tableRows", js.Array(value*))
        
        inline def setTableStyle(value: TableStyle): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
        
        inline def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
      }
    }
    
    trait TableCell extends StObject {
      
      var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTableCellStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
    }
    object TableCell {
      
      inline def apply(): TableCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCell]
      }
      
      extension [Self <: TableCell](x: Self) {
        
        inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTableCellStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTableCellStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTableCellStyleChangesUndefined: Self = StObject.set(x, "suggestedTableCellStyleChanges", js.undefined)
        
        inline def setTableCellStyle(value: TableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
        
        inline def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
      }
    }
    
    trait TableCellBorder extends StObject {
      
      var color: js.UndefOr[OptionalColor] = js.undefined
      
      var dashStyle: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Dimension] = js.undefined
    }
    object TableCellBorder {
      
      inline def apply(): TableCellBorder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellBorder]
      }
      
      extension [Self <: TableCellBorder](x: Self) {
        
        inline def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait TableCellLocation extends StObject {
      
      var columnIndex: js.UndefOr[Double] = js.undefined
      
      var rowIndex: js.UndefOr[Double] = js.undefined
      
      var tableStartLocation: js.UndefOr[Location] = js.undefined
    }
    object TableCellLocation {
      
      inline def apply(): TableCellLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellLocation]
      }
      
      extension [Self <: TableCellLocation](x: Self) {
        
        inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
        
        inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
        
        inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
        
        inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
        
        inline def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
        
        inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
      }
    }
    
    trait TableCellStyle extends StObject {
      
      var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
      
      var borderBottom: js.UndefOr[TableCellBorder] = js.undefined
      
      var borderLeft: js.UndefOr[TableCellBorder] = js.undefined
      
      var borderRight: js.UndefOr[TableCellBorder] = js.undefined
      
      var borderTop: js.UndefOr[TableCellBorder] = js.undefined
      
      var columnSpan: js.UndefOr[Double] = js.undefined
      
      var contentAlignment: js.UndefOr[String] = js.undefined
      
      var paddingBottom: js.UndefOr[Dimension] = js.undefined
      
      var paddingLeft: js.UndefOr[Dimension] = js.undefined
      
      var paddingRight: js.UndefOr[Dimension] = js.undefined
      
      var paddingTop: js.UndefOr[Dimension] = js.undefined
      
      var rowSpan: js.UndefOr[Double] = js.undefined
    }
    object TableCellStyle {
      
      inline def apply(): TableCellStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellStyle]
      }
      
      extension [Self <: TableCellStyle](x: Self) {
        
        inline def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setBorderBottom(value: TableCellBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
        
        inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
        
        inline def setBorderLeft(value: TableCellBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
        
        inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
        
        inline def setBorderRight(value: TableCellBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
        
        inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
        
        inline def setBorderTop(value: TableCellBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
        
        inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
        
        inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
        
        inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
        
        inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
        
        inline def setPaddingBottom(value: Dimension): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
        
        inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
        
        inline def setPaddingLeft(value: Dimension): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
        
        inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
        
        inline def setPaddingRight(value: Dimension): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
        
        inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
        
        inline def setPaddingTop(value: Dimension): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
        
        inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      }
    }
    
    trait TableCellStyleSuggestionState extends StObject {
      
      var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderBottomSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderLeftSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderRightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var borderTopSuggested: js.UndefOr[Boolean] = js.undefined
      
      var columnSpanSuggested: js.UndefOr[Boolean] = js.undefined
      
      var contentAlignmentSuggested: js.UndefOr[Boolean] = js.undefined
      
      var paddingBottomSuggested: js.UndefOr[Boolean] = js.undefined
      
      var paddingLeftSuggested: js.UndefOr[Boolean] = js.undefined
      
      var paddingRightSuggested: js.UndefOr[Boolean] = js.undefined
      
      var paddingTopSuggested: js.UndefOr[Boolean] = js.undefined
      
      var rowSpanSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object TableCellStyleSuggestionState {
      
      inline def apply(): TableCellStyleSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellStyleSuggestionState]
      }
      
      extension [Self <: TableCellStyleSuggestionState](x: Self) {
        
        inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
        
        inline def setBorderBottomSuggested(value: Boolean): Self = StObject.set(x, "borderBottomSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderBottomSuggestedUndefined: Self = StObject.set(x, "borderBottomSuggested", js.undefined)
        
        inline def setBorderLeftSuggested(value: Boolean): Self = StObject.set(x, "borderLeftSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderLeftSuggestedUndefined: Self = StObject.set(x, "borderLeftSuggested", js.undefined)
        
        inline def setBorderRightSuggested(value: Boolean): Self = StObject.set(x, "borderRightSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderRightSuggestedUndefined: Self = StObject.set(x, "borderRightSuggested", js.undefined)
        
        inline def setBorderTopSuggested(value: Boolean): Self = StObject.set(x, "borderTopSuggested", value.asInstanceOf[js.Any])
        
        inline def setBorderTopSuggestedUndefined: Self = StObject.set(x, "borderTopSuggested", js.undefined)
        
        inline def setColumnSpanSuggested(value: Boolean): Self = StObject.set(x, "columnSpanSuggested", value.asInstanceOf[js.Any])
        
        inline def setColumnSpanSuggestedUndefined: Self = StObject.set(x, "columnSpanSuggested", js.undefined)
        
        inline def setContentAlignmentSuggested(value: Boolean): Self = StObject.set(x, "contentAlignmentSuggested", value.asInstanceOf[js.Any])
        
        inline def setContentAlignmentSuggestedUndefined: Self = StObject.set(x, "contentAlignmentSuggested", js.undefined)
        
        inline def setPaddingBottomSuggested(value: Boolean): Self = StObject.set(x, "paddingBottomSuggested", value.asInstanceOf[js.Any])
        
        inline def setPaddingBottomSuggestedUndefined: Self = StObject.set(x, "paddingBottomSuggested", js.undefined)
        
        inline def setPaddingLeftSuggested(value: Boolean): Self = StObject.set(x, "paddingLeftSuggested", value.asInstanceOf[js.Any])
        
        inline def setPaddingLeftSuggestedUndefined: Self = StObject.set(x, "paddingLeftSuggested", js.undefined)
        
        inline def setPaddingRightSuggested(value: Boolean): Self = StObject.set(x, "paddingRightSuggested", value.asInstanceOf[js.Any])
        
        inline def setPaddingRightSuggestedUndefined: Self = StObject.set(x, "paddingRightSuggested", js.undefined)
        
        inline def setPaddingTopSuggested(value: Boolean): Self = StObject.set(x, "paddingTopSuggested", value.asInstanceOf[js.Any])
        
        inline def setPaddingTopSuggestedUndefined: Self = StObject.set(x, "paddingTopSuggested", js.undefined)
        
        inline def setRowSpanSuggested(value: Boolean): Self = StObject.set(x, "rowSpanSuggested", value.asInstanceOf[js.Any])
        
        inline def setRowSpanSuggestedUndefined: Self = StObject.set(x, "rowSpanSuggested", js.undefined)
      }
    }
    
    trait TableColumnProperties extends StObject {
      
      var width: js.UndefOr[Dimension] = js.undefined
      
      var widthType: js.UndefOr[String] = js.undefined
    }
    object TableColumnProperties {
      
      inline def apply(): TableColumnProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableColumnProperties]
      }
      
      extension [Self <: TableColumnProperties](x: Self) {
        
        inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthType(value: String): Self = StObject.set(x, "widthType", value.asInstanceOf[js.Any])
        
        inline def setWidthTypeUndefined: Self = StObject.set(x, "widthType", js.undefined)
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait TableOfContents extends StObject {
      
      var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object TableOfContents {
      
      inline def apply(): TableOfContents = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableOfContents]
      }
      
      extension [Self <: TableOfContents](x: Self) {
        
        inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
      }
    }
    
    trait TableRow extends StObject {
      
      var endIndex: js.UndefOr[Double] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTableRowStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var tableCells: js.UndefOr[js.Array[TableCell]] = js.undefined
      
      var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
    }
    object TableRow {
      
      inline def apply(): TableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRow]
      }
      
      extension [Self <: TableRow](x: Self) {
        
        inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTableRowStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTableRowStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTableRowStyleChangesUndefined: Self = StObject.set(x, "suggestedTableRowStyleChanges", js.undefined)
        
        inline def setTableCells(value: js.Array[TableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
        
        inline def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
        
        inline def setTableCellsVarargs(value: TableCell*): Self = StObject.set(x, "tableCells", js.Array(value*))
        
        inline def setTableRowStyle(value: TableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
        
        inline def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
      }
    }
    
    trait TableRowStyle extends StObject {
      
      var minRowHeight: js.UndefOr[Dimension] = js.undefined
    }
    object TableRowStyle {
      
      inline def apply(): TableRowStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRowStyle]
      }
      
      extension [Self <: TableRowStyle](x: Self) {
        
        inline def setMinRowHeight(value: Dimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
        
        inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
      }
    }
    
    trait TableRowStyleSuggestionState extends StObject {
      
      var minRowHeightSuggested: js.UndefOr[Boolean] = js.undefined
    }
    object TableRowStyleSuggestionState {
      
      inline def apply(): TableRowStyleSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRowStyleSuggestionState]
      }
      
      extension [Self <: TableRowStyleSuggestionState](x: Self) {
        
        inline def setMinRowHeightSuggested(value: Boolean): Self = StObject.set(x, "minRowHeightSuggested", value.asInstanceOf[js.Any])
        
        inline def setMinRowHeightSuggestedUndefined: Self = StObject.set(x, "minRowHeightSuggested", js.undefined)
      }
    }
    
    trait TableStyle extends StObject {
      
      var tableColumnProperties: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
    }
    object TableStyle {
      
      inline def apply(): TableStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableStyle]
      }
      
      extension [Self <: TableStyle](x: Self) {
        
        inline def setTableColumnProperties(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
        
        inline def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
        
        inline def setTableColumnPropertiesVarargs(value: TableColumnProperties*): Self = StObject.set(x, "tableColumnProperties", js.Array(value*))
      }
    }
    
    trait TextRun extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object TextRun {
      
      inline def apply(): TextRun = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextRun]
      }
      
      extension [Self <: TextRun](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
        
        inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
        
        inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
        
        inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
        
        inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
        
        inline def setSuggestedTextStyleChanges(value: js.Object): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
        
        inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait TextStyle extends StObject {
      
      var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
      
      var baselineOffset: js.UndefOr[String] = js.undefined
      
      var bold: js.UndefOr[Boolean] = js.undefined
      
      var fontSize: js.UndefOr[Dimension] = js.undefined
      
      var foregroundColor: js.UndefOr[OptionalColor] = js.undefined
      
      var italic: js.UndefOr[Boolean] = js.undefined
      
      var link: js.UndefOr[Link] = js.undefined
      
      var smallCaps: js.UndefOr[Boolean] = js.undefined
      
      var strikethrough: js.UndefOr[Boolean] = js.undefined
      
      var underline: js.UndefOr[Boolean] = js.undefined
      
      var weightedFontFamily: js.UndefOr[WeightedFontFamily] = js.undefined
    }
    object TextStyle {
      
      inline def apply(): TextStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextStyle]
      }
      
      extension [Self <: TextStyle](x: Self) {
        
        inline def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setBaselineOffset(value: String): Self = StObject.set(x, "baselineOffset", value.asInstanceOf[js.Any])
        
        inline def setBaselineOffsetUndefined: Self = StObject.set(x, "baselineOffset", js.undefined)
        
        inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
        
        inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
        
        inline def setFontSize(value: Dimension): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        inline def setForegroundColor(value: OptionalColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
        
        inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
        
        inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
        
        inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
        
        inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setSmallCaps(value: Boolean): Self = StObject.set(x, "smallCaps", value.asInstanceOf[js.Any])
        
        inline def setSmallCapsUndefined: Self = StObject.set(x, "smallCaps", js.undefined)
        
        inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
        
        inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
        
        inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
        
        inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
        
        inline def setWeightedFontFamily(value: WeightedFontFamily): Self = StObject.set(x, "weightedFontFamily", value.asInstanceOf[js.Any])
        
        inline def setWeightedFontFamilyUndefined: Self = StObject.set(x, "weightedFontFamily", js.undefined)
      }
    }
    
    trait TextStyleSuggestionState extends StObject {
      
      var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
      
      var baselineOffsetSuggested: js.UndefOr[Boolean] = js.undefined
      
      var boldSuggested: js.UndefOr[Boolean] = js.undefined
      
      var fontSizeSuggested: js.UndefOr[Boolean] = js.undefined
      
      var foregroundColorSuggested: js.UndefOr[Boolean] = js.undefined
      
      var italicSuggested: js.UndefOr[Boolean] = js.undefined
      
      var linkSuggested: js.UndefOr[Boolean] = js.undefined
      
      var smallCapsSuggested: js.UndefOr[Boolean] = js.undefined
      
      var strikethroughSuggested: js.UndefOr[Boolean] = js.undefined
      
      var underlineSuggested: js.UndefOr[Boolean] = js.undefined
      
      var weightedFontFamilySuggested: js.UndefOr[Boolean] = js.undefined
    }
    object TextStyleSuggestionState {
      
      inline def apply(): TextStyleSuggestionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextStyleSuggestionState]
      }
      
      extension [Self <: TextStyleSuggestionState](x: Self) {
        
        inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
        
        inline def setBaselineOffsetSuggested(value: Boolean): Self = StObject.set(x, "baselineOffsetSuggested", value.asInstanceOf[js.Any])
        
        inline def setBaselineOffsetSuggestedUndefined: Self = StObject.set(x, "baselineOffsetSuggested", js.undefined)
        
        inline def setBoldSuggested(value: Boolean): Self = StObject.set(x, "boldSuggested", value.asInstanceOf[js.Any])
        
        inline def setBoldSuggestedUndefined: Self = StObject.set(x, "boldSuggested", js.undefined)
        
        inline def setFontSizeSuggested(value: Boolean): Self = StObject.set(x, "fontSizeSuggested", value.asInstanceOf[js.Any])
        
        inline def setFontSizeSuggestedUndefined: Self = StObject.set(x, "fontSizeSuggested", js.undefined)
        
        inline def setForegroundColorSuggested(value: Boolean): Self = StObject.set(x, "foregroundColorSuggested", value.asInstanceOf[js.Any])
        
        inline def setForegroundColorSuggestedUndefined: Self = StObject.set(x, "foregroundColorSuggested", js.undefined)
        
        inline def setItalicSuggested(value: Boolean): Self = StObject.set(x, "italicSuggested", value.asInstanceOf[js.Any])
        
        inline def setItalicSuggestedUndefined: Self = StObject.set(x, "italicSuggested", js.undefined)
        
        inline def setLinkSuggested(value: Boolean): Self = StObject.set(x, "linkSuggested", value.asInstanceOf[js.Any])
        
        inline def setLinkSuggestedUndefined: Self = StObject.set(x, "linkSuggested", js.undefined)
        
        inline def setSmallCapsSuggested(value: Boolean): Self = StObject.set(x, "smallCapsSuggested", value.asInstanceOf[js.Any])
        
        inline def setSmallCapsSuggestedUndefined: Self = StObject.set(x, "smallCapsSuggested", js.undefined)
        
        inline def setStrikethroughSuggested(value: Boolean): Self = StObject.set(x, "strikethroughSuggested", value.asInstanceOf[js.Any])
        
        inline def setStrikethroughSuggestedUndefined: Self = StObject.set(x, "strikethroughSuggested", js.undefined)
        
        inline def setUnderlineSuggested(value: Boolean): Self = StObject.set(x, "underlineSuggested", value.asInstanceOf[js.Any])
        
        inline def setUnderlineSuggestedUndefined: Self = StObject.set(x, "underlineSuggested", js.undefined)
        
        inline def setWeightedFontFamilySuggested(value: Boolean): Self = StObject.set(x, "weightedFontFamilySuggested", value.asInstanceOf[js.Any])
        
        inline def setWeightedFontFamilySuggestedUndefined: Self = StObject.set(x, "weightedFontFamilySuggested", js.undefined)
      }
    }
    
    trait UpdateParagraphStyleRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
      
      var range: js.UndefOr[Range] = js.undefined
    }
    object UpdateParagraphStyleRequest {
      
      inline def apply(): UpdateParagraphStyleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateParagraphStyleRequest]
      }
      
      extension [Self <: UpdateParagraphStyleRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
        
        inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    trait UpdateTextStyleRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.undefined
      
      var range: js.UndefOr[Range] = js.undefined
      
      var textStyle: js.UndefOr[TextStyle] = js.undefined
    }
    object UpdateTextStyleRequest {
      
      inline def apply(): UpdateTextStyleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTextStyleRequest]
      }
      
      extension [Self <: UpdateTextStyleRequest](x: Self) {
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
        
        inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      }
    }
    
    trait WeightedFontFamily extends StObject {
      
      var fontFamily: js.UndefOr[String] = js.undefined
      
      var weight: js.UndefOr[Double] = js.undefined
    }
    object WeightedFontFamily {
      
      inline def apply(): WeightedFontFamily = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WeightedFontFamily]
      }
      
      extension [Self <: WeightedFontFamily](x: Self) {
        
        inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    trait WriteControl extends StObject {
      
      var requiredRevisionId: js.UndefOr[String] = js.undefined
      
      var targetRevisionId: js.UndefOr[String] = js.undefined
    }
    object WriteControl {
      
      inline def apply(): WriteControl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WriteControl]
      }
      
      extension [Self <: WriteControl](x: Self) {
        
        inline def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
        
        inline def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
        
        inline def setTargetRevisionId(value: String): Self = StObject.set(x, "targetRevisionId", value.asInstanceOf[js.Any])
        
        inline def setTargetRevisionIdUndefined: Self = StObject.set(x, "targetRevisionId", js.undefined)
      }
    }
  }
}
