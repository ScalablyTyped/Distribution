package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Sparkline")
@js.native
class Sparkline protected ()
  extends typings.ejWebAll.ej.Sparkline {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Sparkline {
  
  @JSGlobal("ej.Sparkline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Sparkline.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.FontStyle with Double] = js.native
    
    /* 1 */ val Italic: typings.ejWebAll.ej.Sparkline.FontStyle.Italic with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.Sparkline.FontStyle.Normal with Double = js.native
  }
  
  @JSGlobal("ej.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.FontWeight with Double] = js.native
    
    /* 1 */ val Bold: typings.ejWebAll.ej.Sparkline.FontWeight.Bold with Double = js.native
    
    /* 2 */ val Lighter: typings.ejWebAll.ej.Sparkline.FontWeight.Lighter with Double = js.native
    
    /* 0 */ val Regular: typings.ejWebAll.ej.Sparkline.FontWeight.Regular with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Sparkline.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.Theme with Double] = js.native
    
    /* 0 */ val Azure: typings.ejWebAll.ej.Sparkline.Theme.Azure with Double = js.native
    
    /* 3 */ val Azuredark: typings.ejWebAll.ej.Sparkline.Theme.Azuredark with Double = js.native
    
    /* 2 */ val FlatDark: typings.ejWebAll.ej.Sparkline.Theme.FlatDark with Double = js.native
    
    /* 1 */ val FlatLight: typings.ejWebAll.ej.Sparkline.Theme.FlatLight with Double = js.native
    
    /* 9 */ val GradientDark: typings.ejWebAll.ej.Sparkline.Theme.GradientDark with Double = js.native
    
    /* 8 */ val GradientLight: typings.ejWebAll.ej.Sparkline.Theme.GradientLight with Double = js.native
    
    /* 4 */ val Lime: typings.ejWebAll.ej.Sparkline.Theme.Lime with Double = js.native
    
    /* 5 */ val LimeDark: typings.ejWebAll.ej.Sparkline.Theme.LimeDark with Double = js.native
    
    /* 6 */ val Saffron: typings.ejWebAll.ej.Sparkline.Theme.Saffron with Double = js.native
    
    /* 7 */ val SaffronDark: typings.ejWebAll.ej.Sparkline.Theme.SaffronDark with Double = js.native
  }
  
  @JSGlobal("ej.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.Type with Double] = js.native
    
    /* 0 */ val Area: typings.ejWebAll.ej.Sparkline.Type.Area with Double = js.native
    
    /* 2 */ val Column: typings.ejWebAll.ej.Sparkline.Type.Column with Double = js.native
    
    /* 1 */ val Line: typings.ejWebAll.ej.Sparkline.Type.Line with Double = js.native
    
    /* 3 */ val Pie: typings.ejWebAll.ej.Sparkline.Type.Pie with Double = js.native
    
    /* 4 */ val WinLoss: typings.ejWebAll.ej.Sparkline.Type.WinLoss with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Sparkline.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Sparkline = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Sparkline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
