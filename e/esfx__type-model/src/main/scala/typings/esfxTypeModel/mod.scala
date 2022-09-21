package typings.esfxTypeModel

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import typings.esfxTypeModel.esfxTypeModelNumbers.`0`
import typings.esfxTypeModel.esfxTypeModelStrings._empty
import typings.std.Exclude
import typings.std.Extract
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type AbstractConstructor[T, A /* <: js.Array[Any] */] = Instantiable1[/* args */ A, T]
  
  trait AccessorPropertyDescriptor[T] extends StObject {
    
    var configurable: js.UndefOr[Boolean] = js.undefined
    
    var enumerable: js.UndefOr[Boolean] = js.undefined
    
    var get: js.UndefOr[js.Function0[T]] = js.undefined
    
    var set: js.UndefOr[js.Function1[/* v */ T, Unit]] = js.undefined
  }
  object AccessorPropertyDescriptor {
    
    inline def apply[T](): AccessorPropertyDescriptor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessorPropertyDescriptor[T]]
    }
    
    extension [Self <: AccessorPropertyDescriptor[?], T](x: Self & AccessorPropertyDescriptor[T]) {
      
      inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
      
      inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setSet(value: /* v */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
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
  
  type AsyncGeneratorNextType[T] = Any
  
  type AsyncGeneratorReturnType[T] = Await[
    /* import warning: importer.ImportType#apply Failed type conversion: any['value'] */ js.Any
  ]
  
  type AsyncIteratedType[T] = Await[
    /* import warning: importer.ImportType#apply Failed type conversion: any['value'] */ js.Any
  ]
  
  type Await[T] = T | Any
  
  type AwaitAll[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @esfx/type-model.@esfx/type-model/dist.Await<T[P]>}
    */ typings.esfxTypeModel.esfxTypeModelStrings.AwaitAll & TopLevel[T]
  
  type Conjoin[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in @esfx/type-model.@esfx/type-model/dist.AnyKeyof<T> ]: @esfx/type-model.@esfx/type-model/dist.AnyExtract<T, {readonly [ U in P ]: unknown}>[P]}
    */ typings.esfxTypeModel.esfxTypeModelStrings.Conjoin & TopLevel[Any]
  
  type Constructor[T, A /* <: js.Array[Any] */] = Instantiable1[/* args */ A, T]
  
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
  
  type Falsey = Falsy
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Unit
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelNumbers.`0`
    - typings.esfxTypeModel.esfxTypeModelStrings._empty
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type FunctionKeys[T, F /* <: js.Function */] = MatchingKeys[T, F]
  
  type GeneratorNextType[T] = Any
  
  type GeneratorReturnType[T] = /* import warning: importer.ImportType#apply Failed type conversion: any['value'] */ js.Any
  
  type Intersect[A /* <: js.Object */, B /* <: js.Object */] = Pick[A & B, Extract[/* keyof A */ String, /* keyof B */ String]]
  
  type Intersection[A /* <: js.Array[Any] */] = Any
  
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
       with IsSubtypeOf[A, Any]
       with SameType[Any, A]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.mod._IsSubsetOf[Sub, Super]
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type IsProperSubsetOf[Sub, Super] = (_IsProperSubsetOf[Sub, Super]) | Boolean
  
  type IsProperSupersetOf[Super, Sub] = IsProperSubsetOf[Sub, Super]
  
  type IsSubsetOf[Sub, Super] = (_IsSubsetOf[Sub, Super]) | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.mod.IsNever[Sub]
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
  
  type IteratedType[T] = /* import warning: importer.ImportType#apply Failed type conversion: any['value'] */ js.Any
  
  type MatchingKeys[T, TMatch] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends TMatch? P : never}[keyof T] */ js.Any
  
  trait MethodPropertyDescriptor[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    var configurable: js.UndefOr[Boolean] = js.undefined
    
    var enumerable: js.UndefOr[Boolean] = js.undefined
    
    var value: T
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object MethodPropertyDescriptor {
    
    inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](value: T): MethodPropertyDescriptor[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodPropertyDescriptor[T]]
    }
    
    extension [Self <: MethodPropertyDescriptor[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & MethodPropertyDescriptor[T]) {
      
      inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
      
      inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
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
  
  type Pop[L /* <: js.Array[Any] */] = js.Tuple2[Any | scala.Nothing, Any | scala.Nothing]
  
  type Primitive = String | js.Symbol | Boolean | Double | js.BigInt
  
  type PromisedType[T] = Any
  
  type Push[H /* <: js.Array[Any] */, T] = /* import warning: importer.ImportType#apply c repeated non-array type: H */ js.Array[H]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  */
  trait Relatable[A, B] extends StObject
  
  type Reshape[T /* <: js.Object */] = Pick[T, /* keyof T */ String]
  
  type Reverse[L /* <: js.Array[Any] */] = js.Array[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.mod.IsNever[B]
  */
  trait SameType[A, B] extends StObject
  
  type SameTypes[L /* <: js.Array[Any] */] = SameType[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.SameType<L[P], L[number]>}[number] */ js.Any, 
    `true`
  ]
  
  type Shift[L /* <: js.Array[Any] */] = js.Tuple2[Any | scala.Nothing, Any | scala.Nothing]
  
  type Some[L /* <: js.Array[Boolean] */] = SomeRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? 'true' : never}[number] */ js.Any
  ]
  
  type SomeRest[R] = Boolean | `true`
  
  type Union[A /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  
  type Unshift[T /* <: js.Array[Any] */, H] = /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
  
  type XOr[A /* <: Boolean */, B /* <: Boolean */] = `false` | (Not[A | B])
  
  trait _Falsy extends StObject
  
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
  
  trait _OneRest[R] extends StObject
  
  type constnumber = (Double & js.Object) | `0`
  
  type conststring = String | _empty
  
  type constsymbol = (js.Symbol & js.Object) | js.Symbol
  
  type consttuple[T] = js.Array[Any | T]
  
  type numbers255 = js.Array[Any]
  
  type numstr[I /* <: /* keyof any */ String */] = I | (/* import warning: importer.ImportType#apply Failed type conversion: @esfx/type-model.@esfx/type-model/dist.numbers255[I] */ js.Any)
  
  type strings255 = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof any ]: P}
    */ typings.esfxTypeModel.esfxTypeModelStrings.strings255 & TopLevel[Any]
}
