package typings.electronGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyMod {
  
  @JSImport("@electron/get/dist/cjs/proxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initializeProxy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeProxy")().asInstanceOf[Unit]
}
