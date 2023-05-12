package typings.fullcalendarCore.internalCommonMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core/internal-common", "aj")
@js.native
open class aj[RenderProps] ()
  extends StObject
     with CustomRenderingStore[RenderProps] {
  
  /* private */ /* CompleteClass */
  var currentValue: Any = js.native
  
  /* CompleteClass */
  override def handle(customRendering: CustomRendering[RenderProps]): Unit = js.native
  
  /* private */ /* CompleteClass */
  var handlers: Any = js.native
  
  /* private */ /* CompleteClass */
  var map: Any = js.native
  
  /* CompleteClass */
  override def set(value: Map[String, CustomRendering[RenderProps]]): Unit = js.native
  
  /* CompleteClass */
  override def subscribe(handler: js.Function1[Map[String, CustomRendering[RenderProps]], Unit]): Unit = js.native
}
