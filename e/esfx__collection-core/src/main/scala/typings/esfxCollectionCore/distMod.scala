package typings.esfxCollectionCore

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/collection-core/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  
  @js.native
  trait Collection[T] extends ReadonlyCollection[T]
  @js.native
  object Collection extends js.Object {
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.add]` method.
      */
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.clear]` method.
      */
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.delete]` method.
      */
    @JSName("_delete")
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      */
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    def isCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    def isCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    val name: /* "Collection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait FixedSizeIndexedCollection[T] extends ReadonlyIndexedCollection[T]
  @js.native
  object FixedSizeIndexedCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      */
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<T> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    val indexOf: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    def isFixedSizeIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    def isFixedSizeIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    def isReadonlyIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    def isReadonlyIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    val name: /* "FixedSizeIndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `FixedSizeIndexedCollection#[FixedSizeIndexedCollection.setAt]` method.
      */
    val setAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    val size: js.Symbol = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.esfxCollectionCore.distMod.ReadonlyCollection because Already inherited
  - typings.esfxCollectionCore.distMod.Collection because var conflicts: iterator. Inlined  */ @js.native
  trait IndexedCollection[T] extends FixedSizeIndexedCollection[T]
  @js.native
  object IndexedCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.add]` method.
      */
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.clear]` method.
      */
    val clear: js.Symbol = js.native
    
    @JSName("_delete")
    val delete: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Collection.delete */ js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      */
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<T> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    val indexOf: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `IndexedCollection#[IndexedCollection.insertAt]` method.
      */
    val insertAt: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    def isCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    def isCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    def isFixedSizeIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    def isFixedSizeIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      * @deprecated Use `IndexedCollection.hasInstance` instead.
      */
    def isIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      * @deprecated Use `IndexedCollection.hasInstance` instead.
      */
    def isIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    def isReadonlyIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    def isReadonlyIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    val name: /* "IndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `IndexedCollection#[IndexedCollection.removeAt]` method.
      */
    val removeAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `FixedSizeIndexedCollection#[FixedSizeIndexedCollection.setAt]` method.
      */
    val setAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait KeyedCollection[K, V] extends ReadonlyKeyedCollection[K, V]
  @js.native
  object KeyedCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.clear]` method.
      */
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.delete]` method.
      */
    @JSName("_delete")
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.get]` method.
      */
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      */
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      * @deprecated Use `KeyedCollection.hasInstance` instead.
      */
    def isKeyedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      * @deprecated Use `KeyedCollection.hasInstance` instead.
      */
    def isKeyedCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    def isReadonlyKeyedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    def isReadonlyKeyedCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.keys]` method.
      */
    val keys: js.Symbol = js.native
    
    val name: /* "KeyedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.set]` method.
      */
    val set: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.size]` property.
      */
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.values]` method.
      */
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait KeyedMultiCollection[K, V] extends ReadonlyKeyedMultiCollection[K, V]
  @js.native
  object KeyedMultiCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.add]` method.
      */
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.clear]` method.
      */
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.delete]` method.
      */
    @JSName("_delete")
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.deleteValue]` method.
      */
    val deleteValue: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.get]` method.
      */
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      */
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.hasValue]` method.
      */
    val hasValue: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      * @deprecated Use `KeyedMultiCollection.hasInstance` instead.
      */
    def isKeyedMultiCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      * @deprecated Use `KeyedMultiCollection.hasInstance` instead.
      */
    def isKeyedMultiCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    def isReadonlyKeyedMultiCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    def isReadonlyKeyedMultiCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.keys]` method.
      */
    val keys: js.Symbol = js.native
    
    val name: /* "KeyedMultiCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.size]` property.
      */
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.values]` method.
      */
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyCollection[T] extends Iterable[T]
  @js.native
  object ReadonlyCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      */
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    val name: /* "ReadonlyCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyIndexedCollection[T] extends ReadonlyCollection[T]
  @js.native
  object ReadonlyIndexedCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      */
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    val indexOf: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    def isReadonlyIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    def isReadonlyIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    val name: /* "ReadonlyIndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyKeyedCollection[K, V]
    extends Iterable[js.Tuple2[K, V]]
  @js.native
  object ReadonlyKeyedCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.get]` method.
      */
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      */
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    def isReadonlyKeyedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    def isReadonlyKeyedCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.keys]` method.
      */
    val keys: js.Symbol = js.native
    
    val name: /* "ReadonlyKeyedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.size]` property.
      */
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.values]` method.
      */
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyKeyedMultiCollection[K, V]
    extends Iterable[js.Tuple2[K, V]]
  @js.native
  object ReadonlyKeyedMultiCollection extends js.Object {
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.get]` method.
      */
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.has]` method.
      */
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      */
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      */
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.hasValue]` method.
      */
    val hasValue: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    def isReadonlyKeyedMultiCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    def isReadonlyKeyedMultiCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.keys]` method.
      */
    val keys: js.Symbol = js.native
    
    val name: /* "ReadonlyKeyedMultiCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.size]` property.
      */
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.values]` method.
      */
    val values: js.Symbol = js.native
  }
}
