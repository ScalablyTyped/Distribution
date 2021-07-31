package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolPalette
  extends StObject
     with Widget_ {
  
  /** Add items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new items to added in Palette
    * @returns {void}
    */
  def addPaletteItem(paletteName: String, node: js.Any): Unit = js.native
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_SymbolPalette: Model = js.native
  
  /** Remove items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new node to removed in Palette
    * @returns {void}
    */
  def removePaletteItem(paletteName: String, node: js.Any): Unit = js.native
}
object SymbolPalette {
  
  trait DefaultSettings extends StObject {
    
    /** Defines the default properties of the connectors
      * @Default {null}
      */
    var connector: js.UndefOr[js.Any] = js.undefined
    
    /** Defines the default properties of the nodes
      * @Default {null}
      */
    var node: js.UndefOr[js.Any] = js.undefined
  }
  object DefaultSettings {
    
    @scala.inline
    def apply(): DefaultSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSettings]
    }
    
    @scala.inline
    implicit class DefaultSettingsMutableBuilder[Self <: DefaultSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnector(value: js.Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      @scala.inline
      def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Defines whether the symbols can be dragged from palette or not
      * @Default {true}
      */
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    /** Customizes the style of the symbol palette
      * @Default {e-symbolpalette}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Defines the default properties of nodes and connectors
      */
    var defaultSettings: js.UndefOr[DefaultSettings] = js.undefined
    
    /** Sets the Id of the diagram, over which the symbols will be dropped
      * @Default {null}
      */
    var diagramId: js.UndefOr[String] = js.undefined
    
    /** Sets the height of the palette headers
      * @Default {30}
      */
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    /** Defines the height of the symbol palette
      * @Default {400}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Defines the height of the palette items
      * @Default {50}
      */
    var paletteItemHeight: js.UndefOr[Double] = js.undefined
    
    /** Defines the width of the palette items
      * @Default {50}
      */
    var paletteItemWidth: js.UndefOr[Double] = js.undefined
    
    /** An array of JSON objects, where each object represents a node/connector
      * @Default {[]}
      */
    var palettes: js.UndefOr[js.Array[Palette]] = js.undefined
    
    /** Defines the preview height of the symbols
      * @Default {100}
      */
    var previewHeight: js.UndefOr[Double] = js.undefined
    
    /** Defines the offset value to be left between the mouse cursor and symbol previews
      * @Default {(110, 110)}
      */
    var previewOffset: js.UndefOr[js.Any] = js.undefined
    
    /** Defines the width of the symbol previews
      * @Default {100}
      */
    var previewWidth: js.UndefOr[Double] = js.undefined
    
    /** Triggers when a palette item is selected or unselected
      */
    var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.undefined
    
    /** Enable or disable the palette item text
      * @Default {true}
      */
    var showPaletteItemText: js.UndefOr[Boolean] = js.undefined
    
    /** The width of the palette
      * @Default {250}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.SymbolPalette.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.SymbolPalette.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.SymbolPalette.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDefaultSettings(value: DefaultSettings): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSettingsUndefined: Self = StObject.set(x, "defaultSettings", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPaletteItemHeight(value: Double): Self = StObject.set(x, "paletteItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteItemHeightUndefined: Self = StObject.set(x, "paletteItemHeight", js.undefined)
      
      @scala.inline
      def setPaletteItemWidth(value: Double): Self = StObject.set(x, "paletteItemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteItemWidthUndefined: Self = StObject.set(x, "paletteItemWidth", js.undefined)
      
      @scala.inline
      def setPalettes(value: js.Array[Palette]): Self = StObject.set(x, "palettes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalettesUndefined: Self = StObject.set(x, "palettes", js.undefined)
      
      @scala.inline
      def setPalettesVarargs(value: Palette*): Self = StObject.set(x, "palettes", js.Array(value :_*))
      
      @scala.inline
      def setPreviewHeight(value: Double): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewHeightUndefined: Self = StObject.set(x, "previewHeight", js.undefined)
      
      @scala.inline
      def setPreviewOffset(value: js.Any): Self = StObject.set(x, "previewOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOffsetUndefined: Self = StObject.set(x, "previewOffset", js.undefined)
      
      @scala.inline
      def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      @scala.inline
      def setSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      @scala.inline
      def setShowPaletteItemText(value: Boolean): Self = StObject.set(x, "showPaletteItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPaletteItemTextUndefined: Self = StObject.set(x, "showPaletteItemText", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Palette extends StObject {
    
    /** Defines whether the palette must be in expanded state or in collapsed state
      * @Default {true}
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the palette items
      * @Default {[]}
      */
    var items: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Defines the name of the palette
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Palette {
    
    @scala.inline
    def apply(): Palette = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Palette]
    }
    
    @scala.inline
    implicit class PaletteMutableBuilder[Self <: Palette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait SelectionChangeEventArgs extends StObject {
    
    /** returns whether an element is selected or unselected
      */
    var changeType: js.UndefOr[String] = js.undefined
    
    /** returns the node or connector that is selected or unselected
      */
    var element: js.UndefOr[js.Any] = js.undefined
  }
  object SelectionChangeEventArgs {
    
    @scala.inline
    def apply(): SelectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionChangeEventArgs]
    }
    
    @scala.inline
    implicit class SelectionChangeEventArgsMutableBuilder[Self <: SelectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
