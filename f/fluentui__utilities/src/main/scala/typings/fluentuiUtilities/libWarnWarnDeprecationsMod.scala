package typings.fluentuiUtilities

import typings.fluentuiUtilities.libWarnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWarnWarnDeprecationsMod {
  
  @JSImport("@fluentui/utilities/lib/warn/warnDeprecations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecations")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deprecationMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
