package typings.fluentuiUtilities

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnWarnMod {
  
  @JSImport("@fluentui/utilities/lib/warn/warn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setWarningCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")().asInstanceOf[Unit]
  inline def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")(warningCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ISettingsMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typings.fluentuiUtilities.fluentuiUtilitiesStrings.ISettingsMap & TopLevel[Any]
}
