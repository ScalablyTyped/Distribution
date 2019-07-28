package typings.ecol.ecolMod

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol", "EventDispatcher")
@js.native
class EventDispatcher[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] ()
  extends typings.ecol.libBasicEventDispatcherMod.EventDispatcher[T, SourceT, IteratorT, ReverseT]

