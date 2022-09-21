package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rating")
@js.native
open class Rating protected ()
  extends StObject
     with typings.ejWebAll.ej.Rating {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Rating {
  
  @JSGlobal("ej.Rating")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Rating.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Rating.Precision")
  @js.native
  object Precision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Rating.Precision & Double] = js.native
    
    /* 0 */ val Exact: typings.ejWebAll.ej.Rating.Precision.Exact & Double = js.native
    
    /* 1 */ val Full: typings.ejWebAll.ej.Rating.Precision.Full & Double = js.native
    
    /* 2 */ val Half: typings.ejWebAll.ej.Rating.Precision.Half & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Rating.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Rating = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Rating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
