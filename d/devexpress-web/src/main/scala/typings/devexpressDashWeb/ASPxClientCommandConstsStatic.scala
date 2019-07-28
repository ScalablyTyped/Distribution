package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCommandConstsStatic extends js.Object {
  /**
    * Identifies a command that wraps the currently selected text content in a specific html tag with a css class assigned to it.
    * Value: "applycss"
    */
  var APPLYCSS_COMMAND: String
  /**
    * Identifies a command that changes the color of a back color pickers and sets the selected text back color.
    * Value: "backcolor"
    */
  var BACKCOLOR_COMMAND: String
  /**
    * Identifies a command that applies the bold text formatting to the selected text. If it's already applied, cancels it.
    * Value: "bold"
    */
  var BOLD_COMMAND: String
  /**
    * Identifies a command that changes the selected audio element.
    * Value: "changeaudio"
    */
  var CHANGEAUDIO_COMMAND: String
  /**
    * Identifies a command that invokes the Change Audio dialog.
    * Value: "changeaudiodialog"
    */
  var CHANGEAUDIO_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes properties of the element selected in the tag inspector.
    * Value: "changeelementproperties"
    */
  var CHANGEELEMENTPROPERTIES_COMMAND: String
  /**
    * Identifies a command that invokes the Change Element Properties dialog.
    * Value: "changeelementpropertiesdialog"
    */
  var CHANGEELEMENTPROPERTIES_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes the selected flash element.
    * Value: "changeflash"
    */
  var CHANGEFLASH_COMMAND: String
  /**
    * Identifies a command that invokes the Change Flash dialog.
    * Value: "changeflash"
    */
  var CHANGEFLASH_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes the selected image.
    * Value: "changeimage"
    */
  var CHANGEIMAGE_COMMAND: String
  /**
    * Identifies a command that invokes the Change Image dialog.
    * Value: "changeimagedialog"
    */
  var CHANGEIMAGE_DIALOG_COMMAND: String
  /**
    * Identifies a command that invokes the Change Link dialog.
    * Value: "changelinkdialog"
    */
  var CHANGELINK_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes the selected placeholder.
    * Value: "changeplaceholder"
    */
  var CHANGEPLACEHOLDER_COMMAND: String
  /**
    * Identifies a command that invokes the Change Placeholder dialog.
    * Value: "changeplaceholderdialog"
    */
  var CHANGEPLACEHOLDER_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes the selected table cell.
    * Value: "changetablecell"
    */
  var CHANGETABLECELL_COMMAND: String
  /**
    * Identifies a command that changes the selected table column.
    * Value: "changetablecolumn"
    */
  var CHANGETABLECOLUMN_COMMAND: String
  /**
    * Identifies a command that changes the selected table row.
    * Value: "changetablerow"
    */
  var CHANGETABLEROW_COMMAND: String
  /**
    * Identifies a command that changes the selected table.
    * Value: "changetable"
    */
  var CHANGETABLE_COMMAND: String
  /**
    * Identifies a command that changes the selected video element.
    * Value: "changevideo"
    */
  var CHANGEVIDEO_COMMAND: String
  /**
    * Identifies a command that invokes the Change Video dialog.
    * Value: "changevideodialog"
    */
  var CHANGEVIDEO_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes the selected YouTube video element.
    * Value: "changeyoutubevideo"
    */
  var CHANGEYOUTUBEVIDEO_COMMAND: String
  /**
    * Identifies a command that invokes the Change YouTube Video dialog.
    * Value: "changeyoutubevideodialog"
    */
  var CHANGEYOUTUBEVIDEO_DIALOG_COMMAND: String
  /**
    * Identifies a command that initiates spell checking.
    * Value: "checkspelling"
    */
  var CHECKSPELLING_COMMAND: String
  /**
    * Identifies a command that collapses the selected HTML tag.
    * Value: "collapsetag"
    */
  var COLLAPSETAG_COMMAND: String
  /**
    * Identifies a command that comments the selected HTML code. If no code is selected, it comments the focused tag.
    * Value: "comment"
    */
  var COMMENT_COMMAND: String
  /**
    * Identifies a command that continues a disrupted ordered list.
    * Value: "continueorderedlist"
    */
  var CONTINUEORDEREDLIST_COMMAND: String
  /**
    * Identifies a command that copies the selected content.
    * Value: "copy"
    */
  var COPY_COMMAND: String
  /**
    * Identifies a command that invokes a custom dialog.
    * Value: "customdialog"
    */
  var CUSTOMDIALOG_COMMAND: String
  /**
    * Identifies a command that cuts the selected content.
    * Value: "cut"
    */
  var CUT_COMMAND: String
  /**
    * Identifies a command that deletes the currently selected table column.
    * Value: "deletetablecolumn"
    */
  var DELETETABLECOLUMN_COMMAND: String
  /**
    * Identifies a command that deletes the currently selected table row.
    * Value: "deletetablerow"
    */
  var DELETETABLEROW_COMMAND: String
  /**
    * Identifies a command that deletes the currently selected table.
    * Value: "deletetable"
    */
  var DELETETABLE_COMMAND: String
  /**
    * Identifies a command that deletes the selected content.
    * Value: "delete"
    */
  var DELETE_COMMAND: String
  /**
    * Identifies a command that expands the selected HTML tag.
    * Value: "expandtag"
    */
  var EXPANDTAG_COMMAND: String
  /**
    * Identifies a command that exports the html editor content.
    * Value: "export"
    */
  var EXPORT_COMMAND: String
  /**
    * Identifies a command that invokes the Find and Replace dialog.
    * Value: "findandreplacedialog"
    */
  var FINDANDREPLACE_DIALOG_COMMAND: String
  /**
    * Identifies a command that changes the color of a fore color pickers and sets the selected text fore color.
    * Value: "forecolor"
    */
  var FONTCOLOR_COMMAND: String
  /**
    * Identifies a command that changes the font of the selected text.
    * Value: "fontname"
    */
  var FONTNAME_COMMAND: String
  /**
    * Identifies a command that changes the size of the selected text.
    * Value: "fontsize"
    */
  var FONTSIZE_COMMAND: String
  /**
    * Identifies a command that wraps the selected paragraph in the specified html tag.
    * Value: "formatblock"
    */
  var FORMATBLOCK_COMMAND: String
  /**
    * Identifies a command that formats the current HTML document.
    * Value: "formatdocument"
    */
  var FORMATDOCUMENT_COMMAND: String
  /**
    * Identifies a command that toggles the full-screen mode.
    * Value: "fullscreen"
    */
  var FULLSCREEN_COMMAND: String
  /**
    * Identifies a command that applies the indent formatting to the selected content.
    * Value: "indent"
    */
  var INDENTLINE_COMMAND: String
  /**
    * Identifies a command that creates an indent for the selected paragarph.
    * Value: "indent"
    */
  var INDENT_COMMAND: String
  /**
    * Identifies a command that inserts a new audio element.
    * Value: "insertaudio"
    */
  var INSERTAUDIO_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Audio dialog.
    * Value: "insertaudiodialog"
    */
  var INSERTAUDIO_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new flash element.
    * Value: "insertflash"
    */
  var INSERTFLASH_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Flash dialog.
    * Value: "insertflashdialog"
    */
  var INSERTFLASH_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new image.
    * Value: "insertimage"
    */
  var INSERTIMAGE_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Image dialog.
    * Value: "insertimagedialog"
    */
  var INSERTIMAGE_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new hyperlink.
    * Value: "insertlink"
    */
  var INSERTLINK_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Link dialog.
    * Value: "insertlinkdialog"
    */
  var INSERTLINK_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new ordered list.
    * Value: "insertorderedlist"
    */
  var INSERTORDEREDLIST_COMMAND: String
  /**
    * Identifies a command that inserts a new placeholder.
    * Value: "insertplaceholder"
    */
  var INSERTPLACEHOLDER_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Placeholder dialog.
    * Value: "insertplaceholderdialog"
    */
  var INSERTPLACEHOLDER_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new column to the left from the currently focused one.
    * Value: "inserttablecolumntoleft"
    */
  var INSERTTABLECOLUMNTOLEFT_COMMAND: String
  /**
    * Identifies a command that inserts a new column to the right from the currently focused one.
    * Value: "inserttablecolumntoright"
    */
  var INSERTTABLECOLUMNTORIGHT_COMMAND: String
  /**
    * Identifies a command that inserts a new row above the currently focused one.
    * Value: "inserttablerowabove"
    */
  var INSERTTABLEROWABOVE_COMMAND: String
  /**
    * Identifies a command that inserts a new row below the currently focused one.
    * Value: "inserttablerowbelow"
    */
  var INSERTTABLEROWBELOW_COMMAND: String
  /**
    * Identifies a command that inserts a new table.
    * Value: "inserttable"
    */
  var INSERTTABLE_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Table dialog.
    * Value: "inserttabledialog"
    */
  var INSERTTABLE_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new unordered list.
    * Value: "insertunorderedlist"
    */
  var INSERTUNORDEREDLIST_COMMAND: String
  /**
    * Identifies a command that inserts a new video.
    * Value: "insertvideo"
    */
  var INSERTVIDEO_COMMAND: String
  /**
    * Identifies a command that invokes the Insert Video dialog.
    * Value: "insertvideodialog"
    */
  var INSERTVIDEO_DIALOG_COMMAND: String
  /**
    * Identifies a command that inserts a new YouTube video.
    * Value: "insertyoutubevideo"
    */
  var INSERTYOUTUBEVIDEO_COMMAND: String
  /**
    * Identifies a command that invokes the Insert YouTube Video dialog.
    * Value: "insertyoutubevideodialog"
    */
  var INSERTYOUTUBEVIDEO_DIALOG_COMMAND: String
  /**
    * Identifies a command that makes the selected text italic or regular type depending on the current state.
    * Value: "italic"
    */
  var ITALIC_COMMAND: String
  /**
    * Identifies a command that centers the content of the currently focused paragraph.
    * Value: "justifycenter"
    */
  var JUSTIFYCENTER_COMMAND: String
  /**
    * Identifies a command that fully justifies the content of the currently focused paragraph (aligned with both the left and right margines).
    * Value: "justifyfull"
    */
  var JUSTIFYFULL_COMMAND: String
  /**
    * Identifies a command that left justifies the content of the currently focused paragraph.
    * Value: "justifyleft"
    */
  var JUSTIFYLEFT_COMMAND: String
  /**
    * Identifies a command that right justifies the content of the currently focused paragraph.
    * Value: "justifyright"
    */
  var JUSTIFYRIGHT_COMMAND: String
  /**
    * Identifies a command that merges the focused table cell with the one below.
    * Value: "mergetablecelldown"
    */
  var MERGETABLECELLDOWN_COMMAND: String
  /**
    * Identifies a command that merges the focused table cell with the one to the right.
    * Value: "mergetablecellright"
    */
  var MERGETABLECELLRIGHT_COMMAND: String
  /**
    * Identifies a command that applies the outdent formatting to the focused content.
    * Value: "outdent"
    */
  var OUTDENTLINE_COMMAND: String
  /**
    * Identifies a command that creates an outdent for the focused paragarph.
    * Value: "outdent"
    */
  var OUTDENT_COMMAND: String
  /**
    * Identifies a command that invokes the Paste from Word dialog.
    * Value: "pastefromworddialog"
    */
  var PASTEFROMWORDDIALOG_COMMAND: String
  /**
    * Identifies a command that pastes a specified content taking into account that it was copied from Word.
    * Value: "pastefromword"
    */
  var PASTEFROMWORD_COMMAND: String
  /**
    * Identifies a command that pastes the content of the clipboard to the current cursor position, taking into account that the PasteMode property is set to MergeFormatting.
    * Value: "pastehtmlmergeformatting"
    */
  var PASTEHTMLMERGEFORMATTING_COMMAND: String
  /**
    * Identifies a command that pastes the content of the clipboard to the current cursor position, taking into account that the PasteMode property is set to PlainText.
    * Value: "pastehtmlplaintext"
    */
  var PASTEHTMLPLAINTEXT_COMMAND: String
  /**
    * Identifies a command that pastes the content of the clipboard to the current cursor position, taking into account that the PasteMode property is set to SourceFormatting.
    * Value: "pastehtmlsourceformatting"
    */
  var PASTEHTMLSOURCEFORMATTING_COMMAND: String
  /**
    * Identifies a command that can be used to correctly insert HTML code into the editor.
    * Value: "pastehtml"
    */
  var PASTEHTML_COMMAND: String
  /**
    * Identifies a command that pastes the content of the clipboard at the current cursor position.
    * Value: "paste"
    */
  var PASTE_COMMAND: String
  /**
    * Identifies a command that invokes a default browser Print dialog, allowing an end-user to print the content of the html editor.
    * Value: "print"
    */
  var PRINT_COMMAND: String
  /**
    * Identifies a command that returns a previously canceled action.
    * Value: "redo"
    */
  var REDO_COMMAND: String
  /**
    * Identifies a command that removes all formatting from the selected content.
    * Value: "removeformat"
    */
  var REMOVEFORMAT_COMMAND: String
  /**
    * Identifies a command that restarts the current ordered list.
    * Value: "restartorderedlist"
    */
  var RESTARTORDEREDLIST_COMMAND: String
  /**
    * Identifies a command that selects all content inside the html editor.
    * Value: "selectall"
    */
  var SELECT_ALL: String
  /**
    * Identifies a command that shows intellisense for the HTML code editor.
    * Value: "showintellisense"
    */
  var SHOWINTELLISENSE_COMMAND: String
  /**
    * Identifies a command that shows a search panel.
    * Value: "showsearchpanel"
    */
  var SHOWSEARCHPANEL_COMMAND: String
  /**
    * Identifies a command that splits the current table cell horizontally.
    * Value: "splittablecellhorizontally"
    */
  var SPLITTABLECELLHORIZONTALLY_COMMAND: String
  /**
    * Identifies a command that splits the current table cell vertically.
    * Value: "splittablecellvertically"
    */
  var SPLITTABLECELLVERTICALLY_COMMAND: String
  /**
    * Identifies a command that applies the strike through text formatting to the selected text. If it's already applied, cancels it.
    * Value: "strikethrough"
    */
  var STRIKETHROUGH_COMMAND: String
  /**
    * Identifies a command that applies the subscript text formatting to the selected text. If it's already applied, cancels it.
    * Value: "subscript"
    */
  var SUBSCRIPT_COMMAND: String
  /**
    * Identifies a command that applies the superscript text formatting to the selected text. If it's already applied, cancels it.
    * Value: "superscript"
    */
  var SUPERSCRIPT_COMMAND: String
  /**
    * Identifies a command that invokes the Cell Properties dialog.
    * Value: "tablecellpropertiesdialog"
    */
  var TABLECELLPROPERTIES_DIALOG_COMMAND: String
  /**
    * Identifies a command that invokes the Column Properties dialog.
    * Value: "tablecolumnpropertiesdialog"
    */
  var TABLECOLUMNPROPERTIES_DIALOG_COMMAND: String
  /**
    * Identifies a command that invokes the Table Properties dialog.
    * Value: "tablepropertiesdialog"
    */
  var TABLEPROPERTIES_DIALOG_COMMAND: String
  /**
    * Identifies a command that invokes the Row Properties dialog.
    * Value: "tablerowpropertiesdialog"
    */
  var TABLEROWPROPERTIES_DIALOG_COMMAND: String
  /**
    * Identifies a command that uncomments the selected HTML code. If no code is selected, the command uncomments the currently focused tag.
    * Value: "uncomment"
    */
  var UNCOMMENTHTML_COMMAND: String
  /**
    * Identifies a command that applies the underline text formatting to the selected text. If it's already applied, cancels it.
    * Value: "underline"
    */
  var UNDERLINE_COMMAND: String
  /**
    * Identifies a command that cancels the last action.
    * Value: "undo"
    */
  var UNDO_COMMAND: String
  /**
    * Identifies a command that removes a hyperlink from the selected text or image.
    * Value: "unlink"
    */
  var UNLINK_COMMAND: String
  /**
    * Identifies a command that updates the editor content.
    * Value: "updatedocument"
    */
  var UPDATEDOCUMENT_COMMAND: String
}

object ASPxClientCommandConstsStatic {
  @scala.inline
  def apply(
    APPLYCSS_COMMAND: String,
    BACKCOLOR_COMMAND: String,
    BOLD_COMMAND: String,
    CHANGEAUDIO_COMMAND: String,
    CHANGEAUDIO_DIALOG_COMMAND: String,
    CHANGEELEMENTPROPERTIES_COMMAND: String,
    CHANGEELEMENTPROPERTIES_DIALOG_COMMAND: String,
    CHANGEFLASH_COMMAND: String,
    CHANGEFLASH_DIALOG_COMMAND: String,
    CHANGEIMAGE_COMMAND: String,
    CHANGEIMAGE_DIALOG_COMMAND: String,
    CHANGELINK_DIALOG_COMMAND: String,
    CHANGEPLACEHOLDER_COMMAND: String,
    CHANGEPLACEHOLDER_DIALOG_COMMAND: String,
    CHANGETABLECELL_COMMAND: String,
    CHANGETABLECOLUMN_COMMAND: String,
    CHANGETABLEROW_COMMAND: String,
    CHANGETABLE_COMMAND: String,
    CHANGEVIDEO_COMMAND: String,
    CHANGEVIDEO_DIALOG_COMMAND: String,
    CHANGEYOUTUBEVIDEO_COMMAND: String,
    CHANGEYOUTUBEVIDEO_DIALOG_COMMAND: String,
    CHECKSPELLING_COMMAND: String,
    COLLAPSETAG_COMMAND: String,
    COMMENT_COMMAND: String,
    CONTINUEORDEREDLIST_COMMAND: String,
    COPY_COMMAND: String,
    CUSTOMDIALOG_COMMAND: String,
    CUT_COMMAND: String,
    DELETETABLECOLUMN_COMMAND: String,
    DELETETABLEROW_COMMAND: String,
    DELETETABLE_COMMAND: String,
    DELETE_COMMAND: String,
    EXPANDTAG_COMMAND: String,
    EXPORT_COMMAND: String,
    FINDANDREPLACE_DIALOG_COMMAND: String,
    FONTCOLOR_COMMAND: String,
    FONTNAME_COMMAND: String,
    FONTSIZE_COMMAND: String,
    FORMATBLOCK_COMMAND: String,
    FORMATDOCUMENT_COMMAND: String,
    FULLSCREEN_COMMAND: String,
    INDENTLINE_COMMAND: String,
    INDENT_COMMAND: String,
    INSERTAUDIO_COMMAND: String,
    INSERTAUDIO_DIALOG_COMMAND: String,
    INSERTFLASH_COMMAND: String,
    INSERTFLASH_DIALOG_COMMAND: String,
    INSERTIMAGE_COMMAND: String,
    INSERTIMAGE_DIALOG_COMMAND: String,
    INSERTLINK_COMMAND: String,
    INSERTLINK_DIALOG_COMMAND: String,
    INSERTORDEREDLIST_COMMAND: String,
    INSERTPLACEHOLDER_COMMAND: String,
    INSERTPLACEHOLDER_DIALOG_COMMAND: String,
    INSERTTABLECOLUMNTOLEFT_COMMAND: String,
    INSERTTABLECOLUMNTORIGHT_COMMAND: String,
    INSERTTABLEROWABOVE_COMMAND: String,
    INSERTTABLEROWBELOW_COMMAND: String,
    INSERTTABLE_COMMAND: String,
    INSERTTABLE_DIALOG_COMMAND: String,
    INSERTUNORDEREDLIST_COMMAND: String,
    INSERTVIDEO_COMMAND: String,
    INSERTVIDEO_DIALOG_COMMAND: String,
    INSERTYOUTUBEVIDEO_COMMAND: String,
    INSERTYOUTUBEVIDEO_DIALOG_COMMAND: String,
    ITALIC_COMMAND: String,
    JUSTIFYCENTER_COMMAND: String,
    JUSTIFYFULL_COMMAND: String,
    JUSTIFYLEFT_COMMAND: String,
    JUSTIFYRIGHT_COMMAND: String,
    MERGETABLECELLDOWN_COMMAND: String,
    MERGETABLECELLRIGHT_COMMAND: String,
    OUTDENTLINE_COMMAND: String,
    OUTDENT_COMMAND: String,
    PASTEFROMWORDDIALOG_COMMAND: String,
    PASTEFROMWORD_COMMAND: String,
    PASTEHTMLMERGEFORMATTING_COMMAND: String,
    PASTEHTMLPLAINTEXT_COMMAND: String,
    PASTEHTMLSOURCEFORMATTING_COMMAND: String,
    PASTEHTML_COMMAND: String,
    PASTE_COMMAND: String,
    PRINT_COMMAND: String,
    REDO_COMMAND: String,
    REMOVEFORMAT_COMMAND: String,
    RESTARTORDEREDLIST_COMMAND: String,
    SELECT_ALL: String,
    SHOWINTELLISENSE_COMMAND: String,
    SHOWSEARCHPANEL_COMMAND: String,
    SPLITTABLECELLHORIZONTALLY_COMMAND: String,
    SPLITTABLECELLVERTICALLY_COMMAND: String,
    STRIKETHROUGH_COMMAND: String,
    SUBSCRIPT_COMMAND: String,
    SUPERSCRIPT_COMMAND: String,
    TABLECELLPROPERTIES_DIALOG_COMMAND: String,
    TABLECOLUMNPROPERTIES_DIALOG_COMMAND: String,
    TABLEPROPERTIES_DIALOG_COMMAND: String,
    TABLEROWPROPERTIES_DIALOG_COMMAND: String,
    UNCOMMENTHTML_COMMAND: String,
    UNDERLINE_COMMAND: String,
    UNDO_COMMAND: String,
    UNLINK_COMMAND: String,
    UPDATEDOCUMENT_COMMAND: String
  ): ASPxClientCommandConstsStatic = {
    val __obj = js.Dynamic.literal(APPLYCSS_COMMAND = APPLYCSS_COMMAND, BACKCOLOR_COMMAND = BACKCOLOR_COMMAND, BOLD_COMMAND = BOLD_COMMAND, CHANGEAUDIO_COMMAND = CHANGEAUDIO_COMMAND, CHANGEAUDIO_DIALOG_COMMAND = CHANGEAUDIO_DIALOG_COMMAND, CHANGEELEMENTPROPERTIES_COMMAND = CHANGEELEMENTPROPERTIES_COMMAND, CHANGEELEMENTPROPERTIES_DIALOG_COMMAND = CHANGEELEMENTPROPERTIES_DIALOG_COMMAND, CHANGEFLASH_COMMAND = CHANGEFLASH_COMMAND, CHANGEFLASH_DIALOG_COMMAND = CHANGEFLASH_DIALOG_COMMAND, CHANGEIMAGE_COMMAND = CHANGEIMAGE_COMMAND, CHANGEIMAGE_DIALOG_COMMAND = CHANGEIMAGE_DIALOG_COMMAND, CHANGELINK_DIALOG_COMMAND = CHANGELINK_DIALOG_COMMAND, CHANGEPLACEHOLDER_COMMAND = CHANGEPLACEHOLDER_COMMAND, CHANGEPLACEHOLDER_DIALOG_COMMAND = CHANGEPLACEHOLDER_DIALOG_COMMAND, CHANGETABLECELL_COMMAND = CHANGETABLECELL_COMMAND, CHANGETABLECOLUMN_COMMAND = CHANGETABLECOLUMN_COMMAND, CHANGETABLEROW_COMMAND = CHANGETABLEROW_COMMAND, CHANGETABLE_COMMAND = CHANGETABLE_COMMAND, CHANGEVIDEO_COMMAND = CHANGEVIDEO_COMMAND, CHANGEVIDEO_DIALOG_COMMAND = CHANGEVIDEO_DIALOG_COMMAND, CHANGEYOUTUBEVIDEO_COMMAND = CHANGEYOUTUBEVIDEO_COMMAND, CHANGEYOUTUBEVIDEO_DIALOG_COMMAND = CHANGEYOUTUBEVIDEO_DIALOG_COMMAND, CHECKSPELLING_COMMAND = CHECKSPELLING_COMMAND, COLLAPSETAG_COMMAND = COLLAPSETAG_COMMAND, COMMENT_COMMAND = COMMENT_COMMAND, CONTINUEORDEREDLIST_COMMAND = CONTINUEORDEREDLIST_COMMAND, COPY_COMMAND = COPY_COMMAND, CUSTOMDIALOG_COMMAND = CUSTOMDIALOG_COMMAND, CUT_COMMAND = CUT_COMMAND, DELETETABLECOLUMN_COMMAND = DELETETABLECOLUMN_COMMAND, DELETETABLEROW_COMMAND = DELETETABLEROW_COMMAND, DELETETABLE_COMMAND = DELETETABLE_COMMAND, DELETE_COMMAND = DELETE_COMMAND, EXPANDTAG_COMMAND = EXPANDTAG_COMMAND, EXPORT_COMMAND = EXPORT_COMMAND, FINDANDREPLACE_DIALOG_COMMAND = FINDANDREPLACE_DIALOG_COMMAND, FONTCOLOR_COMMAND = FONTCOLOR_COMMAND, FONTNAME_COMMAND = FONTNAME_COMMAND, FONTSIZE_COMMAND = FONTSIZE_COMMAND, FORMATBLOCK_COMMAND = FORMATBLOCK_COMMAND, FORMATDOCUMENT_COMMAND = FORMATDOCUMENT_COMMAND, FULLSCREEN_COMMAND = FULLSCREEN_COMMAND, INDENTLINE_COMMAND = INDENTLINE_COMMAND, INDENT_COMMAND = INDENT_COMMAND, INSERTAUDIO_COMMAND = INSERTAUDIO_COMMAND, INSERTAUDIO_DIALOG_COMMAND = INSERTAUDIO_DIALOG_COMMAND, INSERTFLASH_COMMAND = INSERTFLASH_COMMAND, INSERTFLASH_DIALOG_COMMAND = INSERTFLASH_DIALOG_COMMAND, INSERTIMAGE_COMMAND = INSERTIMAGE_COMMAND, INSERTIMAGE_DIALOG_COMMAND = INSERTIMAGE_DIALOG_COMMAND, INSERTLINK_COMMAND = INSERTLINK_COMMAND, INSERTLINK_DIALOG_COMMAND = INSERTLINK_DIALOG_COMMAND, INSERTORDEREDLIST_COMMAND = INSERTORDEREDLIST_COMMAND, INSERTPLACEHOLDER_COMMAND = INSERTPLACEHOLDER_COMMAND, INSERTPLACEHOLDER_DIALOG_COMMAND = INSERTPLACEHOLDER_DIALOG_COMMAND, INSERTTABLECOLUMNTOLEFT_COMMAND = INSERTTABLECOLUMNTOLEFT_COMMAND, INSERTTABLECOLUMNTORIGHT_COMMAND = INSERTTABLECOLUMNTORIGHT_COMMAND, INSERTTABLEROWABOVE_COMMAND = INSERTTABLEROWABOVE_COMMAND, INSERTTABLEROWBELOW_COMMAND = INSERTTABLEROWBELOW_COMMAND, INSERTTABLE_COMMAND = INSERTTABLE_COMMAND, INSERTTABLE_DIALOG_COMMAND = INSERTTABLE_DIALOG_COMMAND, INSERTUNORDEREDLIST_COMMAND = INSERTUNORDEREDLIST_COMMAND, INSERTVIDEO_COMMAND = INSERTVIDEO_COMMAND, INSERTVIDEO_DIALOG_COMMAND = INSERTVIDEO_DIALOG_COMMAND, INSERTYOUTUBEVIDEO_COMMAND = INSERTYOUTUBEVIDEO_COMMAND, INSERTYOUTUBEVIDEO_DIALOG_COMMAND = INSERTYOUTUBEVIDEO_DIALOG_COMMAND, ITALIC_COMMAND = ITALIC_COMMAND, JUSTIFYCENTER_COMMAND = JUSTIFYCENTER_COMMAND, JUSTIFYFULL_COMMAND = JUSTIFYFULL_COMMAND, JUSTIFYLEFT_COMMAND = JUSTIFYLEFT_COMMAND, JUSTIFYRIGHT_COMMAND = JUSTIFYRIGHT_COMMAND, MERGETABLECELLDOWN_COMMAND = MERGETABLECELLDOWN_COMMAND, MERGETABLECELLRIGHT_COMMAND = MERGETABLECELLRIGHT_COMMAND, OUTDENTLINE_COMMAND = OUTDENTLINE_COMMAND, OUTDENT_COMMAND = OUTDENT_COMMAND, PASTEFROMWORDDIALOG_COMMAND = PASTEFROMWORDDIALOG_COMMAND, PASTEFROMWORD_COMMAND = PASTEFROMWORD_COMMAND, PASTEHTMLMERGEFORMATTING_COMMAND = PASTEHTMLMERGEFORMATTING_COMMAND, PASTEHTMLPLAINTEXT_COMMAND = PASTEHTMLPLAINTEXT_COMMAND, PASTEHTMLSOURCEFORMATTING_COMMAND = PASTEHTMLSOURCEFORMATTING_COMMAND, PASTEHTML_COMMAND = PASTEHTML_COMMAND, PASTE_COMMAND = PASTE_COMMAND, PRINT_COMMAND = PRINT_COMMAND, REDO_COMMAND = REDO_COMMAND, REMOVEFORMAT_COMMAND = REMOVEFORMAT_COMMAND, RESTARTORDEREDLIST_COMMAND = RESTARTORDEREDLIST_COMMAND, SELECT_ALL = SELECT_ALL, SHOWINTELLISENSE_COMMAND = SHOWINTELLISENSE_COMMAND, SHOWSEARCHPANEL_COMMAND = SHOWSEARCHPANEL_COMMAND, SPLITTABLECELLHORIZONTALLY_COMMAND = SPLITTABLECELLHORIZONTALLY_COMMAND, SPLITTABLECELLVERTICALLY_COMMAND = SPLITTABLECELLVERTICALLY_COMMAND, STRIKETHROUGH_COMMAND = STRIKETHROUGH_COMMAND, SUBSCRIPT_COMMAND = SUBSCRIPT_COMMAND, SUPERSCRIPT_COMMAND = SUPERSCRIPT_COMMAND, TABLECELLPROPERTIES_DIALOG_COMMAND = TABLECELLPROPERTIES_DIALOG_COMMAND, TABLECOLUMNPROPERTIES_DIALOG_COMMAND = TABLECOLUMNPROPERTIES_DIALOG_COMMAND, TABLEPROPERTIES_DIALOG_COMMAND = TABLEPROPERTIES_DIALOG_COMMAND, TABLEROWPROPERTIES_DIALOG_COMMAND = TABLEROWPROPERTIES_DIALOG_COMMAND, UNCOMMENTHTML_COMMAND = UNCOMMENTHTML_COMMAND, UNDERLINE_COMMAND = UNDERLINE_COMMAND, UNDO_COMMAND = UNDO_COMMAND, UNLINK_COMMAND = UNLINK_COMMAND, UPDATEDOCUMENT_COMMAND = UPDATEDOCUMENT_COMMAND)
  
    __obj.asInstanceOf[ASPxClientCommandConstsStatic]
  }
}

