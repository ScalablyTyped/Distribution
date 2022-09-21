package typings.fluentuiUtilities

import typings.fluentuiUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typings.fluentuiUtilities.warnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnMod {
  
  @JSImport("@fluentui/utilities/lib/warn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetControlledWarnings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetControlledWarnings")().asInstanceOf[Unit]
  
  inline def setWarningCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")().asInstanceOf[Unit]
  inline def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWarningCallback")(warningCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnConditionallyRequiredProps")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], requiredProps.asInstanceOf[js.Any], conditionalPropName.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnControlledUsage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecations")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], deprecationMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnMutuallyExclusive")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], exclusiveMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
