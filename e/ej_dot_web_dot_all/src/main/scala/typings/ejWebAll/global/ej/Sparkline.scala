package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Sparkline")
@js.native
class Sparkline protected ()
  extends typings.ejWebAll.ej.Sparkline {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}

/* static members */
@JSGlobal("ej.Sparkline")
@js.native
object Sparkline extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Sparkline = js.native
  @js.native
  object FontStyle extends js.Object {
    /* 1 */ val Italic: typings.ejWebAll.ej.Sparkline.FontStyle.Italic with Double = js.native
    /* 0 */ val Normal: typings.ejWebAll.ej.Sparkline.FontStyle.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.FontStyle with Double] = js.native
  }
  
  @js.native
  object FontWeight extends js.Object {
    /* 1 */ val Bold: typings.ejWebAll.ej.Sparkline.FontWeight.Bold with Double = js.native
    /* 2 */ val Lighter: typings.ejWebAll.ej.Sparkline.FontWeight.Lighter with Double = js.native
    /* 0 */ val Regular: typings.ejWebAll.ej.Sparkline.FontWeight.Regular with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.FontWeight with Double] = js.native
  }
  
  @js.native
  object Theme extends js.Object {
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.Theme with Double] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    /* 0 */ val Area: typings.ejWebAll.ej.Sparkline.Type.Area with Double = js.native
    /* 2 */ val Column: typings.ejWebAll.ej.Sparkline.Type.Column with Double = js.native
    /* 1 */ val Line: typings.ejWebAll.ej.Sparkline.Type.Line with Double = js.native
    /* 3 */ val Pie: typings.ejWebAll.ej.Sparkline.Type.Pie with Double = js.native
    /* 4 */ val WinLoss: typings.ejWebAll.ej.Sparkline.Type.WinLoss with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Sparkline.Type with Double] = js.native
  }
  
}

