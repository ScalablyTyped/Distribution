package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.common.charts.PaletteExtensionMode
import typings.devextreme.mod.DevExpress.viz.dxTreeMap.TreeMapColorizerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorCodeField extends StObject {
  
  /**
    * Specifies the name of the data source field whose values define the color of a tile. Applies only if the type property is &apos;gradient&apos; or &apos;range&apos;.
    */
  var colorCodeField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not all tiles in a group must be colored uniformly. Applies only if the type property is &apos;discrete&apos;.
    */
  var colorizeGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the palette to be used to colorize tiles.
    */
  var palette: js.UndefOr[js.Array[String] | Palette] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of treemap tiles.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionMode] = js.undefined
  
  /**
    * Allows you to paint tiles with similar values uniformly. Applies only if the type property is &apos;gradient&apos; or &apos;range&apos;.
    */
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies the colorizing algorithm.
    */
  var `type`: js.UndefOr[TreeMapColorizerType] = js.undefined
}
object ColorCodeField {
  
  inline def apply(): ColorCodeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCodeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorCodeField] (val x: Self) extends AnyVal {
    
    inline def setColorCodeField(value: String): Self = StObject.set(x, "colorCodeField", value.asInstanceOf[js.Any])
    
    inline def setColorCodeFieldUndefined: Self = StObject.set(x, "colorCodeField", js.undefined)
    
    inline def setColorizeGroups(value: Boolean): Self = StObject.set(x, "colorizeGroups", value.asInstanceOf[js.Any])
    
    inline def setColorizeGroupsUndefined: Self = StObject.set(x, "colorizeGroups", js.undefined)
    
    inline def setPalette(value: js.Array[String] | Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionMode): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setType(value: TreeMapColorizerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
