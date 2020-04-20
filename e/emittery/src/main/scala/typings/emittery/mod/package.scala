package typings.emittery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventName = java.lang.String | js.Symbol
  type EventNameFromDataMap[EventDataMap] = typings.std.Extract[/* keyof EventDataMap */ java.lang.String, typings.emittery.mod.EventName]
  /**
  	Removes an event subscription.
  	*/
  type UnsubscribeFn = js.Function0[scala.Unit]
}
