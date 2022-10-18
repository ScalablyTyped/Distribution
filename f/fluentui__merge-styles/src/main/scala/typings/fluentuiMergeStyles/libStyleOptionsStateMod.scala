package typings.fluentuiMergeStyles

import typings.fluentuiMergeStyles.libIstyleoptionsMod.IStyleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyleOptionsStateMod {
  
  @JSImport("@fluentui/merge-styles/lib/StyleOptionsState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTL")().asInstanceOf[Boolean]
  
  inline def getStyleOptions(): IStyleOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleOptions")().asInstanceOf[IStyleOptions]
  
  inline def setRTL(isRTL: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRTL")(isRTL.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
