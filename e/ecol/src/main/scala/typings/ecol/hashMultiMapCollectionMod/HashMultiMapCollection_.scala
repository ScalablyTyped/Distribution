package typings.ecol.hashMultiMapCollectionMod

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.ecol.ieventdispatcherMod.IEventDispatcher
import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.entryMod.Entry
import typings.tstl.hashMultiMapMod.HashMultiMap
import typings.tstl.hashMultiMapMod.HashMultiMap.Iterator
import typings.tstl.hashMultiMapMod.HashMultiMap.ReverseIterator
import typings.tstl.hasherMod.Hasher
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipairMod.IPair
import typings.tstl.mapContainerMod.MapContainer.InsertRet
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.isizeMod.ISize because Already inherited
- typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
- typings.tstl.ipushMod.IPush because Already inherited
- typings.tstl.iemptyMod.IEmpty because Already inherited
- typings.std.Iterable because Already inherited
- typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
- typings.tstl.icontainerMod.IContainer because Already inherited
- typings.ecol.icollectionMod.ICollection because var conflicts: iterator, iterator_IContainer_. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/HashMultiMapCollection", "HashMultiMapCollection")
@js.native
class HashMultiMapCollection_[Key, T] ()
  extends HashMultiMap[Key, T]
     with IEventDispatcher[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Erase_by_key(key: Key): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Erase_by_range(first: Iterator[Key, T]): Iterator[Key, T] = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Erase_by_range(first: Iterator[Key, T], last: Iterator[Key, T]): Iterator[Key, T] = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_erase(
    first: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `false`, HashMultiMap[Key, T]]),
    last: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `false`, HashMultiMap[Key, T]])
  ): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_erase(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_insert(
    first: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `false`, HashMultiMap[Key, T]]),
    last: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `false`, HashMultiMap[Key, T]])
  ): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_insert(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Key_eq(x: Key, y: Key): Boolean = js.native
  /* CompleteClass */
  override def addEventListener(
    `type`: Type,
    listener: Listener[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
  ): Unit = js.native
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  /* InferMemberOverrides */
  override def assign[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def begin(): typings.tstl.icontainerMod.IContainer.Iterator[
    Entry[Key, T], 
    HashMultiMap[Key, T], 
    Iterator[Key, T], 
    ReverseIterator[Key, T], 
    IPair[Key, T]
  ] = js.native
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  /* InferMemberOverrides */
  override def begin(index: Double): typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `false`, HashMultiMap[Key, T]] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("begin")
  override def begin_Iterator(): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("begin")
  override def begin_Iterator(index: Double): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Compute bucket index for the *key*.
    *
    * @param key Target key.
    * @return Index number.
    */
  /* InferMemberOverrides */
  override def bucket(key: Key): Double = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get number of buckets.
    */
  /* InferMemberOverrides */
  override def bucket_count(): Double = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get size of a specific bucket.
    *
    * @param index Specific position.
    * @return Size of the specific bucket.
    */
  /* InferMemberOverrides */
  override def bucket_size(index: Double): Double = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  /* InferMemberOverrides */
  override def count(key: Key): Double = js.native
  /* CompleteClass */
  override def dispatchEvent(
    event: CollectionEvent[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def emplace(key: Key, `val`: T): InsertRet[Key, T, `false`, HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("emplace")
  override def emplace_Iterator(key: Key, `val`: T): Iterator[Key, T] = js.native
  /* InferMemberOverrides */
  override def emplace_hint(hint: Iterator[Key, T], key: Key, `val`: T): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("emplace_hint")
  override def emplace_hint_Iterator(hint: Iterator[Key, T], key: Key, `val`: T): Iterator[Key, T] = js.native
  /**
    * Test whether container is empty.
    */
  /* InferMemberOverrides */
  override def empty(): Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def end(): typings.tstl.icontainerMod.IContainer.Iterator[
    Entry[Key, T], 
    HashMultiMap[Key, T], 
    Iterator[Key, T], 
    ReverseIterator[Key, T], 
    IPair[Key, T]
  ] = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  /* InferMemberOverrides */
  override def end(index: Double): typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `false`, HashMultiMap[Key, T]] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("end")
  override def end_Iterator(): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("end")
  override def end_Iterator(index: Double): Iterator[Key, T] = js.native
  /**
    * Erase elements in range.
    *
    * @param first Range of the first position to erase.
    * @param last Rangee of the last position to erase.
    * @return Iterator following the last removed element, strained by the erasing.
    */
  /* InferMemberOverrides */
  override def erase(first: Iterator[Key, T], last: Iterator[Key, T]): Iterator[Key, T] = js.native
  /**
    * Erase an element.
    *
    * @param pos Position to erase.
    * @return Iterator following the *pos*, strained by the erasing.
    */
  /* InferMemberOverrides */
  override def erase(pos: Iterator[Key, T]): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("erase")
  override def erase_IteratorT(it: Iterator[Key, T]): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  /* InferMemberOverrides */
  override def find(key: Key): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("find")
  override def find_Iterator(key: Key): Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  /* InferMemberOverrides */
  override def has(key: Key): Boolean = js.native
  /* CompleteClass */
  override def hasEventListener(`type`: Type): Boolean = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get hash function.
    *
    * @return The hash function.
    */
  /* InferMemberOverrides */
  override def hash_function(): Hasher[Key] = js.native
  /* InferMemberOverrides */
  override def insert(hint: Iterator[Key, T], pair: IPair[Key, T]): Iterator[Key, T] = js.native
  /* InferMemberOverrides */
  override def insert(pair: IPair[Key, T]): InsertRet[Key, T, `false`, HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
  /* InferMemberOverrides */
  override def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get key equality predicator.
    *
    * @return The key equality predicator.
    */
  /* InferMemberOverrides */
  override def key_eq(): BinaryPredicator[Key, Key] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Compute load factor.
    *
    * @return `this.size() / this.bucket_count()`
    */
  /* InferMemberOverrides */
  override def load_factor(): Double = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get maximum load factor that allowable.
    *
    * @return The maximum load factor.
    */
  /* InferMemberOverrides */
  override def max_load_factor(): Double = js.native
  /**
    * @inheritDoc
    */
  /**
    * Set maximum load factor.
    *
    * @param z The new value to change.
    */
  /* InferMemberOverrides */
  override def max_load_factor(z: Double): Unit = js.native
  /**
    * Merge two containers.
    *
    * @param source Source container to transfer.
    */
  /* InferMemberOverrides */
  override def merge(source: HashMultiMap[Key, T]): Unit = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: (IPair[Key, T])*): Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def rbegin(): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  override def rbegin(index: Double): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("rbegin")
  override def rbegin_ReverseIterator(): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def refresh(): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: Iterator[Key, T]): Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Change of bucktes.
    *
    * @param n The number to change.
    */
  /* InferMemberOverrides */
  override def rehash(n: Double): Unit = js.native
  /* CompleteClass */
  override def removeEventListener(
    `type`: Type,
    listener: Listener[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
  ): Unit = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def rend(): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  override def rend(index: Double): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  @JSName("rend")
  override def rend_ReverseIterator(): ReverseIterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Reserve buckets enable to store *n* elements.
    *
    * @param n The capacity to reserve.
    */
  /* InferMemberOverrides */
  override def reserve(n: Double): Unit = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def size(): Double = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  /* InferMemberOverrides */
  override def swap(obj: HashMultiMap[Key, T]): Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  /* InferMemberOverrides */
  override def toJSON(): js.Array[Entry[Key, T]] = js.native
}

