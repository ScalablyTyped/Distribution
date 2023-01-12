package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set of the available client commands.
  */
trait RichEditCommands extends StObject {
  
  /**
    * Gets a command to add spacing after a paragraph.
    */
  val addSpacingAfterParagraph: AddSpacingAfterParagraphCommand
  
  /**
    * Gets a command to add spacing before a paragraph.
    */
  val addSpacingBeforeParagraph: AddSpacingBeforeParagraphCommand
  
  /**
    * Gets a command to assign a shortcut to the specified client command.
    */
  val assignShortcut: AssignShortcutCommand
  
  /**
    * Gets a command to move the cursor backwards and erase characters in a selected range.
    */
  val backspace: BackspaceCommand
  
  /**
    * Gets a command to prevent the control UI from being updated until the RichEditCommands.endUpdate method is called.
    */
  def beginUpdate(): Unit
  
  /**
    * Gets a command to capitalize each word in the selected sentence.
    */
  val capitalizeEachWordTextCase: CapitalizeEachWordTextCaseCommand
  
  /**
    * Gets a command to customize the numbered list parameters.
    */
  val changeCustomNumberingList: ChangeCustomNumberingListCommand
  
  /**
    * Gets a command to change a floating object's absolute position.
    */
  val changeFloatingObjectAbsolutePosition: ChangeFloatingObjectAbsolutePositionCommand
  
  /**
    * Gets a command to change a floating object's absolute size.
    */
  val changeFloatingObjectAbsoluteSize: ChangeFloatingObjectAbsoluteSizeCommand
  
  /**
    * Gets a command to modify a floating object's alignment position.
    */
  val changeFloatingObjectAlignmentPosition: ChangeFloatingObjectAlignmentPositionCommand
  
  /**
    * Gets a command to modify a floating object's background fill color.
    */
  val changeFloatingObjectFillColor: ChangeFloatingObjectFillColorCommand
  
  /**
    * Gets a command to lock a floating object's anchor.
    */
  val changeFloatingObjectLockAnchor: ChangeFloatingObjectLockAnchorCommand
  
  /**
    * Gets a command to lock a floating object's aspect ratio.
    */
  val changeFloatingObjectLockAspectRatio: ChangeFloatingObjectLockAspectRatioCommand
  
  /**
    * Gets a command to modify a floating object's outline color.
    */
  val changeFloatingObjectOutlineColor: ChangeFloatingObjectOutlineColorCommand
  
  /**
    * Gets a command to modify a floating object's outline width.
    */
  val changeFloatingObjectOutlineWidth: ChangeFloatingObjectOutlineWidthCommand
  
  /**
    * Gets a command to modify a floating object's relative position.
    */
  val changeFloatingObjectRelativePosition: ChangeFloatingObjectRelativePositionCommand
  
  /**
    * Gets a command to rotate a floating object.
    */
  val changeFloatingObjectRotation: ChangeFloatingObjectRotationCommand
  
  /**
    * Gets a command to modify a floating object's text wrapping settings.
    */
  val changeFloatingObjectTextWrapping: ChangeFloatingObjectTextWrappingCommand
  
  /**
    * Gets a command to change the background color of characters in a selected range.
    */
  val changeFontBackColor: ChangeFontBackColorCommand
  
  /**
    * Gets a command to change the bold formatting of characters in a selected range.
    */
  val changeFontBold: ChangeFontBoldCommand
  
  /**
    * Gets a command to change the font color of characters in a selected range.
    */
  val changeFontForeColor: ChangeFontForeColorCommand
  
  /**
    * Gets a command to change the font formatting of characters in a selected range.
    */
  val changeFontFormatting: ChangeFontFormattingCommand
  
  /**
    * Gets a command to change the italic formatting of characters in a selected range.
    */
  val changeFontItalic: ChangeFontItalicCommand
  
  /**
    * Gets a command to change the font name of characters in a selected range.
    */
  val changeFontName: ChangeFontNameCommand
  
  /**
    * Gets a command to change the font size (in points) of characters in a selected range.
    */
  val changeFontSize: ChangeFontSizeCommand
  
  /**
    * Gets a command to change the strikeout formatting of characters in a selected range.
    */
  val changeFontStrikeout: ChangeFontStrikeoutCommand
  
  /**
    * Gets a command to change the subscript formatting of characters in a selected range.
    */
  val changeFontSubscript: ChangeFontSubscriptCommand
  
  /**
    * Gets a command to change the superscript formatting of characters in a selected range.
    */
  val changeFontSuperscript: ChangeFontSuperscriptCommand
  
  /**
    * Gets a command to change the underline formatting of characters in a selected range.
    */
  val changeFontUnderline: ChangeFontUnderlineCommand
  
  /**
    * Gets a command that changes the specified hyperlink.
    */
  val changeHyperlink: ChangeHyperlinkCommand
  
  /**
    * Gets a command to set the background color of all pages contained in the document.
    */
  val changePageColor: ChangePageColorCommand
  
  /**
    * Gets a command to apply page margins settings to sections located within a selected range.
    */
  val changePageMargins: ChangePageMarginsCommand
  
  /**
    * Gets a command to apply page orientation settings to sections located within a selected range.
    */
  val changePageOrientation: ChangePageOrientationCommand
  
  /**
    * Gets a command to apply page size settings to sections located within a selected range.
    */
  val changePageSize: ChangePageSizeCommand
  
  /**
    * Gets a command to change the background color of paragraphs in a selected range.
    */
  val changeParagraphBackColor: ChangeParagraphBackColorCommand
  
  /**
    * Gets a command to apply formatting settings to paragraphs within a selected range.
    */
  val changeParagraphFormatting: ChangeParagraphFormattingCommand
  
  /**
    * Gets a command to scale a selected in-line picture.
    */
  val changePictureScale: ChangePictureScaleCommand
  
  /**
    * Gets a command to apply column layout settings to a section.
    */
  val changeSectionColumns: ChangeSectionColumnsCommand
  
  /**
    * Gets a command to change the number of columns having the same width in a section.
    */
  val changeSectionEqualColumnCount: ChangeSectionEqualColumnCountCommand
  
  /**
    * Gets a command to apply a character or paragraph style settings to text in a selected range.
    */
  val changeStyle: ChangeStyleCommand
  
  /**
    * Gets a command to apply borders' drawing settings.
    */
  val changeTableBorderRepositoryItem: ChangeTableBorderRepositoryItemCommand
  
  /**
    * Gets a command to change the selected table's borders and shading.
    */
  val changeTableBordersAndShading: ChangeTableBordersAndShadingCommand
  
  /**
    * Gets a command to change the cell formatting of the selected table elements.
    */
  val changeTableCellFormatting: ChangeTableCellFormattingCommand
  
  /**
    * Gets a command to change the preferred cell width of the selected table rows.
    */
  val changeTableCellPreferredWidth: ChangeTableCellPreferredWidthCommand
  
  /**
    * Gets a command to change cell shading in selected table cells.
    */
  val changeTableCellShading: ChangeTableCellShadingCommand
  
  /**
    * Gets a command to change the selected table columns' preferred width.
    */
  val changeTableColumnPreferredWidth: ChangeTableColumnPreferredWidthCommand
  
  /**
    * Gets a command to change the selected table's formatting.
    */
  val changeTableFormatting: ChangeTableFormattingCommand
  
  /**
    * Gets a command to change the selected table's style options.
    */
  val changeTableLook: ChangeTableLookCommand
  
  /**
    * Gets a command to change the selected table rows' preferred height.
    */
  val changeTableRowPreferredHeight: ChangeTableRowPreferredHeightCommand
  
  /**
    * Gets a command to change the selected table's style.
    */
  val changeTableStyle: ChangeTableStyleCommand
  
  /**
    * Gets a command to change the default tab stop value of a document and apply custom tab settings to the selected paragraphs.
    */
  val changeTabs: ChangeTabsCommand
  
  /**
    * Gets a command to modify a text box's content margins.
    */
  val changeTextBoxContentMargins: ChangeTextBoxContentMarginsCommand
  
  /**
    * Gets a command to modify a text box's relative size settings.
    */
  val changeTextBoxRelativeSize: ChangeTextBoxRelativeSizeCommand
  
  /**
    * Gets a command to resize the shape to fit the text in the text box.
    */
  val changeTextBoxResizeShapeToFitText: ChangeTextBoxResizeShapeToFitTextCommand
  
  /**
    * Gets a command to change the Rich Edit's document view type.
    */
  val changeViewType: ChangeViewTypeCommand
  
  /**
    * Gets a command to reset textual and paragraph formatting in the selected range to default values.
    */
  val clearFormatting: ClearFormattingCommand
  
  /**
    * Gets a command to substitute a header/footer sub-document with the main sub-document as an active sub-document.
    */
  val closeHeaderFooter: CloseHeaderFooterCommand
  
  /**
    * Gets a command to continue the list's numbering.
    */
  val continueNumberingList: ContinueNumberingListCommand
  
  /**
    * Gets a command to copy the selected text and place it to the clipboard.
    */
  val copy: CopyCommand
  
  /**
    * Gets a command to copy the selected text and place it to the specified position.
    */
  val copyContent: CopyContentCommand
  
  /**
    * Gets a command to insert and update a field with a DATE code.
    */
  val createDateField: CreateDateFieldCommand
  
  /**
    * Gets a command to add a field at the current position in a document.
    */
  val createField: CreateFieldCommand
  
  /**
    * Gets a command to replace the selection with a MERGEFIELD (a data source column name is passed with a parameter).
    */
  val createMergeField: CreateMergeFieldCommand
  
  /**
    * Gets a command to replace the selection with a NUMPAGES field displaying the total number of pages.
    */
  val createPageCountField: CreatePageCountFieldCommand
  
  /**
    * Gets a command to replace the selection with a PAGE field displaying the current page number.
    */
  val createPageField: CreatePageFieldCommand
  
  /**
    * Gets a command to replace the selection with a TIME field displaying the current time.
    */
  val createTimeField: CreateTimeFieldCommand
  
  /**
    * Gets a command to cut the selected text and place it to the clipboard.
    */
  val cut: CutCommand
  
  /**
    * Gets a command to decrease the selected range's font size to the closest smaller predefined value (in points).
    */
  val decreaseFontSize: DecreaseFontSizeCommand
  
  /**
    * Gets a command to decrease the indent level of paragraphs in a selected range.
    */
  val decreaseIndent: DecreaseIndentCommand
  
  /**
    * Gets a command to decrement the indent level of paragraphs in a selected numbered list.
    */
  val decrementNumberingIndent: DecrementNumberingIndentCommand
  
  /**
    * Gets a command to decrement the paragraph's left indent position.
    */
  val decrementParagraphLeftIndent: DecrementParagraphLeftIndentCommand
  
  /**
    * Gets a command to delete text and in-line objects in a selected range.
    */
  val delete: DeleteCommand
  
  /**
    * Gets a command to delete a specific bookmark.
    */
  val deleteBookmark: DeleteBookmarkCommand
  
  /**
    * Gets a command to delete the selected hyperlink.
    */
  val deleteHyperlink: DeleteHyperlinkCommand
  
  /**
    * Gets a command to delete all hyperlinks in the selected range.
    */
  val deleteHyperlinks: DeleteHyperlinksCommand
  
  /**
    * Gets a command to delete the selected table.
    */
  val deleteTable: DeleteTableCommand
  
  /**
    * Gets a command to invoke the Delete Cells dialog window.
    */
  val deleteTableCellsDialog: DeleteTableCellsDialogCommand
  
  /**
    * Gets a command to delete the selected table cells with a horizontal shift.
    */
  val deleteTableCellsWithShiftHorizontally: DeleteTableCellsWithShiftHorizontallyCommand
  
  /**
    * Gets a command to delete the selected table cells with a vertical shift.
    */
  val deleteTableCellsWithShiftVertically: DeleteTableCellsWithShiftVerticallyCommand
  
  /**
    * Gets a command to delete the selected columns in the table.
    */
  val deleteTableColumns: DeleteTableColumnsCommand
  
  /**
    * Gets a command to delete the selected rows in the table.
    */
  val deleteTableRows: DeleteTableRowsCommand
  
  /**
    * Re-enables render operations after a call to the RichEditCommands.beginUpdate method and forces immediate re-rendering.
    */
  def endUpdate(): Unit
  
  /**
    * Gets a command to download the document specifying the file's extension and name.
    */
  val fileDownload: FileDownloadCommand
  
  /**
    * Gets a command to create a new empty document.
    */
  val fileNew: FileNewCommand
  
  /**
    * Gets a command to open a document stored in the specified file.
    */
  val fileOpen: FileOpenCommand
  
  /**
    * Gets a command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
    */
  val fileOpenDialog: FileOpenDialogCommand
  
  /**
    * Gets a command to invoke a browser-specific Print dialog allowing one to print the current document.
    */
  val filePrint: FilePrintCommand
  
  /**
    * Gets a command to save the document at its original location on the server.
    */
  val fileSave: FileSaveCommand
  
  /**
    * Gets a command to save a document in a file with the specified path.
    */
  val fileSaveAs: FileSaveAsCommand
  
  /**
    * Gets a command to invoke the Save As dialog that prompts for a file name and saves the current document in a file with the specified path.
    */
  val fileSaveAsDialog: FileSaveAsDialogCommand
  
  /**
    * Gets a command to find all matches of the specified text in the document.
    */
  val findAll: FindAllCommand
  
  /**
    * Gets a command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
    */
  val forceSyncWithServer: ForceSyncWithServerCommand
  
  /**
    * Gets a command to receive RTF formatted content from the document in the specified range.
    */
  val getRtf: GetRtfCommand
  
  /**
    * Gets a command to navigate to the specified bookmark.
    */
  val goToBookmark: GoToBookmarkCommand
  
  /**
    * Gets a command to open the specified data record.
    */
  val goToDataRecord: GoToDataRecordCommand
  
  /**
    * Gets a command to navigate to the first data record.
    */
  val goToFirstDataRecord: GoToFirstDataRecordCommand
  
  /**
    * Gets a command to substitute a header sub-document with a footer sub-document of the same page as an active sub-document.
    */
  val goToFooter: GoToFooterCommand
  
  /**
    * Gets a command to substitute a footer sub-document with a header sub-document of the same page as an active sub-document.
    */
  val goToHeader: GoToHeaderCommand
  
  /**
    * Gets a command to navigate to the last data record of the bound data source.
    */
  val goToLastDataRecord: GoToLastDataRecordCommand
  
  /**
    * Gets a command to navigate to the next data record of the bound data source.
    */
  val goToNextDataRecord: GoToNextDataRecordCommand
  
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the next section as an active sub-document.
    */
  val goToNextHeaderFooter: GoToNextHeaderFooterCommand
  
  /**
    * Gets a command to navigate to the previous data record of the bound data source.
    */
  val goToPreviousDataRecord: GoToPreviousDataRecordCommand
  
  /**
    * Gets a command to substitute a current header/footer with a header/footer of the previous section as an active sub-document.
    */
  val goToPreviousHeaderFooter: GoToPreviousHeaderFooterCommand
  
  /**
    * Gets a command to hide the search results.
    */
  val hideFindResults: HideFindResultsCommand
  
  /**
    * Gets a command to increase the font size of characters in a selected range to the closest larger predefined value (in points).
    */
  val increaseFontSize: IncreaseFontSizeCommand
  
  /**
    * Gets a command to increment the indent level of paragraphs in a selected range.
    */
  val increaseIndent: IncreaseIndentCommand
  
  /**
    * Gets a command to increment the indent level of paragraphs in a selected numbered list.
    */
  val incrementNumberingIndent: IncrementNumberingIndentCommand
  
  /**
    * Gets a command to increment the left indent of paragraphs in a selected range.
    */
  val incrementParagraphLeftIndent: IncrementParagraphLeftIndentCommand
  
  /**
    * Gets a command to insert a new bookmark that references the current selection.
    */
  val insertBookmark: InsertBookmarkCommand
  
  /**
    * Gets a command to insert a column break at the current position in the document.
    */
  val insertColumnBreak: InsertColumnBreakCommand
  
  /**
    * Gets a command to insert content created on the server to the client model.
    */
  val insertContentFromServer: InsertContentFromServerCommand
  
  /**
    * Gets a command to add a caption (numbered label) to an equation.
    */
  val insertEquationsCaption: InsertEquationsCaptionCommand
  
  /**
    * Gets a command to add a caption (numbered label) to a figure.
    */
  val insertFiguresCaption: InsertFiguresCaptionCommand
  
  /**
    * Gets a command to insert a floating text box.
    */
  val insertFloatingTextBox: InsertFloatingTextBoxCommand
  
  /**
    * Gets a command to create a footer sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    */
  val insertFooter: InsertFooterCommand
  
  /**
    * Gets a command to create a header sub-document (if it is not yet created) and set it as an active sub-document instead of the main sub-document.
    */
  val insertHeader: InsertHeaderCommand
  
  /**
    * Gets a command to add an HTML formatted content in place of a selected range.
    */
  val insertHtml: InsertHtmlCommand
  
  /**
    * Gets a command to insert and update a hyperlink field in place of a selected range.
    */
  val insertHyperlink: InsertHyperlinkCommand
  
  /**
    * Gets a command to insert the line break at the current position in the document.
    */
  val insertLineBreak: InsertLineBreakCommand
  
  /**
    * Gets a command to add a non-breaking space in place of a selected range
    */
  val insertNonBreakingSpace: InsertNonBreakingSpaceCommand
  
  /**
    * Gets a command to insert numeration to a paragraph making it a numbering list item.
    */
  val insertNumeration: InsertNumerationCommand
  
  /**
    * Gets a command to insert a page break at the current position in the document.
    */
  val insertPageBreak: InsertPageBreakCommand
  
  /**
    * Gets a command to insert a paragraph break at the current position in the document.
    */
  val insertParagraph: InsertParagraphCommand
  
  /**
    * Gets a command to insert an inline picture stored by the specified web address.
    */
  val insertPicture: InsertPictureCommand
  
  /**
    * Gets a command to add RTF formatted content at the specified position.
    */
  val insertRtf: InsertRtfCommand
  
  /**
    * Gets a command to insert a section break and starts a new section on the next even-numbered page.
    */
  val insertSectionBreakEvenPage: InsertSectionBreakEvenPageCommand
  
  /**
    * Gets a command to insert a section break and starts a new section on the next page.
    */
  val insertSectionBreakNextPage: InsertSectionBreakNextPageCommand
  
  /**
    * Gets a command to insert a section break and starts a new section on the next odd-numbered page.
    */
  val insertSectionBreakOddPage: InsertSectionBreakOddPageCommand
  
  /**
    * Gets a command to insert characters into a document instead of a selected range.
    */
  val insertSymbol: InsertSymbolCommand
  
  /**
    * Gets a command to insert a tab character at the current position in the document.
    */
  val insertTab: InsertTabCommand
  
  /**
    * Gets a command to insert a rectangular table of the specified size.
    */
  val insertTable: InsertTableCommand
  
  /**
    * Gets a command to insert table cells with a horizontal shift into the selected table.
    */
  val insertTableCellWithShiftToTheLeft: InsertTableCellWithShiftToTheLeftCommand
  
  /**
    * Gets a command to invoke the Insert Cells dialog window.
    */
  val insertTableCellsDialog: InsertTableCellsDialogCommand
  
  /**
    * Gets a command to insert table cells with a vertical shift into the selected table.
    */
  val insertTableCellsWithShiftToTheVertically: InsertTableCellsWithShiftToTheVerticallyCommand
  
  /**
    * Gets a command to insert a table column to the left of the current position in the table.
    */
  val insertTableColumnToTheLeft: InsertTableColumnToTheLeftCommand
  
  /**
    * Gets a command to insert a table column to the right of the current position in the table.
    */
  val insertTableColumnToTheRight: InsertTableColumnToTheRightCommand
  
  /**
    * Gets a command to insert a table of contents.
    */
  val insertTableOfContents: InsertTableOfContentsCommand
  
  /**
    * Gets a command to create a table of equations on the base of equation captions.
    */
  val insertTableOfEquations: InsertTableOfEquationsCommand
  
  /**
    * Gets a command to create a table of figures on the base of figures captions.
    */
  val insertTableOfFigures: InsertTableOfFiguresCommand
  
  /**
    * Gets a command to create a table of tables on the base of tables captions.
    */
  val insertTableOfTables: InsertTableOfTablesCommand
  
  /**
    * Gets a command to insert a row in the table above the selected row.
    */
  val insertTableRowAbove: InsertTableRowAboveCommand
  
  /**
    * Gets a command to insert a row in the table below the selected row.
    */
  val insertTableRowBelow: InsertTableRowBelowCommand
  
  /**
    * Gets a command to add a caption (numbered label) to a table.
    */
  val insertTablesCaption: InsertTablesCaptionCommand
  
  /**
    * Gets a command to insert text in place of a selected range.
    */
  val insertText: InsertTextCommand
  
  /**
    * Gets a command to link a header/footer to the previous section, so it has the same content.
    */
  val linkHeaderFooterToPrevious: LinkHeaderFooterToPreviousCommand
  
  /**
    * Gets a command to perform a mail merge and download the merged document.
    */
  val mailMergeAndDownload: MailMergeAndDownloadCommand
  
  /**
    * Gets a command to perform a mail merge and save the merged document to the server.
    */
  val mailMergeAndSaveAs: MailMergeAndSaveAsCommand
  
  /**
    * Gets a command to invoke the Export Range dialog window to start a mail merge.
    */
  val mailMergeDialog: MailMergeDialogCommand
  
  /**
    * Gets a command to convert selected text to lower case.
    */
  val makeTextLowerCase: MakeTextLowerCaseCommand
  
  /**
    * Gets a command changing all selected text to the sentence case capitalization.
    */
  val makeTextSentenceCase: MakeTextSentenceCaseCommand
  
  /**
    * Gets a command to convert selected text to upper case.
    */
  val makeTextUpperCase: MakeTextUpperCaseCommand
  
  /**
    * Gets a command to invoke the Insert Merge Field dialog window.
    */
  val mergeFieldDialog: MergeFieldDialogCommand
  
  /**
    * Gets a command to merge the selected cells.
    */
  val mergeTableCells: MergeTableCellsCommand
  
  /**
    * Gets a command to move the selected range.
    */
  val moveContent: MoveContentCommand
  
  /**
    * Gets a command to invoke the Customize Numbered List dialog window.
    */
  val openCustomNumberingListDialog: OpenCustomNumberingListDialogCommand
  
  /**
    * Gets a command to invoke the Find and Replace dialog window.
    */
  val openFindAndReplaceDialog: OpenFindAndReplaceDialogCommand
  
  /**
    * Gets a command to invoke the Search Panel allowing end-users to search text and navigate through search results.
    */
  val openFindPanel: OpenFindPanelCommand
  
  /**
    * Gets a command to invoke the Font dialog window.
    */
  val openFontFormattingDialog: OpenFontFormattingDialogCommand
  
  /**
    * Gets a command to go to a bookmark or URI contained within the selected hyperlink.
    */
  val openHyperlink: OpenHyperlinkCommand
  
  /**
    * Gets a command to invoke the Bookmark dialog window.
    */
  val openInsertBookmarkDialog: OpenInsertBookmarkDialogCommand
  
  /**
    * Gets a command to invoke the Hyperlink dialog window.
    */
  val openInsertHyperlinkDialog: OpenInsertHyperlinkDialogCommand
  
  /**
    * Gets a command to invoke the Insert Image dialog window.
    */
  val openInsertPictureDialog: OpenInsertPictureDialogCommand
  
  /**
    * Gets a command to invoke the Symbols dialog window.
    */
  val openInsertSymbolDialog: OpenInsertSymbolDialogCommand
  
  /**
    * Gets a command to invoke the Insert Table dialog window.
    */
  val openInsertTableDialog: OpenInsertTableDialogCommand
  
  /**
    * Gets a command to invoke the Layout dialog window to customize the settings of a floating object.
    */
  val openLayoutOptionsDialog: OpenLayoutOptionsDialogCommand
  
  /**
    * Gets a command to invoke the Bulleted and Numbering dialog window.
    */
  val openNumberingListDialog: OpenNumberingListDialogCommand
  
  /**
    * Gets a command to invoke the Margins tab of the Page Setup dialog window.
    */
  val openPageMarginsDialog: OpenPageMarginsDialogCommand
  
  /**
    * Gets a command to invoke the Paper tab of the Page Setup dialog window.
    */
  val openPagePaperSizeDialog: OpenPagePaperSizeDialogCommand
  
  /**
    * Gets a command to invoke the Indents And Spacing tab of the Paragraph dialog window.
    */
  val openParagraphFormattingDialog: OpenParagraphFormattingDialogCommand
  
  /**
    * Gets a command to invoke the Columns dialog window.
    */
  val openSectionColumnsDialog: OpenSectionColumnsDialogCommand
  
  /**
    * Gets a command to invoke the Spelling dialog window.
    */
  val openSpellingDialog: OpenSpellingDialogCommand
  
  /**
    * Gets a command to invoke the Borders tab of the Borders and Shading dialog window.
    */
  val openTableBordersAndShadingDialog: OpenTableBordersAndShadingDialogCommand
  
  /**
    * Gets a command to invoke the Table tab of the Table Properties dialog window.
    */
  val openTableFormattingDialog: OpenTableFormattingDialogCommand
  
  /**
    * Gets a command to invoke the Tabs dialog window.
    */
  val openTabsDialog: OpenTabsDialogCommand
  
  /**
    * Gets a command to paste the text from the clipboard over the selection.
    */
  val paste: PasteCommand
  
  /**
    * Gets a command to reverse actions of the previous RichEditCommands.undo command.
    */
  val redo: RedoCommand
  
  /**
    * Gets a command to remove the next word.
    */
  val removeNextWord: RemoveNextWordCommand
  
  /**
    * Gets a command to exclude the selected paragraphs from the numbered list.
    */
  val removeNumeration: RemoveNumerationCommand
  
  /**
    * Gets a command to remove the previous word.
    */
  val removePrevWord: RemovePrevWordCommand
  
  /**
    * Gets a command to remove spacing after the selected paragraph.
    */
  val removeSpacingAfterParagraph: RemoveSpacingAfterParagraphCommand
  
  /**
    * Gets a command to remove spacing before the selected paragraph.
    */
  val removeSpacingBeforeParagraph: RemoveSpacingBeforeParagraphCommand
  
  /**
    * Gets a command to remove the borders of the selected table cells.
    */
  val removeTableCellBorders: RemoveTableCellBordersCommand
  
  /**
    * Gets a command to replace all matches of the specified text with new characters.
    */
  val replaceAll: ReplaceAllCommand
  
  /**
    * Gets a command to find and replace a next match of the specified text after the cursor position with new characters.
    */
  val replaceNext: ReplaceNextCommand
  
  /**
    * Gets a command to restart the numbering list.
    */
  val restartNumberingList: RestartNumberingListCommand
  
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for the first page of the current section.
    */
  val setDifferentFirstPageHeaderFooter: SetDifferentFirstPageHeaderFooterCommand
  
  /**
    * Gets a command to enable (or disable if it is enabled) a different page header and footer for odd and even pages of the current section.
    */
  val setDifferentOddAndEvenPagesHeaderFooter: SetDifferentOddAndEvenPagesHeaderFooterCommand
  
  /**
    * Gets a command to format a selected paragraph with double line spacing.
    */
  val setDoubleParagraphSpacing: SetDoubleParagraphSpacingCommand
  
  /**
    * Gets a command to toggle the fullscreen mode.
    */
  val setFullscreen: SetFullscreenCommand
  
  /**
    * Gets a command to invoke the Page Setup dialog.
    */
  val setPageSizeDialog: SetPageSizeDialogCommand
  
  /**
    * Gets a command to apply a paragraph level to the selected text
    */
  val setParagraphLevel: SetParagraphLevelCommand
  
  /**
    * Gets a command to format a current paragraph with one and a half line spacing.
    */
  val setSesquialteralParagraphSpacing: SetSesquialteralParagraphSpacingCommand
  
  /**
    * Gets a command to format a current paragraph with single line spacing.
    */
  val setSingleParagraphSpacing: SetSingleParagraphSpacingCommand
  
  /**
    * Gets a command to display all field codes in place of the fields in the document.
    */
  val showAllFieldCodes: ShowAllFieldCodesCommand
  
  /**
    * Gets a command to display the selected field's codes.
    */
  val showFieldCodes: ShowFieldCodesCommand
  
  /**
    * Gets a command to toggle hidden symbol visibility.
    */
  val showHiddenSymbols: ShowHiddenSymbolsCommand
  
  /**
    * Gets a command to toggle the horizontal ruler's visibility.
    */
  val showHorizontalRuler: ShowHorizontalRulerCommand
  
  /**
    * Gets a command to display or hide actual data in MERGEFIELD fields.
    */
  val showMergedData: ShowMergedDataCommand
  
  /**
    * Gets a command to toggle the display of grid lines for a table with no borders applied - on/off.
    */
  val showTableGridLines: ShowTableGridLinesCommand
  
  /**
    * Gets a command to split the selected table cells.
    */
  val splitTableCells: SplitTableCellsCommand
  
  /**
    * Gets a command to invoke the Split Cells dialog window.
    */
  val splitTableCellsDialog: SplitTableCellsDialogCommand
  
  /**
    * Gets a command to switch the text capitalization in the selection.
    */
  val switchTextCase: SwitchTextCaseCommand
  
  /**
    * Gets a command to toggle between the bulleted paragraph and normal text.
    */
  val toggleBulletedList: ToggleBulletedListCommand
  
  /**
    * Gets a command to toggle between the multilevel list style and normal text.
    */
  val toggleMultilevelList: ToggleMultilevelListCommand
  
  /**
    * Gets a command to toggle between the numbered paragraph and normal text.
    */
  val toggleNumberingList: ToggleNumberingListCommand
  
  /**
    * Gets a command to toggle centered paragraph alignment on and off.
    */
  val toggleParagraphAlignmentCenter: ToggleParagraphAlignmentCenterCommand
  
  /**
    * Gets a command to toggle justified paragraph alignment on and off.
    */
  val toggleParagraphAlignmentJustify: ToggleParagraphAlignmentJustifyCommand
  
  /**
    * Gets a command to toggle left paragraph alignment on and off.
    */
  val toggleParagraphAlignmentLeft: ToggleParagraphAlignmentLeftCommand
  
  /**
    * Gets a command to toggle right paragraph alignment on and off.
    */
  val toggleParagraphAlignmentRight: ToggleParagraphAlignmentRightCommand
  
  /**
    * Gets a command that fits the specified table to its contents.
    */
  val toggleTableAutoFitContents: ToggleTableAutoFitContentsCommand
  
  /**
    * Gets a command that fits the specified table to a document's window.
    */
  val toggleTableAutoFitWindow: ToggleTableAutoFitWindowCommand
  
  /**
    * Gets a command to apply bottom-center alignment for the selected cells.
    */
  val toggleTableCellAlignBottomCenter: ToggleTableCellAlignBottomCenterCommand
  
  /**
    * Gets a command to apply bottom-left alignment for the selected cells.
    */
  val toggleTableCellAlignBottomLeft: ToggleTableCellAlignBottomLeftCommand
  
  /**
    * Gets a command to apply bottom-right alignment for the selected cells.
    */
  val toggleTableCellAlignBottomRight: ToggleTableCellAlignBottomRightCommand
  
  /**
    * Gets a command to apply middle-center alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleCenter: ToggleTableCellAlignMiddleCenterCommand
  
  /**
    * Gets a command to apply middle-left alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleLeft: ToggleTableCellAlignMiddleLeftCommand
  
  /**
    * Gets a command to apply middle-right alignment for the selected cells.
    */
  val toggleTableCellAlignMiddleRight: ToggleTableCellAlignMiddleRightCommand
  
  /**
    * Gets a command to apply top-center alignment for the selected cells.
    */
  val toggleTableCellAlignTopCenter: ToggleTableCellAlignTopCenterCommand
  
  /**
    * Gets a command to apply top-left alignment for the selected cells.
    */
  val toggleTableCellAlignTopLeft: ToggleTableCellAlignTopLeftCommand
  
  /**
    * Gets a command to apply top-right alignment for the selected cells.
    */
  val toggleTableCellAlignTopRight: ToggleTableCellAlignTopRightCommand
  
  /**
    * Gets a command to apply (or cancel) border settings to all borders of the selected cells.
    */
  val toggleTableCellAllBorders: ToggleTableCellAllBordersCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the bottom border for the selected cells.
    */
  val toggleTableCellBottomBorder: ToggleTableCellBottomBorderCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the inside borders for the selected cells.
    */
  val toggleTableCellInsideBorders: ToggleTableCellInsideBordersCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the inside horizontal borders for the selected cells.
    */
  val toggleTableCellInsideHorizontalBorders: ToggleTableCellInsideHorizontalBordersCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the inside vertical borders for the selected cells.
    */
  val toggleTableCellInsideVerticalBorders: ToggleTableCellInsideVerticalBordersCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the left border for the selected cells.
    */
  val toggleTableCellLeftBorder: ToggleTableCellLeftBorderCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the outside borders for the selected cells.
    */
  val toggleTableCellOutsideBorders: ToggleTableCellOutsideBordersCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the right border for the selected cells.
    */
  val toggleTableCellRightBorder: ToggleTableCellRightBorderCommand
  
  /**
    * Gets a command to apply (or cancel) border settings of the top border for the selected cells.
    */
  val toggleTableCellTopBorder: ToggleTableCellTopBorderCommand
  
  /**
    * Gets a command that disables automatic adjusting of the selected table.
    */
  val toggleTableFixedColumnWidth: ToggleTableFixedColumnWidthCommand
  
  /**
    * Gets a command to toggle case for each character - upper case becomes lower, lower case becomes upper.
    */
  val toggleTextCase: ToggleTextCaseCommand
  
  /**
    * Gets a command to cancel changes caused by the previous command.
    */
  val undo: UndoCommand
  
  /**
    * Gets a command to update all fields in the document.
    */
  val updateAllFields: UpdateAllFieldsCommand
  
  /**
    * Gets a command to update each field's result in the selection.
    */
  val updateField: UpdateFieldCommand
  
  /**
    * Gets a command to update a table of contents.
    */
  val updateTableOfContents: UpdateTableOfContentsCommand
}
object RichEditCommands {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(addSpacingAfterParagraph = addSpacingAfterParagraph.asInstanceOf[js.Any], addSpacingBeforeParagraph = addSpacingBeforeParagraph.asInstanceOf[js.Any], assignShortcut = assignShortcut.asInstanceOf[js.Any], backspace = backspace.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), capitalizeEachWordTextCase = capitalizeEachWordTextCase.asInstanceOf[js.Any], changeCustomNumberingList = changeCustomNumberingList.asInstanceOf[js.Any], changeFloatingObjectAbsolutePosition = changeFloatingObjectAbsolutePosition.asInstanceOf[js.Any], changeFloatingObjectAbsoluteSize = changeFloatingObjectAbsoluteSize.asInstanceOf[js.Any], changeFloatingObjectAlignmentPosition = changeFloatingObjectAlignmentPosition.asInstanceOf[js.Any], changeFloatingObjectFillColor = changeFloatingObjectFillColor.asInstanceOf[js.Any], changeFloatingObjectLockAnchor = changeFloatingObjectLockAnchor.asInstanceOf[js.Any], changeFloatingObjectLockAspectRatio = changeFloatingObjectLockAspectRatio.asInstanceOf[js.Any], changeFloatingObjectOutlineColor = changeFloatingObjectOutlineColor.asInstanceOf[js.Any], changeFloatingObjectOutlineWidth = changeFloatingObjectOutlineWidth.asInstanceOf[js.Any], changeFloatingObjectRelativePosition = changeFloatingObjectRelativePosition.asInstanceOf[js.Any], changeFloatingObjectRotation = changeFloatingObjectRotation.asInstanceOf[js.Any], changeFloatingObjectTextWrapping = changeFloatingObjectTextWrapping.asInstanceOf[js.Any], changeFontBackColor = changeFontBackColor.asInstanceOf[js.Any], changeFontBold = changeFontBold.asInstanceOf[js.Any], changeFontForeColor = changeFontForeColor.asInstanceOf[js.Any], changeFontFormatting = changeFontFormatting.asInstanceOf[js.Any], changeFontItalic = changeFontItalic.asInstanceOf[js.Any], changeFontName = changeFontName.asInstanceOf[js.Any], changeFontSize = changeFontSize.asInstanceOf[js.Any], changeFontStrikeout = changeFontStrikeout.asInstanceOf[js.Any], changeFontSubscript = changeFontSubscript.asInstanceOf[js.Any], changeFontSuperscript = changeFontSuperscript.asInstanceOf[js.Any], changeFontUnderline = changeFontUnderline.asInstanceOf[js.Any], changeHyperlink = changeHyperlink.asInstanceOf[js.Any], changePageColor = changePageColor.asInstanceOf[js.Any], changePageMargins = changePageMargins.asInstanceOf[js.Any], changePageOrientation = changePageOrientation.asInstanceOf[js.Any], changePageSize = changePageSize.asInstanceOf[js.Any], changeParagraphBackColor = changeParagraphBackColor.asInstanceOf[js.Any], changeParagraphFormatting = changeParagraphFormatting.asInstanceOf[js.Any], changePictureScale = changePictureScale.asInstanceOf[js.Any], changeSectionColumns = changeSectionColumns.asInstanceOf[js.Any], changeSectionEqualColumnCount = changeSectionEqualColumnCount.asInstanceOf[js.Any], changeStyle = changeStyle.asInstanceOf[js.Any], changeTableBorderRepositoryItem = changeTableBorderRepositoryItem.asInstanceOf[js.Any], changeTableBordersAndShading = changeTableBordersAndShading.asInstanceOf[js.Any], changeTableCellFormatting = changeTableCellFormatting.asInstanceOf[js.Any], changeTableCellPreferredWidth = changeTableCellPreferredWidth.asInstanceOf[js.Any], changeTableCellShading = changeTableCellShading.asInstanceOf[js.Any], changeTableColumnPreferredWidth = changeTableColumnPreferredWidth.asInstanceOf[js.Any], changeTableFormatting = changeTableFormatting.asInstanceOf[js.Any], changeTableLook = changeTableLook.asInstanceOf[js.Any], changeTableRowPreferredHeight = changeTableRowPreferredHeight.asInstanceOf[js.Any], changeTableStyle = changeTableStyle.asInstanceOf[js.Any], changeTabs = changeTabs.asInstanceOf[js.Any], changeTextBoxContentMargins = changeTextBoxContentMargins.asInstanceOf[js.Any], changeTextBoxRelativeSize = changeTextBoxRelativeSize.asInstanceOf[js.Any], changeTextBoxResizeShapeToFitText = changeTextBoxResizeShapeToFitText.asInstanceOf[js.Any], changeViewType = changeViewType.asInstanceOf[js.Any], clearFormatting = clearFormatting.asInstanceOf[js.Any], closeHeaderFooter = closeHeaderFooter.asInstanceOf[js.Any], continueNumberingList = continueNumberingList.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], copyContent = copyContent.asInstanceOf[js.Any], createDateField = createDateField.asInstanceOf[js.Any], createField = createField.asInstanceOf[js.Any], createMergeField = createMergeField.asInstanceOf[js.Any], createPageCountField = createPageCountField.asInstanceOf[js.Any], createPageField = createPageField.asInstanceOf[js.Any], createTimeField = createTimeField.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], decreaseFontSize = decreaseFontSize.asInstanceOf[js.Any], decreaseIndent = decreaseIndent.asInstanceOf[js.Any], decrementNumberingIndent = decrementNumberingIndent.asInstanceOf[js.Any], decrementParagraphLeftIndent = decrementParagraphLeftIndent.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteBookmark = deleteBookmark.asInstanceOf[js.Any], deleteHyperlink = deleteHyperlink.asInstanceOf[js.Any], deleteHyperlinks = deleteHyperlinks.asInstanceOf[js.Any], deleteTable = deleteTable.asInstanceOf[js.Any], deleteTableCellsDialog = deleteTableCellsDialog.asInstanceOf[js.Any], deleteTableCellsWithShiftHorizontally = deleteTableCellsWithShiftHorizontally.asInstanceOf[js.Any], deleteTableCellsWithShiftVertically = deleteTableCellsWithShiftVertically.asInstanceOf[js.Any], deleteTableColumns = deleteTableColumns.asInstanceOf[js.Any], deleteTableRows = deleteTableRows.asInstanceOf[js.Any], endUpdate = js.Any.fromFunction0(endUpdate), fileDownload = fileDownload.asInstanceOf[js.Any], fileNew = fileNew.asInstanceOf[js.Any], fileOpen = fileOpen.asInstanceOf[js.Any], fileOpenDialog = fileOpenDialog.asInstanceOf[js.Any], filePrint = filePrint.asInstanceOf[js.Any], fileSave = fileSave.asInstanceOf[js.Any], fileSaveAs = fileSaveAs.asInstanceOf[js.Any], fileSaveAsDialog = fileSaveAsDialog.asInstanceOf[js.Any], findAll = findAll.asInstanceOf[js.Any], forceSyncWithServer = forceSyncWithServer.asInstanceOf[js.Any], getRtf = getRtf.asInstanceOf[js.Any], goToBookmark = goToBookmark.asInstanceOf[js.Any], goToDataRecord = goToDataRecord.asInstanceOf[js.Any], goToFirstDataRecord = goToFirstDataRecord.asInstanceOf[js.Any], goToFooter = goToFooter.asInstanceOf[js.Any], goToHeader = goToHeader.asInstanceOf[js.Any], goToLastDataRecord = goToLastDataRecord.asInstanceOf[js.Any], goToNextDataRecord = goToNextDataRecord.asInstanceOf[js.Any], goToNextHeaderFooter = goToNextHeaderFooter.asInstanceOf[js.Any], goToPreviousDataRecord = goToPreviousDataRecord.asInstanceOf[js.Any], goToPreviousHeaderFooter = goToPreviousHeaderFooter.asInstanceOf[js.Any], hideFindResults = hideFindResults.asInstanceOf[js.Any], increaseFontSize = increaseFontSize.asInstanceOf[js.Any], increaseIndent = increaseIndent.asInstanceOf[js.Any], incrementNumberingIndent = incrementNumberingIndent.asInstanceOf[js.Any], incrementParagraphLeftIndent = incrementParagraphLeftIndent.asInstanceOf[js.Any], insertBookmark = insertBookmark.asInstanceOf[js.Any], insertColumnBreak = insertColumnBreak.asInstanceOf[js.Any], insertContentFromServer = insertContentFromServer.asInstanceOf[js.Any], insertEquationsCaption = insertEquationsCaption.asInstanceOf[js.Any], insertFiguresCaption = insertFiguresCaption.asInstanceOf[js.Any], insertFloatingTextBox = insertFloatingTextBox.asInstanceOf[js.Any], insertFooter = insertFooter.asInstanceOf[js.Any], insertHeader = insertHeader.asInstanceOf[js.Any], insertHtml = insertHtml.asInstanceOf[js.Any], insertHyperlink = insertHyperlink.asInstanceOf[js.Any], insertLineBreak = insertLineBreak.asInstanceOf[js.Any], insertNonBreakingSpace = insertNonBreakingSpace.asInstanceOf[js.Any], insertNumeration = insertNumeration.asInstanceOf[js.Any], insertPageBreak = insertPageBreak.asInstanceOf[js.Any], insertParagraph = insertParagraph.asInstanceOf[js.Any], insertPicture = insertPicture.asInstanceOf[js.Any], insertRtf = insertRtf.asInstanceOf[js.Any], insertSectionBreakEvenPage = insertSectionBreakEvenPage.asInstanceOf[js.Any], insertSectionBreakNextPage = insertSectionBreakNextPage.asInstanceOf[js.Any], insertSectionBreakOddPage = insertSectionBreakOddPage.asInstanceOf[js.Any], insertSymbol = insertSymbol.asInstanceOf[js.Any], insertTab = insertTab.asInstanceOf[js.Any], insertTable = insertTable.asInstanceOf[js.Any], insertTableCellWithShiftToTheLeft = insertTableCellWithShiftToTheLeft.asInstanceOf[js.Any], insertTableCellsDialog = insertTableCellsDialog.asInstanceOf[js.Any], insertTableCellsWithShiftToTheVertically = insertTableCellsWithShiftToTheVertically.asInstanceOf[js.Any], insertTableColumnToTheLeft = insertTableColumnToTheLeft.asInstanceOf[js.Any], insertTableColumnToTheRight = insertTableColumnToTheRight.asInstanceOf[js.Any], insertTableOfContents = insertTableOfContents.asInstanceOf[js.Any], insertTableOfEquations = insertTableOfEquations.asInstanceOf[js.Any], insertTableOfFigures = insertTableOfFigures.asInstanceOf[js.Any], insertTableOfTables = insertTableOfTables.asInstanceOf[js.Any], insertTableRowAbove = insertTableRowAbove.asInstanceOf[js.Any], insertTableRowBelow = insertTableRowBelow.asInstanceOf[js.Any], insertTablesCaption = insertTablesCaption.asInstanceOf[js.Any], insertText = insertText.asInstanceOf[js.Any], linkHeaderFooterToPrevious = linkHeaderFooterToPrevious.asInstanceOf[js.Any], mailMergeAndDownload = mailMergeAndDownload.asInstanceOf[js.Any], mailMergeAndSaveAs = mailMergeAndSaveAs.asInstanceOf[js.Any], mailMergeDialog = mailMergeDialog.asInstanceOf[js.Any], makeTextLowerCase = makeTextLowerCase.asInstanceOf[js.Any], makeTextSentenceCase = makeTextSentenceCase.asInstanceOf[js.Any], makeTextUpperCase = makeTextUpperCase.asInstanceOf[js.Any], mergeFieldDialog = mergeFieldDialog.asInstanceOf[js.Any], mergeTableCells = mergeTableCells.asInstanceOf[js.Any], moveContent = moveContent.asInstanceOf[js.Any], openCustomNumberingListDialog = openCustomNumberingListDialog.asInstanceOf[js.Any], openFindAndReplaceDialog = openFindAndReplaceDialog.asInstanceOf[js.Any], openFindPanel = openFindPanel.asInstanceOf[js.Any], openFontFormattingDialog = openFontFormattingDialog.asInstanceOf[js.Any], openHyperlink = openHyperlink.asInstanceOf[js.Any], openInsertBookmarkDialog = openInsertBookmarkDialog.asInstanceOf[js.Any], openInsertHyperlinkDialog = openInsertHyperlinkDialog.asInstanceOf[js.Any], openInsertPictureDialog = openInsertPictureDialog.asInstanceOf[js.Any], openInsertSymbolDialog = openInsertSymbolDialog.asInstanceOf[js.Any], openInsertTableDialog = openInsertTableDialog.asInstanceOf[js.Any], openLayoutOptionsDialog = openLayoutOptionsDialog.asInstanceOf[js.Any], openNumberingListDialog = openNumberingListDialog.asInstanceOf[js.Any], openPageMarginsDialog = openPageMarginsDialog.asInstanceOf[js.Any], openPagePaperSizeDialog = openPagePaperSizeDialog.asInstanceOf[js.Any], openParagraphFormattingDialog = openParagraphFormattingDialog.asInstanceOf[js.Any], openSectionColumnsDialog = openSectionColumnsDialog.asInstanceOf[js.Any], openSpellingDialog = openSpellingDialog.asInstanceOf[js.Any], openTableBordersAndShadingDialog = openTableBordersAndShadingDialog.asInstanceOf[js.Any], openTableFormattingDialog = openTableFormattingDialog.asInstanceOf[js.Any], openTabsDialog = openTabsDialog.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], redo = redo.asInstanceOf[js.Any], removeNextWord = removeNextWord.asInstanceOf[js.Any], removeNumeration = removeNumeration.asInstanceOf[js.Any], removePrevWord = removePrevWord.asInstanceOf[js.Any], removeSpacingAfterParagraph = removeSpacingAfterParagraph.asInstanceOf[js.Any], removeSpacingBeforeParagraph = removeSpacingBeforeParagraph.asInstanceOf[js.Any], removeTableCellBorders = removeTableCellBorders.asInstanceOf[js.Any], replaceAll = replaceAll.asInstanceOf[js.Any], replaceNext = replaceNext.asInstanceOf[js.Any], restartNumberingList = restartNumberingList.asInstanceOf[js.Any], setDifferentFirstPageHeaderFooter = setDifferentFirstPageHeaderFooter.asInstanceOf[js.Any], setDifferentOddAndEvenPagesHeaderFooter = setDifferentOddAndEvenPagesHeaderFooter.asInstanceOf[js.Any], setDoubleParagraphSpacing = setDoubleParagraphSpacing.asInstanceOf[js.Any], setFullscreen = setFullscreen.asInstanceOf[js.Any], setPageSizeDialog = setPageSizeDialog.asInstanceOf[js.Any], setParagraphLevel = setParagraphLevel.asInstanceOf[js.Any], setSesquialteralParagraphSpacing = setSesquialteralParagraphSpacing.asInstanceOf[js.Any], setSingleParagraphSpacing = setSingleParagraphSpacing.asInstanceOf[js.Any], showAllFieldCodes = showAllFieldCodes.asInstanceOf[js.Any], showFieldCodes = showFieldCodes.asInstanceOf[js.Any], showHiddenSymbols = showHiddenSymbols.asInstanceOf[js.Any], showHorizontalRuler = showHorizontalRuler.asInstanceOf[js.Any], showMergedData = showMergedData.asInstanceOf[js.Any], showTableGridLines = showTableGridLines.asInstanceOf[js.Any], splitTableCells = splitTableCells.asInstanceOf[js.Any], splitTableCellsDialog = splitTableCellsDialog.asInstanceOf[js.Any], switchTextCase = switchTextCase.asInstanceOf[js.Any], toggleBulletedList = toggleBulletedList.asInstanceOf[js.Any], toggleMultilevelList = toggleMultilevelList.asInstanceOf[js.Any], toggleNumberingList = toggleNumberingList.asInstanceOf[js.Any], toggleParagraphAlignmentCenter = toggleParagraphAlignmentCenter.asInstanceOf[js.Any], toggleParagraphAlignmentJustify = toggleParagraphAlignmentJustify.asInstanceOf[js.Any], toggleParagraphAlignmentLeft = toggleParagraphAlignmentLeft.asInstanceOf[js.Any], toggleParagraphAlignmentRight = toggleParagraphAlignmentRight.asInstanceOf[js.Any], toggleTableAutoFitContents = toggleTableAutoFitContents.asInstanceOf[js.Any], toggleTableAutoFitWindow = toggleTableAutoFitWindow.asInstanceOf[js.Any], toggleTableCellAlignBottomCenter = toggleTableCellAlignBottomCenter.asInstanceOf[js.Any], toggleTableCellAlignBottomLeft = toggleTableCellAlignBottomLeft.asInstanceOf[js.Any], toggleTableCellAlignBottomRight = toggleTableCellAlignBottomRight.asInstanceOf[js.Any], toggleTableCellAlignMiddleCenter = toggleTableCellAlignMiddleCenter.asInstanceOf[js.Any], toggleTableCellAlignMiddleLeft = toggleTableCellAlignMiddleLeft.asInstanceOf[js.Any], toggleTableCellAlignMiddleRight = toggleTableCellAlignMiddleRight.asInstanceOf[js.Any], toggleTableCellAlignTopCenter = toggleTableCellAlignTopCenter.asInstanceOf[js.Any], toggleTableCellAlignTopLeft = toggleTableCellAlignTopLeft.asInstanceOf[js.Any], toggleTableCellAlignTopRight = toggleTableCellAlignTopRight.asInstanceOf[js.Any], toggleTableCellAllBorders = toggleTableCellAllBorders.asInstanceOf[js.Any], toggleTableCellBottomBorder = toggleTableCellBottomBorder.asInstanceOf[js.Any], toggleTableCellInsideBorders = toggleTableCellInsideBorders.asInstanceOf[js.Any], toggleTableCellInsideHorizontalBorders = toggleTableCellInsideHorizontalBorders.asInstanceOf[js.Any], toggleTableCellInsideVerticalBorders = toggleTableCellInsideVerticalBorders.asInstanceOf[js.Any], toggleTableCellLeftBorder = toggleTableCellLeftBorder.asInstanceOf[js.Any], toggleTableCellOutsideBorders = toggleTableCellOutsideBorders.asInstanceOf[js.Any], toggleTableCellRightBorder = toggleTableCellRightBorder.asInstanceOf[js.Any], toggleTableCellTopBorder = toggleTableCellTopBorder.asInstanceOf[js.Any], toggleTableFixedColumnWidth = toggleTableFixedColumnWidth.asInstanceOf[js.Any], toggleTextCase = toggleTextCase.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any], updateAllFields = updateAllFields.asInstanceOf[js.Any], updateField = updateField.asInstanceOf[js.Any], updateTableOfContents = updateTableOfContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditCommands]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichEditCommands] (val x: Self) extends AnyVal {
    
    inline def setAddSpacingAfterParagraph(value: AddSpacingAfterParagraphCommand): Self = StObject.set(x, "addSpacingAfterParagraph", value.asInstanceOf[js.Any])
    
    inline def setAddSpacingBeforeParagraph(value: AddSpacingBeforeParagraphCommand): Self = StObject.set(x, "addSpacingBeforeParagraph", value.asInstanceOf[js.Any])
    
    inline def setAssignShortcut(value: AssignShortcutCommand): Self = StObject.set(x, "assignShortcut", value.asInstanceOf[js.Any])
    
    inline def setBackspace(value: BackspaceCommand): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
    
    inline def setBeginUpdate(value: () => Unit): Self = StObject.set(x, "beginUpdate", js.Any.fromFunction0(value))
    
    inline def setCapitalizeEachWordTextCase(value: CapitalizeEachWordTextCaseCommand): Self = StObject.set(x, "capitalizeEachWordTextCase", value.asInstanceOf[js.Any])
    
    inline def setChangeCustomNumberingList(value: ChangeCustomNumberingListCommand): Self = StObject.set(x, "changeCustomNumberingList", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectAbsolutePosition(value: ChangeFloatingObjectAbsolutePositionCommand): Self = StObject.set(x, "changeFloatingObjectAbsolutePosition", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectAbsoluteSize(value: ChangeFloatingObjectAbsoluteSizeCommand): Self = StObject.set(x, "changeFloatingObjectAbsoluteSize", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectAlignmentPosition(value: ChangeFloatingObjectAlignmentPositionCommand): Self = StObject.set(x, "changeFloatingObjectAlignmentPosition", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectFillColor(value: ChangeFloatingObjectFillColorCommand): Self = StObject.set(x, "changeFloatingObjectFillColor", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectLockAnchor(value: ChangeFloatingObjectLockAnchorCommand): Self = StObject.set(x, "changeFloatingObjectLockAnchor", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectLockAspectRatio(value: ChangeFloatingObjectLockAspectRatioCommand): Self = StObject.set(x, "changeFloatingObjectLockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectOutlineColor(value: ChangeFloatingObjectOutlineColorCommand): Self = StObject.set(x, "changeFloatingObjectOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectOutlineWidth(value: ChangeFloatingObjectOutlineWidthCommand): Self = StObject.set(x, "changeFloatingObjectOutlineWidth", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectRelativePosition(value: ChangeFloatingObjectRelativePositionCommand): Self = StObject.set(x, "changeFloatingObjectRelativePosition", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectRotation(value: ChangeFloatingObjectRotationCommand): Self = StObject.set(x, "changeFloatingObjectRotation", value.asInstanceOf[js.Any])
    
    inline def setChangeFloatingObjectTextWrapping(value: ChangeFloatingObjectTextWrappingCommand): Self = StObject.set(x, "changeFloatingObjectTextWrapping", value.asInstanceOf[js.Any])
    
    inline def setChangeFontBackColor(value: ChangeFontBackColorCommand): Self = StObject.set(x, "changeFontBackColor", value.asInstanceOf[js.Any])
    
    inline def setChangeFontBold(value: ChangeFontBoldCommand): Self = StObject.set(x, "changeFontBold", value.asInstanceOf[js.Any])
    
    inline def setChangeFontForeColor(value: ChangeFontForeColorCommand): Self = StObject.set(x, "changeFontForeColor", value.asInstanceOf[js.Any])
    
    inline def setChangeFontFormatting(value: ChangeFontFormattingCommand): Self = StObject.set(x, "changeFontFormatting", value.asInstanceOf[js.Any])
    
    inline def setChangeFontItalic(value: ChangeFontItalicCommand): Self = StObject.set(x, "changeFontItalic", value.asInstanceOf[js.Any])
    
    inline def setChangeFontName(value: ChangeFontNameCommand): Self = StObject.set(x, "changeFontName", value.asInstanceOf[js.Any])
    
    inline def setChangeFontSize(value: ChangeFontSizeCommand): Self = StObject.set(x, "changeFontSize", value.asInstanceOf[js.Any])
    
    inline def setChangeFontStrikeout(value: ChangeFontStrikeoutCommand): Self = StObject.set(x, "changeFontStrikeout", value.asInstanceOf[js.Any])
    
    inline def setChangeFontSubscript(value: ChangeFontSubscriptCommand): Self = StObject.set(x, "changeFontSubscript", value.asInstanceOf[js.Any])
    
    inline def setChangeFontSuperscript(value: ChangeFontSuperscriptCommand): Self = StObject.set(x, "changeFontSuperscript", value.asInstanceOf[js.Any])
    
    inline def setChangeFontUnderline(value: ChangeFontUnderlineCommand): Self = StObject.set(x, "changeFontUnderline", value.asInstanceOf[js.Any])
    
    inline def setChangeHyperlink(value: ChangeHyperlinkCommand): Self = StObject.set(x, "changeHyperlink", value.asInstanceOf[js.Any])
    
    inline def setChangePageColor(value: ChangePageColorCommand): Self = StObject.set(x, "changePageColor", value.asInstanceOf[js.Any])
    
    inline def setChangePageMargins(value: ChangePageMarginsCommand): Self = StObject.set(x, "changePageMargins", value.asInstanceOf[js.Any])
    
    inline def setChangePageOrientation(value: ChangePageOrientationCommand): Self = StObject.set(x, "changePageOrientation", value.asInstanceOf[js.Any])
    
    inline def setChangePageSize(value: ChangePageSizeCommand): Self = StObject.set(x, "changePageSize", value.asInstanceOf[js.Any])
    
    inline def setChangeParagraphBackColor(value: ChangeParagraphBackColorCommand): Self = StObject.set(x, "changeParagraphBackColor", value.asInstanceOf[js.Any])
    
    inline def setChangeParagraphFormatting(value: ChangeParagraphFormattingCommand): Self = StObject.set(x, "changeParagraphFormatting", value.asInstanceOf[js.Any])
    
    inline def setChangePictureScale(value: ChangePictureScaleCommand): Self = StObject.set(x, "changePictureScale", value.asInstanceOf[js.Any])
    
    inline def setChangeSectionColumns(value: ChangeSectionColumnsCommand): Self = StObject.set(x, "changeSectionColumns", value.asInstanceOf[js.Any])
    
    inline def setChangeSectionEqualColumnCount(value: ChangeSectionEqualColumnCountCommand): Self = StObject.set(x, "changeSectionEqualColumnCount", value.asInstanceOf[js.Any])
    
    inline def setChangeStyle(value: ChangeStyleCommand): Self = StObject.set(x, "changeStyle", value.asInstanceOf[js.Any])
    
    inline def setChangeTableBorderRepositoryItem(value: ChangeTableBorderRepositoryItemCommand): Self = StObject.set(x, "changeTableBorderRepositoryItem", value.asInstanceOf[js.Any])
    
    inline def setChangeTableBordersAndShading(value: ChangeTableBordersAndShadingCommand): Self = StObject.set(x, "changeTableBordersAndShading", value.asInstanceOf[js.Any])
    
    inline def setChangeTableCellFormatting(value: ChangeTableCellFormattingCommand): Self = StObject.set(x, "changeTableCellFormatting", value.asInstanceOf[js.Any])
    
    inline def setChangeTableCellPreferredWidth(value: ChangeTableCellPreferredWidthCommand): Self = StObject.set(x, "changeTableCellPreferredWidth", value.asInstanceOf[js.Any])
    
    inline def setChangeTableCellShading(value: ChangeTableCellShadingCommand): Self = StObject.set(x, "changeTableCellShading", value.asInstanceOf[js.Any])
    
    inline def setChangeTableColumnPreferredWidth(value: ChangeTableColumnPreferredWidthCommand): Self = StObject.set(x, "changeTableColumnPreferredWidth", value.asInstanceOf[js.Any])
    
    inline def setChangeTableFormatting(value: ChangeTableFormattingCommand): Self = StObject.set(x, "changeTableFormatting", value.asInstanceOf[js.Any])
    
    inline def setChangeTableLook(value: ChangeTableLookCommand): Self = StObject.set(x, "changeTableLook", value.asInstanceOf[js.Any])
    
    inline def setChangeTableRowPreferredHeight(value: ChangeTableRowPreferredHeightCommand): Self = StObject.set(x, "changeTableRowPreferredHeight", value.asInstanceOf[js.Any])
    
    inline def setChangeTableStyle(value: ChangeTableStyleCommand): Self = StObject.set(x, "changeTableStyle", value.asInstanceOf[js.Any])
    
    inline def setChangeTabs(value: ChangeTabsCommand): Self = StObject.set(x, "changeTabs", value.asInstanceOf[js.Any])
    
    inline def setChangeTextBoxContentMargins(value: ChangeTextBoxContentMarginsCommand): Self = StObject.set(x, "changeTextBoxContentMargins", value.asInstanceOf[js.Any])
    
    inline def setChangeTextBoxRelativeSize(value: ChangeTextBoxRelativeSizeCommand): Self = StObject.set(x, "changeTextBoxRelativeSize", value.asInstanceOf[js.Any])
    
    inline def setChangeTextBoxResizeShapeToFitText(value: ChangeTextBoxResizeShapeToFitTextCommand): Self = StObject.set(x, "changeTextBoxResizeShapeToFitText", value.asInstanceOf[js.Any])
    
    inline def setChangeViewType(value: ChangeViewTypeCommand): Self = StObject.set(x, "changeViewType", value.asInstanceOf[js.Any])
    
    inline def setClearFormatting(value: ClearFormattingCommand): Self = StObject.set(x, "clearFormatting", value.asInstanceOf[js.Any])
    
    inline def setCloseHeaderFooter(value: CloseHeaderFooterCommand): Self = StObject.set(x, "closeHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setContinueNumberingList(value: ContinueNumberingListCommand): Self = StObject.set(x, "continueNumberingList", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: CopyCommand): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyContent(value: CopyContentCommand): Self = StObject.set(x, "copyContent", value.asInstanceOf[js.Any])
    
    inline def setCreateDateField(value: CreateDateFieldCommand): Self = StObject.set(x, "createDateField", value.asInstanceOf[js.Any])
    
    inline def setCreateField(value: CreateFieldCommand): Self = StObject.set(x, "createField", value.asInstanceOf[js.Any])
    
    inline def setCreateMergeField(value: CreateMergeFieldCommand): Self = StObject.set(x, "createMergeField", value.asInstanceOf[js.Any])
    
    inline def setCreatePageCountField(value: CreatePageCountFieldCommand): Self = StObject.set(x, "createPageCountField", value.asInstanceOf[js.Any])
    
    inline def setCreatePageField(value: CreatePageFieldCommand): Self = StObject.set(x, "createPageField", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeField(value: CreateTimeFieldCommand): Self = StObject.set(x, "createTimeField", value.asInstanceOf[js.Any])
    
    inline def setCut(value: CutCommand): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    
    inline def setDecreaseFontSize(value: DecreaseFontSizeCommand): Self = StObject.set(x, "decreaseFontSize", value.asInstanceOf[js.Any])
    
    inline def setDecreaseIndent(value: DecreaseIndentCommand): Self = StObject.set(x, "decreaseIndent", value.asInstanceOf[js.Any])
    
    inline def setDecrementNumberingIndent(value: DecrementNumberingIndentCommand): Self = StObject.set(x, "decrementNumberingIndent", value.asInstanceOf[js.Any])
    
    inline def setDecrementParagraphLeftIndent(value: DecrementParagraphLeftIndentCommand): Self = StObject.set(x, "decrementParagraphLeftIndent", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: DeleteCommand): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteBookmark(value: DeleteBookmarkCommand): Self = StObject.set(x, "deleteBookmark", value.asInstanceOf[js.Any])
    
    inline def setDeleteHyperlink(value: DeleteHyperlinkCommand): Self = StObject.set(x, "deleteHyperlink", value.asInstanceOf[js.Any])
    
    inline def setDeleteHyperlinks(value: DeleteHyperlinksCommand): Self = StObject.set(x, "deleteHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setDeleteTable(value: DeleteTableCommand): Self = StObject.set(x, "deleteTable", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableCellsDialog(value: DeleteTableCellsDialogCommand): Self = StObject.set(x, "deleteTableCellsDialog", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableCellsWithShiftHorizontally(value: DeleteTableCellsWithShiftHorizontallyCommand): Self = StObject.set(x, "deleteTableCellsWithShiftHorizontally", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableCellsWithShiftVertically(value: DeleteTableCellsWithShiftVerticallyCommand): Self = StObject.set(x, "deleteTableCellsWithShiftVertically", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableColumns(value: DeleteTableColumnsCommand): Self = StObject.set(x, "deleteTableColumns", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableRows(value: DeleteTableRowsCommand): Self = StObject.set(x, "deleteTableRows", value.asInstanceOf[js.Any])
    
    inline def setEndUpdate(value: () => Unit): Self = StObject.set(x, "endUpdate", js.Any.fromFunction0(value))
    
    inline def setFileDownload(value: FileDownloadCommand): Self = StObject.set(x, "fileDownload", value.asInstanceOf[js.Any])
    
    inline def setFileNew(value: FileNewCommand): Self = StObject.set(x, "fileNew", value.asInstanceOf[js.Any])
    
    inline def setFileOpen(value: FileOpenCommand): Self = StObject.set(x, "fileOpen", value.asInstanceOf[js.Any])
    
    inline def setFileOpenDialog(value: FileOpenDialogCommand): Self = StObject.set(x, "fileOpenDialog", value.asInstanceOf[js.Any])
    
    inline def setFilePrint(value: FilePrintCommand): Self = StObject.set(x, "filePrint", value.asInstanceOf[js.Any])
    
    inline def setFileSave(value: FileSaveCommand): Self = StObject.set(x, "fileSave", value.asInstanceOf[js.Any])
    
    inline def setFileSaveAs(value: FileSaveAsCommand): Self = StObject.set(x, "fileSaveAs", value.asInstanceOf[js.Any])
    
    inline def setFileSaveAsDialog(value: FileSaveAsDialogCommand): Self = StObject.set(x, "fileSaveAsDialog", value.asInstanceOf[js.Any])
    
    inline def setFindAll(value: FindAllCommand): Self = StObject.set(x, "findAll", value.asInstanceOf[js.Any])
    
    inline def setForceSyncWithServer(value: ForceSyncWithServerCommand): Self = StObject.set(x, "forceSyncWithServer", value.asInstanceOf[js.Any])
    
    inline def setGetRtf(value: GetRtfCommand): Self = StObject.set(x, "getRtf", value.asInstanceOf[js.Any])
    
    inline def setGoToBookmark(value: GoToBookmarkCommand): Self = StObject.set(x, "goToBookmark", value.asInstanceOf[js.Any])
    
    inline def setGoToDataRecord(value: GoToDataRecordCommand): Self = StObject.set(x, "goToDataRecord", value.asInstanceOf[js.Any])
    
    inline def setGoToFirstDataRecord(value: GoToFirstDataRecordCommand): Self = StObject.set(x, "goToFirstDataRecord", value.asInstanceOf[js.Any])
    
    inline def setGoToFooter(value: GoToFooterCommand): Self = StObject.set(x, "goToFooter", value.asInstanceOf[js.Any])
    
    inline def setGoToHeader(value: GoToHeaderCommand): Self = StObject.set(x, "goToHeader", value.asInstanceOf[js.Any])
    
    inline def setGoToLastDataRecord(value: GoToLastDataRecordCommand): Self = StObject.set(x, "goToLastDataRecord", value.asInstanceOf[js.Any])
    
    inline def setGoToNextDataRecord(value: GoToNextDataRecordCommand): Self = StObject.set(x, "goToNextDataRecord", value.asInstanceOf[js.Any])
    
    inline def setGoToNextHeaderFooter(value: GoToNextHeaderFooterCommand): Self = StObject.set(x, "goToNextHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setGoToPreviousDataRecord(value: GoToPreviousDataRecordCommand): Self = StObject.set(x, "goToPreviousDataRecord", value.asInstanceOf[js.Any])
    
    inline def setGoToPreviousHeaderFooter(value: GoToPreviousHeaderFooterCommand): Self = StObject.set(x, "goToPreviousHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setHideFindResults(value: HideFindResultsCommand): Self = StObject.set(x, "hideFindResults", value.asInstanceOf[js.Any])
    
    inline def setIncreaseFontSize(value: IncreaseFontSizeCommand): Self = StObject.set(x, "increaseFontSize", value.asInstanceOf[js.Any])
    
    inline def setIncreaseIndent(value: IncreaseIndentCommand): Self = StObject.set(x, "increaseIndent", value.asInstanceOf[js.Any])
    
    inline def setIncrementNumberingIndent(value: IncrementNumberingIndentCommand): Self = StObject.set(x, "incrementNumberingIndent", value.asInstanceOf[js.Any])
    
    inline def setIncrementParagraphLeftIndent(value: IncrementParagraphLeftIndentCommand): Self = StObject.set(x, "incrementParagraphLeftIndent", value.asInstanceOf[js.Any])
    
    inline def setInsertBookmark(value: InsertBookmarkCommand): Self = StObject.set(x, "insertBookmark", value.asInstanceOf[js.Any])
    
    inline def setInsertColumnBreak(value: InsertColumnBreakCommand): Self = StObject.set(x, "insertColumnBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertContentFromServer(value: InsertContentFromServerCommand): Self = StObject.set(x, "insertContentFromServer", value.asInstanceOf[js.Any])
    
    inline def setInsertEquationsCaption(value: InsertEquationsCaptionCommand): Self = StObject.set(x, "insertEquationsCaption", value.asInstanceOf[js.Any])
    
    inline def setInsertFiguresCaption(value: InsertFiguresCaptionCommand): Self = StObject.set(x, "insertFiguresCaption", value.asInstanceOf[js.Any])
    
    inline def setInsertFloatingTextBox(value: InsertFloatingTextBoxCommand): Self = StObject.set(x, "insertFloatingTextBox", value.asInstanceOf[js.Any])
    
    inline def setInsertFooter(value: InsertFooterCommand): Self = StObject.set(x, "insertFooter", value.asInstanceOf[js.Any])
    
    inline def setInsertHeader(value: InsertHeaderCommand): Self = StObject.set(x, "insertHeader", value.asInstanceOf[js.Any])
    
    inline def setInsertHtml(value: InsertHtmlCommand): Self = StObject.set(x, "insertHtml", value.asInstanceOf[js.Any])
    
    inline def setInsertHyperlink(value: InsertHyperlinkCommand): Self = StObject.set(x, "insertHyperlink", value.asInstanceOf[js.Any])
    
    inline def setInsertLineBreak(value: InsertLineBreakCommand): Self = StObject.set(x, "insertLineBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertNonBreakingSpace(value: InsertNonBreakingSpaceCommand): Self = StObject.set(x, "insertNonBreakingSpace", value.asInstanceOf[js.Any])
    
    inline def setInsertNumeration(value: InsertNumerationCommand): Self = StObject.set(x, "insertNumeration", value.asInstanceOf[js.Any])
    
    inline def setInsertPageBreak(value: InsertPageBreakCommand): Self = StObject.set(x, "insertPageBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertParagraph(value: InsertParagraphCommand): Self = StObject.set(x, "insertParagraph", value.asInstanceOf[js.Any])
    
    inline def setInsertPicture(value: InsertPictureCommand): Self = StObject.set(x, "insertPicture", value.asInstanceOf[js.Any])
    
    inline def setInsertRtf(value: InsertRtfCommand): Self = StObject.set(x, "insertRtf", value.asInstanceOf[js.Any])
    
    inline def setInsertSectionBreakEvenPage(value: InsertSectionBreakEvenPageCommand): Self = StObject.set(x, "insertSectionBreakEvenPage", value.asInstanceOf[js.Any])
    
    inline def setInsertSectionBreakNextPage(value: InsertSectionBreakNextPageCommand): Self = StObject.set(x, "insertSectionBreakNextPage", value.asInstanceOf[js.Any])
    
    inline def setInsertSectionBreakOddPage(value: InsertSectionBreakOddPageCommand): Self = StObject.set(x, "insertSectionBreakOddPage", value.asInstanceOf[js.Any])
    
    inline def setInsertSymbol(value: InsertSymbolCommand): Self = StObject.set(x, "insertSymbol", value.asInstanceOf[js.Any])
    
    inline def setInsertTab(value: InsertTabCommand): Self = StObject.set(x, "insertTab", value.asInstanceOf[js.Any])
    
    inline def setInsertTable(value: InsertTableCommand): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
    
    inline def setInsertTableCellWithShiftToTheLeft(value: InsertTableCellWithShiftToTheLeftCommand): Self = StObject.set(x, "insertTableCellWithShiftToTheLeft", value.asInstanceOf[js.Any])
    
    inline def setInsertTableCellsDialog(value: InsertTableCellsDialogCommand): Self = StObject.set(x, "insertTableCellsDialog", value.asInstanceOf[js.Any])
    
    inline def setInsertTableCellsWithShiftToTheVertically(value: InsertTableCellsWithShiftToTheVerticallyCommand): Self = StObject.set(x, "insertTableCellsWithShiftToTheVertically", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumnToTheLeft(value: InsertTableColumnToTheLeftCommand): Self = StObject.set(x, "insertTableColumnToTheLeft", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumnToTheRight(value: InsertTableColumnToTheRightCommand): Self = StObject.set(x, "insertTableColumnToTheRight", value.asInstanceOf[js.Any])
    
    inline def setInsertTableOfContents(value: InsertTableOfContentsCommand): Self = StObject.set(x, "insertTableOfContents", value.asInstanceOf[js.Any])
    
    inline def setInsertTableOfEquations(value: InsertTableOfEquationsCommand): Self = StObject.set(x, "insertTableOfEquations", value.asInstanceOf[js.Any])
    
    inline def setInsertTableOfFigures(value: InsertTableOfFiguresCommand): Self = StObject.set(x, "insertTableOfFigures", value.asInstanceOf[js.Any])
    
    inline def setInsertTableOfTables(value: InsertTableOfTablesCommand): Self = StObject.set(x, "insertTableOfTables", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowAbove(value: InsertTableRowAboveCommand): Self = StObject.set(x, "insertTableRowAbove", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowBelow(value: InsertTableRowBelowCommand): Self = StObject.set(x, "insertTableRowBelow", value.asInstanceOf[js.Any])
    
    inline def setInsertTablesCaption(value: InsertTablesCaptionCommand): Self = StObject.set(x, "insertTablesCaption", value.asInstanceOf[js.Any])
    
    inline def setInsertText(value: InsertTextCommand): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setLinkHeaderFooterToPrevious(value: LinkHeaderFooterToPreviousCommand): Self = StObject.set(x, "linkHeaderFooterToPrevious", value.asInstanceOf[js.Any])
    
    inline def setMailMergeAndDownload(value: MailMergeAndDownloadCommand): Self = StObject.set(x, "mailMergeAndDownload", value.asInstanceOf[js.Any])
    
    inline def setMailMergeAndSaveAs(value: MailMergeAndSaveAsCommand): Self = StObject.set(x, "mailMergeAndSaveAs", value.asInstanceOf[js.Any])
    
    inline def setMailMergeDialog(value: MailMergeDialogCommand): Self = StObject.set(x, "mailMergeDialog", value.asInstanceOf[js.Any])
    
    inline def setMakeTextLowerCase(value: MakeTextLowerCaseCommand): Self = StObject.set(x, "makeTextLowerCase", value.asInstanceOf[js.Any])
    
    inline def setMakeTextSentenceCase(value: MakeTextSentenceCaseCommand): Self = StObject.set(x, "makeTextSentenceCase", value.asInstanceOf[js.Any])
    
    inline def setMakeTextUpperCase(value: MakeTextUpperCaseCommand): Self = StObject.set(x, "makeTextUpperCase", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldDialog(value: MergeFieldDialogCommand): Self = StObject.set(x, "mergeFieldDialog", value.asInstanceOf[js.Any])
    
    inline def setMergeTableCells(value: MergeTableCellsCommand): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setMoveContent(value: MoveContentCommand): Self = StObject.set(x, "moveContent", value.asInstanceOf[js.Any])
    
    inline def setOpenCustomNumberingListDialog(value: OpenCustomNumberingListDialogCommand): Self = StObject.set(x, "openCustomNumberingListDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenFindAndReplaceDialog(value: OpenFindAndReplaceDialogCommand): Self = StObject.set(x, "openFindAndReplaceDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenFindPanel(value: OpenFindPanelCommand): Self = StObject.set(x, "openFindPanel", value.asInstanceOf[js.Any])
    
    inline def setOpenFontFormattingDialog(value: OpenFontFormattingDialogCommand): Self = StObject.set(x, "openFontFormattingDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenHyperlink(value: OpenHyperlinkCommand): Self = StObject.set(x, "openHyperlink", value.asInstanceOf[js.Any])
    
    inline def setOpenInsertBookmarkDialog(value: OpenInsertBookmarkDialogCommand): Self = StObject.set(x, "openInsertBookmarkDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenInsertHyperlinkDialog(value: OpenInsertHyperlinkDialogCommand): Self = StObject.set(x, "openInsertHyperlinkDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenInsertPictureDialog(value: OpenInsertPictureDialogCommand): Self = StObject.set(x, "openInsertPictureDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenInsertSymbolDialog(value: OpenInsertSymbolDialogCommand): Self = StObject.set(x, "openInsertSymbolDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenInsertTableDialog(value: OpenInsertTableDialogCommand): Self = StObject.set(x, "openInsertTableDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenLayoutOptionsDialog(value: OpenLayoutOptionsDialogCommand): Self = StObject.set(x, "openLayoutOptionsDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenNumberingListDialog(value: OpenNumberingListDialogCommand): Self = StObject.set(x, "openNumberingListDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenPageMarginsDialog(value: OpenPageMarginsDialogCommand): Self = StObject.set(x, "openPageMarginsDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenPagePaperSizeDialog(value: OpenPagePaperSizeDialogCommand): Self = StObject.set(x, "openPagePaperSizeDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenParagraphFormattingDialog(value: OpenParagraphFormattingDialogCommand): Self = StObject.set(x, "openParagraphFormattingDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenSectionColumnsDialog(value: OpenSectionColumnsDialogCommand): Self = StObject.set(x, "openSectionColumnsDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenSpellingDialog(value: OpenSpellingDialogCommand): Self = StObject.set(x, "openSpellingDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenTableBordersAndShadingDialog(value: OpenTableBordersAndShadingDialogCommand): Self = StObject.set(x, "openTableBordersAndShadingDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenTableFormattingDialog(value: OpenTableFormattingDialogCommand): Self = StObject.set(x, "openTableFormattingDialog", value.asInstanceOf[js.Any])
    
    inline def setOpenTabsDialog(value: OpenTabsDialogCommand): Self = StObject.set(x, "openTabsDialog", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: PasteCommand): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
    
    inline def setRedo(value: RedoCommand): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
    
    inline def setRemoveNextWord(value: RemoveNextWordCommand): Self = StObject.set(x, "removeNextWord", value.asInstanceOf[js.Any])
    
    inline def setRemoveNumeration(value: RemoveNumerationCommand): Self = StObject.set(x, "removeNumeration", value.asInstanceOf[js.Any])
    
    inline def setRemovePrevWord(value: RemovePrevWordCommand): Self = StObject.set(x, "removePrevWord", value.asInstanceOf[js.Any])
    
    inline def setRemoveSpacingAfterParagraph(value: RemoveSpacingAfterParagraphCommand): Self = StObject.set(x, "removeSpacingAfterParagraph", value.asInstanceOf[js.Any])
    
    inline def setRemoveSpacingBeforeParagraph(value: RemoveSpacingBeforeParagraphCommand): Self = StObject.set(x, "removeSpacingBeforeParagraph", value.asInstanceOf[js.Any])
    
    inline def setRemoveTableCellBorders(value: RemoveTableCellBordersCommand): Self = StObject.set(x, "removeTableCellBorders", value.asInstanceOf[js.Any])
    
    inline def setReplaceAll(value: ReplaceAllCommand): Self = StObject.set(x, "replaceAll", value.asInstanceOf[js.Any])
    
    inline def setReplaceNext(value: ReplaceNextCommand): Self = StObject.set(x, "replaceNext", value.asInstanceOf[js.Any])
    
    inline def setRestartNumberingList(value: RestartNumberingListCommand): Self = StObject.set(x, "restartNumberingList", value.asInstanceOf[js.Any])
    
    inline def setSetDifferentFirstPageHeaderFooter(value: SetDifferentFirstPageHeaderFooterCommand): Self = StObject.set(x, "setDifferentFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setSetDifferentOddAndEvenPagesHeaderFooter(value: SetDifferentOddAndEvenPagesHeaderFooterCommand): Self = StObject.set(x, "setDifferentOddAndEvenPagesHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setSetDoubleParagraphSpacing(value: SetDoubleParagraphSpacingCommand): Self = StObject.set(x, "setDoubleParagraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setSetFullscreen(value: SetFullscreenCommand): Self = StObject.set(x, "setFullscreen", value.asInstanceOf[js.Any])
    
    inline def setSetPageSizeDialog(value: SetPageSizeDialogCommand): Self = StObject.set(x, "setPageSizeDialog", value.asInstanceOf[js.Any])
    
    inline def setSetParagraphLevel(value: SetParagraphLevelCommand): Self = StObject.set(x, "setParagraphLevel", value.asInstanceOf[js.Any])
    
    inline def setSetSesquialteralParagraphSpacing(value: SetSesquialteralParagraphSpacingCommand): Self = StObject.set(x, "setSesquialteralParagraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setSetSingleParagraphSpacing(value: SetSingleParagraphSpacingCommand): Self = StObject.set(x, "setSingleParagraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setShowAllFieldCodes(value: ShowAllFieldCodesCommand): Self = StObject.set(x, "showAllFieldCodes", value.asInstanceOf[js.Any])
    
    inline def setShowFieldCodes(value: ShowFieldCodesCommand): Self = StObject.set(x, "showFieldCodes", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenSymbols(value: ShowHiddenSymbolsCommand): Self = StObject.set(x, "showHiddenSymbols", value.asInstanceOf[js.Any])
    
    inline def setShowHorizontalRuler(value: ShowHorizontalRulerCommand): Self = StObject.set(x, "showHorizontalRuler", value.asInstanceOf[js.Any])
    
    inline def setShowMergedData(value: ShowMergedDataCommand): Self = StObject.set(x, "showMergedData", value.asInstanceOf[js.Any])
    
    inline def setShowTableGridLines(value: ShowTableGridLinesCommand): Self = StObject.set(x, "showTableGridLines", value.asInstanceOf[js.Any])
    
    inline def setSplitTableCells(value: SplitTableCellsCommand): Self = StObject.set(x, "splitTableCells", value.asInstanceOf[js.Any])
    
    inline def setSplitTableCellsDialog(value: SplitTableCellsDialogCommand): Self = StObject.set(x, "splitTableCellsDialog", value.asInstanceOf[js.Any])
    
    inline def setSwitchTextCase(value: SwitchTextCaseCommand): Self = StObject.set(x, "switchTextCase", value.asInstanceOf[js.Any])
    
    inline def setToggleBulletedList(value: ToggleBulletedListCommand): Self = StObject.set(x, "toggleBulletedList", value.asInstanceOf[js.Any])
    
    inline def setToggleMultilevelList(value: ToggleMultilevelListCommand): Self = StObject.set(x, "toggleMultilevelList", value.asInstanceOf[js.Any])
    
    inline def setToggleNumberingList(value: ToggleNumberingListCommand): Self = StObject.set(x, "toggleNumberingList", value.asInstanceOf[js.Any])
    
    inline def setToggleParagraphAlignmentCenter(value: ToggleParagraphAlignmentCenterCommand): Self = StObject.set(x, "toggleParagraphAlignmentCenter", value.asInstanceOf[js.Any])
    
    inline def setToggleParagraphAlignmentJustify(value: ToggleParagraphAlignmentJustifyCommand): Self = StObject.set(x, "toggleParagraphAlignmentJustify", value.asInstanceOf[js.Any])
    
    inline def setToggleParagraphAlignmentLeft(value: ToggleParagraphAlignmentLeftCommand): Self = StObject.set(x, "toggleParagraphAlignmentLeft", value.asInstanceOf[js.Any])
    
    inline def setToggleParagraphAlignmentRight(value: ToggleParagraphAlignmentRightCommand): Self = StObject.set(x, "toggleParagraphAlignmentRight", value.asInstanceOf[js.Any])
    
    inline def setToggleTableAutoFitContents(value: ToggleTableAutoFitContentsCommand): Self = StObject.set(x, "toggleTableAutoFitContents", value.asInstanceOf[js.Any])
    
    inline def setToggleTableAutoFitWindow(value: ToggleTableAutoFitWindowCommand): Self = StObject.set(x, "toggleTableAutoFitWindow", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignBottomCenter(value: ToggleTableCellAlignBottomCenterCommand): Self = StObject.set(x, "toggleTableCellAlignBottomCenter", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignBottomLeft(value: ToggleTableCellAlignBottomLeftCommand): Self = StObject.set(x, "toggleTableCellAlignBottomLeft", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignBottomRight(value: ToggleTableCellAlignBottomRightCommand): Self = StObject.set(x, "toggleTableCellAlignBottomRight", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignMiddleCenter(value: ToggleTableCellAlignMiddleCenterCommand): Self = StObject.set(x, "toggleTableCellAlignMiddleCenter", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignMiddleLeft(value: ToggleTableCellAlignMiddleLeftCommand): Self = StObject.set(x, "toggleTableCellAlignMiddleLeft", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignMiddleRight(value: ToggleTableCellAlignMiddleRightCommand): Self = StObject.set(x, "toggleTableCellAlignMiddleRight", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignTopCenter(value: ToggleTableCellAlignTopCenterCommand): Self = StObject.set(x, "toggleTableCellAlignTopCenter", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignTopLeft(value: ToggleTableCellAlignTopLeftCommand): Self = StObject.set(x, "toggleTableCellAlignTopLeft", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAlignTopRight(value: ToggleTableCellAlignTopRightCommand): Self = StObject.set(x, "toggleTableCellAlignTopRight", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellAllBorders(value: ToggleTableCellAllBordersCommand): Self = StObject.set(x, "toggleTableCellAllBorders", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellBottomBorder(value: ToggleTableCellBottomBorderCommand): Self = StObject.set(x, "toggleTableCellBottomBorder", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellInsideBorders(value: ToggleTableCellInsideBordersCommand): Self = StObject.set(x, "toggleTableCellInsideBorders", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellInsideHorizontalBorders(value: ToggleTableCellInsideHorizontalBordersCommand): Self = StObject.set(x, "toggleTableCellInsideHorizontalBorders", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellInsideVerticalBorders(value: ToggleTableCellInsideVerticalBordersCommand): Self = StObject.set(x, "toggleTableCellInsideVerticalBorders", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellLeftBorder(value: ToggleTableCellLeftBorderCommand): Self = StObject.set(x, "toggleTableCellLeftBorder", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellOutsideBorders(value: ToggleTableCellOutsideBordersCommand): Self = StObject.set(x, "toggleTableCellOutsideBorders", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellRightBorder(value: ToggleTableCellRightBorderCommand): Self = StObject.set(x, "toggleTableCellRightBorder", value.asInstanceOf[js.Any])
    
    inline def setToggleTableCellTopBorder(value: ToggleTableCellTopBorderCommand): Self = StObject.set(x, "toggleTableCellTopBorder", value.asInstanceOf[js.Any])
    
    inline def setToggleTableFixedColumnWidth(value: ToggleTableFixedColumnWidthCommand): Self = StObject.set(x, "toggleTableFixedColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setToggleTextCase(value: ToggleTextCaseCommand): Self = StObject.set(x, "toggleTextCase", value.asInstanceOf[js.Any])
    
    inline def setUndo(value: UndoCommand): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    inline def setUpdateAllFields(value: UpdateAllFieldsCommand): Self = StObject.set(x, "updateAllFields", value.asInstanceOf[js.Any])
    
    inline def setUpdateField(value: UpdateFieldCommand): Self = StObject.set(x, "updateField", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableOfContents(value: UpdateTableOfContentsCommand): Self = StObject.set(x, "updateTableOfContents", value.asInstanceOf[js.Any])
  }
}
