package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotSchemaDesigner")
@js.native
class PivotSchemaDesigner protected ()
  extends typings.ejWebAll.ej.PivotSchemaDesigner {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.PivotSchemaDesigner.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.PivotSchemaDesigner.Model) = this()
}
/* static members */
@JSGlobal("ej.PivotSchemaDesigner")
@js.native
object PivotSchemaDesigner extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.PivotSchemaDesigner = js.native
  
  @js.native
  object Layouts extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotSchemaDesigner.Layouts with Double] = js.native
    
    /* 0 */ val Excel: typings.ejWebAll.ej.PivotSchemaDesigner.Layouts.Excel with Double = js.native
    
    /* 1 */ val Normal: typings.ejWebAll.ej.PivotSchemaDesigner.Layouts.Normal with Double = js.native
    
    /* 2 */ val OneByOne: typings.ejWebAll.ej.PivotSchemaDesigner.Layouts.OneByOne with Double = js.native
  }
}
