package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMonitorCodeUseMod {
  
  inline def apply(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(eventName: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fbjs/lib/monitorCodeUse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
