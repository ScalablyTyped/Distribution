package typings.esfxCollectionCore

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Collection[T]
    extends StObject
       with ReadonlyCollection[T]
  object Collection {
    
    @JSImport("@esfx/collection-core", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.add]` method.
      */
    @JSImport("@esfx/collection-core", "Collection.add")
    @js.native
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.clear]` method.
      */
    @JSImport("@esfx/collection-core", "Collection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.delete]` method.
      */
    @JSImport("@esfx/collection-core", "Collection._delete")
    @js.native
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "Collection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.Collection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.Collection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      */
    inline def hasInstance[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.Collection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    inline def isCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.Collection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.Collection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    inline def isCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.Collection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean]
    
    @JSImport("@esfx/collection-core", "Collection.name")
    @js.native
    val name: /* "Collection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "Collection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait FixedSizeIndexedCollection[T]
    extends StObject
       with ReadonlyIndexedCollection[T]
  object FixedSizeIndexedCollection {
    
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection.getAt")
    @js.native
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      */
    inline def hasInstance[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<T> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection.indexOf")
    @js.native
    val indexOf: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    inline def isFixedSizeIndexedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedSizeIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    inline def isFixedSizeIndexedCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedSizeIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    inline def isReadonlyIndexedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    inline def isReadonlyIndexedCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean]
    
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection.name")
    @js.native
    val name: /* "FixedSizeIndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `FixedSizeIndexedCollection#[FixedSizeIndexedCollection.setAt]` method.
      */
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection.setAt")
    @js.native
    val setAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "FixedSizeIndexedCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.esfxCollectionCore.mod.ReadonlyCollection because Already inherited
  - typings.esfxCollectionCore.mod.Collection because var conflicts: iterator. Inlined  */ @js.native
  trait IndexedCollection[T]
    extends StObject
       with FixedSizeIndexedCollection[T]
  object IndexedCollection {
    
    @JSImport("@esfx/collection-core", "IndexedCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.add]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.add")
    @js.native
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `Collection#[Collection.clear]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core", "IndexedCollection._delete")
    @js.native
    val delete: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Collection.delete */ Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.getAt")
    @js.native
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      */
    inline def hasInstance[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<T> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.indexOf")
    @js.native
    val indexOf: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `IndexedCollection#[IndexedCollection.insertAt]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.insertAt")
    @js.native
    val insertAt: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    inline def isCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.Collection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.Collection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `Collection`.
      * @deprecated Use `Collection.hasInstance` instead.
      */
    inline def isCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.Collection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    inline def isFixedSizeIndexedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedSizeIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `FixedSizeIndexedCollection`.
      * @deprecated Use `FixedSizeIndexedCollection.hasInstance` instead.
      */
    inline def isFixedSizeIndexedCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedSizeIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.FixedSizeIndexedCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      * @deprecated Use `IndexedCollection.hasInstance` instead.
      */
    inline def isIndexedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of an `IndexedCollection`.
      * @deprecated Use `IndexedCollection.hasInstance` instead.
      */
    inline def isIndexedCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.IndexedCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    inline def isReadonlyIndexedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    inline def isReadonlyIndexedCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean]
    
    @JSImport("@esfx/collection-core", "IndexedCollection.name")
    @js.native
    val name: /* "IndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `IndexedCollection#[IndexedCollection.removeAt]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.removeAt")
    @js.native
    val removeAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `FixedSizeIndexedCollection#[FixedSizeIndexedCollection.setAt]` method.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.setAt")
    @js.native
    val setAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "IndexedCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait KeyedCollection[K, V]
    extends StObject
       with ReadonlyKeyedCollection[K, V]
  object KeyedCollection {
    
    @JSImport("@esfx/collection-core", "KeyedCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.clear]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.delete]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection._delete")
    @js.native
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.get]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      */
    inline def hasInstance[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<K, V> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      * @deprecated Use `KeyedCollection.hasInstance` instead.
      */
    inline def isKeyedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `KeyedCollection`.
      * @deprecated Use `KeyedCollection.hasInstance` instead.
      */
    inline def isKeyedCollection[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedCollection<K, V> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedCollection[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<K, V> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core", "KeyedCollection.name")
    @js.native
    val name: /* "KeyedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `KeyedCollection#[KeyedCollection.set]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.set")
    @js.native
    val set: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.values]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait KeyedMultiCollection[K, V]
    extends StObject
       with ReadonlyKeyedMultiCollection[K, V]
  object KeyedMultiCollection {
    
    @JSImport("@esfx/collection-core", "KeyedMultiCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.add]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.add")
    @js.native
    val add: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.clear]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.clear")
    @js.native
    val clear: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.delete]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection._delete")
    @js.native
    val delete: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `KeyedMultiCollection#[KeyedMultiCollection.deleteValue]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.deleteValue")
    @js.native
    val deleteValue: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.get]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      */
    inline def hasInstance[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<K, V> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.hasValue]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.hasValue")
    @js.native
    val hasValue: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      * @deprecated Use `KeyedMultiCollection.hasInstance` instead.
      */
    inline def isKeyedMultiCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyedMultiCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `KeyedMultiCollection`.
      * @deprecated Use `KeyedMultiCollection.hasInstance` instead.
      */
    inline def isKeyedMultiCollection[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyedMultiCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.KeyedMultiCollection<K, V> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedMultiCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedMultiCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedMultiCollection[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedMultiCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<K, V> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.name")
    @js.native
    val name: /* "KeyedMultiCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.values]` method.
      */
    @JSImport("@esfx/collection-core", "KeyedMultiCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyCollection[T]
    extends StObject
       with Iterable[T]
  object ReadonlyCollection {
    
    @JSImport("@esfx/collection-core", "ReadonlyCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      */
    inline def hasInstance[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean]
    
    @JSImport("@esfx/collection-core", "ReadonlyCollection.name")
    @js.native
    val name: /* "ReadonlyCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "ReadonlyCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyIndexedCollection[T]
    extends StObject
       with ReadonlyCollection[T]
  object ReadonlyIndexedCollection {
    
    @JSImport("@esfx/collection-core", "ReadonlyIndexedCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.getAt]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyIndexedCollection.getAt")
    @js.native
    val getAt: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyIndexedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      */
    inline def hasInstance[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyIndexedCollection#[ReadonlyIndexedCollection.indexOf]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyIndexedCollection.indexOf")
    @js.native
    val indexOf: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyCollection`.
      * @deprecated Use `ReadonlyCollection.hasInstance` instead.
      */
    inline def isReadonlyCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyCollection<T> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    inline def isReadonlyIndexedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyIndexedCollection`.
      * @deprecated Use `ReadonlyIndexedCollection.hasInstance` instead.
      */
    inline def isReadonlyIndexedCollection[T](value: js.Iterable[T]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyIndexedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyIndexedCollection<T> */ Boolean]
    
    @JSImport("@esfx/collection-core", "ReadonlyIndexedCollection.name")
    @js.native
    val name: /* "ReadonlyIndexedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyCollection#[ReadonlyCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "ReadonlyIndexedCollection.size")
    @js.native
    val size: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyKeyedCollection[K, V]
    extends StObject
       with Iterable[js.Tuple2[K, V]]
  object ReadonlyKeyedCollection {
    
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.get]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      */
    inline def hasInstance[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<K, V> */ Boolean]
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedCollection`.
      * @deprecated Use `ReadonlyKeyedCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedCollection[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedCollection<K, V> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection.name")
    @js.native
    val name: /* "ReadonlyKeyedCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedCollection#[ReadonlyKeyedCollection.values]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
  
  @js.native
  trait ReadonlyKeyedMultiCollection[K, V]
    extends StObject
       with Iterable[js.Tuple2[K, V]]
  object ReadonlyKeyedMultiCollection {
    
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.get]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.get")
    @js.native
    val get: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.has]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.has")
    @js.native
    val has: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      */
    inline def hasInstance(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      */
    inline def hasInstance[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<K, V> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.hasValue]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.hasValue")
    @js.native
    val hasValue: js.Symbol = js.native
    
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedMultiCollection(value: Any): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedMultiCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<unknown, unknown> */ Boolean]
    /**
      * Tests whether a value supports the minimal representation of a `ReadonlyKeyedMultiCollection`.
      * @deprecated Use `ReadonlyKeyedMultiCollection.hasInstance` instead.
      */
    inline def isReadonlyKeyedMultiCollection[K, V](value: js.Iterable[js.Tuple2[K, V]]): /* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeyedMultiCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/collection-core.@esfx/collection-core.ReadonlyKeyedMultiCollection<K, V> */ Boolean]
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.keys]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.keys")
    @js.native
    val keys: js.Symbol = js.native
    
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.name")
    @js.native
    val name: /* "ReadonlyKeyedMultiCollection" */ String = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.size]` property.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.size")
    @js.native
    val size: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define the `ReadonlyKeyedMultiCollection#[ReadonlyKeyedMultiCollection.values]` method.
      */
    @JSImport("@esfx/collection-core", "ReadonlyKeyedMultiCollection.values")
    @js.native
    val values: js.Symbol = js.native
  }
}
