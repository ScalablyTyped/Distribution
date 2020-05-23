package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tab")
@js.native
class Tab protected ()
  extends typings.ejWebAll.ej.Tab {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Tab.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Tab.Model) = this()
}

/* static members */
@JSGlobal("ej.Tab")
@js.native
object Tab extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Tab = js.native
  @js.native
  object HeightAdjustMode extends js.Object {
    /* 2 */ val Auto: typings.ejWebAll.ej.Tab.HeightAdjustMode.Auto with Double = js.native
    /* 1 */ val Content: typings.ejWebAll.ej.Tab.HeightAdjustMode.Content with Double = js.native
    /* 3 */ val Fill: typings.ejWebAll.ej.Tab.HeightAdjustMode.Fill with Double = js.native
    /* 0 */ val None: typings.ejWebAll.ej.Tab.HeightAdjustMode.None with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tab.HeightAdjustMode with Double] = js.native
  }
  
  @js.native
  object Position extends js.Object {
    /* 1 */ val Bottom: typings.ejWebAll.ej.Tab.Position.Bottom with Double = js.native
    /* 2 */ val Left: typings.ejWebAll.ej.Tab.Position.Left with Double = js.native
    /* 3 */ val Right: typings.ejWebAll.ej.Tab.Position.Right with Double = js.native
    /* 0 */ val Top: typings.ejWebAll.ej.Tab.Position.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tab.Position with Double] = js.native
  }
  
}

