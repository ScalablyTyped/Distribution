package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.libTypesMod.SlotProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMergeSlotPropMod {
  
  @JSImport("@fluentui/react-compose/lib/mergeSlotProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeSlotProp[TProps](slotProp: SlotProp[TProps], slotProps: TProps): SlotProp[TProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeSlotProp")(slotProp.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any])).asInstanceOf[SlotProp[TProps]]
  inline def mergeSlotProp[TProps](slotProp: SlotProp[TProps], slotProps: TProps, mappedProp: String): SlotProp[TProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeSlotProp")(slotProp.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], mappedProp.asInstanceOf[js.Any])).asInstanceOf[SlotProp[TProps]]
}
