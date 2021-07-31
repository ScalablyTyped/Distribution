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
import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.gradient
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorCodeField extends StObject {
  
  var colorCodeField: js.UndefOr[String] = js.undefined
  
  var colorizeGroups: js.UndefOr[Boolean] = js.undefined
  
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: js.UndefOr[discrete | gradient | none | range] = js.undefined
}
object ColorCodeField {
  
  @scala.inline
  def apply(): ColorCodeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCodeField]
  }
  
  @scala.inline
  implicit class ColorCodeFieldMutableBuilder[Self <: ColorCodeField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorCodeField(value: String): Self = StObject.set(x, "colorCodeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCodeFieldUndefined: Self = StObject.set(x, "colorCodeField", js.undefined)
    
    @scala.inline
    def setColorizeGroups(value: Boolean): Self = StObject.set(x, "colorizeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorizeGroupsUndefined: Self = StObject.set(x, "colorizeGroups", js.undefined)
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setType(value: discrete | gradient | none | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
