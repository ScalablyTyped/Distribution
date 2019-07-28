package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of the available client commands.
  */
trait RichEditCommands extends js.Object {
  /**
    * Gets a command to add spacing after a paragraph.
    * Value: A <see cref="AddSpacingAfterParagraphCommand" /> object that provides methods for executing the command and checking its state.
    */
  var addSpacingAfterParagraph: AddSpacingAfterParagraphCommand
  /**
    * Gets a command to add spacing before a paragraph.
    * Value: A <see cref="AddSpacingBeforeParagraphCommand" /> object that provides methods for executing the command and checking its state.
    */
  var addSpacingBeforeParagraph: AddSpacingBeforeParagraphCommand
  /**
    * Gets a command to assign a shortcut to the specified client command.
    * Value: A <see cref="AssignShortcutCommand" /> object that provides methods for executing the command and checking its state.
    */
  var assignShortcut: AssignShortcutCommand
  /**
    * Gets a command to move the cursor backwards and erase characters in a selected range.
    * Value: A <see cref="BackspaceCommand" /> object that provides methods for executing the command and checking its state.
    */
  var backspace: BackspaceCommand
  /**
    * Gets a command to capitalize each word in the selected sentence.
    * Value: A <see cref="CapitalizeEachWordTextCaseCommand" /> object that provides methods for executing the command and checking its state.
    */
  var capitalizeEachWordTextCase: CapitalizeEachWordTextCaseCommand
  /**
    * Gets a command to customize the numbered list parameters.
    * Value: A <see cref="ChangeCustomNumberingListCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeCustomNumberingList: ChangeCustomNumberingListCommand
  /**
    * Gets a command to change a floating object's absolute position.
    * Value: A <see cref="ChangeFloatingObjectAbsolutePositionCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectAbsolutePosition: ChangeFloatingObjectAbsolutePositionCommand
  /**
    * Gets a command to change a floating object's absolute size.
    * Value: A <see cref="ChangeFloatingObjectAbsoluteSizeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectAbsoluteSize: ChangeFloatingObjectAbsoluteSizeCommand
  /**
    * Gets a command to modify a floating object's alignment position.
    * Value: A <see cref="ChangeFloatingObjectAlignmentPositionCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectAlignmentPosition: ChangeFloatingObjectAlignmentPositionCommand
  /**
    * Gets a command to modify a floating object's background fill color.
    * Value: A <see cref="ChangeFloatingObjectFillColorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectFillColor: ChangeFloatingObjectFillColorCommand
  /**
    * Gets a command to lock a floating object's anchor.
    * Value: A <see cref="ChangeFloatingObjectLockAnchorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectLockAnchor: ChangeFloatingObjectLockAnchorCommand
  /**
    * Gets a command to lock a floating object's aspect ratio.
    * Value: A <see cref="ChangeFloatingObjectLockAspectRatioCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectLockAspectRatio: ChangeFloatingObjectLockAspectRatioCommand
  /**
    * Gets a command to modify a floating object's outline color.
    * Value: A <see cref="ChangeFloatingObjectOutlineColorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectOutlineColor: ChangeFloatingObjectOutlineColorCommand
  /**
    * Gets a command to modify a floating object's outline width.
    * Value: A <see cref="ChangeFloatingObjectOutlineWidthCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectOutlineWidth: ChangeFloatingObjectOutlineWidthCommand
  /**
    * Gets a command to modify a floating object's relative position.
    * Value: A <see cref="ChangeFloatingObjectRelativePositionCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectRelativePosition: ChangeFloatingObjectRelativePositionCommand
  /**
    * Gets a command to rotate a floating object.
    * Value: A <see cref="ChangeFloatingObjectRotationCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectRotation: ChangeFloatingObjectRotationCommand
  /**
    * Gets a command to modify a floating object's text wrapping settings.
    * Value: A <see cref="ChangeFloatingObjectTextWrappingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFloatingObjectTextWrapping: ChangeFloatingObjectTextWrappingCommand
  /**
    * Gets a command to change the background color of characters in a selected range.
    * Value: A <see cref="ChangeFontBackColorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontBackColor: ChangeFontBackColorCommand
  /**
    * Gets a command to change the bold formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontBoldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontBold: ChangeFontBoldCommand
  /**
    * Gets a command to change the font color of characters in a selected range.
    * Value: A <see cref="ChangeFontForeColorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontForeColor: ChangeFontForeColorCommand
  /**
    * Gets a command to change the font formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontFormattingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontFormatting: ChangeFontFormattingCommand
  /**
    * Gets a command to change the italic formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontItalicCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontItalic: ChangeFontItalicCommand
  /**
    * Gets a command to change the font name of characters in a selected range.
    * Value: A <see cref="ChangeFontNameCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontName: ChangeFontNameCommand
  /**
    * Gets a command to change the font size (in points) of characters in a selected range.
    * Value: A <see cref="ChangeFontSizeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontSize: ChangeFontSizeCommand
  /**
    * Gets a command to change the strikeout formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontStrikeoutCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontStrikeout: ChangeFontStrikeoutCommand
  /**
    * Gets a command to change the subscript formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontSubscriptCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontSubscript: ChangeFontSubscriptCommand
  /**
    * Gets a command to change the superscript formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontSuperscriptCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontSuperscript: ChangeFontSuperscriptCommand
  /**
    * Gets a command to change the underline formatting of characters in a selected range.
    * Value: A <see cref="ChangeFontUnderlineCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeFontUnderline: ChangeFontUnderlineCommand
  /**
    * Gets a command that changes the specified hyperlink.
    * Value: A <see cref="ChangeHyperlinkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeHyperlink: ChangeHyperlinkCommand
  /**
    * Gets a command to set the background color of all pages contained in the document.
    * Value: A <see cref="ChangePageColorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changePageColor: ChangePageColorCommand
  /**
    * Gets a command to apply page margins settings to sections located within a selected range.
    * Value: A <see cref="ChangePageMarginsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changePageMargins: ChangePageMarginsCommand
  /**
    * Gets a command to apply page orientation settings to sections located within a selected range.
    * Value: A <see cref="ChangePageOrientationCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changePageOrientation: ChangePageOrientationCommand
  /**
    * Gets a command to apply page size settings to sections located within a selected range.
    * Value: A <see cref="ChangePageSizeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changePageSize: ChangePageSizeCommand
  /**
    * Gets a command to change the background color of paragraphs in a selected range.
    * Value: A <see cref="ChangeParagraphBackColorCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeParagraphBackColor: ChangeParagraphBackColorCommand
  /**
    * Gets a command to apply formatting settings to paragraphs within a selected range.
    * Value: A <see cref="ChangeParagraphFormattingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeParagraphFormatting: ChangeParagraphFormattingCommand
  /**
    * Gets a command to scale a selected in-line picture.
    * Value: A <see cref="ChangePictureScaleCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changePictureScale: ChangePictureScaleCommand
  /**
    * Gets a command to apply column layout settings to a section.
    * Value: A <see cref="ChangeSectionColumnsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeSectionColumns: ChangeSectionColumnsCommand
  /**
    * Gets a command to change the number of columns having the same width in a section.
    * Value: A <see cref="ChangeSectionEqualColumnCountCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeSectionEqualColumnCount: ChangeSectionEqualColumnCountCommand
  /**
    * Gets a command to apply a character or paragraph style settings to text in a selected range.
    * Value: A <see cref="ChangeStyleCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeStyle: ChangeStyleCommand
  /**
    * Gets a command to apply borders' drawing settings.
    * Value: A <see cref="ChangeTableBorderRepositoryItemCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableBorderRepositoryItem: ChangeTableBorderRepositoryItemCommand
  /**
    * Gets a command to change the selected table's borders and shading.
    * Value: A <see cref="ChangeTableBordersAndShadingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableBordersAndShading: ChangeTableBordersAndShadingCommand
  /**
    * Gets a command to change the cell formatting of the selected table elements.
    * Value: A <see cref="ChangeTableCellFormattingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableCellFormatting: ChangeTableCellFormattingCommand
  /**
    * Gets a command to change the preferred cell width of the selected table rows.
    * Value: A <see cref="ChangeTableCellPreferredWidthCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableCellPreferredWidth: ChangeTableCellPreferredWidthCommand
  /**
    * Gets a command to change cell shading in selected table cells.
    * Value: A <see cref="ChangeTableCellShadingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableCellShading: ChangeTableCellShadingCommand
  /**
    * Gets a command to change the selected table columns' preferred width.
    * Value: A <see cref="ChangeTableColumnPreferredWidthCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableColumnPreferredWidth: ChangeTableColumnPreferredWidthCommand
  /**
    * Gets a command to change the selected table's formatting.
    * Value: A <see cref="ChangeTableFormattingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableFormatting: ChangeTableFormattingCommand
  /**
    * Gets a command to change the selected table's style options.
    * Value: A <see cref="ChangeTableLookCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableLook: ChangeTableLookCommand
  /**
    * Gets a command to change the selected table rows' preferred height.
    * Value: A <see cref="ChangeTableRowPreferredHeightCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableRowPreferredHeight: ChangeTableRowPreferredHeightCommand
  /**
    * Gets a command to change the selected table's style.
    * Value: A <see cref="ChangeTableStyleCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTableStyle: ChangeTableStyleCommand
  /**
    * Gets a command to change the default tab stop value of a document and apply custom tab settings to the selected paragraphs.
    * Value: A <see cref="ChangeTabsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTabs: ChangeTabsCommand
  /**
    * Gets a command to modify a text box's content margins.
    * Value: A <see cref="ChangeTextBoxContentMarginsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTextBoxContentMargins: ChangeTextBoxContentMarginsCommand
  /**
    * Gets a command to modify a text box's relative size settings.
    * Value: A <see cref="ChangeTextBoxRelativeSizeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTextBoxRelativeSize: ChangeTextBoxRelativeSizeCommand
  /**
    * Gets a command to resize the shape to fit the text in the text box.
    * Value: A <see cref="ChangeTextBoxResizeShapeToFitTextCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeTextBoxResizeShapeToFitText: ChangeTextBoxResizeShapeToFitTextCommand
  /**
    * Gets a command to change the Rich Edit's document view type.
    * Value: A <see cref="ChangeViewTypeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var changeViewType: ChangeViewTypeCommand
  /**
    * Gets a command to reset textual and paragraph formatting in the selected range to default values.
    * Value: A <see cref="ClearFormattingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var clearFormatting: ClearFormattingCommand
  /**
    * Gets a command to substitute a header/footer sub-document with the main sub-document as an active sub-document.
    * Value: A <see cref="CloseHeaderFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var closeHeaderFooter: CloseHeaderFooterCommand
  /**
    * Gets a command to continue the list's numbering.
    * Value: A <see cref="ContinueNumberingListCommand" /> object that provides methods for executing the command and checking its state.
    */
  var continueNumberingList: ContinueNumberingListCommand
  /**
    * Gets a command to copy the selected text and place it to the clipboard.
    * Value: A <see cref="CopyCommand" /> object that provides methods for executing the command and checking its state.
    */
  var copy: CopyCommand
  /**
    * Gets a command to copy the selected text and place it to the specified position.
    * Value: A <see cref="CopyContentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var copyContent: CopyContentCommand
  /**
    * Gets a command to insert and update a field with a DATE code.
    * Value: A <see cref="CreateDateFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var createDateField: CreateDateFieldCommand
  /**
    * Gets a command to add a field at the current position in a document.
    * Value: A <see cref="CreateFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var createField: CreateFieldCommand
  /**
    * Gets a command to replace the selection with a MERGEFIELD (a data source column name is passed with a parameter).
    * Value: A <see cref="CreateMergeFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var createMergeField: CreateMergeFieldCommand
  /**
    * Gets a command to replace the selection with a NUMPAGES field displaying the total number of pages.
    * Value: A <see cref="CreatePageCountFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var createPageCountField: CreatePageCountFieldCommand
  /**
    * Gets a command to replace the selection with a PAGE field displaying the current page number.
    * Value: A <see cref="CreatePageFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var createPageField: CreatePageFieldCommand
  /**
    * Gets a command to replace the selection with a TIME field displaying the current time.
    * Value: A <see cref="CreateTimeFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var createTimeField: CreateTimeFieldCommand
  /**
    * Gets a command to cut the selected text and place it to the clipboard.
    * Value: A <see cref="CutCommand" /> object that provides methods for executing the command and checking its state.
    */
  var cut: CutCommand
  /**
    * Gets a command to decrease the selected range's font size to the closest smaller predefined value (in points).
    * Value: A <see cref="DecreaseFontSizeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var decreaseFontSize: DecreaseFontSizeCommand
  /**
    * Gets a command to decrease the indent level of paragraphs in a selected range.
    * Value: A <see cref="DecreaseIndentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var decreaseIndent: DecreaseIndentCommand
  /**
    * Gets a command to decrement the indent level of paragraphs in a selected numbered list.
    * Value: A <see cref="DecrementNumberingIndentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var decrementNumberingIndent: DecrementNumberingIndentCommand
  /**
    * Gets a command to decrement the paragraph's left indent position.
    * Value: A <see cref="DecrementParagraphLeftIndentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var decrementParagraphLeftIndent: DecrementParagraphLeftIndentCommand
  /**
    * Gets a command to delete text and in-line objects in a selected range.
    * Value: A <see cref="DeleteCommand" /> object that provides methods for executing the command and checking its state.
    */
  var delete: DeleteCommand
  /**
    * Gets a command to delete a specific bookmark.
    * Value: A <see cref="DeleteBookmarkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteBookmark: DeleteBookmarkCommand
  /**
    * Gets a command to delete the selected hyperlink.
    * Value: A <see cref="DeleteHyperlinkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteHyperlink: DeleteHyperlinkCommand
  /**
    * Gets a command to delete all hyperlinks in the selected range.
    * Value: A <see cref="DeleteHyperlinksCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteHyperlinks: DeleteHyperlinksCommand
  /**
    * Gets a command to delete the selected table.
    * Value: A <see cref="DeleteTableCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteTable: DeleteTableCommand
  /**
    * Gets a command to invoke the Delete Cells dialog window.
    * Value: A <see cref="DeleteTableCellsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteTableCellsDialog: DeleteTableCellsDialogCommand
  /**
    * Gets a command to delete the selected table cells with a horizontal shift.
    * Value: A <see cref="DeleteTableCellsWithShiftHorizontallyCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteTableCellsWithShiftHorizontally: DeleteTableCellsWithShiftHorizontallyCommand
  /**
    * Gets a command to delete the selected table cells with a vertical shift.
    * Value: A <see cref="DeleteTableCellsWithShiftVerticallyCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteTableCellsWithShiftVertically: DeleteTableCellsWithShiftVerticallyCommand
  /**
    * Gets a command to delete the selected columns in the table.
    * Value: A <see cref="DeleteTableColumnsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteTableColumns: DeleteTableColumnsCommand
  /**
    * Gets a command to delete the selected rows in the table.
    * Value: A <see cref="DeleteTableRowsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var deleteTableRows: DeleteTableRowsCommand
  /**
    * Gets a command to download the document specifying the file's extension.
    * Value: A <see cref="FileDownloadCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileDownload: FileDownloadCommand
  /**
    * Gets a command to create a new empty document.
    * Value: A <see cref="FileNewCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileNew: FileNewCommand
  /**
    * Gets a command to open a document stored in the specified file.
    * Value: A <see cref="FileOpenCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileOpen: FileOpenCommand
  /**
    * Gets a command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
    * Value: A <see cref="FileOpenDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileOpenDialog: FileOpenDialogCommand
  /**
    * Gets a command to invoke a browser-specific Print dialog allowing one to print the current document.
    * Value: A <see cref="FilePrintCommand" /> object that provides methods for executing the command and checking its state.
    */
  var filePrint: FilePrintCommand
  /**
    * Gets a command to save the document at its original location on the server.
    * Value: A <see cref="FileSaveCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileSave: FileSaveCommand
  /**
    * Gets a command to save a document in a file with the specified path.
    * Value: A <see cref="FileSaveAsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileSaveAs: FileSaveAsCommand
  /**
    * Gets a command to invoke the Save As dialog that prompts for a file name and saves the current document in a file with the specified path.
    * Value: A <see cref="FileSaveAsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var fileSaveAsDialog: FileSaveAsDialogCommand
  /**
    * Gets a command to find all matches of the specified text in the document.
    * Value: A <see cref="FindAllCommand" /> object that provides methods for executing the command and checking its state.
    */
  var findAll: FindAllCommand
  /**
    * Gets a command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
    * Value: A <see cref="ForceSyncWithServerCommand" /> object that provides methods for executing the command and checking its state.
    */
  var forceSyncWithServer: ForceSyncWithServerCommand
  /**
    * Gets a command to receive RTF formatted content from the document in the specified range.
    * Value: A <see cref="GetRtfCommand" /> object that provides methods for executing the command and checking its state.
    */
  var getRtf: GetRtfCommand
  /**
    * Gets a command to navigate to the specified bookmark.
    * Value: A <see cref="GoToBookmarkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToBookmark: GoToBookmarkCommand
  /**
    * Gets a command to open the specified data record.
    * Value: A <see cref="GoToDataRecordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToDataRecord: GoToDataRecordCommand
  /**
    * Gets a command to navigate to the first data record.
    * Value: A <see cref="GoToFirstDataRecordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToFirstDataRecord: GoToFirstDataRecordCommand
  /**
    * Gets a command to substitute a header sub-document with a footer sub-document of the same page as an active sub-document.
    * Value: A <see cref="GoToFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToFooter: GoToFooterCommand
  /**
    * Gets a command to substitute a footer sub-document with a header sub-document of the same page as an active sub-document.
    * Value: A <see cref="GoToHeaderCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToHeader: GoToHeaderCommand
  /**
    * Gets a command to navigate to the last data record of the bound data source.
    * Value: A <see cref="GoToLastDataRecordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToLastDataRecord: GoToLastDataRecordCommand
  /**
    * Gets a command to navigate to the next data record of the bound data source.
    * Value: A <see cref="GoToNextDataRecordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToNextDataRecord: GoToNextDataRecordCommand
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the next section as an active sub-document.
    * Value: A <see cref="GoToNextHeaderFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToNextHeaderFooter: GoToNextHeaderFooterCommand
  /**
    * Gets a command to navigate to the previous data record of the bound data source.
    * Value: A <see cref="GoToPreviousDataRecordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToPreviousDataRecord: GoToPreviousDataRecordCommand
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the previous section as an active sub-document.
    * Value: A <see cref="GoToPreviousHeaderFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var goToPreviousHeaderFooter: GoToPreviousHeaderFooterCommand
  /**
    * Gets a command to hide the search results.
    * Value: A <see cref="HideFindResultsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var hideFindResults: HideFindResultsCommand
  /**
    * Gets a command to increase the font size of characters in a selected range to the closest larger predefined value (in points).
    * Value: A <see cref="IncreaseFontSizeCommand" /> object that provides methods for executing the command and checking its state.
    */
  var increaseFontSize: IncreaseFontSizeCommand
  /**
    * Gets a command to increment the indent level of paragraphs in a selected range.
    * Value: A <see cref="IncreaseIndentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var increaseIndent: IncreaseIndentCommand
  /**
    * Gets a command to increment the indent level of paragraphs in a selected numbered list.
    * Value: A <see cref="IncrementNumberingIndentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var incrementNumberingIndent: IncrementNumberingIndentCommand
  /**
    * Gets a command to increment the left indent of paragraphs in a selected range.
    * Value: A <see cref="IncrementParagraphLeftIndentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var incrementParagraphLeftIndent: IncrementParagraphLeftIndentCommand
  /**
    * Gets a command to insert a new bookmark that references the current selection.
    * Value: A <see cref="InsertBookmarkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertBookmark: InsertBookmarkCommand
  /**
    * Gets a command to insert a column break at the current position in the document.
    * Value: A <see cref="InsertColumnBreakCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertColumnBreak: InsertColumnBreakCommand
  /**
    * Gets a command to insert content created on the server to the client model.
    * Value: A <see cref="InsertContentFromServerCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertContentFromServer: InsertContentFromServerCommand
  /**
    * Gets a command to add a caption (numbered label) to an equation.
    * Value: A <see cref="InsertEquationsCaptionCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertEquationsCaption: InsertEquationsCaptionCommand
  /**
    * Gets a command to add a caption (numbered label) to a figure.
    * Value: A <see cref="InsertFiguresCaptionCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertFiguresCaption: InsertFiguresCaptionCommand
  /**
    * Gets a command to insert a floating text box.
    * Value: A <see cref="InsertFloatingTextBoxCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertFloatingTextBox: InsertFloatingTextBoxCommand
  /**
    * Gets a command to create a footer sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    * Value: A <see cref="InsertFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertFooter: InsertFooterCommand
  /**
    * Gets a command to create a header sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    * Value: A <see cref="InsertHeaderCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertHeader: InsertHeaderCommand
  /**
    * Gets a command to add an HTML formatted content in place of a selected range.
    * Value: A <see cref="InsertHtmlCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertHtml: InsertHtmlCommand
  /**
    * Gets a command to insert and update a hyperlink field in place of a selected range.
    * Value: A <see cref="InsertHyperlinkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertHyperlink: InsertHyperlinkCommand
  /**
    * Gets a command to insert the line break at the current position in the document.
    * Value: A <see cref="InsertLineBreakCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertLineBreak: InsertLineBreakCommand
  /**
    * Gets a command to add a non-breaking space in place of a selected range
    * Value: A <see cref="InsertNonBreakingSpaceCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertNonBreakingSpace: InsertNonBreakingSpaceCommand
  /**
    * Gets a command to insert numeration to a paragraph making it a numbering list item.
    * Value: A <see cref="InsertNumerationCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertNumeration: InsertNumerationCommand
  /**
    * Gets a command to insert a page break at the current position in the document.
    * Value: A <see cref="InsertPageBreakCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertPageBreak: InsertPageBreakCommand
  /**
    * Gets a command to insert a paragraph break at the current position in the document.
    * Value: A <see cref="InsertParagraphCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertParagraph: InsertParagraphCommand
  /**
    * Gets a command to insert an inline picture stored by the specified web address.
    * Value: A <see cref="InsertPictureCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertPicture: InsertPictureCommand
  /**
    * Gets a command to add RTF formatted content at the specified position.
    * Value: A <see cref="InsertRtfCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertRtf: InsertRtfCommand
  /**
    * Gets a command to insert a section break and starts a new section on the next even-numbered page.
    * Value: A <see cref="InsertSectionBreakEvenPageCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertSectionBreakEvenPage: InsertSectionBreakEvenPageCommand
  /**
    * Gets a command to insert a section break and starts a new section on the next page.
    * Value: A <see cref="InsertSectionBreakNextPageCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertSectionBreakNextPage: InsertSectionBreakNextPageCommand
  /**
    * Gets a command to insert a section break and starts a new section on the next odd-numbered page.
    * Value: A <see cref="InsertSectionBreakOddPageCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertSectionBreakOddPage: InsertSectionBreakOddPageCommand
  /**
    * Gets a command to insert characters into a document instead of a selected range.
    * Value: A <see cref="InsertSymbolCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertSymbol: InsertSymbolCommand
  /**
    * Gets a command to insert a tab character at the current position in the document.
    * Value: A <see cref="InsertTabCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTab: InsertTabCommand
  /**
    * Gets a command to insert a rectangular table of the specified size.
    * Value: A <see cref="InsertTableCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTable: InsertTableCommand
  /**
    * Gets a command to insert table cells with a horizontal shift into the selected table.
    * Value: A <see cref="InsertTableCellWithShiftToTheLeftCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableCellWithShiftToTheLeft: InsertTableCellWithShiftToTheLeftCommand
  /**
    * Gets a command to invoke the Insert Cells dialog window.
    * Value: A <see cref="InsertTableCellsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableCellsDialog: InsertTableCellsDialogCommand
  /**
    * Gets a command to insert table cells with a vertical shift into the selected table.
    * Value: A <see cref="InsertTableCellsWithShiftToTheVerticallyCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableCellsWithShiftToTheVertically: InsertTableCellsWithShiftToTheVerticallyCommand
  /**
    * Gets a command to insert a table column to the left of the current position in the table.
    * Value: A <see cref="InsertTableColumnToTheLeftCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableColumnToTheLeft: InsertTableColumnToTheLeftCommand
  /**
    * Gets a command to insert a table column to the right of the current position in the table.
    * Value: A <see cref="InsertTableColumnToTheRightCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableColumnToTheRight: InsertTableColumnToTheRightCommand
  /**
    * Gets a command to insert a table of contents.
    * Value: A <see cref="InsertTableOfContentsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableOfContents: InsertTableOfContentsCommand
  /**
    * Gets a command to create a table of equations on the base of equation captions.
    * Value: A <see cref="InsertTableOfEquationsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableOfEquations: InsertTableOfEquationsCommand
  /**
    * Gets a command to create a table of figures on the base of figures captions.
    * Value: A <see cref="InsertTableOfFiguresCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableOfFigures: InsertTableOfFiguresCommand
  /**
    * Gets a command to create a table of tables on the base of tables captions.
    * Value: A <see cref="InsertTableOfTablesCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableOfTables: InsertTableOfTablesCommand
  /**
    * Gets a command to insert a row in the table above the selected row.
    * Value: A <see cref="InsertTableRowAboveCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableRowAbove: InsertTableRowAboveCommand
  /**
    * Gets a command to insert a row in the table below the selected row.
    * Value: A <see cref="InsertTableRowBelowCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTableRowBelow: InsertTableRowBelowCommand
  /**
    * Gets a command to add a caption (numbered label) to a table.
    * Value: A <see cref="InsertTablesCaptionCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertTablesCaption: InsertTablesCaptionCommand
  /**
    * Gets a command to insert text in place of a selected range.
    * Value: A <see cref="InsertTextCommand" /> object that provides methods for executing the command and checking its state.
    */
  var insertText: InsertTextCommand
  /**
    * Gets a command to link a header/footer to the previous section, so it has the same content.
    * Value: A <see cref="LinkHeaderFooterToPreviousCommand" /> object that provides methods for executing the command and checking its state.
    */
  var linkHeaderFooterToPrevious: LinkHeaderFooterToPreviousCommand
  /**
    * Gets a command to perform a mail merge and download the merged document.
    * Value: A <see cref="MailMergeAndDownloadCommand" /> object that provides methods for executing the command and checking its state.
    */
  var mailMergeAndDownload: MailMergeAndDownloadCommand
  /**
    * Gets a command to perform a mail merge and save the merged document to the server.
    * Value: A <see cref="MailMergeAndSaveAsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var mailMergeAndSaveAs: MailMergeAndSaveAsCommand
  /**
    * Gets a command to invoke the Export Range dialog window to start a mail merge.
    * Value: A <see cref="MailMergeDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var mailMergeDialog: MailMergeDialogCommand
  /**
    * Gets a command to convert selected text to lower case.
    * Value: A <see cref="MakeTextLowerCaseCommand" /> object that provides methods for executing the command and checking its state.
    */
  var makeTextLowerCase: MakeTextLowerCaseCommand
  /**
    * Gets a command changing all selected text to the sentence case capitalization.
    * Value: A <see cref="MakeTextSentenceCaseCommand" /> object that provides methods for executing the command and checking its state.
    */
  var makeTextSentenceCase: MakeTextSentenceCaseCommand
  /**
    * Gets a command to convert selected text to upper case.
    * Value: A <see cref="MakeTextUpperCaseCommand" /> object that provides methods for executing the command and checking its state.
    */
  var makeTextUpperCase: MakeTextUpperCaseCommand
  /**
    * Gets a command to invoke the Insert Merge Field dialog window.
    * Value: A <see cref="MergeFieldDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var mergeFieldDialog: MergeFieldDialogCommand
  /**
    * Gets a command to merge the selected cells.
    * Value: A <see cref="MergeTableCellsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var mergeTableCells: MergeTableCellsCommand
  /**
    * Gets a command to move the selected range.
    * Value: A <see cref="MoveContentCommand" /> object that provides methods for executing the command and checking its state.
    */
  var moveContent: MoveContentCommand
  /**
    * Gets a command to invoke the Customize Numbered List dialog window.
    * Value: A <see cref="OpenCustomNumberingListDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openCustomNumberingListDialog: OpenCustomNumberingListDialogCommand
  /**
    * Gets a command to invoke the Find and Replace dialog window.
    * Value: A <see cref="OpenFindAndReplaceDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openFindAndReplaceDialog: OpenFindAndReplaceDialogCommand
  /**
    * Gets a command to invoke the Search Panel allowing end-users to search text and navigate through search results.
    * Value: A <see cref="OpenFindPanelCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openFindPanel: OpenFindPanelCommand
  /**
    * Gets a command to invoke the Font dialog window.
    * Value: A <see cref="OpenFontFormattingDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openFontFormattingDialog: OpenFontFormattingDialogCommand
  /**
    * Gets a command to go to a bookmark or URI contained within the selected hyperlink.
    * Value: A <see cref="OpenHyperlinkCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openHyperlink: OpenHyperlinkCommand
  /**
    * Gets a command to invoke the Bookmark dialog window.
    * Value: A <see cref="OpenInsertBookmarkDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openInsertBookmarkDialog: OpenInsertBookmarkDialogCommand
  /**
    * Gets a command to invoke the Hyperlink dialog window.
    * Value: A <see cref="OpenInsertHyperlinkDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openInsertHyperlinkDialog: OpenInsertHyperlinkDialogCommand
  /**
    * Gets a command to invoke the Insert Image dialog window.
    * Value: A <see cref="OpenInsertPictureDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openInsertPictureDialog: OpenInsertPictureDialogCommand
  /**
    * Gets a command to invoke the Symbols dialog window.
    * Value: A <see cref="OpenInsertSymbolDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openInsertSymbolDialog: OpenInsertSymbolDialogCommand
  /**
    * Gets a command to invoke the Insert Table dialog window.
    * Value: A <see cref="OpenInsertTableDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openInsertTableDialog: OpenInsertTableDialogCommand
  /**
    * Gets a command to invoke the Layout dialog window to customize the settings of a floating object.
    * Value: A <see cref="OpenLayoutOptionsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openLayoutOptionsDialog: OpenLayoutOptionsDialogCommand
  /**
    * Gets a command to invoke the Bulleted and Numbering dialog window.
    * Value: A <see cref="OpenNumberingListDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openNumberingListDialog: OpenNumberingListDialogCommand
  /**
    * Gets a command to invoke the Margins tab of the Page Setup dialog window.
    * Value: A <see cref="OpenPageMarginsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openPageMarginsDialog: OpenPageMarginsDialogCommand
  /**
    * Gets a command to invoke the Paper tab of the Page Setup dialog window.
    * Value: A <see cref="OpenPagePaperSizeDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openPagePaperSizeDialog: OpenPagePaperSizeDialogCommand
  /**
    * Gets a command to invoke the Indents And Spacing tab of the Paragraph dialog window.
    * Value: A <see cref="OpenParagraphFormattingDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openParagraphFormattingDialog: OpenParagraphFormattingDialogCommand
  /**
    * Gets a command to invoke the Columns dialog window.
    * Value: A <see cref="OpenSectionColumnsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openSectionColumnsDialog: OpenSectionColumnsDialogCommand
  /**
    * Gets a command to invoke the Spelling dialog window.
    * Value: A <see cref="OpenSpellingDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openSpellingDialog: OpenSpellingDialogCommand
  /**
    * Gets a command to invoke the Borders tab of the Borders and Shading dialog window.
    * Value: A <see cref="OpenTableBordersAndShadingDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openTableBordersAndShadingDialog: OpenTableBordersAndShadingDialogCommand
  /**
    * Gets a command to invoke the Table tab of the Table Properties dialog window.
    * Value: A <see cref="OpenTableFormattingDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openTableFormattingDialog: OpenTableFormattingDialogCommand
  /**
    * Gets a command to invoke the Tabs dialog window.
    * Value: A <see cref="OpenTabsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var openTabsDialog: OpenTabsDialogCommand
  /**
    * Gets a command to paste the text from the clipboard over the selection.
    * Value: A <see cref="PasteCommand" /> object that provides methods for executing the command and checking its state.
    */
  var paste: PasteCommand
  /**
    * Gets a command to reverse actions of the previous undo command.
    * Value: A <see cref="RedoCommand" /> object that provides methods for executing the command and checking its state.
    */
  var redo: RedoCommand
  /**
    * Gets a command to remove the next word.
    * Value: A <see cref="RemoveNextWordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var removeNextWord: RemoveNextWordCommand
  /**
    * Gets a command to exclude the selected paragraphs from the numbered list.
    * Value: A <see cref="RemoveNumerationCommand" /> object that provides methods for executing the command and checking its state.
    */
  var removeNumeration: RemoveNumerationCommand
  /**
    * Gets a command to remove the previous word.
    * Value: A <see cref="RemovePrevWordCommand" /> object that provides methods for executing the command and checking its state.
    */
  var removePrevWord: RemovePrevWordCommand
  /**
    * Gets a command to remove spacing after the selected paragraph.
    * Value: A <see cref="RemoveSpacingAfterParagraphCommand" /> object that provides methods for executing the command and checking its state.
    */
  var removeSpacingAfterParagraph: RemoveSpacingAfterParagraphCommand
  /**
    * Gets a command to remove spacing before the selected paragraph.
    * Value: A <see cref="RemoveSpacingBeforeParagraphCommand" /> object that provides methods for executing the command and checking its state.
    */
  var removeSpacingBeforeParagraph: RemoveSpacingBeforeParagraphCommand
  /**
    * Gets a command to remove the borders of the selected table cells.
    * Value: A <see cref="RemoveTableCellBordersCommand" /> object that provides methods for executing the command and checking its state.
    */
  var removeTableCellBorders: RemoveTableCellBordersCommand
  /**
    * Gets a command to replace all matches of the specified text with new characters.
    * Value: A <see cref="ReplaceAllCommand" /> object that provides methods for executing the command and checking its state.
    */
  var replaceAll: ReplaceAllCommand
  /**
    * Gets a command to find and replace a next match of the specified text after the cursor position with new characters.
    * Value: A <see cref="ReplaceNextCommand" /> object that provides methods for executing the command and checking its state.
    */
  var replaceNext: ReplaceNextCommand
  /**
    * Gets a command to restart the numbering list.
    * Value: A <see cref="RestartNumberingListCommand" /> object that provides methods for executing the command and checking its state.
    */
  var restartNumberingList: RestartNumberingListCommand
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for the first page of the current section.
    * Value: A <see cref="SetDifferentFirstPageHeaderFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setDifferentFirstPageHeaderFooter: SetDifferentFirstPageHeaderFooterCommand
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for odd and even pages of the current section.
    * Value: A <see cref="SetDifferentOddAndEvenPagesHeaderFooterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setDifferentOddAndEvenPagesHeaderFooter: SetDifferentOddAndEvenPagesHeaderFooterCommand
  /**
    * Gets a command to format a selected paragraph with double line spacing.
    * Value: A <see cref="SetDoubleParagraphSpacingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setDoubleParagraphSpacing: SetDoubleParagraphSpacingCommand
  /**
    * Gets a command to toggle the fullscreen mode.
    * Value: A <see cref="SetFullscreenCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setFullscreen: SetFullscreenCommand
  /**
    * Gets a command to invoke the Page Setup dialog.
    * Value: A <see cref="SetPageSizeDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setPageSizeDialog: SetPageSizeDialogCommand
  /**
    * Gets a command to apply a paragraph level to the selected text
    * Value: A <see cref="SetParagraphLevelCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setParagraphLevel: SetParagraphLevelCommand
  /**
    * Gets a command to format a current paragraph with one and a half line spacing.
    * Value: A <see cref="SetSesquialteralParagraphSpacingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setSesquialteralParagraphSpacing: SetSesquialteralParagraphSpacingCommand
  /**
    * Gets a command to format a current paragraph with single line spacing.
    * Value: A <see cref="SetSingleParagraphSpacingCommand" /> object that provides methods for executing the command and checking its state.
    */
  var setSingleParagraphSpacing: SetSingleParagraphSpacingCommand
  /**
    * Gets a command to display all field codes in place of the fields in the document.
    * Value: A <see cref="ShowAllFieldCodesCommand" /> object that provides methods for executing the command and checking its state.
    */
  var showAllFieldCodes: ShowAllFieldCodesCommand
  /**
    * Gets a command to display the selected field's codes.
    * Value: A <see cref="ShowFieldCodesCommand" /> object that provides methods for executing the command and checking its state.
    */
  var showFieldCodes: ShowFieldCodesCommand
  /**
    * Gets a command to toggle hidden symbol visibility.
    * Value: A <see cref="ShowHiddenSymbolsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var showHiddenSymbols: ShowHiddenSymbolsCommand
  /**
    * Gets a command to toggle the horizontal ruler's visibility.
    * Value: A <see cref="ShowHorizontalRulerCommand" /> object that provides methods for executing the command and checking its state.
    */
  var showHorizontalRuler: ShowHorizontalRulerCommand
  /**
    * Gets a command to display or hide actual data in MERGEFIELD fields.
    * Value: A <see cref="ShowMergedDataCommand" /> object that provides methods for executing the command and checking its state.
    */
  var showMergedData: ShowMergedDataCommand
  /**
    * Gets a command to toggle the display of grid lines for a table with no borders applied - on/off.
    * Value: A <see cref="ShowTableGridLinesCommand" /> object that provides methods for executing the command and checking its state.
    */
  var showTableGridLines: ShowTableGridLinesCommand
  /**
    * Gets a command to split the selected table cells.
    * Value: A <see cref="SplitTableCellsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var splitTableCells: SplitTableCellsCommand
  /**
    * Gets a command to invoke the Split Cells dialog window.
    * Value: A <see cref="SplitTableCellsDialogCommand" /> object that provides methods for executing the command and checking its state.
    */
  var splitTableCellsDialog: SplitTableCellsDialogCommand
  /**
    * Gets a command to switch the text capitalization in the selection.
    * Value: A <see cref="SwitchTextCaseCommand" /> object that provides methods for executing the command and checking its state.
    */
  var switchTextCase: SwitchTextCaseCommand
  /**
    * Gets a command to toggle between the bulleted paragraph and normal text.
    * Value: A <see cref="ToggleBulletedListCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleBulletedList: ToggleBulletedListCommand
  /**
    * Gets a command to toggle between the multilevel list style and normal text.
    * Value: A <see cref="ToggleMultilevelListCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleMultilevelList: ToggleMultilevelListCommand
  /**
    * Gets a command to toggle between the numbered paragraph and normal text.
    * Value: A <see cref="ToggleNumberingListCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleNumberingList: ToggleNumberingListCommand
  /**
    * Gets a command to toggle centered paragraph alignment on and off.
    * Value: A <see cref="ToggleParagraphAlignmentCenterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleParagraphAlignmentCenter: ToggleParagraphAlignmentCenterCommand
  /**
    * Gets a command to toggle justified paragraph alignment on and off.
    * Value: A <see cref="ToggleParagraphAlignmentJustifyCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleParagraphAlignmentJustify: ToggleParagraphAlignmentJustifyCommand
  /**
    * Gets a command to toggle left paragraph alignment on and off.
    * Value: A <see cref="ToggleParagraphAlignmentLeftCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleParagraphAlignmentLeft: ToggleParagraphAlignmentLeftCommand
  /**
    * Gets a command to toggle right paragraph alignment on and off.
    * Value: A <see cref="ToggleParagraphAlignmentRightCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleParagraphAlignmentRight: ToggleParagraphAlignmentRightCommand
  /**
    * Gets a command that fits the specified table to its contents.
    * Value: A <see cref="ToggleTableAutoFitContentsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableAutoFitContents: ToggleTableAutoFitContentsCommand
  /**
    * Gets a command that fits the specified table to a document's window.
    * Value: A <see cref="ToggleTableAutoFitWindowCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableAutoFitWindow: ToggleTableAutoFitWindowCommand
  /**
    * Gets a command to apply bottom-center alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignBottomCenterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignBottomCenter: ToggleTableCellAlignBottomCenterCommand
  /**
    * Gets a command to apply bottom-left alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignBottomLeftCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignBottomLeft: ToggleTableCellAlignBottomLeftCommand
  /**
    * Gets a command to apply bottom-right alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignBottomRightCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignBottomRight: ToggleTableCellAlignBottomRightCommand
  /**
    * Gets a command to apply middle-center alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignMiddleCenterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignMiddleCenter: ToggleTableCellAlignMiddleCenterCommand
  /**
    * Gets a command to apply middle-left alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignMiddleLeftCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignMiddleLeft: ToggleTableCellAlignMiddleLeftCommand
  /**
    * Gets a command to apply middle-right alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignMiddleRightCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignMiddleRight: ToggleTableCellAlignMiddleRightCommand
  /**
    * Gets a command to apply top-center alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignTopCenterCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignTopCenter: ToggleTableCellAlignTopCenterCommand
  /**
    * Gets a command to apply top-left alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignTopLeftCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignTopLeft: ToggleTableCellAlignTopLeftCommand
  /**
    * Gets a command to apply top-right alignment for the selected cells.
    * Value: A <see cref="ToggleTableCellAlignTopRightCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAlignTopRight: ToggleTableCellAlignTopRightCommand
  /**
    * Gets a command to apply (or cancel) border settings to all borders of the selected cells.
    * Value: A <see cref="ToggleTableCellAllBordersCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellAllBorders: ToggleTableCellAllBordersCommand
  /**
    * Gets a command to apply (or cancel) border settings of the bottom border for the selected cells.
    * Value: A <see cref="ToggleTableCellBottomBorderCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellBottomBorder: ToggleTableCellBottomBorderCommand
  /**
    * Gets a command to apply (or cancel) border settings of the inside borders for the selected cells.
    * Value: A <see cref="ToggleTableCellInsideBordersCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellInsideBorders: ToggleTableCellInsideBordersCommand
  /**
    * Gets a command to apply (or cancel) border settings of the inside horizontal borders for the selected cells.
    * Value: A <see cref="ToggleTableCellInsideHorizontalBordersCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellInsideHorizontalBorders: ToggleTableCellInsideHorizontalBordersCommand
  /**
    * Gets a command to apply (or cancel) border settings of the inside vertical borders for the selected cells.
    * Value: A <see cref="ToggleTableCellInsideVerticalBordersCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellInsideVerticalBorders: ToggleTableCellInsideVerticalBordersCommand
  /**
    * Gets a command to apply (or cancel) border settings of the left border for the selected cells.
    * Value: A <see cref="ToggleTableCellLeftBorderCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellLeftBorder: ToggleTableCellLeftBorderCommand
  /**
    * Gets a command to apply (or cancel) border settings of the outside borders for the selected cells.
    * Value: A <see cref="ToggleTableCellOutsideBordersCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellOutsideBorders: ToggleTableCellOutsideBordersCommand
  /**
    * Gets a command to apply (or cancel) border settings of the right border for the selected cells.
    * Value: A <see cref="ToggleTableCellRightBorderCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellRightBorder: ToggleTableCellRightBorderCommand
  /**
    * Gets a command to apply (or cancel) border settings of the top border for the selected cells.
    * Value: A <see cref="ToggleTableCellTopBorderCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableCellTopBorder: ToggleTableCellTopBorderCommand
  /**
    * Gets a command that disables automatic adjusting of the selected table.
    * Value: A <see cref="ToggleTableFixedColumnWidthCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTableFixedColumnWidth: ToggleTableFixedColumnWidthCommand
  /**
    * Gets a command to toggle case for each character - upper case becomes lower, lower case becomes upper.
    * Value: A <see cref="ToggleTextCaseCommand" /> object that provides methods for executing the command and checking its state.
    */
  var toggleTextCase: ToggleTextCaseCommand
  /**
    * Gets a command to cancel changes caused by the previous command.
    * Value: A <see cref="UndoCommand" /> object that provides methods for executing the command and checking its state.
    */
  var undo: UndoCommand
  /**
    * Gets a command to update all fields in the document.
    * Value: A <see cref="UpdateAllFieldsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var updateAllFields: UpdateAllFieldsCommand
  /**
    * Gets a command to update each field's result in the selection.
    * Value: A <see cref="UpdateFieldCommand" /> object that provides methods for executing the command and checking its state.
    */
  var updateField: UpdateFieldCommand
  /**
    * Gets a command to update a table of contents.
    * Value: A <see cref="UpdateTableOfContentsCommand" /> object that provides methods for executing the command and checking its state.
    */
  var updateTableOfContents: UpdateTableOfContentsCommand
  /**
    * Gets a command to prevent the control UI from being updated until the endUpdate method is called.
    */
  def beginUpdate(): Unit
  /**
    * Re-enables render operations after a call to the beginUpdate method and forces immediate re-rendering.
    */
  def endUpdate(): Unit
}

object RichEditCommands {
  @scala.inline
  def apply(
    addSpacingAfterParagraph: AddSpacingAfterParagraphCommand,
    addSpacingBeforeParagraph: AddSpacingBeforeParagraphCommand,
    assignShortcut: AssignShortcutCommand,
    backspace: BackspaceCommand,
    beginUpdate: () => Unit,
    capitalizeEachWordTextCase: CapitalizeEachWordTextCaseCommand,
    changeCustomNumberingList: ChangeCustomNumberingListCommand,
    changeFloatingObjectAbsolutePosition: ChangeFloatingObjectAbsolutePositionCommand,
    changeFloatingObjectAbsoluteSize: ChangeFloatingObjectAbsoluteSizeCommand,
    changeFloatingObjectAlignmentPosition: ChangeFloatingObjectAlignmentPositionCommand,
    changeFloatingObjectFillColor: ChangeFloatingObjectFillColorCommand,
    changeFloatingObjectLockAnchor: ChangeFloatingObjectLockAnchorCommand,
    changeFloatingObjectLockAspectRatio: ChangeFloatingObjectLockAspectRatioCommand,
    changeFloatingObjectOutlineColor: ChangeFloatingObjectOutlineColorCommand,
    changeFloatingObjectOutlineWidth: ChangeFloatingObjectOutlineWidthCommand,
    changeFloatingObjectRelativePosition: ChangeFloatingObjectRelativePositionCommand,
    changeFloatingObjectRotation: ChangeFloatingObjectRotationCommand,
    changeFloatingObjectTextWrapping: ChangeFloatingObjectTextWrappingCommand,
    changeFontBackColor: ChangeFontBackColorCommand,
    changeFontBold: ChangeFontBoldCommand,
    changeFontForeColor: ChangeFontForeColorCommand,
    changeFontFormatting: ChangeFontFormattingCommand,
    changeFontItalic: ChangeFontItalicCommand,
    changeFontName: ChangeFontNameCommand,
    changeFontSize: ChangeFontSizeCommand,
    changeFontStrikeout: ChangeFontStrikeoutCommand,
    changeFontSubscript: ChangeFontSubscriptCommand,
    changeFontSuperscript: ChangeFontSuperscriptCommand,
    changeFontUnderline: ChangeFontUnderlineCommand,
    changeHyperlink: ChangeHyperlinkCommand,
    changePageColor: ChangePageColorCommand,
    changePageMargins: ChangePageMarginsCommand,
    changePageOrientation: ChangePageOrientationCommand,
    changePageSize: ChangePageSizeCommand,
    changeParagraphBackColor: ChangeParagraphBackColorCommand,
    changeParagraphFormatting: ChangeParagraphFormattingCommand,
    changePictureScale: ChangePictureScaleCommand,
    changeSectionColumns: ChangeSectionColumnsCommand,
    changeSectionEqualColumnCount: ChangeSectionEqualColumnCountCommand,
    changeStyle: ChangeStyleCommand,
    changeTableBorderRepositoryItem: ChangeTableBorderRepositoryItemCommand,
    changeTableBordersAndShading: ChangeTableBordersAndShadingCommand,
    changeTableCellFormatting: ChangeTableCellFormattingCommand,
    changeTableCellPreferredWidth: ChangeTableCellPreferredWidthCommand,
    changeTableCellShading: ChangeTableCellShadingCommand,
    changeTableColumnPreferredWidth: ChangeTableColumnPreferredWidthCommand,
    changeTableFormatting: ChangeTableFormattingCommand,
    changeTableLook: ChangeTableLookCommand,
    changeTableRowPreferredHeight: ChangeTableRowPreferredHeightCommand,
    changeTableStyle: ChangeTableStyleCommand,
    changeTabs: ChangeTabsCommand,
    changeTextBoxContentMargins: ChangeTextBoxContentMarginsCommand,
    changeTextBoxRelativeSize: ChangeTextBoxRelativeSizeCommand,
    changeTextBoxResizeShapeToFitText: ChangeTextBoxResizeShapeToFitTextCommand,
    changeViewType: ChangeViewTypeCommand,
    clearFormatting: ClearFormattingCommand,
    closeHeaderFooter: CloseHeaderFooterCommand,
    continueNumberingList: ContinueNumberingListCommand,
    copy: CopyCommand,
    copyContent: CopyContentCommand,
    createDateField: CreateDateFieldCommand,
    createField: CreateFieldCommand,
    createMergeField: CreateMergeFieldCommand,
    createPageCountField: CreatePageCountFieldCommand,
    createPageField: CreatePageFieldCommand,
    createTimeField: CreateTimeFieldCommand,
    cut: CutCommand,
    decreaseFontSize: DecreaseFontSizeCommand,
    decreaseIndent: DecreaseIndentCommand,
    decrementNumberingIndent: DecrementNumberingIndentCommand,
    decrementParagraphLeftIndent: DecrementParagraphLeftIndentCommand,
    delete: DeleteCommand,
    deleteBookmark: DeleteBookmarkCommand,
    deleteHyperlink: DeleteHyperlinkCommand,
    deleteHyperlinks: DeleteHyperlinksCommand,
    deleteTable: DeleteTableCommand,
    deleteTableCellsDialog: DeleteTableCellsDialogCommand,
    deleteTableCellsWithShiftHorizontally: DeleteTableCellsWithShiftHorizontallyCommand,
    deleteTableCellsWithShiftVertically: DeleteTableCellsWithShiftVerticallyCommand,
    deleteTableColumns: DeleteTableColumnsCommand,
    deleteTableRows: DeleteTableRowsCommand,
    endUpdate: () => Unit,
    fileDownload: FileDownloadCommand,
    fileNew: FileNewCommand,
    fileOpen: FileOpenCommand,
    fileOpenDialog: FileOpenDialogCommand,
    filePrint: FilePrintCommand,
    fileSave: FileSaveCommand,
    fileSaveAs: FileSaveAsCommand,
    fileSaveAsDialog: FileSaveAsDialogCommand,
    findAll: FindAllCommand,
    forceSyncWithServer: ForceSyncWithServerCommand,
    getRtf: GetRtfCommand,
    goToBookmark: GoToBookmarkCommand,
    goToDataRecord: GoToDataRecordCommand,
    goToFirstDataRecord: GoToFirstDataRecordCommand,
    goToFooter: GoToFooterCommand,
    goToHeader: GoToHeaderCommand,
    goToLastDataRecord: GoToLastDataRecordCommand,
    goToNextDataRecord: GoToNextDataRecordCommand,
    goToNextHeaderFooter: GoToNextHeaderFooterCommand,
    goToPreviousDataRecord: GoToPreviousDataRecordCommand,
    goToPreviousHeaderFooter: GoToPreviousHeaderFooterCommand,
    hideFindResults: HideFindResultsCommand,
    increaseFontSize: IncreaseFontSizeCommand,
    increaseIndent: IncreaseIndentCommand,
    incrementNumberingIndent: IncrementNumberingIndentCommand,
    incrementParagraphLeftIndent: IncrementParagraphLeftIndentCommand,
    insertBookmark: InsertBookmarkCommand,
    insertColumnBreak: InsertColumnBreakCommand,
    insertContentFromServer: InsertContentFromServerCommand,
    insertEquationsCaption: InsertEquationsCaptionCommand,
    insertFiguresCaption: InsertFiguresCaptionCommand,
    insertFloatingTextBox: InsertFloatingTextBoxCommand,
    insertFooter: InsertFooterCommand,
    insertHeader: InsertHeaderCommand,
    insertHtml: InsertHtmlCommand,
    insertHyperlink: InsertHyperlinkCommand,
    insertLineBreak: InsertLineBreakCommand,
    insertNonBreakingSpace: InsertNonBreakingSpaceCommand,
    insertNumeration: InsertNumerationCommand,
    insertPageBreak: InsertPageBreakCommand,
    insertParagraph: InsertParagraphCommand,
    insertPicture: InsertPictureCommand,
    insertRtf: InsertRtfCommand,
    insertSectionBreakEvenPage: InsertSectionBreakEvenPageCommand,
    insertSectionBreakNextPage: InsertSectionBreakNextPageCommand,
    insertSectionBreakOddPage: InsertSectionBreakOddPageCommand,
    insertSymbol: InsertSymbolCommand,
    insertTab: InsertTabCommand,
    insertTable: InsertTableCommand,
    insertTableCellWithShiftToTheLeft: InsertTableCellWithShiftToTheLeftCommand,
    insertTableCellsDialog: InsertTableCellsDialogCommand,
    insertTableCellsWithShiftToTheVertically: InsertTableCellsWithShiftToTheVerticallyCommand,
    insertTableColumnToTheLeft: InsertTableColumnToTheLeftCommand,
    insertTableColumnToTheRight: InsertTableColumnToTheRightCommand,
    insertTableOfContents: InsertTableOfContentsCommand,
    insertTableOfEquations: InsertTableOfEquationsCommand,
    insertTableOfFigures: InsertTableOfFiguresCommand,
    insertTableOfTables: InsertTableOfTablesCommand,
    insertTableRowAbove: InsertTableRowAboveCommand,
    insertTableRowBelow: InsertTableRowBelowCommand,
    insertTablesCaption: InsertTablesCaptionCommand,
    insertText: InsertTextCommand,
    linkHeaderFooterToPrevious: LinkHeaderFooterToPreviousCommand,
    mailMergeAndDownload: MailMergeAndDownloadCommand,
    mailMergeAndSaveAs: MailMergeAndSaveAsCommand,
    mailMergeDialog: MailMergeDialogCommand,
    makeTextLowerCase: MakeTextLowerCaseCommand,
    makeTextSentenceCase: MakeTextSentenceCaseCommand,
    makeTextUpperCase: MakeTextUpperCaseCommand,
    mergeFieldDialog: MergeFieldDialogCommand,
    mergeTableCells: MergeTableCellsCommand,
    moveContent: MoveContentCommand,
    openCustomNumberingListDialog: OpenCustomNumberingListDialogCommand,
    openFindAndReplaceDialog: OpenFindAndReplaceDialogCommand,
    openFindPanel: OpenFindPanelCommand,
    openFontFormattingDialog: OpenFontFormattingDialogCommand,
    openHyperlink: OpenHyperlinkCommand,
    openInsertBookmarkDialog: OpenInsertBookmarkDialogCommand,
    openInsertHyperlinkDialog: OpenInsertHyperlinkDialogCommand,
    openInsertPictureDialog: OpenInsertPictureDialogCommand,
    openInsertSymbolDialog: OpenInsertSymbolDialogCommand,
    openInsertTableDialog: OpenInsertTableDialogCommand,
    openLayoutOptionsDialog: OpenLayoutOptionsDialogCommand,
    openNumberingListDialog: OpenNumberingListDialogCommand,
    openPageMarginsDialog: OpenPageMarginsDialogCommand,
    openPagePaperSizeDialog: OpenPagePaperSizeDialogCommand,
    openParagraphFormattingDialog: OpenParagraphFormattingDialogCommand,
    openSectionColumnsDialog: OpenSectionColumnsDialogCommand,
    openSpellingDialog: OpenSpellingDialogCommand,
    openTableBordersAndShadingDialog: OpenTableBordersAndShadingDialogCommand,
    openTableFormattingDialog: OpenTableFormattingDialogCommand,
    openTabsDialog: OpenTabsDialogCommand,
    paste: PasteCommand,
    redo: RedoCommand,
    removeNextWord: RemoveNextWordCommand,
    removeNumeration: RemoveNumerationCommand,
    removePrevWord: RemovePrevWordCommand,
    removeSpacingAfterParagraph: RemoveSpacingAfterParagraphCommand,
    removeSpacingBeforeParagraph: RemoveSpacingBeforeParagraphCommand,
    removeTableCellBorders: RemoveTableCellBordersCommand,
    replaceAll: ReplaceAllCommand,
    replaceNext: ReplaceNextCommand,
    restartNumberingList: RestartNumberingListCommand,
    setDifferentFirstPageHeaderFooter: SetDifferentFirstPageHeaderFooterCommand,
    setDifferentOddAndEvenPagesHeaderFooter: SetDifferentOddAndEvenPagesHeaderFooterCommand,
    setDoubleParagraphSpacing: SetDoubleParagraphSpacingCommand,
    setFullscreen: SetFullscreenCommand,
    setPageSizeDialog: SetPageSizeDialogCommand,
    setParagraphLevel: SetParagraphLevelCommand,
    setSesquialteralParagraphSpacing: SetSesquialteralParagraphSpacingCommand,
    setSingleParagraphSpacing: SetSingleParagraphSpacingCommand,
    showAllFieldCodes: ShowAllFieldCodesCommand,
    showFieldCodes: ShowFieldCodesCommand,
    showHiddenSymbols: ShowHiddenSymbolsCommand,
    showHorizontalRuler: ShowHorizontalRulerCommand,
    showMergedData: ShowMergedDataCommand,
    showTableGridLines: ShowTableGridLinesCommand,
    splitTableCells: SplitTableCellsCommand,
    splitTableCellsDialog: SplitTableCellsDialogCommand,
    switchTextCase: SwitchTextCaseCommand,
    toggleBulletedList: ToggleBulletedListCommand,
    toggleMultilevelList: ToggleMultilevelListCommand,
    toggleNumberingList: ToggleNumberingListCommand,
    toggleParagraphAlignmentCenter: ToggleParagraphAlignmentCenterCommand,
    toggleParagraphAlignmentJustify: ToggleParagraphAlignmentJustifyCommand,
    toggleParagraphAlignmentLeft: ToggleParagraphAlignmentLeftCommand,
    toggleParagraphAlignmentRight: ToggleParagraphAlignmentRightCommand,
    toggleTableAutoFitContents: ToggleTableAutoFitContentsCommand,
    toggleTableAutoFitWindow: ToggleTableAutoFitWindowCommand,
    toggleTableCellAlignBottomCenter: ToggleTableCellAlignBottomCenterCommand,
    toggleTableCellAlignBottomLeft: ToggleTableCellAlignBottomLeftCommand,
    toggleTableCellAlignBottomRight: ToggleTableCellAlignBottomRightCommand,
    toggleTableCellAlignMiddleCenter: ToggleTableCellAlignMiddleCenterCommand,
    toggleTableCellAlignMiddleLeft: ToggleTableCellAlignMiddleLeftCommand,
    toggleTableCellAlignMiddleRight: ToggleTableCellAlignMiddleRightCommand,
    toggleTableCellAlignTopCenter: ToggleTableCellAlignTopCenterCommand,
    toggleTableCellAlignTopLeft: ToggleTableCellAlignTopLeftCommand,
    toggleTableCellAlignTopRight: ToggleTableCellAlignTopRightCommand,
    toggleTableCellAllBorders: ToggleTableCellAllBordersCommand,
    toggleTableCellBottomBorder: ToggleTableCellBottomBorderCommand,
    toggleTableCellInsideBorders: ToggleTableCellInsideBordersCommand,
    toggleTableCellInsideHorizontalBorders: ToggleTableCellInsideHorizontalBordersCommand,
    toggleTableCellInsideVerticalBorders: ToggleTableCellInsideVerticalBordersCommand,
    toggleTableCellLeftBorder: ToggleTableCellLeftBorderCommand,
    toggleTableCellOutsideBorders: ToggleTableCellOutsideBordersCommand,
    toggleTableCellRightBorder: ToggleTableCellRightBorderCommand,
    toggleTableCellTopBorder: ToggleTableCellTopBorderCommand,
    toggleTableFixedColumnWidth: ToggleTableFixedColumnWidthCommand,
    toggleTextCase: ToggleTextCaseCommand,
    undo: UndoCommand,
    updateAllFields: UpdateAllFieldsCommand,
    updateField: UpdateFieldCommand,
    updateTableOfContents: UpdateTableOfContentsCommand
  ): RichEditCommands = {
    val __obj = js.Dynamic.literal(addSpacingAfterParagraph = addSpacingAfterParagraph, addSpacingBeforeParagraph = addSpacingBeforeParagraph, assignShortcut = assignShortcut, backspace = backspace, beginUpdate = js.Any.fromFunction0(beginUpdate), capitalizeEachWordTextCase = capitalizeEachWordTextCase, changeCustomNumberingList = changeCustomNumberingList, changeFloatingObjectAbsolutePosition = changeFloatingObjectAbsolutePosition, changeFloatingObjectAbsoluteSize = changeFloatingObjectAbsoluteSize, changeFloatingObjectAlignmentPosition = changeFloatingObjectAlignmentPosition, changeFloatingObjectFillColor = changeFloatingObjectFillColor, changeFloatingObjectLockAnchor = changeFloatingObjectLockAnchor, changeFloatingObjectLockAspectRatio = changeFloatingObjectLockAspectRatio, changeFloatingObjectOutlineColor = changeFloatingObjectOutlineColor, changeFloatingObjectOutlineWidth = changeFloatingObjectOutlineWidth, changeFloatingObjectRelativePosition = changeFloatingObjectRelativePosition, changeFloatingObjectRotation = changeFloatingObjectRotation, changeFloatingObjectTextWrapping = changeFloatingObjectTextWrapping, changeFontBackColor = changeFontBackColor, changeFontBold = changeFontBold, changeFontForeColor = changeFontForeColor, changeFontFormatting = changeFontFormatting, changeFontItalic = changeFontItalic, changeFontName = changeFontName, changeFontSize = changeFontSize, changeFontStrikeout = changeFontStrikeout, changeFontSubscript = changeFontSubscript, changeFontSuperscript = changeFontSuperscript, changeFontUnderline = changeFontUnderline, changeHyperlink = changeHyperlink, changePageColor = changePageColor, changePageMargins = changePageMargins, changePageOrientation = changePageOrientation, changePageSize = changePageSize, changeParagraphBackColor = changeParagraphBackColor, changeParagraphFormatting = changeParagraphFormatting, changePictureScale = changePictureScale, changeSectionColumns = changeSectionColumns, changeSectionEqualColumnCount = changeSectionEqualColumnCount, changeStyle = changeStyle, changeTableBorderRepositoryItem = changeTableBorderRepositoryItem, changeTableBordersAndShading = changeTableBordersAndShading, changeTableCellFormatting = changeTableCellFormatting, changeTableCellPreferredWidth = changeTableCellPreferredWidth, changeTableCellShading = changeTableCellShading, changeTableColumnPreferredWidth = changeTableColumnPreferredWidth, changeTableFormatting = changeTableFormatting, changeTableLook = changeTableLook, changeTableRowPreferredHeight = changeTableRowPreferredHeight, changeTableStyle = changeTableStyle, changeTabs = changeTabs, changeTextBoxContentMargins = changeTextBoxContentMargins, changeTextBoxRelativeSize = changeTextBoxRelativeSize, changeTextBoxResizeShapeToFitText = changeTextBoxResizeShapeToFitText, changeViewType = changeViewType, clearFormatting = clearFormatting, closeHeaderFooter = closeHeaderFooter, continueNumberingList = continueNumberingList, copy = copy, copyContent = copyContent, createDateField = createDateField, createField = createField, createMergeField = createMergeField, createPageCountField = createPageCountField, createPageField = createPageField, createTimeField = createTimeField, cut = cut, decreaseFontSize = decreaseFontSize, decreaseIndent = decreaseIndent, decrementNumberingIndent = decrementNumberingIndent, decrementParagraphLeftIndent = decrementParagraphLeftIndent, delete = delete, deleteBookmark = deleteBookmark, deleteHyperlink = deleteHyperlink, deleteHyperlinks = deleteHyperlinks, deleteTable = deleteTable, deleteTableCellsDialog = deleteTableCellsDialog, deleteTableCellsWithShiftHorizontally = deleteTableCellsWithShiftHorizontally, deleteTableCellsWithShiftVertically = deleteTableCellsWithShiftVertically, deleteTableColumns = deleteTableColumns, deleteTableRows = deleteTableRows, endUpdate = js.Any.fromFunction0(endUpdate), fileDownload = fileDownload, fileNew = fileNew, fileOpen = fileOpen, fileOpenDialog = fileOpenDialog, filePrint = filePrint, fileSave = fileSave, fileSaveAs = fileSaveAs, fileSaveAsDialog = fileSaveAsDialog, findAll = findAll, forceSyncWithServer = forceSyncWithServer, getRtf = getRtf, goToBookmark = goToBookmark, goToDataRecord = goToDataRecord, goToFirstDataRecord = goToFirstDataRecord, goToFooter = goToFooter, goToHeader = goToHeader, goToLastDataRecord = goToLastDataRecord, goToNextDataRecord = goToNextDataRecord, goToNextHeaderFooter = goToNextHeaderFooter, goToPreviousDataRecord = goToPreviousDataRecord, goToPreviousHeaderFooter = goToPreviousHeaderFooter, hideFindResults = hideFindResults, increaseFontSize = increaseFontSize, increaseIndent = increaseIndent, incrementNumberingIndent = incrementNumberingIndent, incrementParagraphLeftIndent = incrementParagraphLeftIndent, insertBookmark = insertBookmark, insertColumnBreak = insertColumnBreak, insertContentFromServer = insertContentFromServer, insertEquationsCaption = insertEquationsCaption, insertFiguresCaption = insertFiguresCaption, insertFloatingTextBox = insertFloatingTextBox, insertFooter = insertFooter, insertHeader = insertHeader, insertHtml = insertHtml, insertHyperlink = insertHyperlink, insertLineBreak = insertLineBreak, insertNonBreakingSpace = insertNonBreakingSpace, insertNumeration = insertNumeration, insertPageBreak = insertPageBreak, insertParagraph = insertParagraph, insertPicture = insertPicture, insertRtf = insertRtf, insertSectionBreakEvenPage = insertSectionBreakEvenPage, insertSectionBreakNextPage = insertSectionBreakNextPage, insertSectionBreakOddPage = insertSectionBreakOddPage, insertSymbol = insertSymbol, insertTab = insertTab, insertTable = insertTable, insertTableCellWithShiftToTheLeft = insertTableCellWithShiftToTheLeft, insertTableCellsDialog = insertTableCellsDialog, insertTableCellsWithShiftToTheVertically = insertTableCellsWithShiftToTheVertically, insertTableColumnToTheLeft = insertTableColumnToTheLeft, insertTableColumnToTheRight = insertTableColumnToTheRight, insertTableOfContents = insertTableOfContents, insertTableOfEquations = insertTableOfEquations, insertTableOfFigures = insertTableOfFigures, insertTableOfTables = insertTableOfTables, insertTableRowAbove = insertTableRowAbove, insertTableRowBelow = insertTableRowBelow, insertTablesCaption = insertTablesCaption, insertText = insertText, linkHeaderFooterToPrevious = linkHeaderFooterToPrevious, mailMergeAndDownload = mailMergeAndDownload, mailMergeAndSaveAs = mailMergeAndSaveAs, mailMergeDialog = mailMergeDialog, makeTextLowerCase = makeTextLowerCase, makeTextSentenceCase = makeTextSentenceCase, makeTextUpperCase = makeTextUpperCase, mergeFieldDialog = mergeFieldDialog, mergeTableCells = mergeTableCells, moveContent = moveContent, openCustomNumberingListDialog = openCustomNumberingListDialog, openFindAndReplaceDialog = openFindAndReplaceDialog, openFindPanel = openFindPanel, openFontFormattingDialog = openFontFormattingDialog, openHyperlink = openHyperlink, openInsertBookmarkDialog = openInsertBookmarkDialog, openInsertHyperlinkDialog = openInsertHyperlinkDialog, openInsertPictureDialog = openInsertPictureDialog, openInsertSymbolDialog = openInsertSymbolDialog, openInsertTableDialog = openInsertTableDialog, openLayoutOptionsDialog = openLayoutOptionsDialog, openNumberingListDialog = openNumberingListDialog, openPageMarginsDialog = openPageMarginsDialog, openPagePaperSizeDialog = openPagePaperSizeDialog, openParagraphFormattingDialog = openParagraphFormattingDialog, openSectionColumnsDialog = openSectionColumnsDialog, openSpellingDialog = openSpellingDialog, openTableBordersAndShadingDialog = openTableBordersAndShadingDialog, openTableFormattingDialog = openTableFormattingDialog, openTabsDialog = openTabsDialog, paste = paste, redo = redo, removeNextWord = removeNextWord, removeNumeration = removeNumeration, removePrevWord = removePrevWord, removeSpacingAfterParagraph = removeSpacingAfterParagraph, removeSpacingBeforeParagraph = removeSpacingBeforeParagraph, removeTableCellBorders = removeTableCellBorders, replaceAll = replaceAll, replaceNext = replaceNext, restartNumberingList = restartNumberingList, setDifferentFirstPageHeaderFooter = setDifferentFirstPageHeaderFooter, setDifferentOddAndEvenPagesHeaderFooter = setDifferentOddAndEvenPagesHeaderFooter, setDoubleParagraphSpacing = setDoubleParagraphSpacing, setFullscreen = setFullscreen, setPageSizeDialog = setPageSizeDialog, setParagraphLevel = setParagraphLevel, setSesquialteralParagraphSpacing = setSesquialteralParagraphSpacing, setSingleParagraphSpacing = setSingleParagraphSpacing, showAllFieldCodes = showAllFieldCodes, showFieldCodes = showFieldCodes, showHiddenSymbols = showHiddenSymbols, showHorizontalRuler = showHorizontalRuler, showMergedData = showMergedData, showTableGridLines = showTableGridLines, splitTableCells = splitTableCells, splitTableCellsDialog = splitTableCellsDialog, switchTextCase = switchTextCase, toggleBulletedList = toggleBulletedList, toggleMultilevelList = toggleMultilevelList, toggleNumberingList = toggleNumberingList, toggleParagraphAlignmentCenter = toggleParagraphAlignmentCenter, toggleParagraphAlignmentJustify = toggleParagraphAlignmentJustify, toggleParagraphAlignmentLeft = toggleParagraphAlignmentLeft, toggleParagraphAlignmentRight = toggleParagraphAlignmentRight, toggleTableAutoFitContents = toggleTableAutoFitContents, toggleTableAutoFitWindow = toggleTableAutoFitWindow, toggleTableCellAlignBottomCenter = toggleTableCellAlignBottomCenter, toggleTableCellAlignBottomLeft = toggleTableCellAlignBottomLeft, toggleTableCellAlignBottomRight = toggleTableCellAlignBottomRight, toggleTableCellAlignMiddleCenter = toggleTableCellAlignMiddleCenter, toggleTableCellAlignMiddleLeft = toggleTableCellAlignMiddleLeft, toggleTableCellAlignMiddleRight = toggleTableCellAlignMiddleRight, toggleTableCellAlignTopCenter = toggleTableCellAlignTopCenter, toggleTableCellAlignTopLeft = toggleTableCellAlignTopLeft, toggleTableCellAlignTopRight = toggleTableCellAlignTopRight, toggleTableCellAllBorders = toggleTableCellAllBorders, toggleTableCellBottomBorder = toggleTableCellBottomBorder, toggleTableCellInsideBorders = toggleTableCellInsideBorders, toggleTableCellInsideHorizontalBorders = toggleTableCellInsideHorizontalBorders, toggleTableCellInsideVerticalBorders = toggleTableCellInsideVerticalBorders, toggleTableCellLeftBorder = toggleTableCellLeftBorder, toggleTableCellOutsideBorders = toggleTableCellOutsideBorders, toggleTableCellRightBorder = toggleTableCellRightBorder, toggleTableCellTopBorder = toggleTableCellTopBorder, toggleTableFixedColumnWidth = toggleTableFixedColumnWidth, toggleTextCase = toggleTextCase, undo = undo, updateAllFields = updateAllFields, updateField = updateField, updateTableOfContents = updateTableOfContents)
  
    __obj.asInstanceOf[RichEditCommands]
  }
}

