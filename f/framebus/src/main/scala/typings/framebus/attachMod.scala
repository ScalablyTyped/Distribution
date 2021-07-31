package typings.framebus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachMod {
  
  @JSImport("framebus/dist/lib/attach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[Unit]
  
  @scala.inline
  def detach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")().asInstanceOf[Unit]
}
