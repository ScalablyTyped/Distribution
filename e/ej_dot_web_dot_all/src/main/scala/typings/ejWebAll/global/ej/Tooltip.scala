package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tooltip")
@js.native
class Tooltip protected ()
  extends typings.ejWebAll.ej.Tooltip {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Tooltip.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Tooltip.Model) = this()
}
/* static members */
@JSGlobal("ej.Tooltip")
@js.native
object Tooltip extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.Tooltip = js.native
  
  @js.native
  object Associate extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.Associate with Double] = js.native
    
    /* 3 */ val Axis: typings.ejWebAll.ej.Tooltip.Associate.Axis with Double = js.native
    
    /* 2 */ val MouseEnter: typings.ejWebAll.ej.Tooltip.Associate.MouseEnter with Double = js.native
    
    /* 1 */ val MouseFollow: typings.ejWebAll.ej.Tooltip.Associate.MouseFollow with Double = js.native
    
    /* 0 */ val Target: typings.ejWebAll.ej.Tooltip.Associate.Target with Double = js.native
    
    /* 4 */ val Window: typings.ejWebAll.ej.Tooltip.Associate.Window with Double = js.native
  }
  
  @js.native
  object CloseMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.CloseMode with Double] = js.native
    
    /* 1 */ val Auto: typings.ejWebAll.ej.Tooltip.CloseMode.Auto with Double = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.Tooltip.CloseMode.None with Double = js.native
    
    /* 0 */ val Sticky: typings.ejWebAll.ej.Tooltip.CloseMode.Sticky with Double = js.native
  }
  
  @js.native
  object Collision extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.Collision with Double] = js.native
    
    /* 1 */ val Fit: typings.ejWebAll.ej.Tooltip.Collision.Fit with Double = js.native
    
    /* 0 */ val Flip: typings.ejWebAll.ej.Tooltip.Collision.Flip with Double = js.native
    
    /* 2 */ val FlipFit: typings.ejWebAll.ej.Tooltip.Collision.FlipFit with Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.Tooltip.Collision.None with Double = js.native
  }
  
  @js.native
  object Trigger extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.Trigger with Double] = js.native
    
    /* 0 */ val Click: typings.ejWebAll.ej.Tooltip.Trigger.Click with Double = js.native
    
    /* 2 */ val Focus: typings.ejWebAll.ej.Tooltip.Trigger.Focus with Double = js.native
    
    /* 1 */ val Hover: typings.ejWebAll.ej.Tooltip.Trigger.Hover with Double = js.native
  }
  
  @js.native
  object effect extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.effect with Double] = js.native
    
    /* 2 */ val Fade: typings.ejWebAll.ej.Tooltip.effect.Fade with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.Tooltip.effect.None with Double = js.native
    
    /* 1 */ val Slide: typings.ejWebAll.ej.Tooltip.effect.Slide with Double = js.native
  }
}
