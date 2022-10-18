package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "ViewRoot")
@js.native
open class ViewRoot ()
  extends StObject
     with BaseComponent[ViewRootProps, Dictionary] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  def normalizeClassNames(generator: ClassNamesGenerator[ViewContentArg], hookProps: ViewContentArg): js.Array[String] = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[ViewRootProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: ViewRootProps, nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
