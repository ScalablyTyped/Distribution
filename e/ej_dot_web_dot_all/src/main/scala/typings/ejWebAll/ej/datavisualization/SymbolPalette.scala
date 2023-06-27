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
  def addPaletteItem(paletteName: String, node: Any): Unit = js.native
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_SymbolPalette: Model = js.native
  
  /** Remove items to Palettes at runtime
    * @param {string} name of the Palette
    * @param {any} JSON for the new node to removed in Palette
    * @returns {void}
    */
  def removePaletteItem(paletteName: String, node: Any): Unit = js.native
}
object SymbolPalette {
  
  trait DefaultSettings extends StObject {
    
    /** Defines the default properties of the connectors
      * @default {null}
      */
    var connector: js.UndefOr[Any] = js.undefined
    
    /** Defines the default properties of the nodes
      * @default {null}
      */
    var node: js.UndefOr[Any] = js.undefined
  }
  object DefaultSettings {
    
    inline def apply(): DefaultSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultSettings] (val x: Self) extends AnyVal {
      
      inline def setConnector(value: Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Defines whether the symbols can be dragged from palette or not
      * @default {true}
      */
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    /** Customizes the style of the symbol palette
      * @default {e-symbolpalette}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Defines the default properties of nodes and connectors
      */
    var defaultSettings: js.UndefOr[DefaultSettings] = js.undefined
    
    /** Sets the Id of the diagram, over which the symbols will be dropped
      * @default {null}
      */
    var diagramId: js.UndefOr[String] = js.undefined
    
    /** Sets the height of the palette headers
      * @default {30}
      */
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    /** Defines the height of the symbol palette
      * @default {400}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Defines the height of the palette items
      * @default {50}
      */
    var paletteItemHeight: js.UndefOr[Double] = js.undefined
    
    /** Defines the width of the palette items
      * @default {50}
      */
    var paletteItemWidth: js.UndefOr[Double] = js.undefined
    
    /** An array of JSON objects, where each object represents a node/connector
      * @default {[]}
      */
    var palettes: js.UndefOr[js.Array[Palette]] = js.undefined
    
    /** Defines the preview height of the symbols
      * @default {100}
      */
    var previewHeight: js.UndefOr[Double] = js.undefined
    
    /** Defines the offset value to be left between the mouse cursor and symbol previews
      * @default {(110, 110)}
      */
    var previewOffset: js.UndefOr[Any] = js.undefined
    
    /** Defines the width of the symbol previews
      * @default {100}
      */
    var previewWidth: js.UndefOr[Double] = js.undefined
    
    /** Triggers when a palette item is selected or unselected
      */
    var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.undefined
    
    /** Enable or disable the palette item text
      * @default {true}
      */
    var showPaletteItemText: js.UndefOr[Boolean] = js.undefined
    
    /** The width of the palette
      * @default {250}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.SymbolPalette.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.SymbolPalette.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.SymbolPalette.Model] (val x: Self) extends AnyVal {
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDefaultSettings(value: DefaultSettings): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      inline def setDefaultSettingsUndefined: Self = StObject.set(x, "defaultSettings", js.undefined)
      
      inline def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      inline def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPaletteItemHeight(value: Double): Self = StObject.set(x, "paletteItemHeight", value.asInstanceOf[js.Any])
      
      inline def setPaletteItemHeightUndefined: Self = StObject.set(x, "paletteItemHeight", js.undefined)
      
      inline def setPaletteItemWidth(value: Double): Self = StObject.set(x, "paletteItemWidth", value.asInstanceOf[js.Any])
      
      inline def setPaletteItemWidthUndefined: Self = StObject.set(x, "paletteItemWidth", js.undefined)
      
      inline def setPalettes(value: js.Array[Palette]): Self = StObject.set(x, "palettes", value.asInstanceOf[js.Any])
      
      inline def setPalettesUndefined: Self = StObject.set(x, "palettes", js.undefined)
      
      inline def setPalettesVarargs(value: Palette*): Self = StObject.set(x, "palettes", js.Array(value*))
      
      inline def setPreviewHeight(value: Double): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
      
      inline def setPreviewHeightUndefined: Self = StObject.set(x, "previewHeight", js.undefined)
      
      inline def setPreviewOffset(value: Any): Self = StObject.set(x, "previewOffset", value.asInstanceOf[js.Any])
      
      inline def setPreviewOffsetUndefined: Self = StObject.set(x, "previewOffset", js.undefined)
      
      inline def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      inline def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      inline def setSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setShowPaletteItemText(value: Boolean): Self = StObject.set(x, "showPaletteItemText", value.asInstanceOf[js.Any])
      
      inline def setShowPaletteItemTextUndefined: Self = StObject.set(x, "showPaletteItemText", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Palette extends StObject {
    
    /** Defines whether the palette must be in expanded state or in collapsed state
      * @default {true}
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the palette items
      * @default {[]}
      */
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Defines the name of the palette
      * @default {null}
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Palette {
    
    inline def apply(): Palette = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Palette]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Palette] (val x: Self) extends AnyVal {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait SelectionChangeEventArgs extends StObject {
    
    /** returns whether an element is selected or unselected
      */
    var changeType: js.UndefOr[String] = js.undefined
    
    /** returns the node or connector that is selected or unselected
      */
    var element: js.UndefOr[Any] = js.undefined
  }
  object SelectionChangeEventArgs {
    
    inline def apply(): SelectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
