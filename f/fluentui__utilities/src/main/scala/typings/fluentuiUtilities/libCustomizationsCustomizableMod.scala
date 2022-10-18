package typings.fluentuiUtilities

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCustomizationsCustomizableMod {
  
  @JSImport("@fluentui/utilities/lib/customizations/customizable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customizable(scope: String, fields: js.Array[String]): js.Function1[/* ComposedComponent */ ComponentType[Any], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("customizable")(scope.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ComposedComponent */ ComponentType[Any], Any]]
  inline def customizable(scope: String, fields: js.Array[String], concatStyles: Boolean): js.Function1[/* ComposedComponent */ ComponentType[Any], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("customizable")(scope.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], concatStyles.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ComposedComponent */ ComponentType[Any], Any]]
}
