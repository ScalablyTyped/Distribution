package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
open class PivotSchemaDesigner protected ()
  extends StObject
     with typings.ejWebAll.ej.PivotSchemaDesigner {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PivotSchemaDesigner {
  
  @JSGlobal("ej.PivotSchemaDesigner")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotSchemaDesigner.Layouts")
  @js.native
  object Layouts extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotSchemaDesigner.Layouts & Double] = js.native
    
    /* 0 */ val Excel: typings.ejWebAll.ej.PivotSchemaDesigner.Layouts.Excel & Double = js.native
    
    /* 1 */ val Normal: typings.ejWebAll.ej.PivotSchemaDesigner.Layouts.Normal & Double = js.native
    
    /* 2 */ val OneByOne: typings.ejWebAll.ej.PivotSchemaDesigner.Layouts.OneByOne & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotSchemaDesigner.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotSchemaDesigner.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotSchemaDesigner = js.native
  inline def fn_=(x: typings.ejWebAll.ej.PivotSchemaDesigner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
