package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.libTypesMod.ComposeOptions
import typings.fluentuiReactCompose.libTypesMod.ComposePreparedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComputeDisplayNamesMod {
  
  @JSImport("@fluentui/react-compose/lib/computeDisplayNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeDisplayNames(
    inputOptions: ComposeOptions[js.Object, js.Object, js.Object, js.Object, js.Object],
    parentOptions: ComposePreparedOptions[js.Object, Any, js.Object]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDisplayNames")(inputOptions.asInstanceOf[js.Any], parentOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
