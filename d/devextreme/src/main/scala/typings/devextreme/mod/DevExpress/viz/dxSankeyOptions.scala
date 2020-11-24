package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorMode
import typings.devextreme.anon.ComponentElementEventModelTarget
import typings.devextreme.anon.HorizontalOffset
import typings.devextreme.anon.KeepLabels
import typings.devextreme.anon.Padding
import typings.devextreme.anon.`27`
import typings.devextreme.anon.`28`
import typings.devextreme.anon.`29`
import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
import typings.devextreme.devextremeStrings.Material
import typings.devextreme.devextremeStrings.Ocean
import typings.devextreme.devextremeStrings.Office
import typings.devextreme.devextremeStrings.Pastel
import typings.devextreme.devextremeStrings.Soft
import typings.devextreme.devextremeStrings.Vintage
import typings.devextreme.devextremeStrings.Violet
import typings.devextreme.devextremeStrings.`Dark Moon`
import typings.devextreme.devextremeStrings.`Dark Violet`
import typings.devextreme.devextremeStrings.`Green Mist`
import typings.devextreme.devextremeStrings.`Harmony Light`
import typings.devextreme.devextremeStrings.`Soft Blue`
import typings.devextreme.devextremeStrings.`Soft Pastel`
import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSankeyOptions extends BaseWidgetOptions[dxSankey] {
  
  /**
    * [descr:dxSankey.Options.adaptiveLayout]
    */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.native
  
  /**
    * [descr:dxSankey.Options.alignment]
    */
  var alignment: js.UndefOr[bottom | center | top | (js.Array[bottom | center | top])] = js.native
  
  /**
    * [descr:dxSankey.Options.dataSource]
    */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  
  /**
    * [descr:dxSankey.Options.hoverEnabled]
    */
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxSankey.Options.label]
    */
  var label: js.UndefOr[HorizontalOffset] = js.native
  
  /**
    * [descr:dxSankey.Options.link]
    */
  var link: js.UndefOr[ColorMode] = js.native
  
  /**
    * [descr:dxSankey.Options.node]
    */
  var node: js.UndefOr[Padding] = js.native
  
  /**
    * [descr:dxSankey.Options.onLinkClick]
    */
  var onLinkClick: js.UndefOr[(js.Function1[/* e */ ComponentElementEventModelTarget, _]) | String] = js.native
  
  /**
    * [descr:dxSankey.Options.onLinkHoverChanged]
    */
  var onLinkHoverChanged: js.UndefOr[js.Function1[/* e */ `27`, _]] = js.native
  
  /**
    * [descr:dxSankey.Options.onNodeClick]
    */
  var onNodeClick: js.UndefOr[(js.Function1[/* e */ `28`, _]) | String] = js.native
  
  /**
    * [descr:dxSankey.Options.onNodeHoverChanged]
    */
  var onNodeHoverChanged: js.UndefOr[js.Function1[/* e */ `29`, _]] = js.native
  
  /**
    * [descr:dxSankey.Options.palette]
    */
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  
  /**
    * [descr:dxSankey.Options.paletteExtensionMode]
    */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  
  /**
    * [descr:dxSankey.Options.sortData]
    */
  var sortData: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxSankey.Options.sourceField]
    */
  var sourceField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSankey.Options.targetField]
    */
  var targetField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSankey.Options.tooltip]
    */
  @JSName("tooltip")
  var tooltip_dxSankeyOptions: js.UndefOr[dxSankeyTooltip] = js.native
  
  /**
    * [descr:dxSankey.Options.weightField]
    */
  var weightField: js.UndefOr[String] = js.native
}
object dxSankeyOptions {
  
  @scala.inline
  def apply(): dxSankeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyOptions]
  }
  
  @scala.inline
  implicit class dxSankeyOptionsOps[Self <: dxSankeyOptions] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveLayout(value: KeepLabels): Self = this.set("adaptiveLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveLayout: Self = this.set("adaptiveLayout", js.undefined)
    
    @scala.inline
    def setAlignmentVarargs(value: (bottom | center | top)*): Self = this.set("alignment", js.Array(value :_*))
    
    @scala.inline
    def setAlignment(value: bottom | center | top | (js.Array[bottom | center | top])): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverEnabled: Self = this.set("hoverEnabled", js.undefined)
    
    @scala.inline
    def setLabel(value: HorizontalOffset): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLink(value: ColorMode): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setNode(value: Padding): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setOnLinkClickFunction1(value: /* e */ ComponentElementEventModelTarget => _): Self = this.set("onLinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLinkClick(value: (js.Function1[/* e */ ComponentElementEventModelTarget, _]) | String): Self = this.set("onLinkClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLinkClick: Self = this.set("onLinkClick", js.undefined)
    
    @scala.inline
    def setOnLinkHoverChanged(value: /* e */ `27` => _): Self = this.set("onLinkHoverChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLinkHoverChanged: Self = this.set("onLinkHoverChanged", js.undefined)
    
    @scala.inline
    def setOnNodeClickFunction1(value: /* e */ `28` => _): Self = this.set("onNodeClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNodeClick(value: (js.Function1[/* e */ `28`, _]) | String): Self = this.set("onNodeClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnNodeClick: Self = this.set("onNodeClick", js.undefined)
    
    @scala.inline
    def setOnNodeHoverChanged(value: /* e */ `29` => _): Self = this.set("onNodeHoverChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNodeHoverChanged: Self = this.set("onNodeHoverChanged", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = this.set("paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteExtensionMode: Self = this.set("paletteExtensionMode", js.undefined)
    
    @scala.inline
    def setSortData(value: js.Any): Self = this.set("sortData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortData: Self = this.set("sortData", js.undefined)
    
    @scala.inline
    def setSourceField(value: String): Self = this.set("sourceField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceField: Self = this.set("sourceField", js.undefined)
    
    @scala.inline
    def setTargetField(value: String): Self = this.set("targetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetField: Self = this.set("targetField", js.undefined)
    
    @scala.inline
    def setTooltip(value: dxSankeyTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setWeightField(value: String): Self = this.set("weightField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightField: Self = this.set("weightField", js.undefined)
  }
}
