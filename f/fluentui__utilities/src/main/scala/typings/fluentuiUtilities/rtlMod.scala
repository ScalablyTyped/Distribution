package typings.fluentuiUtilities

import typings.fluentuiUtilities.anon.Rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtlMod {
  
  @JSImport("@fluentui/utilities/lib/rtl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTL")().asInstanceOf[Boolean]
  inline def getRTL(theme: Rtl): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTL")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getRTLSafeKeyCode(key: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLSafeKeyCode")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getRTLSafeKeyCode(key: Double, theme: Rtl): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRTLSafeKeyCode")(key.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setRTL(isRTL: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRTL")(isRTL.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTL")(isRTL.asInstanceOf[js.Any], persistSetting.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
