package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/core/internal-common", "c$")
@js.native
open class c protected ()
  extends StObject
     with Interaction {
  def this(settings: InteractionSettings) = this()
  
  /* CompleteClass */
  var component: DateComponent[Any, Dictionary] = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  var isHitComboAllowed: (js.Function2[/* hit0 */ Hit, /* hit1 */ Hit, Boolean]) | Null = js.native
}
