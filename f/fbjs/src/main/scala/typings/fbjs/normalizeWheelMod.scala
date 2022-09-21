package typings.fbjs

import typings.fbjs.anon.PixelX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeWheelMod {
  
  inline def apply(event: Any): PixelX = ^.asInstanceOf[js.Dynamic].apply(event.asInstanceOf[js.Any]).asInstanceOf[PixelX]
  
  @JSImport("fbjs/lib/normalizeWheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")().asInstanceOf[String]
}
