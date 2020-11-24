package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tools extends js.Object {
  
  /** Specifies the alignment tools and the display order of this tool in the RTE toolbar.
    */
  var alignment: js.UndefOr[js.Any] = js.native
  
  /** Specifies the casing tools and the display order of this tool in the RTE toolbar.
    */
  var casing: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the clear tools and the display order of this tool in the RTE toolbar.
    */
  var clear: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the clipboard tools and the display order of this tool in the RTE toolbar.
    */
  var clipboard: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the customOrderedList tools and the display order of this tool in the RTE toolbar.
    */
  var customOrderedList: js.UndefOr[js.Array[ToolsCustomOrderedList]] = js.native
  
  /** Specifies the customUnOrderedList tools and the display order of this tool in the RTE toolbar.
    */
  var customUnorderedList: js.UndefOr[js.Array[ToolsCustomUnorderedList]] = js.native
  
  /** Specifies the doAction tools and the display order of this tool in the RTE toolbar.
    */
  var doAction: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the edit tools and the displays tool in the RTE toolbar.
    */
  var edit: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the effect of tools and the display order of this tool in RTE toolbar.
    */
  var effects: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the font tools and the display order of this tool in the RTE toolbar.
    */
  var font: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the formatStyle tools and the display order of this tool in the RTE toolbar.
    */
  var formatStyle: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the image tools and the display order of this tool in the RTE toolbar.
    */
  var images: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the importExport tools and the display order of this tool in the RTE toolbar.
    */
  var importExport: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the indent tools and the display order of this tool in the RTE toolbar.
    */
  var indenting: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the link tools and the display order of this tool in the RTE toolbar.
    */
  var links: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the list tools and the display order of this tool in the RTE toolbar.
    */
  var lists: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the media tools and the display order of this tool in the RTE toolbar.
    */
  var media: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the print tools and the display order of this tool in the RTE toolbar.
    */
  var print: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the style tools and the display order of this tool in the RTE toolbar.
    */
  var style: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the table tools and the display order of this tool in the RTE toolbar.
    */
  var tables: js.UndefOr[js.Array[_]] = js.native
  
  /** Specifies the view tools and the display order of this tool in the RTE toolbar.
    */
  var view: js.UndefOr[js.Array[_]] = js.native
}
object Tools {
  
  @scala.inline
  def apply(): Tools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tools]
  }
  
  @scala.inline
  implicit class ToolsOps[Self <: Tools] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignment(value: js.Any): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setCasingVarargs(value: js.Any*): Self = this.set("casing", js.Array(value :_*))
    
    @scala.inline
    def setCasing(value: js.Array[_]): Self = this.set("casing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCasing: Self = this.set("casing", js.undefined)
    
    @scala.inline
    def setClearVarargs(value: js.Any*): Self = this.set("clear", js.Array(value :_*))
    
    @scala.inline
    def setClear(value: js.Array[_]): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setClipboardVarargs(value: js.Any*): Self = this.set("clipboard", js.Array(value :_*))
    
    @scala.inline
    def setClipboard(value: js.Array[_]): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    
    @scala.inline
    def setCustomOrderedListVarargs(value: ToolsCustomOrderedList*): Self = this.set("customOrderedList", js.Array(value :_*))
    
    @scala.inline
    def setCustomOrderedList(value: js.Array[ToolsCustomOrderedList]): Self = this.set("customOrderedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomOrderedList: Self = this.set("customOrderedList", js.undefined)
    
    @scala.inline
    def setCustomUnorderedListVarargs(value: ToolsCustomUnorderedList*): Self = this.set("customUnorderedList", js.Array(value :_*))
    
    @scala.inline
    def setCustomUnorderedList(value: js.Array[ToolsCustomUnorderedList]): Self = this.set("customUnorderedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUnorderedList: Self = this.set("customUnorderedList", js.undefined)
    
    @scala.inline
    def setDoActionVarargs(value: js.Any*): Self = this.set("doAction", js.Array(value :_*))
    
    @scala.inline
    def setDoAction(value: js.Array[_]): Self = this.set("doAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoAction: Self = this.set("doAction", js.undefined)
    
    @scala.inline
    def setEditVarargs(value: js.Any*): Self = this.set("edit", js.Array(value :_*))
    
    @scala.inline
    def setEdit(value: js.Array[_]): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setEffectsVarargs(value: js.Any*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[_]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setFontVarargs(value: js.Any*): Self = this.set("font", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: js.Array[_]): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFormatStyleVarargs(value: js.Any*): Self = this.set("formatStyle", js.Array(value :_*))
    
    @scala.inline
    def setFormatStyle(value: js.Array[_]): Self = this.set("formatStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatStyle: Self = this.set("formatStyle", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setImportExportVarargs(value: js.Any*): Self = this.set("importExport", js.Array(value :_*))
    
    @scala.inline
    def setImportExport(value: js.Array[_]): Self = this.set("importExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportExport: Self = this.set("importExport", js.undefined)
    
    @scala.inline
    def setIndentingVarargs(value: js.Any*): Self = this.set("indenting", js.Array(value :_*))
    
    @scala.inline
    def setIndenting(value: js.Array[_]): Self = this.set("indenting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndenting: Self = this.set("indenting", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Any*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[_]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setListsVarargs(value: js.Any*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[_]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setMediaVarargs(value: js.Any*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[_]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setPrintVarargs(value: js.Any*): Self = this.set("print", js.Array(value :_*))
    
    @scala.inline
    def setPrint(value: js.Array[_]): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: js.Any*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: js.Array[_]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: js.Any*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[_]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setViewVarargs(value: js.Any*): Self = this.set("view", js.Array(value :_*))
    
    @scala.inline
    def setView(value: js.Array[_]): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
