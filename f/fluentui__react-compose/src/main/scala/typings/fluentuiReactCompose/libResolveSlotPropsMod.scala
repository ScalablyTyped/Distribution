package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.libTypesMod.ComposePreparedOptions
import typings.fluentuiReactCompose.libTypesMod.GenericDictionary
import typings.fluentuiReactCompose.libTypesMod.MergePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolveSlotPropsMod {
  
  @JSImport("@fluentui/react-compose/lib/resolveSlotProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NullRender(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("NullRender")().asInstanceOf[Null]
  
  inline def resolveSlotProps[TProps, TState](
    result: MergePropsResult[
      TState, 
      GenericDictionary, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof @fluentui/react-compose.@fluentui/react-compose/lib/types.GenericDictionary ]: any} */ js.Any
    ],
    options: ComposePreparedOptions[TProps, TState, TProps]
  ): MergePropsResult[
    TState, 
    GenericDictionary, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof @fluentui/react-compose.@fluentui/react-compose/lib/types.GenericDictionary ]: any} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSlotProps")(result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MergePropsResult[
    TState, 
    GenericDictionary, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof @fluentui/react-compose.@fluentui/react-compose/lib/types.GenericDictionary ]: any} */ js.Any
  ]]
}
