package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorMode
import typings.devextreme.anon.HorizontalOffset
import typings.devextreme.anon.KeepLabels
import typings.devextreme.anon.Padding
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.common.charts.PaletteExtensionMode
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.viz.dxSankey.LinkClickEvent
import typings.devextreme.mod.DevExpress.viz.dxSankey.LinkHoverEvent
import typings.devextreme.mod.DevExpress.viz.dxSankey.NodeClickEvent
import typings.devextreme.mod.DevExpress.viz.dxSankey.NodeHoverEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyOptions
  extends StObject
     with BaseWidgetOptions[dxSankey] {
  
  /**
    * Specifies adaptive layout properties.
    */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.undefined
  
  /**
    * Aligns node columns vertically.
    */
  var alignment: js.UndefOr[VerticalAlignment | js.Array[VerticalAlignment]] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies whether nodes and links change their style when they are hovered over or pressed.
    */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures sankey nodes&apos; labels.
    */
  var label: js.UndefOr[HorizontalOffset] = js.undefined
  
  /**
    * Configures sankey links&apos; appearance.
    */
  var link: js.UndefOr[ColorMode] = js.undefined
  
  /**
    * Configures sankey nodes&apos; appearance.
    */
  var node: js.UndefOr[Padding] = js.undefined
  
  /**
    * A function that is executed when a sankey link is clicked or tapped.
    */
  var onLinkClick: js.UndefOr[(js.Function1[/* e */ LinkClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a sankey link.
    */
  var onLinkHoverChanged: js.UndefOr[js.Function1[/* e */ LinkHoverEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a sankey node is clicked or tapped.
    */
  var onNodeClick: js.UndefOr[(js.Function1[/* e */ NodeClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a sankey node.
    */
  var onNodeHoverChanged: js.UndefOr[js.Function1[/* e */ NodeHoverEvent, Unit]] = js.undefined
  
  /**
    * Sets the palette to be used to colorize sankey nodes.
    */
  var palette: js.UndefOr[js.Array[String] | Palette] = js.undefined
  
  /**
    * Specifies how to extend the palette when it contains less colors than the number of sankey nodes.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionMode] = js.undefined
  
  /**
    * Specifies nodes&apos; sorting order in their columns.
    */
  var sortData: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies which data source field provides links&apos; source nodes.
    */
  var sourceField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which data source field provides links&apos; target nodes.
    */
  var targetField: js.UndefOr[String] = js.undefined
  
  /**
    * Configures tooltips - small pop-up rectangles that display information about a data-visualizing UI component element being pressed or hovered over with the mouse pointer.
    */
  @JSName("tooltip")
  var tooltip_dxSankeyOptions: js.UndefOr[dxSankeyTooltip] = js.undefined
  
  /**
    * Specifies which data source field provides links&apos; weights.
    */
  var weightField: js.UndefOr[String] = js.undefined
}
object dxSankeyOptions {
  
  inline def apply(): dxSankeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyOptions]
  }
  
  extension [Self <: dxSankeyOptions](x: Self) {
    
    inline def setAdaptiveLayout(value: KeepLabels): Self = StObject.set(x, "adaptiveLayout", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveLayoutUndefined: Self = StObject.set(x, "adaptiveLayout", js.undefined)
    
    inline def setAlignment(value: VerticalAlignment | js.Array[VerticalAlignment]): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAlignmentVarargs(value: VerticalAlignment*): Self = StObject.set(x, "alignment", js.Array(value*))
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setLabel(value: HorizontalOffset): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLink(value: ColorMode): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setNode(value: Padding): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOnLinkClick(value: (js.Function1[/* e */ LinkClickEvent, Unit]) | String): Self = StObject.set(x, "onLinkClick", value.asInstanceOf[js.Any])
    
    inline def setOnLinkClickFunction1(value: /* e */ LinkClickEvent => Unit): Self = StObject.set(x, "onLinkClick", js.Any.fromFunction1(value))
    
    inline def setOnLinkClickUndefined: Self = StObject.set(x, "onLinkClick", js.undefined)
    
    inline def setOnLinkHoverChanged(value: /* e */ LinkHoverEvent => Unit): Self = StObject.set(x, "onLinkHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnLinkHoverChangedUndefined: Self = StObject.set(x, "onLinkHoverChanged", js.undefined)
    
    inline def setOnNodeClick(value: (js.Function1[/* e */ NodeClickEvent, Unit]) | String): Self = StObject.set(x, "onNodeClick", value.asInstanceOf[js.Any])
    
    inline def setOnNodeClickFunction1(value: /* e */ NodeClickEvent => Unit): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction1(value))
    
    inline def setOnNodeClickUndefined: Self = StObject.set(x, "onNodeClick", js.undefined)
    
    inline def setOnNodeHoverChanged(value: /* e */ NodeHoverEvent => Unit): Self = StObject.set(x, "onNodeHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnNodeHoverChangedUndefined: Self = StObject.set(x, "onNodeHoverChanged", js.undefined)
    
    inline def setPalette(value: js.Array[String] | Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionMode): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setSortData(value: Any): Self = StObject.set(x, "sortData", value.asInstanceOf[js.Any])
    
    inline def setSortDataUndefined: Self = StObject.set(x, "sortData", js.undefined)
    
    inline def setSourceField(value: String): Self = StObject.set(x, "sourceField", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldUndefined: Self = StObject.set(x, "sourceField", js.undefined)
    
    inline def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    inline def setTargetFieldUndefined: Self = StObject.set(x, "targetField", js.undefined)
    
    inline def setTooltip(value: dxSankeyTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setWeightField(value: String): Self = StObject.set(x, "weightField", value.asInstanceOf[js.Any])
    
    inline def setWeightFieldUndefined: Self = StObject.set(x, "weightField", js.undefined)
  }
}
