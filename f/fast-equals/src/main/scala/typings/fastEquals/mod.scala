package typings.fastEquals

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circularDeepEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circularDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def circularShallowEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("circularShallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createCustomCircularEqual[Meta](getComparatorOptions: GetComparatorOptions[Meta]): EqualityComparator[Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomCircularEqual")(getComparatorOptions.asInstanceOf[js.Any]).asInstanceOf[EqualityComparator[Meta]]
  
  inline def createCustomEqual[Meta](getComparatorOptions: GetComparatorOptions[Meta]): EqualityComparator[Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomEqual")(getComparatorOptions.asInstanceOf[js.Any]).asInstanceOf[EqualityComparator[Meta]]
  
  inline def deepEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sameValueZeroEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameValueZeroEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shallowEqual[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Inlined parent std.Pick<std.WeakMap<any, any>, 'delete' | 'get'> */
  trait BaseCircularMeta extends StObject {
    
    def delete(key: Any): Boolean
    @JSName("delete")
    var delete_Original: js.Function1[/* key */ Any, Boolean]
    
    def get(key: Any): js.UndefOr[Any]
    @JSName("get")
    var get_Original: js.Function1[/* key */ Any, js.UndefOr[Any]]
    
    def set(key: js.Object, value: Any): Any
  }
  object BaseCircularMeta {
    
    inline def apply(
      delete: /* key */ Any => Boolean,
      get: /* key */ Any => js.UndefOr[Any],
      set: (js.Object, Any) => Any
    ): BaseCircularMeta = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[BaseCircularMeta]
    }
    
    extension [Self <: BaseCircularMeta](x: Self) {
      
      inline def setDelete(value: /* key */ Any => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: /* key */ Any => js.UndefOr[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (js.Object, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait CreateComparatorCreatorOptions[Meta] extends StObject {
    
    def areArraysEqual(a: Any, b: Any, isEqual: InternalEqualityComparator[Meta], meta: Meta): Boolean
    @JSName("areArraysEqual")
    var areArraysEqual_Original: TypeEqualityComparator[Any, Meta]
    
    def areDatesEqual(a: Any, b: Any, isEqual: InternalEqualityComparator[Meta], meta: Meta): Boolean
    @JSName("areDatesEqual")
    var areDatesEqual_Original: TypeEqualityComparator[Any, Meta]
    
    def areMapsEqual(a: Any, b: Any, isEqual: InternalEqualityComparator[Meta], meta: Meta): Boolean
    @JSName("areMapsEqual")
    var areMapsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    def areObjectsEqual(a: Any, b: Any, isEqual: InternalEqualityComparator[Meta], meta: Meta): Boolean
    @JSName("areObjectsEqual")
    var areObjectsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    def areRegExpsEqual(a: Any, b: Any, isEqual: InternalEqualityComparator[Meta], meta: Meta): Boolean
    @JSName("areRegExpsEqual")
    var areRegExpsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    def areSetsEqual(a: Any, b: Any, isEqual: InternalEqualityComparator[Meta], meta: Meta): Boolean
    @JSName("areSetsEqual")
    var areSetsEqual_Original: TypeEqualityComparator[Any, Meta]
    
    def createIsNestedEqual(fn: EqualityComparator[Meta]): InternalEqualityComparator[Meta]
    @JSName("createIsNestedEqual")
    var createIsNestedEqual_Original: EqualityComparatorCreator[Meta]
  }
  object CreateComparatorCreatorOptions {
    
    inline def apply[Meta](
      areArraysEqual: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean,
      areDatesEqual: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean,
      areMapsEqual: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean,
      areObjectsEqual: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean,
      areRegExpsEqual: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean,
      areSetsEqual: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean,
      createIsNestedEqual: /* fn */ EqualityComparator[Meta] => InternalEqualityComparator[Meta]
    ): CreateComparatorCreatorOptions[Meta] = {
      val __obj = js.Dynamic.literal(areArraysEqual = js.Any.fromFunction4(areArraysEqual), areDatesEqual = js.Any.fromFunction4(areDatesEqual), areMapsEqual = js.Any.fromFunction4(areMapsEqual), areObjectsEqual = js.Any.fromFunction4(areObjectsEqual), areRegExpsEqual = js.Any.fromFunction4(areRegExpsEqual), areSetsEqual = js.Any.fromFunction4(areSetsEqual), createIsNestedEqual = js.Any.fromFunction1(createIsNestedEqual))
      __obj.asInstanceOf[CreateComparatorCreatorOptions[Meta]]
    }
    
    extension [Self <: CreateComparatorCreatorOptions[?], Meta](x: Self & CreateComparatorCreatorOptions[Meta]) {
      
      inline def setAreArraysEqual(value: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean): Self = StObject.set(x, "areArraysEqual", js.Any.fromFunction4(value))
      
      inline def setAreDatesEqual(value: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean): Self = StObject.set(x, "areDatesEqual", js.Any.fromFunction4(value))
      
      inline def setAreMapsEqual(value: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean): Self = StObject.set(x, "areMapsEqual", js.Any.fromFunction4(value))
      
      inline def setAreObjectsEqual(value: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean): Self = StObject.set(x, "areObjectsEqual", js.Any.fromFunction4(value))
      
      inline def setAreRegExpsEqual(value: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean): Self = StObject.set(x, "areRegExpsEqual", js.Any.fromFunction4(value))
      
      inline def setAreSetsEqual(value: (Any, Any, /* isEqual */ InternalEqualityComparator[Meta], Meta) => Boolean): Self = StObject.set(x, "areSetsEqual", js.Any.fromFunction4(value))
      
      inline def setCreateIsNestedEqual(value: /* fn */ EqualityComparator[Meta] => InternalEqualityComparator[Meta]): Self = StObject.set(x, "createIsNestedEqual", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Meta extends undefined ? <A, B>(a : A, b : B, meta : Meta | undefined): boolean : <A, B>(a : A, b : B, meta : Meta): boolean
    }}}
    */
  @js.native
  trait EqualityComparator[Meta] extends StObject
  
  type EqualityComparatorCreator[Meta] = js.Function1[/* fn */ EqualityComparator[Meta], InternalEqualityComparator[Meta]]
  
  type GetComparatorOptions[Meta] = js.Function1[
    /* defaultOptions */ CreateComparatorCreatorOptions[Meta], 
    Partial[CreateComparatorCreatorOptions[Meta]]
  ]
  
  type InternalEqualityComparator[Meta] = js.Function7[
    /* a */ Any, 
    /* b */ Any, 
    /* indexOrKeyA */ Any, 
    /* indexOrKeyB */ Any, 
    /* parentA */ Any, 
    /* parentB */ Any, 
    /* meta */ Meta, 
    Boolean
  ]
  
  type NativeEqualityComparator = js.Function2[/* a */ Any, /* b */ Any, Boolean]
  
  type TypeEqualityComparator[Type, Meta] = js.Function4[
    /* a */ Type, 
    /* b */ Type, 
    /* isEqual */ InternalEqualityComparator[Meta], 
    /* meta */ Meta, 
    Boolean
  ]
}
