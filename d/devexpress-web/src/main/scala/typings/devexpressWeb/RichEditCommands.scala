package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of the available client commands.
  */
trait RichEditCommands extends js.Object {
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
    * Gets a command to download the document specifying the file's extension.
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
  /**
    * Gets a command to prevent the control UI from being updated until the RichEditCommands.endUpdate method is called.
    */
  def beginUpdate(): Unit
  /**
    * Re-enables render operations after a call to the RichEditCommands.beginUpdate method and forces immediate re-rendering.
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
    val __obj = js.Dynamic.literal(addSpacingAfterParagraph = addSpacingAfterParagraph.asInstanceOf[js.Any], addSpacingBeforeParagraph = addSpacingBeforeParagraph.asInstanceOf[js.Any], assignShortcut = assignShortcut.asInstanceOf[js.Any], backspace = backspace.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), capitalizeEachWordTextCase = capitalizeEachWordTextCase.asInstanceOf[js.Any], changeCustomNumberingList = changeCustomNumberingList.asInstanceOf[js.Any], changeFloatingObjectAbsolutePosition = changeFloatingObjectAbsolutePosition.asInstanceOf[js.Any], changeFloatingObjectAbsoluteSize = changeFloatingObjectAbsoluteSize.asInstanceOf[js.Any], changeFloatingObjectAlignmentPosition = changeFloatingObjectAlignmentPosition.asInstanceOf[js.Any], changeFloatingObjectFillColor = changeFloatingObjectFillColor.asInstanceOf[js.Any], changeFloatingObjectLockAnchor = changeFloatingObjectLockAnchor.asInstanceOf[js.Any], changeFloatingObjectLockAspectRatio = changeFloatingObjectLockAspectRatio.asInstanceOf[js.Any], changeFloatingObjectOutlineColor = changeFloatingObjectOutlineColor.asInstanceOf[js.Any], changeFloatingObjectOutlineWidth = changeFloatingObjectOutlineWidth.asInstanceOf[js.Any], changeFloatingObjectRelativePosition = changeFloatingObjectRelativePosition.asInstanceOf[js.Any], changeFloatingObjectRotation = changeFloatingObjectRotation.asInstanceOf[js.Any], changeFloatingObjectTextWrapping = changeFloatingObjectTextWrapping.asInstanceOf[js.Any], changeFontBackColor = changeFontBackColor.asInstanceOf[js.Any], changeFontBold = changeFontBold.asInstanceOf[js.Any], changeFontForeColor = changeFontForeColor.asInstanceOf[js.Any], changeFontFormatting = changeFontFormatting.asInstanceOf[js.Any], changeFontItalic = changeFontItalic.asInstanceOf[js.Any], changeFontName = changeFontName.asInstanceOf[js.Any], changeFontSize = changeFontSize.asInstanceOf[js.Any], changeFontStrikeout = changeFontStrikeout.asInstanceOf[js.Any], changeFontSubscript = changeFontSubscript.asInstanceOf[js.Any], changeFontSuperscript = changeFontSuperscript.asInstanceOf[js.Any], changeFontUnderline = changeFontUnderline.asInstanceOf[js.Any], changeHyperlink = changeHyperlink.asInstanceOf[js.Any], changePageColor = changePageColor.asInstanceOf[js.Any], changePageMargins = changePageMargins.asInstanceOf[js.Any], changePageOrientation = changePageOrientation.asInstanceOf[js.Any], changePageSize = changePageSize.asInstanceOf[js.Any], changeParagraphBackColor = changeParagraphBackColor.asInstanceOf[js.Any], changeParagraphFormatting = changeParagraphFormatting.asInstanceOf[js.Any], changePictureScale = changePictureScale.asInstanceOf[js.Any], changeSectionColumns = changeSectionColumns.asInstanceOf[js.Any], changeSectionEqualColumnCount = changeSectionEqualColumnCount.asInstanceOf[js.Any], changeStyle = changeStyle.asInstanceOf[js.Any], changeTableBorderRepositoryItem = changeTableBorderRepositoryItem.asInstanceOf[js.Any], changeTableBordersAndShading = changeTableBordersAndShading.asInstanceOf[js.Any], changeTableCellFormatting = changeTableCellFormatting.asInstanceOf[js.Any], changeTableCellPreferredWidth = changeTableCellPreferredWidth.asInstanceOf[js.Any], changeTableCellShading = changeTableCellShading.asInstanceOf[js.Any], changeTableColumnPreferredWidth = changeTableColumnPreferredWidth.asInstanceOf[js.Any], changeTableFormatting = changeTableFormatting.asInstanceOf[js.Any], changeTableLook = changeTableLook.asInstanceOf[js.Any], changeTableRowPreferredHeight = changeTableRowPreferredHeight.asInstanceOf[js.Any], changeTableStyle = changeTableStyle.asInstanceOf[js.Any], changeTabs = changeTabs.asInstanceOf[js.Any], changeTextBoxContentMargins = changeTextBoxContentMargins.asInstanceOf[js.Any], changeTextBoxRelativeSize = changeTextBoxRelativeSize.asInstanceOf[js.Any], changeTextBoxResizeShapeToFitText = changeTextBoxResizeShapeToFitText.asInstanceOf[js.Any], changeViewType = changeViewType.asInstanceOf[js.Any], clearFormatting = clearFormatting.asInstanceOf[js.Any], closeHeaderFooter = closeHeaderFooter.asInstanceOf[js.Any], continueNumberingList = continueNumberingList.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], copyContent = copyContent.asInstanceOf[js.Any], createDateField = createDateField.asInstanceOf[js.Any], createField = createField.asInstanceOf[js.Any], createMergeField = createMergeField.asInstanceOf[js.Any], createPageCountField = createPageCountField.asInstanceOf[js.Any], createPageField = createPageField.asInstanceOf[js.Any], createTimeField = createTimeField.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], decreaseFontSize = decreaseFontSize.asInstanceOf[js.Any], decreaseIndent = decreaseIndent.asInstanceOf[js.Any], decrementNumberingIndent = decrementNumberingIndent.asInstanceOf[js.Any], decrementParagraphLeftIndent = decrementParagraphLeftIndent.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteBookmark = deleteBookmark.asInstanceOf[js.Any], deleteHyperlink = deleteHyperlink.asInstanceOf[js.Any], deleteHyperlinks = deleteHyperlinks.asInstanceOf[js.Any], deleteTable = deleteTable.asInstanceOf[js.Any], deleteTableCellsDialog = deleteTableCellsDialog.asInstanceOf[js.Any], deleteTableCellsWithShiftHorizontally = deleteTableCellsWithShiftHorizontally.asInstanceOf[js.Any], deleteTableCellsWithShiftVertically = deleteTableCellsWithShiftVertically.asInstanceOf[js.Any], deleteTableColumns = deleteTableColumns.asInstanceOf[js.Any], deleteTableRows = deleteTableRows.asInstanceOf[js.Any], endUpdate = js.Any.fromFunction0(endUpdate), fileDownload = fileDownload.asInstanceOf[js.Any], fileNew = fileNew.asInstanceOf[js.Any], fileOpen = fileOpen.asInstanceOf[js.Any], fileOpenDialog = fileOpenDialog.asInstanceOf[js.Any], filePrint = filePrint.asInstanceOf[js.Any], fileSave = fileSave.asInstanceOf[js.Any], fileSaveAs = fileSaveAs.asInstanceOf[js.Any], fileSaveAsDialog = fileSaveAsDialog.asInstanceOf[js.Any], findAll = findAll.asInstanceOf[js.Any], forceSyncWithServer = forceSyncWithServer.asInstanceOf[js.Any], getRtf = getRtf.asInstanceOf[js.Any], goToBookmark = goToBookmark.asInstanceOf[js.Any], goToDataRecord = goToDataRecord.asInstanceOf[js.Any], goToFirstDataRecord = goToFirstDataRecord.asInstanceOf[js.Any], goToFooter = goToFooter.asInstanceOf[js.Any], goToHeader = goToHeader.asInstanceOf[js.Any], goToLastDataRecord = goToLastDataRecord.asInstanceOf[js.Any], goToNextDataRecord = goToNextDataRecord.asInstanceOf[js.Any], goToNextHeaderFooter = goToNextHeaderFooter.asInstanceOf[js.Any], goToPreviousDataRecord = goToPreviousDataRecord.asInstanceOf[js.Any], goToPreviousHeaderFooter = goToPreviousHeaderFooter.asInstanceOf[js.Any], hideFindResults = hideFindResults.asInstanceOf[js.Any], increaseFontSize = increaseFontSize.asInstanceOf[js.Any], increaseIndent = increaseIndent.asInstanceOf[js.Any], incrementNumberingIndent = incrementNumberingIndent.asInstanceOf[js.Any], incrementParagraphLeftIndent = incrementParagraphLeftIndent.asInstanceOf[js.Any], insertBookmark = insertBookmark.asInstanceOf[js.Any], insertColumnBreak = insertColumnBreak.asInstanceOf[js.Any], insertContentFromServer = insertContentFromServer.asInstanceOf[js.Any], insertEquationsCaption = insertEquationsCaption.asInstanceOf[js.Any], insertFiguresCaption = insertFiguresCaption.asInstanceOf[js.Any], insertFloatingTextBox = insertFloatingTextBox.asInstanceOf[js.Any], insertFooter = insertFooter.asInstanceOf[js.Any], insertHeader = insertHeader.asInstanceOf[js.Any], insertHtml = insertHtml.asInstanceOf[js.Any], insertHyperlink = insertHyperlink.asInstanceOf[js.Any], insertLineBreak = insertLineBreak.asInstanceOf[js.Any], insertNonBreakingSpace = insertNonBreakingSpace.asInstanceOf[js.Any], insertNumeration = insertNumeration.asInstanceOf[js.Any], insertPageBreak = insertPageBreak.asInstanceOf[js.Any], insertParagraph = insertParagraph.asInstanceOf[js.Any], insertPicture = insertPicture.asInstanceOf[js.Any], insertRtf = insertRtf.asInstanceOf[js.Any], insertSectionBreakEvenPage = insertSectionBreakEvenPage.asInstanceOf[js.Any], insertSectionBreakNextPage = insertSectionBreakNextPage.asInstanceOf[js.Any], insertSectionBreakOddPage = insertSectionBreakOddPage.asInstanceOf[js.Any], insertSymbol = insertSymbol.asInstanceOf[js.Any], insertTab = insertTab.asInstanceOf[js.Any], insertTable = insertTable.asInstanceOf[js.Any], insertTableCellWithShiftToTheLeft = insertTableCellWithShiftToTheLeft.asInstanceOf[js.Any], insertTableCellsDialog = insertTableCellsDialog.asInstanceOf[js.Any], insertTableCellsWithShiftToTheVertically = insertTableCellsWithShiftToTheVertically.asInstanceOf[js.Any], insertTableColumnToTheLeft = insertTableColumnToTheLeft.asInstanceOf[js.Any], insertTableColumnToTheRight = insertTableColumnToTheRight.asInstanceOf[js.Any], insertTableOfContents = insertTableOfContents.asInstanceOf[js.Any], insertTableOfEquations = insertTableOfEquations.asInstanceOf[js.Any], insertTableOfFigures = insertTableOfFigures.asInstanceOf[js.Any], insertTableOfTables = insertTableOfTables.asInstanceOf[js.Any], insertTableRowAbove = insertTableRowAbove.asInstanceOf[js.Any], insertTableRowBelow = insertTableRowBelow.asInstanceOf[js.Any], insertTablesCaption = insertTablesCaption.asInstanceOf[js.Any], insertText = insertText.asInstanceOf[js.Any], linkHeaderFooterToPrevious = linkHeaderFooterToPrevious.asInstanceOf[js.Any], mailMergeAndDownload = mailMergeAndDownload.asInstanceOf[js.Any], mailMergeAndSaveAs = mailMergeAndSaveAs.asInstanceOf[js.Any], mailMergeDialog = mailMergeDialog.asInstanceOf[js.Any], makeTextLowerCase = makeTextLowerCase.asInstanceOf[js.Any], makeTextSentenceCase = makeTextSentenceCase.asInstanceOf[js.Any], makeTextUpperCase = makeTextUpperCase.asInstanceOf[js.Any], mergeFieldDialog = mergeFieldDialog.asInstanceOf[js.Any], mergeTableCells = mergeTableCells.asInstanceOf[js.Any], moveContent = moveContent.asInstanceOf[js.Any], openCustomNumberingListDialog = openCustomNumberingListDialog.asInstanceOf[js.Any], openFindAndReplaceDialog = openFindAndReplaceDialog.asInstanceOf[js.Any], openFindPanel = openFindPanel.asInstanceOf[js.Any], openFontFormattingDialog = openFontFormattingDialog.asInstanceOf[js.Any], openHyperlink = openHyperlink.asInstanceOf[js.Any], openInsertBookmarkDialog = openInsertBookmarkDialog.asInstanceOf[js.Any], openInsertHyperlinkDialog = openInsertHyperlinkDialog.asInstanceOf[js.Any], openInsertPictureDialog = openInsertPictureDialog.asInstanceOf[js.Any], openInsertSymbolDialog = openInsertSymbolDialog.asInstanceOf[js.Any], openInsertTableDialog = openInsertTableDialog.asInstanceOf[js.Any], openLayoutOptionsDialog = openLayoutOptionsDialog.asInstanceOf[js.Any], openNumberingListDialog = openNumberingListDialog.asInstanceOf[js.Any], openPageMarginsDialog = openPageMarginsDialog.asInstanceOf[js.Any], openPagePaperSizeDialog = openPagePaperSizeDialog.asInstanceOf[js.Any], openParagraphFormattingDialog = openParagraphFormattingDialog.asInstanceOf[js.Any], openSectionColumnsDialog = openSectionColumnsDialog.asInstanceOf[js.Any], openSpellingDialog = openSpellingDialog.asInstanceOf[js.Any], openTableBordersAndShadingDialog = openTableBordersAndShadingDialog.asInstanceOf[js.Any], openTableFormattingDialog = openTableFormattingDialog.asInstanceOf[js.Any], openTabsDialog = openTabsDialog.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], redo = redo.asInstanceOf[js.Any], removeNextWord = removeNextWord.asInstanceOf[js.Any], removeNumeration = removeNumeration.asInstanceOf[js.Any], removePrevWord = removePrevWord.asInstanceOf[js.Any], removeSpacingAfterParagraph = removeSpacingAfterParagraph.asInstanceOf[js.Any], removeSpacingBeforeParagraph = removeSpacingBeforeParagraph.asInstanceOf[js.Any], removeTableCellBorders = removeTableCellBorders.asInstanceOf[js.Any], replaceAll = replaceAll.asInstanceOf[js.Any], replaceNext = replaceNext.asInstanceOf[js.Any], restartNumberingList = restartNumberingList.asInstanceOf[js.Any], setDifferentFirstPageHeaderFooter = setDifferentFirstPageHeaderFooter.asInstanceOf[js.Any], setDifferentOddAndEvenPagesHeaderFooter = setDifferentOddAndEvenPagesHeaderFooter.asInstanceOf[js.Any], setDoubleParagraphSpacing = setDoubleParagraphSpacing.asInstanceOf[js.Any], setFullscreen = setFullscreen.asInstanceOf[js.Any], setPageSizeDialog = setPageSizeDialog.asInstanceOf[js.Any], setParagraphLevel = setParagraphLevel.asInstanceOf[js.Any], setSesquialteralParagraphSpacing = setSesquialteralParagraphSpacing.asInstanceOf[js.Any], setSingleParagraphSpacing = setSingleParagraphSpacing.asInstanceOf[js.Any], showAllFieldCodes = showAllFieldCodes.asInstanceOf[js.Any], showFieldCodes = showFieldCodes.asInstanceOf[js.Any], showHiddenSymbols = showHiddenSymbols.asInstanceOf[js.Any], showHorizontalRuler = showHorizontalRuler.asInstanceOf[js.Any], showMergedData = showMergedData.asInstanceOf[js.Any], showTableGridLines = showTableGridLines.asInstanceOf[js.Any], splitTableCells = splitTableCells.asInstanceOf[js.Any], splitTableCellsDialog = splitTableCellsDialog.asInstanceOf[js.Any], switchTextCase = switchTextCase.asInstanceOf[js.Any], toggleBulletedList = toggleBulletedList.asInstanceOf[js.Any], toggleMultilevelList = toggleMultilevelList.asInstanceOf[js.Any], toggleNumberingList = toggleNumberingList.asInstanceOf[js.Any], toggleParagraphAlignmentCenter = toggleParagraphAlignmentCenter.asInstanceOf[js.Any], toggleParagraphAlignmentJustify = toggleParagraphAlignmentJustify.asInstanceOf[js.Any], toggleParagraphAlignmentLeft = toggleParagraphAlignmentLeft.asInstanceOf[js.Any], toggleParagraphAlignmentRight = toggleParagraphAlignmentRight.asInstanceOf[js.Any], toggleTableAutoFitContents = toggleTableAutoFitContents.asInstanceOf[js.Any], toggleTableAutoFitWindow = toggleTableAutoFitWindow.asInstanceOf[js.Any], toggleTableCellAlignBottomCenter = toggleTableCellAlignBottomCenter.asInstanceOf[js.Any], toggleTableCellAlignBottomLeft = toggleTableCellAlignBottomLeft.asInstanceOf[js.Any], toggleTableCellAlignBottomRight = toggleTableCellAlignBottomRight.asInstanceOf[js.Any], toggleTableCellAlignMiddleCenter = toggleTableCellAlignMiddleCenter.asInstanceOf[js.Any], toggleTableCellAlignMiddleLeft = toggleTableCellAlignMiddleLeft.asInstanceOf[js.Any], toggleTableCellAlignMiddleRight = toggleTableCellAlignMiddleRight.asInstanceOf[js.Any], toggleTableCellAlignTopCenter = toggleTableCellAlignTopCenter.asInstanceOf[js.Any], toggleTableCellAlignTopLeft = toggleTableCellAlignTopLeft.asInstanceOf[js.Any], toggleTableCellAlignTopRight = toggleTableCellAlignTopRight.asInstanceOf[js.Any], toggleTableCellAllBorders = toggleTableCellAllBorders.asInstanceOf[js.Any], toggleTableCellBottomBorder = toggleTableCellBottomBorder.asInstanceOf[js.Any], toggleTableCellInsideBorders = toggleTableCellInsideBorders.asInstanceOf[js.Any], toggleTableCellInsideHorizontalBorders = toggleTableCellInsideHorizontalBorders.asInstanceOf[js.Any], toggleTableCellInsideVerticalBorders = toggleTableCellInsideVerticalBorders.asInstanceOf[js.Any], toggleTableCellLeftBorder = toggleTableCellLeftBorder.asInstanceOf[js.Any], toggleTableCellOutsideBorders = toggleTableCellOutsideBorders.asInstanceOf[js.Any], toggleTableCellRightBorder = toggleTableCellRightBorder.asInstanceOf[js.Any], toggleTableCellTopBorder = toggleTableCellTopBorder.asInstanceOf[js.Any], toggleTableFixedColumnWidth = toggleTableFixedColumnWidth.asInstanceOf[js.Any], toggleTextCase = toggleTextCase.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any], updateAllFields = updateAllFields.asInstanceOf[js.Any], updateField = updateField.asInstanceOf[js.Any], updateTableOfContents = updateTableOfContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditCommands]
  }
}

