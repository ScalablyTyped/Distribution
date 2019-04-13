package typings
package eeDashFirstLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eeDashFirstMod {
  type Listener[TEmitter /* <: nodeLib.eventsMod.EventEmitter */] = js.Function4[
    /* err */ js.Any, 
    /* ee */ TEmitter, 
    /* event */ js.Array[java.lang.String], 
    /* args */ js.Array[js.Any], 
    scala.Unit
  ]
}
