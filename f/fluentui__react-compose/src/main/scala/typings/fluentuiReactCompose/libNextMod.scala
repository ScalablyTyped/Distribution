package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.anon.SlotProps
import typings.fluentuiReactCompose.libNextMakeMergePropsMod.MergePropsOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextMod {
  
  @JSImport("@fluentui/react-compose/lib/next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSlots(state: Record[String, Any]): SlotProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(state.asInstanceOf[js.Any]).asInstanceOf[SlotProps]
  inline def getSlots(state: Record[String, Any], slotNames: js.Array[String]): SlotProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(state.asInstanceOf[js.Any], slotNames.asInstanceOf[js.Any])).asInstanceOf[SlotProps]
  
  inline def makeClasses(classes: Record[String, String]): js.Function1[/* state */ Record[String, Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* state */ Record[String, Any], Unit]]
  
  inline def makeMergeProps[TState](): js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMergeProps")().asInstanceOf[js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ]]
  inline def makeMergeProps[TState](options: MergePropsOptions): js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMergeProps")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ]]
  
  inline def resolveShorthandProps[TProps](props: TProps, shorthandPropNames: js.Array[/* keyof TProps */ String]): TProps = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveShorthandProps")(props.asInstanceOf[js.Any], shorthandPropNames.asInstanceOf[js.Any])).asInstanceOf[TProps]
}
