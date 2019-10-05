package typings.ejDotWebDotAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tools extends js.Object {
  /** Specifies the alignment tools and the display order of this tool in the RTE toolbar.
    */
  var alignment: js.UndefOr[js.Any] = js.undefined
  /** Specifies the casing tools and the display order of this tool in the RTE toolbar.
    */
  var casing: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the clear tools and the display order of this tool in the RTE toolbar.
    */
  var clear: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the clipboard tools and the display order of this tool in the RTE toolbar.
    */
  var clipboard: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the customOrderedList tools and the display order of this tool in the RTE toolbar.
    */
  var customOrderedList: js.UndefOr[js.Array[ToolsCustomOrderedList]] = js.undefined
  /** Specifies the customUnOrderedList tools and the display order of this tool in the RTE toolbar.
    */
  var customUnorderedList: js.UndefOr[js.Array[ToolsCustomUnorderedList]] = js.undefined
  /** Specifies the doAction tools and the display order of this tool in the RTE toolbar.
    */
  var doAction: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the edit tools and the displays tool in the RTE toolbar.
    */
  var edit: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the effect of tools and the display order of this tool in RTE toolbar.
    */
  var effects: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the font tools and the display order of this tool in the RTE toolbar.
    */
  var font: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the formatStyle tools and the display order of this tool in the RTE toolbar.
    */
  var formatStyle: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the image tools and the display order of this tool in the RTE toolbar.
    */
  var images: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the importExport tools and the display order of this tool in the RTE toolbar.
    */
  var importExport: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the indent tools and the display order of this tool in the RTE toolbar.
    */
  var indenting: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the link tools and the display order of this tool in the RTE toolbar.
    */
  var links: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the list tools and the display order of this tool in the RTE toolbar.
    */
  var lists: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the media tools and the display order of this tool in the RTE toolbar.
    */
  var media: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the print tools and the display order of this tool in the RTE toolbar.
    */
  var print: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the style tools and the display order of this tool in the RTE toolbar.
    */
  var style: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the table tools and the display order of this tool in the RTE toolbar.
    */
  var tables: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the view tools and the display order of this tool in the RTE toolbar.
    */
  var view: js.UndefOr[js.Array[_]] = js.undefined
}

object Tools {
  @scala.inline
  def apply(
    alignment: js.Any = null,
    casing: js.Array[_] = null,
    clear: js.Array[_] = null,
    clipboard: js.Array[_] = null,
    customOrderedList: js.Array[ToolsCustomOrderedList] = null,
    customUnorderedList: js.Array[ToolsCustomUnorderedList] = null,
    doAction: js.Array[_] = null,
    edit: js.Array[_] = null,
    effects: js.Array[_] = null,
    font: js.Array[_] = null,
    formatStyle: js.Array[_] = null,
    images: js.Array[_] = null,
    importExport: js.Array[_] = null,
    indenting: js.Array[_] = null,
    links: js.Array[_] = null,
    lists: js.Array[_] = null,
    media: js.Array[_] = null,
    print: js.Array[_] = null,
    style: js.Array[_] = null,
    tables: js.Array[_] = null,
    view: js.Array[_] = null
  ): Tools = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (casing != null) __obj.updateDynamic("casing")(casing)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard)
    if (customOrderedList != null) __obj.updateDynamic("customOrderedList")(customOrderedList)
    if (customUnorderedList != null) __obj.updateDynamic("customUnorderedList")(customUnorderedList)
    if (doAction != null) __obj.updateDynamic("doAction")(doAction)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (font != null) __obj.updateDynamic("font")(font)
    if (formatStyle != null) __obj.updateDynamic("formatStyle")(formatStyle)
    if (images != null) __obj.updateDynamic("images")(images)
    if (importExport != null) __obj.updateDynamic("importExport")(importExport)
    if (indenting != null) __obj.updateDynamic("indenting")(indenting)
    if (links != null) __obj.updateDynamic("links")(links)
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (media != null) __obj.updateDynamic("media")(media)
    if (print != null) __obj.updateDynamic("print")(print)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Tools]
  }
}

