package typings.dialogPolyfill

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dialog-polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerDialog(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDialog")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
