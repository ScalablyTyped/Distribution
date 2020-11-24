package typings.eventTargetShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventTarget[TEvents /* <: typings.eventTargetShim.mod.EventTarget.EventDefinition */, TEventAttributes /* <: typings.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typings.eventTargetShim.mod.EventTarget.Mode */] = typings.eventTargetShim.mod.EventTarget.EventAttributes[TEventAttributes] with (typings.eventTargetShim.anon.AddEventListener[TEvents, TMode])
}
