package typings.ejWebAll.ej.datavisualization.SymbolPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Defines whether the symbols can be dragged from palette or not
    * @Default {true}
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  
  /** Customizes the style of the symbol palette
    * @Default {e-symbolpalette}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Defines the default properties of nodes and connectors
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.native
  
  /** Sets the Id of the diagram, over which the symbols will be dropped
    * @Default {null}
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** Sets the height of the palette headers
    * @Default {30}
    */
  var headerHeight: js.UndefOr[Double] = js.native
  
  /** Defines the height of the symbol palette
    * @Default {400}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Defines the height of the palette items
    * @Default {50}
    */
  var paletteItemHeight: js.UndefOr[Double] = js.native
  
  /** Defines the width of the palette items
    * @Default {50}
    */
  var paletteItemWidth: js.UndefOr[Double] = js.native
  
  /** An array of JSON objects, where each object represents a node/connector
    * @Default {[]}
    */
  var palettes: js.UndefOr[js.Array[Palette]] = js.native
  
  /** Defines the preview height of the symbols
    * @Default {100}
    */
  var previewHeight: js.UndefOr[Double] = js.native
  
  /** Defines the offset value to be left between the mouse cursor and symbol previews
    * @Default {(110, 110)}
    */
  var previewOffset: js.UndefOr[js.Any] = js.native
  
  /** Defines the width of the symbol previews
    * @Default {100}
    */
  var previewWidth: js.UndefOr[Double] = js.native
  
  /** Triggers when a palette item is selected or unselected
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.native
  
  /** Enable or disable the palette item text
    * @Default {true}
    */
  var showPaletteItemText: js.UndefOr[Boolean] = js.native
  
  /** The width of the palette
    * @Default {250}
    */
  var width: js.UndefOr[Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDrag: Self = this.set("allowDrag", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDefaultSettings(value: DefaultSettings): Self = this.set("defaultSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSettings: Self = this.set("defaultSettings", js.undefined)
    
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPaletteItemHeight(value: Double): Self = this.set("paletteItemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteItemHeight: Self = this.set("paletteItemHeight", js.undefined)
    
    @scala.inline
    def setPaletteItemWidth(value: Double): Self = this.set("paletteItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteItemWidth: Self = this.set("paletteItemWidth", js.undefined)
    
    @scala.inline
    def setPalettesVarargs(value: Palette*): Self = this.set("palettes", js.Array(value :_*))
    
    @scala.inline
    def setPalettes(value: js.Array[Palette]): Self = this.set("palettes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalettes: Self = this.set("palettes", js.undefined)
    
    @scala.inline
    def setPreviewHeight(value: Double): Self = this.set("previewHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewHeight: Self = this.set("previewHeight", js.undefined)
    
    @scala.inline
    def setPreviewOffset(value: js.Any): Self = this.set("previewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewOffset: Self = this.set("previewOffset", js.undefined)
    
    @scala.inline
    def setPreviewWidth(value: Double): Self = this.set("previewWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewWidth: Self = this.set("previewWidth", js.undefined)
    
    @scala.inline
    def setSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = this.set("selectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectionChange: Self = this.set("selectionChange", js.undefined)
    
    @scala.inline
    def setShowPaletteItemText(value: Boolean): Self = this.set("showPaletteItemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPaletteItemText: Self = this.set("showPaletteItemText", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
