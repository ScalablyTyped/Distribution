package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/common", "DateComponent")
@js.native
open class DateComponent[Props, State] ()
  extends StObject
     with BaseComponent[Props, State] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  def isValidDateDownEl(el: HTMLElement): Boolean = js.native
  
  def isValidSegDownEl(el: HTMLElement): Boolean = js.native
  
  def prepareHits(): Unit = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[Props] = js.native
  
  def queryHit(positionLeft: Double, positionTop: Double, elWidth: Double, elHeight: Double): Hit | Null = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[State]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: Props, nextState: State): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[State] = js.native
  
  var uid: String = js.native
}
