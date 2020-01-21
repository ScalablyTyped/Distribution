package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of the available client commands.
  */
@JSGlobal("RichEditCommands")
@js.native
class RichEditCommands () extends js.Object {
  /**
    * Gets a command to add spacing after a paragraph.
    */
  val addSpacingAfterParagraph: AddSpacingAfterParagraphCommand = js.native
  /**
    * Gets a command to add spacing before a paragraph.
    */
  val addSpacingBeforeParagraph: AddSpacingBeforeParagraphCommand = js.native
  /**
    * Gets a command to assign a shortcut to the specified client command.
    */
  val assignShortcut: AssignShortcutCommand = js.native
  /**
    * Gets a command to move the cursor backwards and erase characters in a selected range.
    */
  val backspace: BackspaceCommand = js.native
  /**
    * Gets a command to capitalize each word in the selected sentence.
    */
  val capitalizeEachWordTextCase: CapitalizeEachWordTextCaseCommand = js.native
  /**
    * Gets a command to customize the numbered list parameters.
    */
  val changeCustomNumberingList: ChangeCustomNumberingListCommand = js.native
  /**
    * Gets a command to change a floating object's absolute position.
    */
  val changeFloatingObjectAbsolutePosition: ChangeFloatingObjectAbsolutePositionCommand = js.native
  /**
    * Gets a command to change a floating object's absolute size.
    */
  val changeFloatingObjectAbsoluteSize: ChangeFloatingObjectAbsoluteSizeCommand = js.native
  /**
    * Gets a command to modify a floating object's alignment position.
    */
  val changeFloatingObjectAlignmentPosition: ChangeFloatingObjectAlignmentPositionCommand = js.native
  /**
    * Gets a command to modify a floating object's background fill color.
    */
  val changeFloatingObjectFillColor: ChangeFloatingObjectFillColorCommand = js.native
  /**
    * Gets a command to lock a floating object's anchor.
    */
  val changeFloatingObjectLockAnchor: ChangeFloatingObjectLockAnchorCommand = js.native
  /**
    * Gets a command to lock a floating object's aspect ratio.
    */
  val changeFloatingObjectLockAspectRatio: ChangeFloatingObjectLockAspectRatioCommand = js.native
  /**
    * Gets a command to modify a floating object's outline color.
    */
  val changeFloatingObjectOutlineColor: ChangeFloatingObjectOutlineColorCommand = js.native
  /**
    * Gets a command to modify a floating object's outline width.
    */
  val changeFloatingObjectOutlineWidth: ChangeFloatingObjectOutlineWidthCommand = js.native
  /**
    * Gets a command to modify a floating object's relative position.
    */
  val changeFloatingObjectRelativePosition: ChangeFloatingObjectRelativePositionCommand = js.native
  /**
    * Gets a command to rotate a floating object.
    */
  val changeFloatingObjectRotation: ChangeFloatingObjectRotationCommand = js.native
  /**
    * Gets a command to modify a floating object's text wrapping settings.
    */
  val changeFloatingObjectTextWrapping: ChangeFloatingObjectTextWrappingCommand = js.native
  /**
    * Gets a command to change the background color of characters in a selected range.
    */
  val changeFontBackColor: ChangeFontBackColorCommand = js.native
  /**
    * Gets a command to change the bold formatting of characters in a selected range.
    */
  val changeFontBold: ChangeFontBoldCommand = js.native
  /**
    * Gets a command to change the font color of characters in a selected range.
    */
  val changeFontForeColor: ChangeFontForeColorCommand = js.native
  /**
    * Gets a command to change the font formatting of characters in a selected range.
    */
  val changeFontFormatting: ChangeFontFormattingCommand = js.native
  /**
    * Gets a command to change the italic formatting of characters in a selected range.
    */
  val changeFontItalic: ChangeFontItalicCommand = js.native
  /**
    * Gets a command to change the font name of characters in a selected range.
    */
  val changeFontName: ChangeFontNameCommand = js.native
  /**
    * Gets a command to change the font size (in points) of characters in a selected range.
    */
  val changeFontSize: ChangeFontSizeCommand = js.native
  /**
    * Gets a command to change the strikeout formatting of characters in a selected range.
    */
  val changeFontStrikeout: ChangeFontStrikeoutCommand = js.native
  /**
    * Gets a command to change the subscript formatting of characters in a selected range.
    */
  val changeFontSubscript: ChangeFontSubscriptCommand = js.native
  /**
    * Gets a command to change the superscript formatting of characters in a selected range.
    */
  val changeFontSuperscript: ChangeFontSuperscriptCommand = js.native
  /**
    * Gets a command to change the underline formatting of characters in a selected range.
    */
  val changeFontUnderline: ChangeFontUnderlineCommand = js.native
  /**
    * Gets a command that changes the specified hyperlink.
    */
  val changeHyperlink: ChangeHyperlinkCommand = js.native
  /**
    * Gets a command to set the background color of all pages contained in the document.
    */
  val changePageColor: ChangePageColorCommand = js.native
  /**
    * Gets a command to apply page margins settings to sections located within a selected range.
    */
  val changePageMargins: ChangePageMarginsCommand = js.native
  /**
    * Gets a command to apply page orientation settings to sections located within a selected range.
    */
  val changePageOrientation: ChangePageOrientationCommand = js.native
  /**
    * Gets a command to apply page size settings to sections located within a selected range.
    */
  val changePageSize: ChangePageSizeCommand = js.native
  /**
    * Gets a command to change the background color of paragraphs in a selected range.
    */
  val changeParagraphBackColor: ChangeParagraphBackColorCommand = js.native
  /**
    * Gets a command to apply formatting settings to paragraphs within a selected range.
    */
  val changeParagraphFormatting: ChangeParagraphFormattingCommand = js.native
  /**
    * Gets a command to scale a selected in-line picture.
    */
  val changePictureScale: ChangePictureScaleCommand = js.native
  /**
    * Gets a command to apply column layout settings to a section.
    */
  val changeSectionColumns: ChangeSectionColumnsCommand = js.native
  /**
    * Gets a command to change the number of columns having the same width in a section.
    */
  val changeSectionEqualColumnCount: ChangeSectionEqualColumnCountCommand = js.native
  /**
    * Gets a command to apply a character or paragraph style settings to text in a selected range.
    */
  val changeStyle: ChangeStyleCommand = js.native
  /**
    * Gets a command to apply borders' drawing settings.
    */
  val changeTableBorderRepositoryItem: ChangeTableBorderRepositoryItemCommand = js.native
  /**
    * Gets a command to change the selected table's borders and shading.
    */
  val changeTableBordersAndShading: ChangeTableBordersAndShadingCommand = js.native
  /**
    * Gets a command to change the cell formatting of the selected table elements.
    */
  val changeTableCellFormatting: ChangeTableCellFormattingCommand = js.native
  /**
    * Gets a command to change the preferred cell width of the selected table rows.
    */
  val changeTableCellPreferredWidth: ChangeTableCellPreferredWidthCommand = js.native
  /**
    * Gets a command to change cell shading in selected table cells.
    */
  val changeTableCellShading: ChangeTableCellShadingCommand = js.native
  /**
    * Gets a command to change the selected table columns' preferred width.
    */
  val changeTableColumnPreferredWidth: ChangeTableColumnPreferredWidthCommand = js.native
  /**
    * Gets a command to change the selected table's formatting.
    */
  val changeTableFormatting: ChangeTableFormattingCommand = js.native
  /**
    * Gets a command to change the selected table's style options.
    */
  val changeTableLook: ChangeTableLookCommand = js.native
  /**
    * Gets a command to change the selected table rows' preferred height.
    */
  val changeTableRowPreferredHeight: ChangeTableRowPreferredHeightCommand = js.native
  /**
    * Gets a command to change the selected table's style.
    */
  val changeTableStyle: ChangeTableStyleCommand = js.native
  /**
    * Gets a command to change the default tab stop value of a document and apply custom tab settings to the selected paragraphs.
    */
  val changeTabs: ChangeTabsCommand = js.native
  /**
    * Gets a command to modify a text box's content margins.
    */
  val changeTextBoxContentMargins: ChangeTextBoxContentMarginsCommand = js.native
  /**
    * Gets a command to modify a text box's relative size settings.
    */
  val changeTextBoxRelativeSize: ChangeTextBoxRelativeSizeCommand = js.native
  /**
    * Gets a command to resize the shape to fit the text in the text box.
    */
  val changeTextBoxResizeShapeToFitText: ChangeTextBoxResizeShapeToFitTextCommand = js.native
  /**
    * Gets a command to change the Rich Edit's document view type.
    */
  val changeViewType: ChangeViewTypeCommand = js.native
  /**
    * Gets a command to reset textual and paragraph formatting in the selected range to default values.
    */
  val clearFormatting: ClearFormattingCommand = js.native
  /**
    * Gets a command to substitute a header/footer sub-document with the main sub-document as an active sub-document.
    */
  val closeHeaderFooter: CloseHeaderFooterCommand = js.native
  /**
    * Gets a command to continue the list's numbering.
    */
  val continueNumberingList: ContinueNumberingListCommand = js.native
  /**
    * Gets a command to copy the selected text and place it to the clipboard.
    */
  val copy: CopyCommand = js.native
  /**
    * Gets a command to copy the selected text and place it to the specified position.
    */
  val copyContent: CopyContentCommand = js.native
  /**
    * Gets a command to insert and update a field with a DATE code.
    */
  val createDateField: CreateDateFieldCommand = js.native
  /**
    * Gets a command to add a field at the current position in a document.
    */
  val createField: CreateFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a MERGEFIELD (a data source column name is passed with a parameter).
    */
  val createMergeField: CreateMergeFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a NUMPAGES field displaying the total number of pages.
    */
  val createPageCountField: CreatePageCountFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a PAGE field displaying the current page number.
    */
  val createPageField: CreatePageFieldCommand = js.native
  /**
    * Gets a command to replace the selection with a TIME field displaying the current time.
    */
  val createTimeField: CreateTimeFieldCommand = js.native
  /**
    * Gets a command to cut the selected text and place it to the clipboard.
    */
  val cut: CutCommand = js.native
  /**
    * Gets a command to decrease the selected range's font size to the closest smaller predefined value (in points).
    */
  val decreaseFontSize: DecreaseFontSizeCommand = js.native
  /**
    * Gets a command to decrease the indent level of paragraphs in a selected range.
    */
  val decreaseIndent: DecreaseIndentCommand = js.native
  /**
    * Gets a command to decrement the indent level of paragraphs in a selected numbered list.
    */
  val decrementNumberingIndent: DecrementNumberingIndentCommand = js.native
  /**
    * Gets a command to decrement the paragraph's left indent position.
    */
  val decrementParagraphLeftIndent: DecrementParagraphLeftIndentCommand = js.native
  /**
    * Gets a command to delete text and in-line objects in a selected range.
    */
  val delete: DeleteCommand = js.native
  /**
    * Gets a command to delete a specific bookmark.
    */
  val deleteBookmark: DeleteBookmarkCommand = js.native
  /**
    * Gets a command to delete the selected hyperlink.
    */
  val deleteHyperlink: DeleteHyperlinkCommand = js.native
  /**
    * Gets a command to delete all hyperlinks in the selected range.
    */
  val deleteHyperlinks: DeleteHyperlinksCommand = js.native
  /**
    * Gets a command to delete the selected table.
    */
  val deleteTable: DeleteTableCommand = js.native
  /**
    * Gets a command to invoke the Delete Cells dialog window.
    */
  val deleteTableCellsDialog: DeleteTableCellsDialogCommand = js.native
  /**
    * Gets a command to delete the selected table cells with a horizontal shift.
    */
  val deleteTableCellsWithShiftHorizontally: DeleteTableCellsWithShiftHorizontallyCommand = js.native
  /**
    * Gets a command to delete the selected table cells with a vertical shift.
    */
  val deleteTableCellsWithShiftVertically: DeleteTableCellsWithShiftVerticallyCommand = js.native
  /**
    * Gets a command to delete the selected columns in the table.
    */
  val deleteTableColumns: DeleteTableColumnsCommand = js.native
  /**
    * Gets a command to delete the selected rows in the table.
    */
  val deleteTableRows: DeleteTableRowsCommand = js.native
  /**
    * Gets a command to download the document specifying the file's extension.
    */
  val fileDownload: FileDownloadCommand = js.native
  /**
    * Gets a command to create a new empty document.
    */
  val fileNew: FileNewCommand = js.native
  /**
    * Gets a command to open a document stored in the specified file.
    */
  val fileOpen: FileOpenCommand = js.native
  /**
    * Gets a command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
    */
  val fileOpenDialog: FileOpenDialogCommand = js.native
  /**
    * Gets a command to invoke a browser-specific Print dialog allowing one to print the current document.
    */
  val filePrint: FilePrintCommand = js.native
  /**
    * Gets a command to save the document at its original location on the server.
    */
  val fileSave: FileSaveCommand = js.native
  /**
    * Gets a command to save a document in a file with the specified path.
    */
  val fileSaveAs: FileSaveAsCommand = js.native
  /**
    * Gets a command to invoke the Save As dialog that prompts for a file name and saves the current document in a file with the specified path.
    */
  val fileSaveAsDialog: FileSaveAsDialogCommand = js.native
  /**
    * Gets a command to find all matches of the specified text in the document.
    */
  val findAll: FindAllCommand = js.native
  /**
    * Gets a command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
    */
  val forceSyncWithServer: ForceSyncWithServerCommand = js.native
  /**
    * Gets a command to receive RTF formatted content from the document in the specified range.
    */
  val getRtf: GetRtfCommand = js.native
  /**
    * Gets a command to navigate to the specified bookmark.
    */
  val goToBookmark: GoToBookmarkCommand = js.native
  /**
    * Gets a command to open the specified data record.
    */
  val goToDataRecord: GoToDataRecordCommand = js.native
  /**
    * Gets a command to navigate to the first data record.
    */
  val goToFirstDataRecord: GoToFirstDataRecordCommand = js.native
  /**
    * Gets a command to substitute a header sub-document with a footer sub-document of the same page as an active sub-document.
    */
  val goToFooter: GoToFooterCommand = js.native
  /**
    * Gets a command to substitute a footer sub-document with a header sub-document of the same page as an active sub-document.
    */
  val goToHeader: GoToHeaderCommand = js.native
  /**
    * Gets a command to navigate to the last data record of the bound data source.
    */
  val goToLastDataRecord: GoToLastDataRecordCommand = js.native
  /**
    * Gets a command to navigate to the next data record of the bound data source.
    */
  val goToNextDataRecord: GoToNextDataRecordCommand = js.native
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the next section as an active sub-document.
    */
  val goToNextHeaderFooter: GoToNextHeaderFooterCommand = js.native
  /**
    * Gets a command to navigate to the previous data record of the bound data source.
    */
  val goToPreviousDataRecord: GoToPreviousDataRecordCommand = js.native
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the previous section as an active sub-document.
    */
  val goToPreviousHeaderFooter: GoToPreviousHeaderFooterCommand = js.native
  /**
    * Gets a command to hide the search results.
    */
  val hideFindResults: HideFindResultsCommand = js.native
  /**
    * Gets a command to increase the font size of characters in a selected range to the closest larger predefined value (in points).
    */
  val increaseFontSize: IncreaseFontSizeCommand = js.native
  /**
    * Gets a command to increment the indent level of paragraphs in a selected range.
    */
  val increaseIndent: IncreaseIndentCommand = js.native
  /**
    * Gets a command to increment the indent level of paragraphs in a selected numbered list.
    */
  val incrementNumberingIndent: IncrementNumberingIndentCommand = js.native
  /**
    * Gets a command to increment the left indent of paragraphs in a selected range.
    */
  val incrementParagraphLeftIndent: IncrementParagraphLeftIndentCommand = js.native
  /**
    * Gets a command to insert a new bookmark that references the current selection.
    */
  val insertBookmark: InsertBookmarkCommand = js.native
  /**
    * Gets a command to insert a column break at the current position in the document.
    */
  val insertColumnBreak: InsertColumnBreakCommand = js.native
  /**
    * Gets a command to insert content created on the server to the client model.
    */
  val insertContentFromServer: InsertContentFromServerCommand = js.native
  /**
    * Gets a command to add a caption (numbered label) to an equation.
    */
  val insertEquationsCaption: InsertEquationsCaptionCommand = js.native
  /**
    * Gets a command to add a caption (numbered label) to a figure.
    */
  val insertFiguresCaption: InsertFiguresCaptionCommand = js.native
  /**
    * Gets a command to insert a floating text box.
    */
  val insertFloatingTextBox: InsertFloatingTextBoxCommand = js.native
  /**
    * Gets a command to create a footer sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    */
  val insertFooter: InsertFooterCommand = js.native
  /**
    * Gets a command to create a header sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    */
  val insertHeader: InsertHeaderCommand = js.native
  /**
    * Gets a command to add an HTML formatted content in place of a selected range.
    */
  val insertHtml: InsertHtmlCommand = js.native
  /**
    * Gets a command to insert and update a hyperlink field in place of a selected range.
    */
  val insertHyperlink: InsertHyperlinkCommand = js.native
  /**
    * Gets a command to insert the line break at the current position in the document.
    */
  val insertLineBreak: InsertLineBreakCommand = js.native
  /**
    * Gets a command to add a non-breaking space in place of a selected range
    */
  val insertNonBreakingSpace: InsertNonBreakingSpaceCommand = js.native
  /**
    * Gets a command to insert numeration to a paragraph making it a numbering list item.
    */
  val insertNumeration: InsertNumerationCommand = js.native
  /**
    * Gets a command to insert a page break at the current position in the document.
    */
  val insertPageBreak: InsertPageBreakCommand = js.native
  /**
    * Gets a command to insert a paragraph break at the current position in the document.
    */
  val insertParagraph: InsertParagraphCommand = js.native
  /**
    * Gets a command to insert an inline picture stored by the specified web address.
    */
  val insertPicture: InsertPictureCommand = js.native
  /**
    * Gets a command to add RTF formatted content at the specified position.
    */
  val insertRtf: InsertRtfCommand = js.native
  /**
    * Gets a command to insert a section break and starts a new section on the next even-numbered page.
    */
  val insertSectionBreakEvenPage: InsertSectionBreakEvenPageCommand = js.native
  /**
    * Gets a command to insert a section break and starts a new section on the next page.
    */
  val insertSectionBreakNextPage: InsertSectionBreakNextPageCommand = js.native
  /**
    * Gets a command to insert a section break and starts a new section on the next odd-numbered page.
    */
  val insertSectionBreakOddPage: InsertSectionBreakOddPageCommand = js.native
  /**
    * Gets a command to insert characters into a document instead of a selected range.
    */
  val insertSymbol: InsertSymbolCommand = js.native
  /**
    * Gets a command to insert a tab character at the current position in the document.
    */
  val insertTab: InsertTabCommand = js.native
  /**
    * Gets a command to insert a rectangular table of the specified size.
    */
  val insertTable: InsertTableCommand = js.native
  /**
    * Gets a command to insert table cells with a horizontal shift into the selected table.
    */
  val insertTableCellWithShiftToTheLeft: InsertTableCellWithShiftToTheLeftCommand = js.native
  /**
    * Gets a command to invoke the Insert Cells dialog window.
    */
  val insertTableCellsDialog: InsertTableCellsDialogCommand = js.native
  /**
    * Gets a command to insert table cells with a vertical shift into the selected table.
    */
  val insertTableCellsWithShiftToTheVertically: InsertTableCellsWithShiftToTheVerticallyCommand = js.native
  /**
    * Gets a command to insert a table column to the left of the current position in the table.
    */
  val insertTableColumnToTheLeft: InsertTableColumnToTheLeftCommand = js.native
  /**
    * Gets a command to insert a table column to the right of the current position in the table.
    */
  val insertTableColumnToTheRight: InsertTableColumnToTheRightCommand = js.native
  /**
    * Gets a command to insert a table of contents.
    */
  val insertTableOfContents: InsertTableOfContentsCommand = js.native
  /**
    * Gets a command to create a table of equations on the base of equation captions.
    */
  val insertTableOfEquations: InsertTableOfEquationsCommand = js.native
  /**
    * Gets a command to create a table of figures on the base of figures captions.
    */
  val insertTableOfFigures: InsertTableOfFiguresCommand = js.native
  /**
    * Gets a command to create a table of tables on the base of tables captions.
    */
  val insertTableOfTables: InsertTableOfTablesCommand = js.native
  /**
    * Gets a command to insert a row in the table above the selected row.
    */
  val insertTableRowAbove: InsertTableRowAboveCommand = js.native
  /**
    * Gets a command to insert a row in the table below the selected row.
    */
  val insertTableRowBelow: InsertTableRowBelowCommand = js.native
  /**
    * Gets a command to add a caption (numbered label) to a table.
    */
  val insertTablesCaption: InsertTablesCaptionCommand = js.native
  /**
    * Gets a command to insert text in place of a selected range.
    */
  val insertText: InsertTextCommand = js.native
  /**
    * Gets a command to link a header/footer to the previous section, so it has the same content.
    */
  val linkHeaderFooterToPrevious: LinkHeaderFooterToPreviousCommand = js.native
  /**
    * Gets a command to perform a mail merge and download the merged document.
    */
  val mailMergeAndDownload: MailMergeAndDownloadCommand = js.native
  /**
    * Gets a command to perform a mail merge and save the merged document to the server.
    */
  val mailMergeAndSaveAs: MailMergeAndSaveAsCommand = js.native
  /**
    * Gets a command to invoke the Export Range dialog window to start a mail merge.
    */
  val mailMergeDialog: MailMergeDialogCommand = js.native
  /**
    * Gets a command to convert selected text to lower case.
    */
  val makeTextLowerCase: MakeTextLowerCaseCommand = js.native
  /**
    * Gets a command changing all selected text to the sentence case capitalization.
    */
  val makeTextSentenceCase: MakeTextSentenceCaseCommand = js.native
  /**
    * Gets a command to convert selected text to upper case.
    */
  val makeTextUpperCase: MakeTextUpperCaseCommand = js.native
  /**
    * Gets a command to invoke the Insert Merge Field dialog window.
    */
  val mergeFieldDialog: MergeFieldDialogCommand = js.native
  /**
    * Gets a command to merge the selected cells.
    */
  val mergeTableCells: MergeTableCellsCommand = js.native
  /**
    * Gets a command to move the selected range.
    */
  val moveContent: MoveContentCommand = js.native
  /**
    * Gets a command to invoke the Customize Numbered List dialog window.
    */
  val openCustomNumberingListDialog: OpenCustomNumberingListDialogCommand = js.native
  /**
    * Gets a command to invoke the Find and Replace dialog window.
    */
  val openFindAndReplaceDialog: OpenFindAndReplaceDialogCommand = js.native
  /**
    * Gets a command to invoke the Search Panel allowing end-users to search text and navigate through search results.
    */
  val openFindPanel: OpenFindPanelCommand = js.native
  /**
    * Gets a command to invoke the Font dialog window.
    */
  val openFontFormattingDialog: OpenFontFormattingDialogCommand = js.native
  /**
    * Gets a command to go to a bookmark or URI contained within the selected hyperlink.
    */
  val openHyperlink: OpenHyperlinkCommand = js.native
  /**
    * Gets a command to invoke the Bookmark dialog window.
    */
  val openInsertBookmarkDialog: OpenInsertBookmarkDialogCommand = js.native
  /**
    * Gets a command to invoke the Hyperlink dialog window.
    */
  val openInsertHyperlinkDialog: OpenInsertHyperlinkDialogCommand = js.native
  /**
    * Gets a command to invoke the Insert Image dialog window.
    */
  val openInsertPictureDialog: OpenInsertPictureDialogCommand = js.native
  /**
    * Gets a command to invoke the Symbols dialog window.
    */
  val openInsertSymbolDialog: OpenInsertSymbolDialogCommand = js.native
  /**
    * Gets a command to invoke the Insert Table dialog window.
    */
  val openInsertTableDialog: OpenInsertTableDialogCommand = js.native
  /**
    * Gets a command to invoke the Layout dialog window to customize the settings of a floating object.
    */
  val openLayoutOptionsDialog: OpenLayoutOptionsDialogCommand = js.native
  /**
    * Gets a command to invoke the Bulleted and Numbering dialog window.
    */
  val openNumberingListDialog: OpenNumberingListDialogCommand = js.native
  /**
    * Gets a command to invoke the Margins tab of the Page Setup dialog window.
    */
  val openPageMarginsDialog: OpenPageMarginsDialogCommand = js.native
  /**
    * Gets a command to invoke the Paper tab of the Page Setup dialog window.
    */
  val openPagePaperSizeDialog: OpenPagePaperSizeDialogCommand = js.native
  /**
    * Gets a command to invoke the Indents And Spacing tab of the Paragraph dialog window.
    */
  val openParagraphFormattingDialog: OpenParagraphFormattingDialogCommand = js.native
  /**
    * Gets a command to invoke the Columns dialog window.
    */
  val openSectionColumnsDialog: OpenSectionColumnsDialogCommand = js.native
  /**
    * Gets a command to invoke the Spelling dialog window.
    */
  val openSpellingDialog: OpenSpellingDialogCommand = js.native
  /**
    * Gets a command to invoke the Borders tab of the Borders and Shading dialog window.
    */
  val openTableBordersAndShadingDialog: OpenTableBordersAndShadingDialogCommand = js.native
  /**
    * Gets a command to invoke the Table tab of the Table Properties dialog window.
    */
  val openTableFormattingDialog: OpenTableFormattingDialogCommand = js.native
  /**
    * Gets a command to invoke the Tabs dialog window.
    */
  val openTabsDialog: OpenTabsDialogCommand = js.native
  /**
    * Gets a command to paste the text from the clipboard over the selection.
    */
  val paste: PasteCommand = js.native
  /**
    * Gets a command to reverse actions of the previous RichEditCommands.undo command.
    */
  val redo: RedoCommand = js.native
  /**
    * Gets a command to remove the next word.
    */
  val removeNextWord: RemoveNextWordCommand = js.native
  /**
    * Gets a command to exclude the selected paragraphs from the numbered list.
    */
  val removeNumeration: RemoveNumerationCommand = js.native
  /**
    * Gets a command to remove the previous word.
    */
  val removePrevWord: RemovePrevWordCommand = js.native
  /**
    * Gets a command to remove spacing after the selected paragraph.
    */
  val removeSpacingAfterParagraph: RemoveSpacingAfterParagraphCommand = js.native
  /**
    * Gets a command to remove spacing before the selected paragraph.
    */
  val removeSpacingBeforeParagraph: RemoveSpacingBeforeParagraphCommand = js.native
  /**
    * Gets a command to remove the borders of the selected table cells.
    */
  val removeTableCellBorders: RemoveTableCellBordersCommand = js.native
  /**
    * Gets a command to replace all matches of the specified text with new characters.
    */
  val replaceAll: ReplaceAllCommand = js.native
  /**
    * Gets a command to find and replace a next match of the specified text after the cursor position with new characters.
    */
  val replaceNext: ReplaceNextCommand = js.native
  /**
    * Gets a command to restart the numbering list.
    */
  val restartNumberingList: RestartNumberingListCommand = js.native
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for the first page of the current section.
    */
  val setDifferentFirstPageHeaderFooter: SetDifferentFirstPageHeaderFooterCommand = js.native
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for odd and even pages of the current section.
    */
  val setDifferentOddAndEvenPagesHeaderFooter: SetDifferentOddAndEvenPagesHeaderFooterCommand = js.native
  /**
    * Gets a command to format a selected paragraph with double line spacing.
    */
  val setDoubleParagraphSpacing: SetDoubleParagraphSpacingCommand = js.native
  /**
    * Gets a command to toggle the fullscreen mode.
    */
  val setFullscreen: SetFullscreenCommand = js.native
  /**
    * Gets a command to invoke the Page Setup dialog.
    */
  val setPageSizeDialog: SetPageSizeDialogCommand = js.native
  /**
    * Gets a command to apply a paragraph level to the selected text
    */
  val setParagraphLevel: SetParagraphLevelCommand = js.native
  /**
    * Gets a command to format a current paragraph with one and a half line spacing.
    */
  val setSesquialteralParagraphSpacing: SetSesquialteralParagraphSpacingCommand = js.native
  /**
    * Gets a command to format a current paragraph with single line spacing.
    */
  val setSingleParagraphSpacing: SetSingleParagraphSpacingCommand = js.native
  /**
    * Gets a command to display all field codes in place of the fields in the document.
    */
  val showAllFieldCodes: ShowAllFieldCodesCommand = js.native
  /**
    * Gets a command to display the selected field's codes.
    */
  val showFieldCodes: ShowFieldCodesCommand = js.native
  /**
    * Gets a command to toggle hidden symbol visibility.
    */
  val showHiddenSymbols: ShowHiddenSymbolsCommand = js.native
  /**
    * Gets a command to toggle the horizontal ruler's visibility.
    */
  val showHorizontalRuler: ShowHorizontalRulerCommand = js.native
  /**
    * Gets a command to display or hide actual data in MERGEFIELD fields.
    */
  val showMergedData: ShowMergedDataCommand = js.native
  /**
    * Gets a command to toggle the display of grid lines for a table with no borders applied - on/off.
    */
  val showTableGridLines: ShowTableGridLinesCommand = js.native
  /**
    * Gets a command to split the selected table cells.
    */
  val splitTableCells: SplitTableCellsCommand = js.native
  /**
    * Gets a command to invoke the Split Cells dialog window.
    */
  val splitTableCellsDialog: SplitTableCellsDialogCommand = js.native
  /**
    * Gets a command to switch the text capitalization in the selection.
    */
  val switchTextCase: SwitchTextCaseCommand = js.native
  /**
    * Gets a command to toggle between the bulleted paragraph and normal text.
    */
  val toggleBulletedList: ToggleBulletedListCommand = js.native
  /**
    * Gets a command to toggle between the multilevel list style and normal text.
    */
  val toggleMultilevelList: ToggleMultilevelListCommand = js.native
  /**
    * Gets a command to toggle between the numbered paragraph and normal text.
    */
  val toggleNumberingList: ToggleNumberingListCommand = js.native
  /**
    * Gets a command to toggle centered paragraph alignment on and off.
    */
  val toggleParagraphAlignmentCenter: ToggleParagraphAlignmentCenterCommand = js.native
  /**
    * Gets a command to toggle justified paragraph alignment on and off.
    */
  val toggleParagraphAlignmentJustify: ToggleParagraphAlignmentJustifyCommand = js.native
  /**
    * Gets a command to toggle left paragraph alignment on and off.
    */
  val toggleParagraphAlignmentLeft: ToggleParagraphAlignmentLeftCommand = js.native
  /**
    * Gets a command to toggle right paragraph alignment on and off.
    */
  val toggleParagraphAlignmentRight: ToggleParagraphAlignmentRightCommand = js.native
  /**
    * Gets a command that fits the specified table to its contents.
    */
  val toggleTableAutoFitContents: ToggleTableAutoFitContentsCommand = js.native
  /**
    * Gets a command that fits the specified table to a document's window.
    */
  val toggleTableAutoFitWindow: ToggleTableAutoFitWindowCommand = js.native
  /**
    * Gets a command to apply bottom-center alignment for the selected cells.
    */
  val toggleTableCellAlignBottomCenter: ToggleTableCellAlignBottomCenterCommand = js.native
  /**
    * Gets a command to apply bottom-left alignment for the selected cells.
    */
  val toggleTableCellAlignBottomLeft: ToggleTableCellAlignBottomLeftCommand = js.native
  /**
    * Gets a command to apply bottom-right alignment for the selected cells.
    */
  val toggleTableCellAlignBottomRight: ToggleTableCellAlignBottomRightCommand = js.native
  /**
    * Gets a command to apply middle-center alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleCenter: ToggleTableCellAlignMiddleCenterCommand = js.native
  /**
    * Gets a command to apply middle-left alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleLeft: ToggleTableCellAlignMiddleLeftCommand = js.native
  /**
    * Gets a command to apply middle-right alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleRight: ToggleTableCellAlignMiddleRightCommand = js.native
  /**
    * Gets a command to apply top-center alignment for the selected cells.
    */
  val toggleTableCellAlignTopCenter: ToggleTableCellAlignTopCenterCommand = js.native
  /**
    * Gets a command to apply top-left alignment for the selected cells.
    */
  val toggleTableCellAlignTopLeft: ToggleTableCellAlignTopLeftCommand = js.native
  /**
    * Gets a command to apply top-right alignment for the selected cells.
    */
  val toggleTableCellAlignTopRight: ToggleTableCellAlignTopRightCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings to all borders of the selected cells.
    */
  val toggleTableCellAllBorders: ToggleTableCellAllBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the bottom border for the selected cells.
    */
  val toggleTableCellBottomBorder: ToggleTableCellBottomBorderCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the inside borders for the selected cells.
    */
  val toggleTableCellInsideBorders: ToggleTableCellInsideBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the inside horizontal borders for the selected cells.
    */
  val toggleTableCellInsideHorizontalBorders: ToggleTableCellInsideHorizontalBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the inside vertical borders for the selected cells.
    */
  val toggleTableCellInsideVerticalBorders: ToggleTableCellInsideVerticalBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the left border for the selected cells.
    */
  val toggleTableCellLeftBorder: ToggleTableCellLeftBorderCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the outside borders for the selected cells.
    */
  val toggleTableCellOutsideBorders: ToggleTableCellOutsideBordersCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the right border for the selected cells.
    */
  val toggleTableCellRightBorder: ToggleTableCellRightBorderCommand = js.native
  /**
    * Gets a command to apply (or cancel) border settings of the top border for the selected cells.
    */
  val toggleTableCellTopBorder: ToggleTableCellTopBorderCommand = js.native
  /**
    * Gets a command that disables automatic adjusting of the selected table.
    */
  val toggleTableFixedColumnWidth: ToggleTableFixedColumnWidthCommand = js.native
  /**
    * Gets a command to toggle case for each character - upper case becomes lower, lower case becomes upper.
    */
  val toggleTextCase: ToggleTextCaseCommand = js.native
  /**
    * Gets a command to cancel changes caused by the previous command.
    */
  val undo: UndoCommand = js.native
  /**
    * Gets a command to update all fields in the document.
    */
  val updateAllFields: UpdateAllFieldsCommand = js.native
  /**
    * Gets a command to update each field's result in the selection.
    */
  val updateField: UpdateFieldCommand = js.native
  /**
    * Gets a command to update a table of contents.
    */
  val updateTableOfContents: UpdateTableOfContentsCommand = js.native
  /**
    * Gets a command to prevent the control UI from being updated until the RichEditCommands.endUpdate method is called.
    */
  def beginUpdate(): Unit = js.native
  /**
    * Re-enables render operations after a call to the RichEditCommands.beginUpdate method and forces immediate re-rendering.
    */
  def endUpdate(): Unit = js.native
}

