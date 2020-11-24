package typings.devextreme.anon

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
import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bubble
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.marker
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.pie
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.viz.MapLayerElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderWidth extends js.Object {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colorGroupingField: js.UndefOr[String] = js.native
  
  var colorGroups: js.UndefOr[js.Array[Double]] = js.native
  
  var customize: js.UndefOr[js.Function1[/* elements */ js.Array[MapLayerElement], _]] = js.native
  
  var dataField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[
    js.Any | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String | js.Array[_]
  ] = js.native
  
  var elementType: js.UndefOr[bubble | dot | image | pie] = js.native
  
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  
  var hoveredBorderColor: js.UndefOr[String] = js.native
  
  var hoveredBorderWidth: js.UndefOr[Double] = js.native
  
  var hoveredColor: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[DataFieldEnabled] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  
  var paletteSize: js.UndefOr[Double] = js.native
  
  var selectedBorderColor: js.UndefOr[String] = js.native
  
  var selectedBorderWidth: js.UndefOr[Double] = js.native
  
  var selectedColor: js.UndefOr[String] = js.native
  
  var selectionMode: js.UndefOr[multiple | none | single_] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var sizeGroupingField: js.UndefOr[String] = js.native
  
  var sizeGroups: js.UndefOr[js.Array[Double]] = js.native
  
  var `type`: js.UndefOr[area | line | marker] = js.native
}
object BorderWidth {
  
  @scala.inline
  def apply(): BorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidth]
  }
  
  @scala.inline
  implicit class BorderWidthOps[Self <: BorderWidth] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorGroupingField(value: String): Self = this.set("colorGroupingField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorGroupingField: Self = this.set("colorGroupingField", js.undefined)
    
    @scala.inline
    def setColorGroupsVarargs(value: Double*): Self = this.set("colorGroups", js.Array(value :_*))
    
    @scala.inline
    def setColorGroups(value: js.Array[Double]): Self = this.set("colorGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorGroups: Self = this.set("colorGroups", js.undefined)
    
    @scala.inline
    def setCustomize(value: /* elements */ js.Array[MapLayerElement] => _): Self = this.set("customize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomize: Self = this.set("customize", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(
      value: js.Any | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String | js.Array[_]
    ): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setElementType(value: bubble | dot | image | pie): Self = this.set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverEnabled: Self = this.set("hoverEnabled", js.undefined)
    
    @scala.inline
    def setHoveredBorderColor(value: String): Self = this.set("hoveredBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoveredBorderColor: Self = this.set("hoveredBorderColor", js.undefined)
    
    @scala.inline
    def setHoveredBorderWidth(value: Double): Self = this.set("hoveredBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoveredBorderWidth: Self = this.set("hoveredBorderWidth", js.undefined)
    
    @scala.inline
    def setHoveredColor(value: String): Self = this.set("hoveredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoveredColor: Self = this.set("hoveredColor", js.undefined)
    
    @scala.inline
    def setLabel(value: DataFieldEnabled): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPaletteSize(value: Double): Self = this.set("paletteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteSize: Self = this.set("paletteSize", js.undefined)
    
    @scala.inline
    def setSelectedBorderColor(value: String): Self = this.set("selectedBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedBorderColor: Self = this.set("selectedBorderColor", js.undefined)
    
    @scala.inline
    def setSelectedBorderWidth(value: Double): Self = this.set("selectedBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedBorderWidth: Self = this.set("selectedBorderWidth", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: multiple | none | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeGroupingField(value: String): Self = this.set("sizeGroupingField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeGroupingField: Self = this.set("sizeGroupingField", js.undefined)
    
    @scala.inline
    def setSizeGroupsVarargs(value: Double*): Self = this.set("sizeGroups", js.Array(value :_*))
    
    @scala.inline
    def setSizeGroups(value: js.Array[Double]): Self = this.set("sizeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeGroups: Self = this.set("sizeGroups", js.undefined)
    
    @scala.inline
    def setType(value: area | line | marker): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
