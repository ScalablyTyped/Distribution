package typings.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object freedom {
  
  // Common on/emit for message passing interfaces.
  type EventDispatchFn[T] = js.Function2[/* eventType */ java.lang.String, /* value */ js.UndefOr[T], scala.Unit]
  
  type EventHandlerFn[T] = js.Function2[
    /* eventType */ java.lang.String, 
    /* handler */ js.Function1[/* eventData */ T, scala.Unit], 
    scala.Unit
  ]
}
