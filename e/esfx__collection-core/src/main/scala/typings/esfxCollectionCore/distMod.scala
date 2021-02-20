package typings.esfxCollectionCore

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @js.native
  trait Collection[T] extends ReadonlyCollection[T]
  object Collection {
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.add]` method.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.add")
    @js.native
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.clear]` method.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.delete]` method.
      */
    @JSImport("@esfx/collection-core/dist", "Collection._delete")
    @js.native
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.hasInstance")
    @js.native
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.isCollection")
    @js.native
    def isCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.isCollection")
    @js.native
    def isCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    @JSImport("@esfx/collection-core/dist", "Collection.name")
    @js.native
    val name: /* "Collection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "Collection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait FixedSizeIndexedCollection[T] extends ReadonlyIndexedCollection[T]
  object FixedSizeIndexedCollection {
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.getAt")
    @js.native
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.hasInstance")
    @js.native
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<T> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.indexOf")
    @js.native
    val indexOf: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.isFixedSizeIndexedCollection")
    @js.native
    def isFixedSizeIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.isFixedSizeIndexedCollection")
    @js.native
    def isFixedSizeIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.isReadonlyIndexedCollection")
    @js.native
    def isReadonlyIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.isReadonlyIndexedCollection")
    @js.native
    def isReadonlyIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.name")
    @js.native
    val name: /* "FixedSizeIndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `FixedSizeIndexedCollection#[FixedSizeIndexedCollection.setAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.setAt")
    @js.native
    val setAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "FixedSizeIndexedCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.esfxCollectionCore.distMod.ReadonlyCollection because Already inherited
  - typings.esfxCollectionCore.distMod.Collection because var conflicts: iterator. Inlined  */ @js.native
  trait IndexedCollection[T] extends FixedSizeIndexedCollection[T]
  object IndexedCollection {
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.add]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.add")
    @js.native
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.clear]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core/dist", "IndexedCollection._delete")
    @js.native
    val delete: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Collection.delete */ js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.getAt")
    @js.native
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.hasInstance")
    @js.native
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<T> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.indexOf")
    @js.native
    val indexOf: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `IndexedCollection#[IndexedCollection.insertAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.insertAt")
    @js.native
    val insertAt: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isCollection")
    @js.native
    def isCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isCollection")
    @js.native
    def isCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.Collection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isFixedSizeIndexedCollection")
    @js.native
    def isFixedSizeIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isFixedSizeIndexedCollection")
    @js.native
    def isFixedSizeIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.FixedSizeIndexedCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      * @deprecated Use `IndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isIndexedCollection")
    @js.native
    def isIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      * @deprecated Use `IndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isIndexedCollection")
    @js.native
    def isIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.IndexedCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isReadonlyIndexedCollection")
    @js.native
    def isReadonlyIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.isReadonlyIndexedCollection")
    @js.native
    def isReadonlyIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.name")
    @js.native
    val name: /* "IndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `IndexedCollection#[IndexedCollection.removeAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.removeAt")
    @js.native
    val removeAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `FixedSizeIndexedCollection#[FixedSizeIndexedCollection.setAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.setAt")
    @js.native
    val setAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "IndexedCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait KeyedCollection[K, V] extends ReadonlyKeyedCollection[K, V]
  object KeyedCollection {
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.clear]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.delete]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection._delete")
    @js.native
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.get]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.hasInstance")
    @js.native
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      * @deprecated Use `KeyedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.isKeyedCollection")
    @js.native
    def isKeyedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      * @deprecated Use `KeyedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.isKeyedCollection")
    @js.native
    def isKeyedCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.isReadonlyKeyedCollection")
    @js.native
    def isReadonlyKeyedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.isReadonlyKeyedCollection")
    @js.native
    def isReadonlyKeyedCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.name")
    @js.native
    val name: /* "KeyedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.set]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.set")
    @js.native
    val set: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.values]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait KeyedMultiCollection[K, V] extends ReadonlyKeyedMultiCollection[K, V]
  object KeyedMultiCollection {
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.add]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.add")
    @js.native
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.clear]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.delete]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection._delete")
    @js.native
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.deleteValue]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.deleteValue")
    @js.native
    val deleteValue: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.get]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.hasInstance")
    @js.native
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.hasValue]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.hasValue")
    @js.native
    val hasValue: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      * @deprecated Use `KeyedMultiCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.isKeyedMultiCollection")
    @js.native
    def isKeyedMultiCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      * @deprecated Use `KeyedMultiCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.isKeyedMultiCollection")
    @js.native
    def isKeyedMultiCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.KeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.isReadonlyKeyedMultiCollection")
    @js.native
    def isReadonlyKeyedMultiCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.isReadonlyKeyedMultiCollection")
    @js.native
    def isReadonlyKeyedMultiCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.name")
    @js.native
    val name: /* "KeyedMultiCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.values]` method.
      */
    @JSImport("@esfx/collection-core/dist", "KeyedMultiCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyCollection[T] extends Iterable[T]
  object ReadonlyCollection {
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.hasInstance")
    @js.native
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.name")
    @js.native
    val name: /* "ReadonlyCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyIndexedCollection[T] extends ReadonlyCollection[T]
  object ReadonlyIndexedCollection {
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.getAt")
    @js.native
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.hasInstance")
    @js.native
    def hasInstance[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.indexOf")
    @js.native
    val indexOf: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.isReadonlyCollection")
    @js.native
    def isReadonlyCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyCollection<T> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.isReadonlyIndexedCollection")
    @js.native
    def isReadonlyIndexedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.isReadonlyIndexedCollection")
    @js.native
    def isReadonlyIndexedCollection[T](value: Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyIndexedCollection<T> */ Boolean = js.native
    
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.name")
    @js.native
    val name: /* "ReadonlyIndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyIndexedCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyKeyedCollection[K, V]
    extends Iterable[js.Tuple2[K, V]]
  object ReadonlyKeyedCollection {
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.get]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.hasInstance")
    @js.native
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.isReadonlyKeyedCollection")
    @js.native
    def isReadonlyKeyedCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.isReadonlyKeyedCollection")
    @js.native
    def isReadonlyKeyedCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.name")
    @js.native
    val name: /* "ReadonlyKeyedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.values]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyKeyedMultiCollection[K, V]
    extends Iterable[js.Tuple2[K, V]]
  object ReadonlyKeyedMultiCollection {
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.get]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.has]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.hasInstance")
    @js.native
    def hasInstance[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.hasValue]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.hasValue")
    @js.native
    val hasValue: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.isReadonlyKeyedMultiCollection")
    @js.native
    def isReadonlyKeyedMultiCollection(value: js.Any): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = js.native
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.isReadonlyKeyedMultiCollection")
    @js.native
    def isReadonlyKeyedMultiCollection[K, V](value: Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core/dist.ReadonlyKeyedMultiCollection<K, V> */ Boolean = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.name")
    @js.native
    val name: /* "ReadonlyKeyedMultiCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.size]` property.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.values]` method.
      */
    @JSImport("@esfx/collection-core/dist", "ReadonlyKeyedMultiCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
}
