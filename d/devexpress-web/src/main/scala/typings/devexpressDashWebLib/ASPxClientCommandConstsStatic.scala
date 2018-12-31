package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCommandConstsStatic extends js.Object {
  /**
    * Identifies a command that wraps the currently selected text content in a specific html tag with a css class assigned to it.
    * Value: "applycss"
    */
  var APPLYCSS_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the color of a back color pickers and sets the selected text back color.
    * Value: "backcolor"
    */
  var BACKCOLOR_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the bold text formatting to the selected text. If it's already applied, cancels it.
    * Value: "bold"
    */
  var BOLD_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected audio element.
    * Value: "changeaudio"
    */
  var CHANGEAUDIO_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Audio dialog.
    * Value: "changeaudiodialog"
    */
  var CHANGEAUDIO_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes properties of the element selected in the tag inspector.
    * Value: "changeelementproperties"
    */
  var CHANGEELEMENTPROPERTIES_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Element Properties dialog.
    * Value: "changeelementpropertiesdialog"
    */
  var CHANGEELEMENTPROPERTIES_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected flash element.
    * Value: "changeflash"
    */
  var CHANGEFLASH_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Flash dialog.
    * Value: "changeflash"
    */
  var CHANGEFLASH_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected image.
    * Value: "changeimage"
    */
  var CHANGEIMAGE_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Image dialog.
    * Value: "changeimagedialog"
    */
  var CHANGEIMAGE_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Link dialog.
    * Value: "changelinkdialog"
    */
  var CHANGELINK_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected placeholder.
    * Value: "changeplaceholder"
    */
  var CHANGEPLACEHOLDER_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Placeholder dialog.
    * Value: "changeplaceholderdialog"
    */
  var CHANGEPLACEHOLDER_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected table cell.
    * Value: "changetablecell"
    */
  var CHANGETABLECELL_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected table column.
    * Value: "changetablecolumn"
    */
  var CHANGETABLECOLUMN_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected table row.
    * Value: "changetablerow"
    */
  var CHANGETABLEROW_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected table.
    * Value: "changetable"
    */
  var CHANGETABLE_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected video element.
    * Value: "changevideo"
    */
  var CHANGEVIDEO_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change Video dialog.
    * Value: "changevideodialog"
    */
  var CHANGEVIDEO_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the selected YouTube video element.
    * Value: "changeyoutubevideo"
    */
  var CHANGEYOUTUBEVIDEO_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Change YouTube Video dialog.
    * Value: "changeyoutubevideodialog"
    */
  var CHANGEYOUTUBEVIDEO_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that initiates spell checking.
    * Value: "checkspelling"
    */
  var CHECKSPELLING_COMMAND: java.lang.String
  /**
    * Identifies a command that collapses the selected HTML tag.
    * Value: "collapsetag"
    */
  var COLLAPSETAG_COMMAND: java.lang.String
  /**
    * Identifies a command that comments the selected HTML code. If no code is selected, it comments the focused tag.
    * Value: "comment"
    */
  var COMMENT_COMMAND: java.lang.String
  /**
    * Identifies a command that continues a disrupted ordered list.
    * Value: "continueorderedlist"
    */
  var CONTINUEORDEREDLIST_COMMAND: java.lang.String
  /**
    * Identifies a command that copies the selected content.
    * Value: "copy"
    */
  var COPY_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes a custom dialog.
    * Value: "customdialog"
    */
  var CUSTOMDIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that cuts the selected content.
    * Value: "cut"
    */
  var CUT_COMMAND: java.lang.String
  /**
    * Identifies a command that deletes the currently selected table column.
    * Value: "deletetablecolumn"
    */
  var DELETETABLECOLUMN_COMMAND: java.lang.String
  /**
    * Identifies a command that deletes the currently selected table row.
    * Value: "deletetablerow"
    */
  var DELETETABLEROW_COMMAND: java.lang.String
  /**
    * Identifies a command that deletes the currently selected table.
    * Value: "deletetable"
    */
  var DELETETABLE_COMMAND: java.lang.String
  /**
    * Identifies a command that deletes the selected content.
    * Value: "delete"
    */
  var DELETE_COMMAND: java.lang.String
  /**
    * Identifies a command that expands the selected HTML tag.
    * Value: "expandtag"
    */
  var EXPANDTAG_COMMAND: java.lang.String
  /**
    * Identifies a command that exports the html editor content.
    * Value: "export"
    */
  var EXPORT_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Find and Replace dialog.
    * Value: "findandreplacedialog"
    */
  var FINDANDREPLACE_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the color of a fore color pickers and sets the selected text fore color.
    * Value: "forecolor"
    */
  var FONTCOLOR_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the font of the selected text.
    * Value: "fontname"
    */
  var FONTNAME_COMMAND: java.lang.String
  /**
    * Identifies a command that changes the size of the selected text.
    * Value: "fontsize"
    */
  var FONTSIZE_COMMAND: java.lang.String
  /**
    * Identifies a command that wraps the selected paragraph in the specified html tag.
    * Value: "formatblock"
    */
  var FORMATBLOCK_COMMAND: java.lang.String
  /**
    * Identifies a command that formats the current HTML document.
    * Value: "formatdocument"
    */
  var FORMATDOCUMENT_COMMAND: java.lang.String
  /**
    * Identifies a command that toggles the full-screen mode.
    * Value: "fullscreen"
    */
  var FULLSCREEN_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the indent formatting to the selected content.
    * Value: "indent"
    */
  var INDENTLINE_COMMAND: java.lang.String
  /**
    * Identifies a command that creates an indent for the selected paragarph.
    * Value: "indent"
    */
  var INDENT_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new audio element.
    * Value: "insertaudio"
    */
  var INSERTAUDIO_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Audio dialog.
    * Value: "insertaudiodialog"
    */
  var INSERTAUDIO_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new flash element.
    * Value: "insertflash"
    */
  var INSERTFLASH_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Flash dialog.
    * Value: "insertflashdialog"
    */
  var INSERTFLASH_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new image.
    * Value: "insertimage"
    */
  var INSERTIMAGE_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Image dialog.
    * Value: "insertimagedialog"
    */
  var INSERTIMAGE_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new hyperlink.
    * Value: "insertlink"
    */
  var INSERTLINK_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Link dialog.
    * Value: "insertlinkdialog"
    */
  var INSERTLINK_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new ordered list.
    * Value: "insertorderedlist"
    */
  var INSERTORDEREDLIST_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new placeholder.
    * Value: "insertplaceholder"
    */
  var INSERTPLACEHOLDER_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Placeholder dialog.
    * Value: "insertplaceholderdialog"
    */
  var INSERTPLACEHOLDER_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new column to the left from the currently focused one.
    * Value: "inserttablecolumntoleft"
    */
  var INSERTTABLECOLUMNTOLEFT_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new column to the right from the currently focused one.
    * Value: "inserttablecolumntoright"
    */
  var INSERTTABLECOLUMNTORIGHT_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new row above the currently focused one.
    * Value: "inserttablerowabove"
    */
  var INSERTTABLEROWABOVE_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new row below the currently focused one.
    * Value: "inserttablerowbelow"
    */
  var INSERTTABLEROWBELOW_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new table.
    * Value: "inserttable"
    */
  var INSERTTABLE_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Table dialog.
    * Value: "inserttabledialog"
    */
  var INSERTTABLE_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new unordered list.
    * Value: "insertunorderedlist"
    */
  var INSERTUNORDEREDLIST_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new video.
    * Value: "insertvideo"
    */
  var INSERTVIDEO_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert Video dialog.
    * Value: "insertvideodialog"
    */
  var INSERTVIDEO_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that inserts a new YouTube video.
    * Value: "insertyoutubevideo"
    */
  var INSERTYOUTUBEVIDEO_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Insert YouTube Video dialog.
    * Value: "insertyoutubevideodialog"
    */
  var INSERTYOUTUBEVIDEO_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that makes the selected text italic or regular type depending on the current state.
    * Value: "italic"
    */
  var ITALIC_COMMAND: java.lang.String
  /**
    * Identifies a command that centers the content of the currently focused paragraph.
    * Value: "justifycenter"
    */
  var JUSTIFYCENTER_COMMAND: java.lang.String
  /**
    * Identifies a command that fully justifies the content of the currently focused paragraph (aligned with both the left and right margines).
    * Value: "justifyfull"
    */
  var JUSTIFYFULL_COMMAND: java.lang.String
  /**
    * Identifies a command that left justifies the content of the currently focused paragraph.
    * Value: "justifyleft"
    */
  var JUSTIFYLEFT_COMMAND: java.lang.String
  /**
    * Identifies a command that right justifies the content of the currently focused paragraph.
    * Value: "justifyright"
    */
  var JUSTIFYRIGHT_COMMAND: java.lang.String
  /**
    * Identifies a command that merges the focused table cell with the one below.
    * Value: "mergetablecelldown"
    */
  var MERGETABLECELLDOWN_COMMAND: java.lang.String
  /**
    * Identifies a command that merges the focused table cell with the one to the right.
    * Value: "mergetablecellright"
    */
  var MERGETABLECELLRIGHT_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the outdent formatting to the focused content.
    * Value: "outdent"
    */
  var OUTDENTLINE_COMMAND: java.lang.String
  /**
    * Identifies a command that creates an outdent for the focused paragarph.
    * Value: "outdent"
    */
  var OUTDENT_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Paste from Word dialog.
    * Value: "pastefromworddialog"
    */
  var PASTEFROMWORDDIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that pastes a specified content taking into account that it was copied from Word.
    * Value: "pastefromword"
    */
  var PASTEFROMWORD_COMMAND: java.lang.String
  /**
    * Identifies a command that pastes the content of the clipboard to the current cursor position, taking into account that the PasteMode property is set to MergeFormatting.
    * Value: "pastehtmlmergeformatting"
    */
  var PASTEHTMLMERGEFORMATTING_COMMAND: java.lang.String
  /**
    * Identifies a command that pastes the content of the clipboard to the current cursor position, taking into account that the PasteMode property is set to PlainText.
    * Value: "pastehtmlplaintext"
    */
  var PASTEHTMLPLAINTEXT_COMMAND: java.lang.String
  /**
    * Identifies a command that pastes the content of the clipboard to the current cursor position, taking into account that the PasteMode property is set to SourceFormatting.
    * Value: "pastehtmlsourceformatting"
    */
  var PASTEHTMLSOURCEFORMATTING_COMMAND: java.lang.String
  /**
    * Identifies a command that can be used to correctly insert HTML code into the editor.
    * Value: "pastehtml"
    */
  var PASTEHTML_COMMAND: java.lang.String
  /**
    * Identifies a command that pastes the content of the clipboard at the current cursor position.
    * Value: "paste"
    */
  var PASTE_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes a default browser Print dialog, allowing an end-user to print the content of the html editor.
    * Value: "print"
    */
  var PRINT_COMMAND: java.lang.String
  /**
    * Identifies a command that returns a previously canceled action.
    * Value: "redo"
    */
  var REDO_COMMAND: java.lang.String
  /**
    * Identifies a command that removes all formatting from the selected content.
    * Value: "removeformat"
    */
  var REMOVEFORMAT_COMMAND: java.lang.String
  /**
    * Identifies a command that restarts the current ordered list.
    * Value: "restartorderedlist"
    */
  var RESTARTORDEREDLIST_COMMAND: java.lang.String
  /**
    * Identifies a command that selects all content inside the html editor.
    * Value: "selectall"
    */
  var SELECT_ALL: java.lang.String
  /**
    * Identifies a command that shows intellisense for the HTML code editor.
    * Value: "showintellisense"
    */
  var SHOWINTELLISENSE_COMMAND: java.lang.String
  /**
    * Identifies a command that shows a search panel.
    * Value: "showsearchpanel"
    */
  var SHOWSEARCHPANEL_COMMAND: java.lang.String
  /**
    * Identifies a command that splits the current table cell horizontally.
    * Value: "splittablecellhorizontally"
    */
  var SPLITTABLECELLHORIZONTALLY_COMMAND: java.lang.String
  /**
    * Identifies a command that splits the current table cell vertically.
    * Value: "splittablecellvertically"
    */
  var SPLITTABLECELLVERTICALLY_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the strike through text formatting to the selected text. If it's already applied, cancels it.
    * Value: "strikethrough"
    */
  var STRIKETHROUGH_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the subscript text formatting to the selected text. If it's already applied, cancels it.
    * Value: "subscript"
    */
  var SUBSCRIPT_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the superscript text formatting to the selected text. If it's already applied, cancels it.
    * Value: "superscript"
    */
  var SUPERSCRIPT_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Cell Properties dialog.
    * Value: "tablecellpropertiesdialog"
    */
  var TABLECELLPROPERTIES_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Column Properties dialog.
    * Value: "tablecolumnpropertiesdialog"
    */
  var TABLECOLUMNPROPERTIES_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Table Properties dialog.
    * Value: "tablepropertiesdialog"
    */
  var TABLEPROPERTIES_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that invokes the Row Properties dialog.
    * Value: "tablerowpropertiesdialog"
    */
  var TABLEROWPROPERTIES_DIALOG_COMMAND: java.lang.String
  /**
    * Identifies a command that uncomments the selected HTML code. If no code is selected, the command uncomments the currently focused tag.
    * Value: "uncomment"
    */
  var UNCOMMENTHTML_COMMAND: java.lang.String
  /**
    * Identifies a command that applies the underline text formatting to the selected text. If it's already applied, cancels it.
    * Value: "underline"
    */
  var UNDERLINE_COMMAND: java.lang.String
  /**
    * Identifies a command that cancels the last action.
    * Value: "undo"
    */
  var UNDO_COMMAND: java.lang.String
  /**
    * Identifies a command that removes a hyperlink from the selected text or image.
    * Value: "unlink"
    */
  var UNLINK_COMMAND: java.lang.String
  /**
    * Identifies a command that updates the editor content.
    * Value: "updatedocument"
    */
  var UPDATEDOCUMENT_COMMAND: java.lang.String
}

