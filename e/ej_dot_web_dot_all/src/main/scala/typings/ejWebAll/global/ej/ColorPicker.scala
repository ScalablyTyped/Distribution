package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ColorPicker")
@js.native
class ColorPicker protected ()
  extends typings.ejWebAll.ej.ColorPicker {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object ColorPicker {
  
  @JSGlobal("ej.ColorPicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ColorPicker.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ColorPicker.ModelType")
  @js.native
  object ModelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ColorPicker.ModelType with Double] = js.native
    
    /* 0 */ val Palette: typings.ejWebAll.ej.ColorPicker.ModelType.Palette with Double = js.native
    
    /* 1 */ val Picker: typings.ejWebAll.ej.ColorPicker.ModelType.Picker with Double = js.native
  }
  
  @JSGlobal("ej.ColorPicker.Palette")
  @js.native
  object Palette extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ColorPicker.Palette with Double] = js.native
    
    /* 0 */ val BasicPalette: typings.ejWebAll.ej.ColorPicker.Palette.BasicPalette with Double = js.native
    
    /* 1 */ val CustomPalette: typings.ejWebAll.ej.ColorPicker.Palette.CustomPalette with Double = js.native
  }
  
  @JSGlobal("ej.ColorPicker.Presets")
  @js.native
  object Presets extends StObject {
    
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
  
  /* static member */
  @JSGlobal("ej.ColorPicker.fn")
  @js.native
  def fn: typings.ejWebAll.ej.ColorPicker = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.ColorPicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
