package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "TableDateCell")
@js.native
open class TableDateCell ()
  extends StObject
     with BaseComponent[TableDateCellProps, Dictionary] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[TableDateCellProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: TableDateCellProps, nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
