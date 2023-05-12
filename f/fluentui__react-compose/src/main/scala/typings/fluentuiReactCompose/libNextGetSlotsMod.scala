package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.anon.SlotProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextGetSlotsMod {
  
  @JSImport("@fluentui/react-compose/lib/next/getSlots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSlots(state: Record[String, Any]): SlotProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(state.asInstanceOf[js.Any]).asInstanceOf[SlotProps]
  inline def getSlots(state: Record[String, Any], slotNames: js.Array[String]): SlotProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(state.asInstanceOf[js.Any], slotNames.asInstanceOf[js.Any])).asInstanceOf[SlotProps]
}
