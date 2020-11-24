package typings.ecol.collectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CollectionEvent {
  
  type Listener[T, SourceT /* <: typings.tstl.icontainerMod.IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: typings.tstl.icontainerMod.IContainer.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: typings.tstl.icontainerMod.IContainer.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[
    /* event */ typings.ecol.collectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    scala.Unit
  ]
}
