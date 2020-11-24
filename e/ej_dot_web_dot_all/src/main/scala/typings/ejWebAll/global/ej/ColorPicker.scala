package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ColorPicker")
@js.native
class ColorPicker protected ()
  extends typings.ejWebAll.ej.ColorPicker {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ColorPicker.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ColorPicker.Model) = this()
}
/* static members */
@JSGlobal("ej.ColorPicker")
@js.native
object ColorPicker extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.ColorPicker = js.native
  
  @js.native
  object ModelType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ColorPicker.ModelType with Double] = js.native
    
    /* 0 */ val Palette: typings.ejWebAll.ej.ColorPicker.ModelType.Palette with Double = js.native
    
    /* 1 */ val Picker: typings.ejWebAll.ej.ColorPicker.ModelType.Picker with Double = js.native
  }
  
  @js.native
  object Palette extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ColorPicker.Palette with Double] = js.native
    
    /* 0 */ val BasicPalette: typings.ejWebAll.ej.ColorPicker.Palette.BasicPalette with Double = js.native
    
    /* 1 */ val CustomPalette: typings.ejWebAll.ej.ColorPicker.Palette.CustomPalette with Double = js.native
  }
  
  @js.native
  object Presets extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ColorPicker.Presets with Double] = js.native
    
    /* 0 */ val Basic: typings.ejWebAll.ej.ColorPicker.Presets.Basic with Double = js.native
    
    /* 1 */ val CandyCrush: typings.ejWebAll.ej.ColorPicker.Presets.CandyCrush with Double = js.native
    
    /* 2 */ val Citrus: typings.ejWebAll.ej.ColorPicker.Presets.Citrus with Double = js.native
    
    /* 3 */ val FlatColors: typings.ejWebAll.ej.ColorPicker.Presets.FlatColors with Double = js.native
    
    /* 4 */ val Misty: typings.ejWebAll.ej.ColorPicker.Presets.Misty with Double = js.native
    
    /* 5 */ val MoonLight: typings.ejWebAll.ej.ColorPicker.Presets.MoonLight with Double = js.native
    
    /* 6 */ val PinkShades: typings.ejWebAll.ej.ColorPicker.Presets.PinkShades with Double = js.native
    
    /* 7 */ val Sandy: typings.ejWebAll.ej.ColorPicker.Presets.Sandy with Double = js.native
    
    /* 8 */ val SeaWolf: typings.ejWebAll.ej.ColorPicker.Presets.SeaWolf with Double = js.native
    
    /* 9 */ val Vintage: typings.ejWebAll.ej.ColorPicker.Presets.Vintage with Double = js.native
    
    /* 10 */ val WebColors: typings.ejWebAll.ej.ColorPicker.Presets.WebColors with Double = js.native
  }
}
