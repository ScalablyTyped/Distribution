package typings
package ecolLib.libBasicCollectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionEventNs {
  type Listener[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[
    /* event */ ecolLib.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    scala.Unit
  ]
  type Type = ecolLib.ecolLibStrings.insert | ecolLib.ecolLibStrings.erase | ecolLib.ecolLibStrings.refresh
}
