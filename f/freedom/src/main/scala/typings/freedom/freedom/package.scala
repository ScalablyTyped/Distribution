package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Common on/emit for message passing interfaces.
type EventDispatchFn[T] = js.Function2[/* eventType */ String, /* value */ js.UndefOr[T], Unit]

type EventHandlerFn[T] = js.Function2[/* eventType */ String, /* handler */ js.Function1[/* eventData */ T, Unit], Unit]
