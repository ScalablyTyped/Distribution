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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderWidth extends StObject {
  
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
  implicit class BorderWidthMutableBuilder[Self <: BorderWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGroupingField(value: String): Self = StObject.set(x, "colorGroupingField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGroupingFieldUndefined: Self = StObject.set(x, "colorGroupingField", js.undefined)
    
    @scala.inline
    def setColorGroups(value: js.Array[Double]): Self = StObject.set(x, "colorGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGroupsUndefined: Self = StObject.set(x, "colorGroups", js.undefined)
    
    @scala.inline
    def setColorGroupsVarargs(value: Double*): Self = StObject.set(x, "colorGroups", js.Array(value :_*))
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCustomize(value: /* elements */ js.Array[MapLayerElement] => _): Self = StObject.set(x, "customize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setDataSource(
      value: js.Any | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions | String | js.Array[_]
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setElementType(value: bubble | dot | image | pie): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    @scala.inline
    def setHoveredBorderColor(value: String): Self = StObject.set(x, "hoveredBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredBorderColorUndefined: Self = StObject.set(x, "hoveredBorderColor", js.undefined)
    
    @scala.inline
    def setHoveredBorderWidth(value: Double): Self = StObject.set(x, "hoveredBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredBorderWidthUndefined: Self = StObject.set(x, "hoveredBorderWidth", js.undefined)
    
    @scala.inline
    def setHoveredColor(value: String): Self = StObject.set(x, "hoveredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredColorUndefined: Self = StObject.set(x, "hoveredColor", js.undefined)
    
    @scala.inline
    def setLabel(value: DataFieldEnabled): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteSize(value: Double): Self = StObject.set(x, "paletteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteSizeUndefined: Self = StObject.set(x, "paletteSize", js.undefined)
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value :_*))
    
    @scala.inline
    def setSelectedBorderColor(value: String): Self = StObject.set(x, "selectedBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBorderColorUndefined: Self = StObject.set(x, "selectedBorderColor", js.undefined)
    
    @scala.inline
    def setSelectedBorderWidth(value: Double): Self = StObject.set(x, "selectedBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBorderWidthUndefined: Self = StObject.set(x, "selectedBorderWidth", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: multiple | none | single_): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGroupingField(value: String): Self = StObject.set(x, "sizeGroupingField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGroupingFieldUndefined: Self = StObject.set(x, "sizeGroupingField", js.undefined)
    
    @scala.inline
    def setSizeGroups(value: js.Array[Double]): Self = StObject.set(x, "sizeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGroupsUndefined: Self = StObject.set(x, "sizeGroups", js.undefined)
    
    @scala.inline
    def setSizeGroupsVarargs(value: Double*): Self = StObject.set(x, "sizeGroups", js.Array(value :_*))
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: area | line | marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
