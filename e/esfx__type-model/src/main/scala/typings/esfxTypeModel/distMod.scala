package typings.esfxTypeModel

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @js.native
  trait AbstractConstructor[T]
    extends js.Function
  
  trait AccessorPropertyDescriptor[T] extends StObject {
    
    var configurable: js.UndefOr[Boolean] = js.undefined
    
    var enumerable: js.UndefOr[Boolean] = js.undefined
    
    var get: js.UndefOr[js.Function0[T]] = js.undefined
    
    var set: js.UndefOr[js.Function1[/* v */ T, Unit]] = js.undefined
  }
  object AccessorPropertyDescriptor {
    
    @scala.inline
    def apply[T](): AccessorPropertyDescriptor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessorPropertyDescriptor[T]]
    }
    
    @scala.inline
    implicit class AccessorPropertyDescriptorMutableBuilder[Self <: AccessorPropertyDescriptor[?], T] (val x: Self & AccessorPropertyDescriptor[T]) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
      
      @scala.inline
      def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setSet(value: /* v */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
  */
  trait And[A /* <: Boolean */, B /* <: Boolean */] extends StObject
  
  type AnyExclude[T, U] = Exclude[T, U]
  
  type AnyExtract[T, U] = Extract[T, U]
  
  type AnyKeyof[T] = /* keyof T */ String
  
  type Assign[A /* <: js.Object */, B /* <: js.Object */] = Reshape[(Diff[A, B]) & B]
  
  type Conjoin[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in @esfx/type-model.@esfx/type-model/dist.AnyKeyof<T> ]: @esfx/type-model.@esfx/type-model/dist.AnyExtract<T, {readonly [ U in P ]: unknown}>[P]}
    */ typings.esfxTypeModel.esfxTypeModelStrings.Conjoin & TopLevel[js.Any]
  
  type Constructor[T, A /* <: js.Array[js.Any] */] = Instantiable1[/* args */ A, T]
  
  type Diff[A /* <: js.Object */, B /* <: js.Object */] = Omit[A, /* keyof B */ String]
  
  type Disjoin[T /* <: js.Object */] = DisjoinRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: {[ P in K ]: T[P]}}[keyof T] */ js.Any
  ]
  
  type DisjoinOverlaps[A, B] = Overlaps[A | Disjoin[A], B | Disjoin[B]]
  
  type DisjoinRest[T] = T | js.Object
  
  type Every[L /* <: js.Array[Boolean] */] = EveryRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends false? 'false' : never}[number] */ js.Any
  ]
  
  type EveryRest[R] = Boolean | `false`
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Unit
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelNumbers.`0`
    - typings.esfxTypeModel.esfxTypeModelStrings._empty
  */
  type Falsey = js.UndefOr[_Falsey | Null]
  
  type FunctionKeys[T, F /* <: js.Function */] = MatchingKeys[T, F]
  
  type GeneratorNextType[T] = js.Any
  
  type GeneratorReturnType[T] = Unit
  
  type Intersect[A /* <: js.Object */, B /* <: js.Object */] = Pick[A & B, Extract[/* keyof A */ String, /* keyof B */ String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait IsAny[A] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - scala.Boolean
  */
  type IsCallable[T] = _IsCallable[T] | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - scala.Boolean
  */
  type IsConstructable[T] = _IsConstructable[T] | Boolean
  
  type IsEmpty[T /* <: js.Object */] = IsNever[/* keyof T */ String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait IsNever[A]
    extends StObject
       with IsSubtypeOf[A, js.Any]
       with SameType[js.Any, A]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.distMod._IsSubsetOf[Sub, Super]
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type IsProperSubsetOf[Sub, Super] = (_IsProperSubsetOf[Sub, Super]) | Boolean
  
  type IsProperSupersetOf[Super, Sub] = IsProperSubsetOf[Sub, Super]
  
  type IsSubsetOf[Sub, Super] = (_IsSubsetOf[Sub, Super]) | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.distMod.IsNever[Sub]
  */
  trait IsSubtypeOf[Sub, Super] extends StObject
  
  type IsSupersetOf[Super, Sub] = IsSubsetOf[Sub, Super]
  
  type IsSupertypeOf[Super, Sub] = IsSubtypeOf[Sub, Super]
  
  type IsUnion[T] = (IsUnionRest[T, js.Array[T]]) | `false`
  
  type IsUnionRest[T, Q] = Not[SameType[js.Array[T], Q]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait IsUnknown[A] extends StObject
  
  type IteratedType[T] = js.Any
  
  type MatchingKeys[T, TMatch] = _MatchingKeys[T, TMatch, /* keyof T */ String]
  
  trait MethodPropertyDescriptor[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] extends StObject {
    
    var configurable: js.UndefOr[Boolean] = js.undefined
    
    var enumerable: js.UndefOr[Boolean] = js.undefined
    
    var value: T
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object MethodPropertyDescriptor {
    
    @scala.inline
    def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](value: T): MethodPropertyDescriptor[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodPropertyDescriptor[T]]
    }
    
    @scala.inline
    implicit class MethodPropertyDescriptorMutableBuilder[Self <: MethodPropertyDescriptor[?], T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] (val x: Self & MethodPropertyDescriptor[T]) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
      
      @scala.inline
      def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.esfxTypeModel.esfxTypeModelStrings.Mutable & TopLevel[T]
  
  type NonFunctionKeys[T, F /* <: js.Function */] = NonMatchingKeys[T, F]
  
  type NonMatchingKeys[T, TMatch] = Exclude[/* keyof T */ String, MatchingKeys[T, TMatch]]
  
  type NonOptional[T] = T
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait Not[A /* <: Boolean */] extends StObject
  
  type Nullable[T] = js.UndefOr[T | Null]
  
  type Omit[T, K /* <: PropertyKey */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type One[L /* <: js.Array[Boolean] */] = OneRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? [P] : never}[number] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type OneRest[R] = _OneRest[R] | Boolean
  
  type Optional[T] = js.UndefOr[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait Or[A /* <: Boolean */, B /* <: Boolean */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait Overlaps[A, B] extends StObject
  
  type Primitive = String | js.Symbol | Boolean | Double | js.BigInt
  
  type PromisedType[T] = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait Relatable[A, B] extends StObject
  
  type Reshape[T /* <: js.Object */] = Pick[T, /* keyof T */ String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.distMod.IsNever[B]
  */
  trait SameType[A, B] extends StObject
  
  type SameTypes[L /* <: js.Array[js.Any] */] = SameType[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.SameType<L[P], L[number]>}[number] */ js.Any, 
    `true`
  ]
  
  type Some[L /* <: js.Array[Boolean] */] = SomeRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? 'true' : never}[number] */ js.Any
  ]
  
  type SomeRest[R] = Boolean | `true`
  
  type XOr[A /* <: Boolean */, B /* <: Boolean */] = `false` | (Not[A | B])
  
  trait _Falsey extends StObject
  
  trait _IsCallable[T] extends StObject
  
  trait _IsConstructable[T] extends StObject
  
  trait _IsProperSubsetOf[Sub, Super] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait _IsSubsetOf[Sub, Super]
    extends StObject
       with _IsProperSubsetOf[Sub, Super]
  
  type _MatchingKeys[T, TSuper, K /* <: /* keyof T */ String */] = K
  
  trait _OneRest[R] extends StObject
}
