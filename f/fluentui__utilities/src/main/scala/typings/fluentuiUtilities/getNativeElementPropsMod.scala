package typings.fluentuiUtilities

import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNativeElementPropsMod {
  
  @JSImport("@fluentui/utilities/lib/getNativeElementProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNativeElementProps[TAttributes /* <: HTMLAttributes[Any] */](tagName: String, props: js.Object): TAttributes = (^.asInstanceOf[js.Dynamic].applyDynamic("getNativeElementProps")(tagName.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TAttributes]
  inline def getNativeElementProps[TAttributes /* <: HTMLAttributes[Any] */](tagName: String, props: js.Object, excludedPropNames: js.Array[String]): TAttributes = (^.asInstanceOf[js.Dynamic].applyDynamic("getNativeElementProps")(tagName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], excludedPropNames.asInstanceOf[js.Any])).asInstanceOf[TAttributes]
}
