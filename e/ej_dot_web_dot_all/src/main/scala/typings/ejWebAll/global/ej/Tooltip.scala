package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tooltip")
@js.native
class Tooltip protected ()
  extends typings.ejWebAll.ej.Tooltip {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Tooltip {
  
  @JSGlobal("ej.Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Tooltip.Associate")
  @js.native
  object Associate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.Associate with Double] = js.native
    
    /* 3 */ val Axis: typings.ejWebAll.ej.Tooltip.Associate.Axis with Double = js.native
    
    /* 2 */ val MouseEnter: typings.ejWebAll.ej.Tooltip.Associate.MouseEnter with Double = js.native
    
    /* 1 */ val MouseFollow: typings.ejWebAll.ej.Tooltip.Associate.MouseFollow with Double = js.native
    
    /* 0 */ val Target: typings.ejWebAll.ej.Tooltip.Associate.Target with Double = js.native
    
    /* 4 */ val Window: typings.ejWebAll.ej.Tooltip.Associate.Window with Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.CloseMode")
  @js.native
  object CloseMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.CloseMode with Double] = js.native
    
    /* 1 */ val Auto: typings.ejWebAll.ej.Tooltip.CloseMode.Auto with Double = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.Tooltip.CloseMode.None with Double = js.native
    
    /* 0 */ val Sticky: typings.ejWebAll.ej.Tooltip.CloseMode.Sticky with Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.Collision")
  @js.native
  object Collision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.Collision with Double] = js.native
    
    /* 1 */ val Fit: typings.ejWebAll.ej.Tooltip.Collision.Fit with Double = js.native
    
    /* 0 */ val Flip: typings.ejWebAll.ej.Tooltip.Collision.Flip with Double = js.native
    
    /* 2 */ val FlipFit: typings.ejWebAll.ej.Tooltip.Collision.FlipFit with Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.Tooltip.Collision.None with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tooltip.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tooltip.Trigger")
  @js.native
  object Trigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.Trigger with Double] = js.native
    
    /* 0 */ val Click: typings.ejWebAll.ej.Tooltip.Trigger.Click with Double = js.native
    
    /* 2 */ val Focus: typings.ejWebAll.ej.Tooltip.Trigger.Focus with Double = js.native
    
    /* 1 */ val Hover: typings.ejWebAll.ej.Tooltip.Trigger.Hover with Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.effect")
  @js.native
  object effect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tooltip.effect with Double] = js.native
    
    /* 2 */ val Fade: typings.ejWebAll.ej.Tooltip.effect.Fade with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.Tooltip.effect.None with Double = js.native
    
    /* 1 */ val Slide: typings.ejWebAll.ej.Tooltip.effect.Slide with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tooltip.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Tooltip = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
