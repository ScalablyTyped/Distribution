package typings.dmx

import typings.dmx.mod.OptionRange
import typings.dmx.mod.SliderRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colorpretsets extends StObject {
    
    var `color-pretsets`: js.UndefOr[OptionRange] = js.undefined
    
    var `colour-macros-programme-01`: js.UndefOr[OptionRange] = js.undefined
    
    var ctrl: js.UndefOr[OptionRange] = js.undefined
    
    var dimmer: js.UndefOr[SliderRange] = js.undefined
    
    var `programme-selection`: js.UndefOr[OptionRange] = js.undefined
    
    var `static-color`: js.UndefOr[OptionRange] = js.undefined
    
    var strobe: js.UndefOr[OptionRange] = js.undefined
    
    var temperature: js.UndefOr[OptionRange] = js.undefined
  }
  object Colorpretsets {
    
    inline def apply(): Colorpretsets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colorpretsets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colorpretsets] (val x: Self) extends AnyVal {
      
      inline def `setColor-pretsets`(value: OptionRange): Self = StObject.set(x, "color-pretsets", value.asInstanceOf[js.Any])
      
      inline def `setColor-pretsetsUndefined`: Self = StObject.set(x, "color-pretsets", js.undefined)
      
      inline def `setColour-macros-programme-01`(value: OptionRange): Self = StObject.set(x, "colour-macros-programme-01", value.asInstanceOf[js.Any])
      
      inline def `setColour-macros-programme-01Undefined`: Self = StObject.set(x, "colour-macros-programme-01", js.undefined)
      
      inline def setCtrl(value: OptionRange): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
      
      inline def setDimmer(value: SliderRange): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
      
      inline def `setProgramme-selection`(value: OptionRange): Self = StObject.set(x, "programme-selection", value.asInstanceOf[js.Any])
      
      inline def `setProgramme-selectionUndefined`: Self = StObject.set(x, "programme-selection", js.undefined)
      
      inline def `setStatic-color`(value: OptionRange): Self = StObject.set(x, "static-color", value.asInstanceOf[js.Any])
      
      inline def `setStatic-colorUndefined`: Self = StObject.set(x, "static-color", js.undefined)
      
      inline def setStrobe(value: OptionRange): Self = StObject.set(x, "strobe", value.asInstanceOf[js.Any])
      
      inline def setStrobeUndefined: Self = StObject.set(x, "strobe", js.undefined)
      
      inline def setTemperature(value: OptionRange): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
      
      inline def setTemperatureUndefined: Self = StObject.set(x, "temperature", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var value: Double
  }
  object Label {
    
    inline def apply(label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
