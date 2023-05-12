package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.libTypesMod.ComposePreparedOptions
import typings.fluentuiReactCompose.libTypesMod.MergePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMergePropsMod {
  
  @JSImport("@fluentui/react-compose/lib/mergeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeProps[TProps, TState, TSlots, TSlotProps](state: TState, options: ComposePreparedOptions[TProps, TState, TProps]): MergePropsResult[TState, TSlots, TSlotProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MergePropsResult[TState, TSlots, TSlotProps]]
}
