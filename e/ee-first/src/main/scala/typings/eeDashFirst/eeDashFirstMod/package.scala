package typings.eeDashFirst

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eeDashFirstMod {
  type Listener[TEmitter /* <: EventEmitter */] = js.Function4[
    /* err */ js.Any, 
    /* ee */ TEmitter, 
    /* event */ js.Array[String], 
    /* args */ js.Array[js.Any], 
    Unit
  ]
}
