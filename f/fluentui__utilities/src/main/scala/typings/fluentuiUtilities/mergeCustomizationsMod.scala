package typings.fluentuiUtilities

import typings.fluentuiUtilities.customizerContextMod.ICustomizerContext
import typings.fluentuiUtilities.customizerTypesMod.ICustomizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeCustomizationsMod {
  
  @JSImport("@fluentui/utilities/lib/customizations/mergeCustomizations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeCustomizations(props: ICustomizerProps, parentContext: ICustomizerContext): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCustomizations")(props.asInstanceOf[js.Any], parentContext.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
}
