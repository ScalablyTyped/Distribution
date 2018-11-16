package typings
package ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Layouts extends js.Object

@JSGlobal("ej.PivotSchemaDesigner.Layouts")
@js.native
object Layouts extends js.Object {
  ///To set the layout as same in the Excel.
  @js.native
  sealed trait Excel
    extends ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Layouts
  
  ///To set normal layout for Field List.
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Layouts
  
  ///To set layout with the axes one above the other.
  @js.native
  sealed trait OneByOne
    extends ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Layouts
  
  val Excel: Excel with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val OneByOne: OneByOne with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs.Layouts with java.lang.String] = js.native
}

