package typings.engineIo

import typings.engineIo.serverMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineIoStrings {
  
  @js.native
  sealed trait high extends StObject
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait lax extends StObject
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait low extends StObject
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait medium extends StObject
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait polling
    extends StObject
       with Transport
  inline def polling: polling = "polling".asInstanceOf[polling]
  
  @js.native
  sealed trait strict extends StObject
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait websocket
    extends StObject
       with Transport
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
}
