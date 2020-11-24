package typings.emittery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventName = java.lang.String | js.Symbol
  
  type EventNameFromDataMap[EventDataMap] = typings.std.Extract[/* keyof EventDataMap */ java.lang.String, typings.emittery.mod.EventName]
  
  /**
  Emittery also accepts an array of strings and symbols as event names.
  */
  type EventNames = typings.emittery.mod.EventName | js.Array[typings.emittery.mod.EventName]
  
  /**
  	Removes an event subscription.
  	*/
  type UnsubscribeFn = js.Function0[scala.Unit]
}
