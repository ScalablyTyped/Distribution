package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.libTypesMod.ClassDictionary
import typings.fluentuiReactCompose.libTypesMod.ClassFunction
import typings.fluentuiReactCompose.libTypesMod.GenericDictionary
import typings.fluentuiReactCompose.libTypesMod.MergePropsResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolveClassesMod {
  
  @JSImport("@fluentui/react-compose/lib/resolveClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendToSlotClassName(slotProps: Record[String, GenericDictionary], slotName: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendToSlotClassName")(slotProps.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveClasses[TState](
    result: MergePropsResult[
      TState, 
      GenericDictionary, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof @fluentui/react-compose.@fluentui/react-compose/lib/types.GenericDictionary ]: any} */ js.Any
    ],
    classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]]
  ): MergePropsResult[
    TState, 
    GenericDictionary, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof @fluentui/react-compose.@fluentui/react-compose/lib/types.GenericDictionary ]: any} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClasses")(result.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[MergePropsResult[
    TState, 
    GenericDictionary, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof @fluentui/react-compose.@fluentui/react-compose/lib/types.GenericDictionary ]: any} */ js.Any
  ]]
}
