package typings.devextreme.anon

import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bubble
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.image
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.marker
import typings.devextreme.devextremeStrings.pie
import typings.devextreme.mod.DevExpress.common.SingleMultipleOrNone
import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.viz.MapLayerElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorGroupingField extends StObject {
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colorGroupingField: js.UndefOr[String] = js.undefined
  
  var colorGroups: js.UndefOr[js.Array[Double]] = js.undefined
  
  var customize: js.UndefOr[js.Function1[/* elements */ js.Array[MapLayerElement], Any]] = js.undefined
  
  var dataField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[js.Object | (DataSourceLike[Any, Any]) | Null] = js.undefined
  
  var elementType: js.UndefOr[bubble | dot | image | pie] = js.undefined
  
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  var hoveredBorderColor: js.UndefOr[String] = js.undefined
  
  var hoveredBorderWidth: js.UndefOr[Double] = js.undefined
  
  var hoveredColor: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[DataField] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var palette: js.UndefOr[js.Array[String] | Palette] = js.undefined
  
  var paletteSize: js.UndefOr[Double] = js.undefined
  
  var selectedBorderColor: js.UndefOr[String] = js.undefined
  
  var selectedBorderWidth: js.UndefOr[Double] = js.undefined
  
  var selectedColor: js.UndefOr[String] = js.undefined
  
  var selectionMode: js.UndefOr[SingleMultipleOrNone] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeGroupingField: js.UndefOr[String] = js.undefined
  
  var sizeGroups: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: js.UndefOr[area | line | marker] = js.undefined
}
object ColorGroupingField {
  
  inline def apply(): ColorGroupingField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorGroupingField]
  }
  
  extension [Self <: ColorGroupingField](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorGroupingField(value: String): Self = StObject.set(x, "colorGroupingField", value.asInstanceOf[js.Any])
    
    inline def setColorGroupingFieldUndefined: Self = StObject.set(x, "colorGroupingField", js.undefined)
    
    inline def setColorGroups(value: js.Array[Double]): Self = StObject.set(x, "colorGroups", value.asInstanceOf[js.Any])
    
    inline def setColorGroupsUndefined: Self = StObject.set(x, "colorGroups", js.undefined)
    
    inline def setColorGroupsVarargs(value: Double*): Self = StObject.set(x, "colorGroups", js.Array(value*))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCustomize(value: /* elements */ js.Array[MapLayerElement] => Any): Self = StObject.set(x, "customize", js.Any.fromFunction1(value))
    
    inline def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataSource(value: js.Object | (DataSourceLike[Any, Any])): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setElementType(value: bubble | dot | image | pie): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setHoveredBorderColor(value: String): Self = StObject.set(x, "hoveredBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoveredBorderColorUndefined: Self = StObject.set(x, "hoveredBorderColor", js.undefined)
    
    inline def setHoveredBorderWidth(value: Double): Self = StObject.set(x, "hoveredBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoveredBorderWidthUndefined: Self = StObject.set(x, "hoveredBorderWidth", js.undefined)
    
    inline def setHoveredColor(value: String): Self = StObject.set(x, "hoveredColor", value.asInstanceOf[js.Any])
    
    inline def setHoveredColorUndefined: Self = StObject.set(x, "hoveredColor", js.undefined)
    
    inline def setLabel(value: DataField): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPalette(value: js.Array[String] | Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteSize(value: Double): Self = StObject.set(x, "paletteSize", value.asInstanceOf[js.Any])
    
    inline def setPaletteSizeUndefined: Self = StObject.set(x, "paletteSize", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setSelectedBorderColor(value: String): Self = StObject.set(x, "selectedBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedBorderColorUndefined: Self = StObject.set(x, "selectedBorderColor", js.undefined)
    
    inline def setSelectedBorderWidth(value: Double): Self = StObject.set(x, "selectedBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setSelectedBorderWidthUndefined: Self = StObject.set(x, "selectedBorderWidth", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setSelectionMode(value: SingleMultipleOrNone): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupingField(value: String): Self = StObject.set(x, "sizeGroupingField", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupingFieldUndefined: Self = StObject.set(x, "sizeGroupingField", js.undefined)
    
    inline def setSizeGroups(value: js.Array[Double]): Self = StObject.set(x, "sizeGroups", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupsUndefined: Self = StObject.set(x, "sizeGroups", js.undefined)
    
    inline def setSizeGroupsVarargs(value: Double*): Self = StObject.set(x, "sizeGroups", js.Array(value*))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: area | line | marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
