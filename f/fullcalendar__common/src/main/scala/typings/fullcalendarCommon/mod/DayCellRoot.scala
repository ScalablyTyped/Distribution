package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "DayCellRoot")
@js.native
open class DayCellRoot ()
  extends StObject
     with BaseComponent[DayCellRootProps, Dictionary] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  def normalizeClassNames(generator: ClassNamesGenerator[DayCellContentArg], hookProps: DayCellContentArg): js.Array[String] = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[DayCellRootProps] = js.native
  
  def refineHookProps(arg: DayCellHookPropsInput): DayCellContentArg1 = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: DayCellRootProps, nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
