package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.anon.RequiredComposePreparedOp
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.div
import typings.fluentuiReactCompose.libTypesMod.ComposeOptions
import typings.fluentuiReactCompose.libTypesMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMergeComposeOptionsMod {
  
  @JSImport("@fluentui/react-compose/lib/mergeComposeOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeComposeOptions_div(
    input: Input[div, js.Object],
    inputOptions: ComposeOptions[js.Object, js.Object, js.Object, js.Object, js.Object]
  ): RequiredComposePreparedOp = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeComposeOptions")(input.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[RequiredComposePreparedOp]
  inline def mergeComposeOptions_div(
    input: Input[div, js.Object],
    inputOptions: ComposeOptions[js.Object, js.Object, js.Object, js.Object, js.Object],
    parentOptions: RequiredComposePreparedOp
  ): RequiredComposePreparedOp = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeComposeOptions")(input.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any], parentOptions.asInstanceOf[js.Any])).asInstanceOf[RequiredComposePreparedOp]
}
