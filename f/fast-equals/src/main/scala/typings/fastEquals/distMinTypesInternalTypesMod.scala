package typings.fastEquals

import org.scalablytyped.runtime.StringDictionary
import typings.fastEquals.anon.`0`
import typings.std.Number
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMinTypesInternalTypesMod {
  
  type AnyEqualityComparator[Meta] = js.Function3[/* a */ Any, /* b */ Any, /* state */ State[Meta], Boolean]
  
  trait Cache[Key /* <: js.Object */, Value] extends StObject {
    
    def delete(key: Key): Boolean
    
    def get(key: Key): js.UndefOr[Value]
    
    def set(key: Key, value: Any): Any
  }
  object Cache {
    
    inline def apply[Key /* <: js.Object */, Value](delete: Key => Boolean, get: Key => js.UndefOr[Value], set: (Key, Any) => Any): Cache[Key, Value] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache[Key, Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache[?, ?], Key /* <: js.Object */, Value] (val x: Self & (Cache[Key, Value])) extends AnyVal {
      
      inline def setDelete(value: Key => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: Key => js.UndefOr[Value]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Key, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait CircularState[Meta]
    extends StObject
       with State[Meta] {
    
    @JSName("cache")
    val cache_CircularState: Cache[Any, Any]
  }
  object CircularState {
    
    inline def apply[Meta](
      cache: Cache[Any, Any],
      equals_ : (Any, Any, Any, Any, Any, Any, State[Meta]) => Boolean,
      meta: Meta,
      strict: Boolean
    ): CircularState[Meta] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction7(equals_))
      __obj.asInstanceOf[CircularState[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularState[?], Meta] (val x: Self & CircularState[Meta]) extends AnyVal {
      
      inline def setCache(value: Cache[Any, Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComparatorConfig[Meta] extends StObject {
    
    /**
      * Whether the arrays passed are equal in value. In strict mode, this includes
      * additional properties added to the array.
      */
    def areArraysEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the arrays passed are equal in value. In strict mode, this includes
      * additional properties added to the array.
      */
    @JSName("areArraysEqual")
    var areArraysEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the dates passed are equal in value.
      */
    def areDatesEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the dates passed are equal in value.
      */
    @JSName("areDatesEqual")
    var areDatesEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the maps passed are equal in value. In strict mode, this includes
      * additional properties added to the map.
      */
    def areMapsEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the maps passed are equal in value. In strict mode, this includes
      * additional properties added to the map.
      */
    @JSName("areMapsEqual")
    var areMapsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the objects passed are equal in value. In strict mode, this includes
      * non-enumerable properties added to the map, as well as symbol properties.
      */
    def areObjectsEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the objects passed are equal in value. In strict mode, this includes
      * non-enumerable properties added to the map, as well as symbol properties.
      */
    @JSName("areObjectsEqual")
    var areObjectsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the primitive wrappers passed are equal in value.
      */
    def arePrimitiveWrappersEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the primitive wrappers passed are equal in value.
      */
    @JSName("arePrimitiveWrappersEqual")
    var arePrimitiveWrappersEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the regexps passed are equal in value.
      */
    def areRegExpsEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the regexps passed are equal in value.
      */
    @JSName("areRegExpsEqual")
    var areRegExpsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the sets passed are equal in value. In strict mode, this includes
      * additional properties added to the set.
      */
    def areSetsEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the sets passed are equal in value. In strict mode, this includes
      * additional properties added to the set.
      */
    @JSName("areSetsEqual")
    var areSetsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    /**
      * Whether the typed arrays passed are equal in value. In strict mode, this includes
      * additional properties added to the typed array.
      */
    def areTypedArraysEqual(a: Any, b: Any, state: State[Meta]): Boolean
    /**
      * Whether the typed arrays passed are equal in value. In strict mode, this includes
      * additional properties added to the typed array.
      */
    @JSName("areTypedArraysEqual")
    var areTypedArraysEqual_Original: TypeEqualityComparator[Any, Meta]
  }
  object ComparatorConfig {
    
    inline def apply[Meta](
      areArraysEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      areDatesEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      areMapsEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      areObjectsEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      arePrimitiveWrappersEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      areRegExpsEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      areSetsEqual: (Any, Any, /* state */ State[Meta]) => Boolean,
      areTypedArraysEqual: (Any, Any, /* state */ State[Meta]) => Boolean
    ): ComparatorConfig[Meta] = {
      val __obj = js.Dynamic.literal(areArraysEqual = js.Any.fromFunction3(areArraysEqual), areDatesEqual = js.Any.fromFunction3(areDatesEqual), areMapsEqual = js.Any.fromFunction3(areMapsEqual), areObjectsEqual = js.Any.fromFunction3(areObjectsEqual), arePrimitiveWrappersEqual = js.Any.fromFunction3(arePrimitiveWrappersEqual), areRegExpsEqual = js.Any.fromFunction3(areRegExpsEqual), areSetsEqual = js.Any.fromFunction3(areSetsEqual), areTypedArraysEqual = js.Any.fromFunction3(areTypedArraysEqual))
      __obj.asInstanceOf[ComparatorConfig[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComparatorConfig[?], Meta] (val x: Self & ComparatorConfig[Meta]) extends AnyVal {
      
      inline def setAreArraysEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areArraysEqual", js.Any.fromFunction3(value))
      
      inline def setAreDatesEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areDatesEqual", js.Any.fromFunction3(value))
      
      inline def setAreMapsEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areMapsEqual", js.Any.fromFunction3(value))
      
      inline def setAreObjectsEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areObjectsEqual", js.Any.fromFunction3(value))
      
      inline def setArePrimitiveWrappersEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "arePrimitiveWrappersEqual", js.Any.fromFunction3(value))
      
      inline def setAreRegExpsEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areRegExpsEqual", js.Any.fromFunction3(value))
      
      inline def setAreSetsEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areSetsEqual", js.Any.fromFunction3(value))
      
      inline def setAreTypedArraysEqual(value: (Any, Any, /* state */ State[Meta]) => Boolean): Self = StObject.set(x, "areTypedArraysEqual", js.Any.fromFunction3(value))
    }
  }
  
  type CreateCustomComparatorConfig[Meta] = js.Function1[/* config */ ComparatorConfig[Meta], Partial[ComparatorConfig[Meta]]]
  
  type CreateState[Meta] = js.Function0[`0`[Meta]]
  
  trait CustomEqualCreatorOptions[Meta] extends StObject {
    
    /**
      * Whether circular references should be supported. It causes the
      * comparison to be slower, but for objects that have circular references
      * it is required to avoid stack overflows.
      */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Create a custom configuration of type-specific equality comparators.
      * This receives the default configuration, which allows either replacement
      * or supersetting of the default methods.
      */
    var createCustomConfig: js.UndefOr[CreateCustomComparatorConfig[Meta]] = js.undefined
    
    /**
      * Create a custom internal comparator, which is used as an override to the
      * default entry point for nested value equality comparisons. This is often
      * used for doing custom logic for specific types (such as handling a specific
      * class instance differently than other objects) or to incorporate `meta` in
      * the comparison. See the recipes for examples.
      */
    var createInternalComparator: js.UndefOr[
        js.Function1[/* compare */ EqualityComparator[Meta], InternalEqualityComparator[Meta]]
      ] = js.undefined
    
    /**
      * Create a custom `state` object passed between the methods. This allows for
      * custom `cache` and/or `meta` values to be used.
      */
    var createState: js.UndefOr[CreateState[Meta]] = js.undefined
    
    /**
      * Whether the equality comparison is strict, meaning it matches
      * all properties (including symbols and non-enumerable properties)
      * with equal shape of descriptors.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object CustomEqualCreatorOptions {
    
    inline def apply[Meta](): CustomEqualCreatorOptions[Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomEqualCreatorOptions[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomEqualCreatorOptions[?], Meta] (val x: Self & CustomEqualCreatorOptions[Meta]) extends AnyVal {
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setCreateCustomConfig(value: /* config */ ComparatorConfig[Meta] => Partial[ComparatorConfig[Meta]]): Self = StObject.set(x, "createCustomConfig", js.Any.fromFunction1(value))
      
      inline def setCreateCustomConfigUndefined: Self = StObject.set(x, "createCustomConfig", js.undefined)
      
      inline def setCreateInternalComparator(value: /* compare */ EqualityComparator[Meta] => InternalEqualityComparator[Meta]): Self = StObject.set(x, "createInternalComparator", js.Any.fromFunction1(value))
      
      inline def setCreateInternalComparatorUndefined: Self = StObject.set(x, "createInternalComparator", js.undefined)
      
      inline def setCreateState(value: () => `0`[Meta]): Self = StObject.set(x, "createState", js.Any.fromFunction0(value))
      
      inline def setCreateStateUndefined: Self = StObject.set(x, "createState", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait DefaultState[Meta]
    extends StObject
       with State[Meta] {
    
    @JSName("cache")
    val cache_DefaultState: Unit
  }
  object DefaultState {
    
    inline def apply[Meta](
      cache: Unit,
      equals_ : (Any, Any, Any, Any, Any, Any, State[Meta]) => Boolean,
      meta: Meta,
      strict: Boolean
    ): DefaultState[Meta] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction7(equals_))
      __obj.asInstanceOf[DefaultState[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultState[?], Meta] (val x: Self & DefaultState[Meta]) extends AnyVal {
      
      inline def setCache(value: Unit): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictionary[Value]
    extends StObject
       with /* key */ StringDictionary[Value] {
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.UndefOr[Any] = js.undefined
  }
  object Dictionary {
    
    inline def apply[Value](): Dictionary[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictionary[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictionary[?], Value] (val x: Self & Dictionary[Value]) extends AnyVal {
      
      inline def setDollarDollartypeof(value: Any): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      inline def setDollarDollartypeofUndefined: Self = StObject.set(x, "$$typeof", js.undefined)
    }
  }
  
  type EqualityComparator[Meta] = js.Function3[/* a */ Any, /* b */ Any, /* state */ State[Meta], Boolean]
  
  type EqualityComparatorCreator[Meta] = js.Function1[/* fn */ EqualityComparator[Meta], InternalEqualityComparator[Meta]]
  
  type InternalEqualityComparator[Meta] = js.Function7[
    /* a */ Any, 
    /* b */ Any, 
    /* indexOrKeyA */ Any, 
    /* indexOrKeyB */ Any, 
    /* parentA */ Any, 
    /* parentB */ Any, 
    /* state */ State[Meta], 
    Boolean
  ]
  
  type PrimitiveWrapper = Boolean | Number | String
  
  trait State[Meta] extends StObject {
    
    /**
      * Cache used to identify circular references
      */
    val cache: js.UndefOr[Cache[Any, Any]] = js.undefined
    
    /**
      * Method used to determine equality of nested value.
      */
    def equals(a: Any, b: Any, indexOrKeyA: Any, indexOrKeyB: Any, parentA: Any, parentB: Any, state: State[Meta]): Boolean
    
    /**
      * Additional value that can be used for comparisons.
      */
    var meta: Meta
    
    /**
      * Whether the equality comparison is strict, meaning it matches
      * all properties (including symbols and non-enumerable properties)
      * with equal shape of descriptors.
      */
    val strict: Boolean
  }
  object State {
    
    inline def apply[Meta](equals_ : (Any, Any, Any, Any, Any, Any, State[Meta]) => Boolean, meta: Meta, strict: Boolean): State[Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction7(equals_))
      __obj.asInstanceOf[State[Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State[?], Meta] (val x: Self & State[Meta]) extends AnyVal {
      
      inline def setCache(value: Cache[Any, Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setEquals_(value: (Any, Any, Any, Any, Any, Any, State[Meta]) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction7(value))
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeEqualityComparator[Type, Meta] = js.Function3[/* a */ Type, /* b */ Type, /* state */ State[Meta], Boolean]
  
  type TypedArray = js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray
}
