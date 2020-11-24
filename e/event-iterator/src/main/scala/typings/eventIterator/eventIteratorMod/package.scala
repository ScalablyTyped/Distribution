package typings.eventIterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventIteratorMod {
  
  type ListenHandler[T] = js.Function1[
    /* queue */ typings.eventIterator.eventIteratorMod.Queue[T], 
    scala.Unit | typings.eventIterator.eventIteratorMod.RemoveHandler
  ]
  
  type RemoveHandler = js.Function0[scala.Unit]
}
