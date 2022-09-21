package typings.fluentuiUtilities

import typings.fluentuiUtilities.warnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnMutuallyExclusiveMod {
  
  @JSImport("@fluentui/utilities/lib/warn/warnMutuallyExclusive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnMutuallyExclusive")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], exclusiveMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
