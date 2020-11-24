package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rotator")
@js.native
class Rotator protected ()
  extends typings.ejWebAll.ej.Rotator {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Rotator.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Rotator.Model) = this()
}
/* static members */
@JSGlobal("ej.Rotator")
@js.native
object Rotator extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.Rotator = js.native
  
  @js.native
  object PagerPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Rotator.PagerPosition with Double] = js.native
    
    /* 0 */ val BottomLeft: typings.ejWebAll.ej.Rotator.PagerPosition.BottomLeft with Double = js.native
    
    /* 1 */ val BottomRight: typings.ejWebAll.ej.Rotator.PagerPosition.BottomRight with Double = js.native
    
    /* 2 */ val Outside: typings.ejWebAll.ej.Rotator.PagerPosition.Outside with Double = js.native
    
    /* 3 */ val TopCenter: typings.ejWebAll.ej.Rotator.PagerPosition.TopCenter with Double = js.native
    
    /* 4 */ val TopLeft: typings.ejWebAll.ej.Rotator.PagerPosition.TopLeft with Double = js.native
    
    /* 5 */ val TopRight: typings.ejWebAll.ej.Rotator.PagerPosition.TopRight with Double = js.native
  }
}
