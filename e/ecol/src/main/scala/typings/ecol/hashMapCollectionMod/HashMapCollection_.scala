package typings.ecol.hashMapCollectionMod

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.ecol.ieventdispatcherMod.IEventDispatcher
import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.entryMod.Entry
import typings.tstl.hashMapMod.HashMap
import typings.tstl.hashMapMod.HashMap.Iterator
import typings.tstl.hashMapMod.HashMap.ReverseIterator
import typings.tstl.hasherMod.Hasher
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipairMod.IPair
import typings.tstl.mapContainerMod.MapContainer.InsertRet
import typings.tstl.pairMod.Pair
import typings.tstl.tstlBooleans.`true`
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
- typings.ecol.icollectionMod.ICollection because var conflicts: iterator, iterator_IContainer_. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/HashMapCollection", "HashMapCollection")
@js.native
class HashMapCollection_[Key, T] ()
  extends HashMap[Key, T]
     with IEventDispatcher[Entry[Key, T], HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
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
    first: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]]),
    last: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]])
  ): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_erase(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_insert(
    first: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]]),
    last: (Iterator[Key, T]) | (typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]])
  ): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Handle_insert(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /* CompleteClass */
  override def addEventListener(
    `type`: Type,
    listener: Listener[Entry[Key, T], HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
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
  override def begin(): typings.tstl.icontainerMod.IContainer.Iterator[Entry[Key, T], HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T], IPair[Key, T]] = js.native
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  /* InferMemberOverrides */
  override def begin(index: Double): typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
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
  override def dispatchEvent(event: CollectionEvent[Entry[Key, T], HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]): Unit = js.native
  /* InferMemberOverrides */
  override def emplace(key: Key, `val`: T): InsertRet[Key, T, `true`, HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
  /* InferMemberOverrides */
  @JSName("emplace")
  override def emplace_InsertRet(key: Key, `val`: T): InsertRet[
    Key, 
    T, 
    `true`, 
    HashMap[Key, T], 
    typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]], 
    typings.tstl.ihashmapMod.IHashMap.ReverseIterator[Key, T, `true`, HashMap[Key, T]]
  ] = js.native
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
  override def end(): typings.tstl.icontainerMod.IContainer.Iterator[Entry[Key, T], HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T], IPair[Key, T]] = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  /* InferMemberOverrides */
  override def end(index: Double): typings.tstl.ihashmapMod.IHashMap.Iterator[Key, T, `true`, HashMap[Key, T]] = js.native
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
    * Extract an element by key.
    *
    * @param key Key to search for.
    * @return The extracted element.
    */
  /* InferMemberOverrides */
  override def extract(key: Key): Entry[Key, T] = js.native
  /**
    * Extract an element by iterator.
    *
    * @param pos The iterator to the element for extraction.
    * @return Iterator following the *pos*, strained by the extraction.
    */
  /* InferMemberOverrides */
  @JSName("extract")
  override def extract_Iterator(pos: Iterator[Key, T]): Iterator[Key, T] = js.native
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
    * Get a value.
    *
    * @param key Key to search for.
    * @return The value mapped by the key.
    */
  /* InferMemberOverrides */
  override def get(key: Key): T = js.native
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
  override def insert(pair: IPair[Key, T]): InsertRet[Key, T, `true`, HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
  /* InferMemberOverrides */
  override def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * Insert or assign an element with hint.
    *
    * @param hint Hint for the position where the element can be inserted.
    * @param key Key to be mapped or search for.
    * @param value Value to insert or assign.
    * @return An iterator to the newly inserted element, if the specified key doesn't exist, otherwise an iterator to the ordinary element.
    */
  /* InferMemberOverrides */
  override def insert_or_assign(hint: Iterator[Key, T], key: Key, value: T): Iterator[Key, T] = js.native
  /**
    * Insert or assign an element.
    *
    * @param key Key to be mapped or search for.
    * @param value Value to insert or assign.
    * @return {@link Pair} of an iterator to the newly inserted element and `true`, if the specified *key* doesn't exist, otherwise {@link Pair} of iterator to the ordinary element and `false`.
    */
  /* InferMemberOverrides */
  override def insert_or_assign(key: Key, value: T): Pair[Iterator[Key, T], Boolean] = js.native
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
  override def merge(source: HashMap[Key, T]): Unit = js.native
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
  override def rbegin_ReverseIterator(): typings.tstl.ihashmapMod.IHashMap.ReverseIterator[Key, T, `true`, HashMap[Key, T]] = js.native
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
    listener: Listener[Entry[Key, T], HashMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
  ): Unit = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
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
  override def rend_ReverseIterator(): typings.tstl.ihashmapMod.IHashMap.ReverseIterator[Key, T, `true`, HashMap[Key, T]] = js.native
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
    * Set a value with key.
    *
    * @param key Key to be mapped or search for.
    * @param val Value to insert or assign.
    */
  /* InferMemberOverrides */
  override def set(key: Key, `val`: T): Unit = js.native
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
  override def swap(obj: HashMap[Key, T]): Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  /* InferMemberOverrides */
  override def toJSON(): js.Array[Entry[Key, T]] = js.native
}

