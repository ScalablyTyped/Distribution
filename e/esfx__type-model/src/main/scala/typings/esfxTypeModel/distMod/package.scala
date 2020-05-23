package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  type AnyExclude[T, U] = typings.std.Exclude[T, U]
  type AnyExtract[T, U] = typings.std.Extract[T, U]
  type AnyKeyof[T] = /* keyof T */ java.lang.String
  type Assign[A /* <: js.Object */, B /* <: js.Object */] = typings.esfxTypeModel.distMod.Reshape[(typings.esfxTypeModel.distMod.Diff[A, B]) with B]
  type Conjoin[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in @esfx/type-model.@esfx/type-model/dist.AnyKeyof<T> ]: @esfx/type-model.@esfx/type-model/dist.AnyExtract<T, {readonly [ U in P ]: unknown}>[P]}
    */ typings.esfxTypeModel.esfxTypeModelStrings.Conjoin with (org.scalablytyped.runtime.TopLevel[
    typings.esfxTypeModel.distMod.AnyExtract[
      T, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ U in P ]: unknown}
    */ typings.esfxTypeModel.esfxTypeModelStrings.Conjoin with org.scalablytyped.runtime.TopLevel[js.Any]
    ]
  ])
  type Constructor[T, A /* <: js.Array[_] */] = org.scalablytyped.runtime.Instantiable1[/* args */ A, T]
  type Diff[A /* <: js.Object */, B /* <: js.Object */] = typings.esfxTypeModel.distMod.Omit[A, /* keyof B */ java.lang.String]
  type Disjoin[T /* <: js.Object */] = typings.esfxTypeModel.distMod.DisjoinRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: {[ P in K ]: T[P]}}[keyof T] */ js.Any
  ]
  type DisjoinOverlaps[A, B] = typings.esfxTypeModel.distMod.Overlaps[
    A | typings.esfxTypeModel.distMod.Disjoin[A], 
    B | typings.esfxTypeModel.distMod.Disjoin[B]
  ]
  type DisjoinRest[T] = T | js.Object
  type Every[L /* <: js.Array[scala.Boolean] */] = typings.esfxTypeModel.distMod.EveryRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends false? 'false' : never}[number] */ js.Any
  ]
  type EveryRest[R] = scala.Boolean | typings.esfxTypeModel.esfxTypeModelBooleans.`false`
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelNumbers.`0`
    - typings.esfxTypeModel.esfxTypeModelStrings._empty
  */
  type Falsey = js.UndefOr[typings.esfxTypeModel.distMod._Falsey | scala.Null]
  type FunctionKeys[T, F /* <: js.Function */] = typings.esfxTypeModel.distMod.MatchingKeys[T, F]
  type GeneratorNextType[T] = js.Any
  type GeneratorReturnType[T] = scala.Unit
  type Intersect[A /* <: js.Object */, B /* <: js.Object */] = typings.std.Pick[
    A with B, 
    typings.std.Extract[/* keyof A */ java.lang.String, /* keyof B */ java.lang.String]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - scala.Boolean
  */
  type IsCallable[T] = typings.esfxTypeModel.distMod._IsCallable[T] | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - scala.Boolean
  */
  type IsConstructable[T] = typings.esfxTypeModel.distMod._IsConstructable[T] | scala.Boolean
  type IsEmpty[T /* <: js.Object */] = typings.esfxTypeModel.distMod.IsNever[/* keyof T */ java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.distMod._IsSubsetOf[Sub, Super]
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type IsProperSubsetOf[Sub, Super] = (typings.esfxTypeModel.distMod._IsProperSubsetOf[Sub, Super]) | scala.Boolean
  type IsProperSupersetOf[Super, Sub] = typings.esfxTypeModel.distMod.IsProperSubsetOf[Sub, Super]
  type IsSubsetOf[Sub, Super] = (typings.esfxTypeModel.distMod._IsSubsetOf[Sub, Super]) | scala.Boolean
  type IsSupersetOf[Super, Sub] = typings.esfxTypeModel.distMod.IsSubsetOf[Sub, Super]
  type IsSupertypeOf[Super, Sub] = typings.esfxTypeModel.distMod.IsSubtypeOf[Sub, Super]
  type IsUnion[T] = (typings.esfxTypeModel.distMod.IsUnionRest[T, js.Array[T]]) | typings.esfxTypeModel.esfxTypeModelBooleans.`false`
  type IsUnionRest[T, Q] = typings.esfxTypeModel.distMod.Not[typings.esfxTypeModel.distMod.SameType[js.Array[T], Q]]
  type IteratedType[T] = js.Any
  type MatchingKeys[T, TMatch] = typings.esfxTypeModel.distMod._MatchingKeys[T, TMatch, /* keyof T */ java.lang.String]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.esfxTypeModel.esfxTypeModelStrings.Mutable with org.scalablytyped.runtime.TopLevel[T]
  type NonFunctionKeys[T, F /* <: js.Function */] = typings.esfxTypeModel.distMod.NonMatchingKeys[T, F]
  type NonMatchingKeys[T, TMatch] = typings.std.Exclude[
    /* keyof T */ java.lang.String, 
    typings.esfxTypeModel.distMod.MatchingKeys[T, TMatch]
  ]
  type NonOptional[T] = T
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Omit[T, K /* <: typings.std.PropertyKey */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type One[L /* <: js.Array[scala.Boolean] */] = typings.esfxTypeModel.distMod.OneRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? [P] : never}[number] */ js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.esfxTypeModel.esfxTypeModelBooleans.`true`
    - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
    - scala.Boolean
  */
  type OneRest[R] = typings.esfxTypeModel.distMod._OneRest[R] | scala.Boolean
  type Optional[T] = js.UndefOr[T]
  type Primitive = java.lang.String | js.Symbol | scala.Boolean | scala.Double | typings.std.BigInt
  type PromisedType[T] = js.Any
  type Reshape[T /* <: js.Object */] = typings.std.Pick[T, /* keyof T */ java.lang.String]
  type SameTypes[L /* <: js.Array[_] */] = typings.esfxTypeModel.distMod.SameType[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.SameType<L[P], L[number]>}[number] */ js.Any, 
    typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  ]
  type Some[L /* <: js.Array[scala.Boolean] */] = typings.esfxTypeModel.distMod.SomeRest[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? 'true' : never}[number] */ js.Any
  ]
  type SomeRest[R] = scala.Boolean | typings.esfxTypeModel.esfxTypeModelBooleans.`true`
  type XOr[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = typings.esfxTypeModel.esfxTypeModelBooleans.`false` | (typings.esfxTypeModel.distMod.Not[A | B])
  type _MatchingKeys[T, TSuper, K /* <: /* keyof T */ java.lang.String */] = K
}
