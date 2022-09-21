package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnConditionallyRequiredPropsMod {
  
  @JSImport("@fluentui/utilities/lib/warn/warnConditionallyRequiredProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnConditionallyRequiredProps")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], requiredProps.asInstanceOf[js.Any], conditionalPropName.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
