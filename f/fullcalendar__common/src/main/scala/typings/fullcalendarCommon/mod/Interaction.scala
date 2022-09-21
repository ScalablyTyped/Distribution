package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "Interaction")
@js.native
abstract class Interaction protected () extends StObject {
  def this(settings: InteractionSettings) = this()
  
  var component: DateComponent[Any, Dictionary] = js.native
  
  def destroy(): Unit = js.native
  
  var isHitComboAllowed: (js.Function2[/* hit0 */ Hit, /* hit1 */ Hit, Boolean]) | Null = js.native
}
