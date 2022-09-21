package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ComboBox")
@js.native
open class ComboBox protected ()
  extends StObject
     with typings.ejWebAll.ej.ComboBox {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object ComboBox {
  
  @JSGlobal("ej.ComboBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ComboBox.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ComboBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ComboBox.SortOrder & Double] = js.native
    
    /* 1 */ val Ascending: typings.ejWebAll.ej.ComboBox.SortOrder.Ascending & Double = js.native
    
    /* 2 */ val Descending: typings.ejWebAll.ej.ComboBox.SortOrder.Descending & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.ComboBox.SortOrder.None & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ComboBox.fn")
  @js.native
  def fn: typings.ejWebAll.ej.ComboBox = js.native
  inline def fn_=(x: typings.ejWebAll.ej.ComboBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
