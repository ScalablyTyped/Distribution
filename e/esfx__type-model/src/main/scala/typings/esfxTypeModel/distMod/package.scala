package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.Instantiable1
import typings.esfxTypeModel.esfxTypeModelInts.`0`
import typings.esfxTypeModel.esfxTypeModelStrings._empty
import typings.std.Exclude
import typings.std.Extract
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbstractConstructor[T, A /* <: js.Array[Any] */] = Instantiable1[/* args */ A, T]

type Assign[A /* <: js.Object */, B /* <: js.Object */] = Reshape[(Diff[A, B]) & B]

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in @esfx/type-model.@esfx/type-model/dist.AnyKeyof<T> ]: @esfx/type-model.@esfx/type-model/dist.AnyExtract<T, {readonly [ U in P ]: unknown}>[P]}
  }}}
  */
type Conjoin[T /* <: js.Object */] = AnyExtract[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ U in P ]: unknown} */ js.Any]

type Constructor[T, A /* <: js.Array[Any] */] = Instantiable1[/* args */ A, T]

type Diff[A /* <: js.Object */, B /* <: js.Object */] = Omit[A, /* keyof B */ String]

type DisjoinOverlaps[A, B] = Overlaps[
/* import warning: importer.ImportType#apply Failed type conversion: A extends object ? @esfx/type-model.@esfx/type-model/dist.Disjoin<A> : A */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: B extends object ? @esfx/type-model.@esfx/type-model/dist.Disjoin<B> : B */ js.Any]

type Falsey = Falsy

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Unit
  - typings.esfxTypeModel.esfxTypeModelBooleans.`false`
  - typings.esfxTypeModel.esfxTypeModelInts.`0`
  - typings.esfxTypeModel.esfxTypeModelStrings._empty
*/
type Falsy = js.UndefOr[_Falsy | Null]

type FunctionKeys[T, F /* <: js.Function */] = MatchingKeys[T, F]

type Intersect[A /* <: js.Object */, B /* <: js.Object */] = Pick[A & B, Extract[/* keyof A */ String, /* keyof B */ String]]

type IsEmpty[T /* <: js.Object */] = IsNever[/* keyof T */ String]

type IsProperSupersetOf[Super, Sub] = IsProperSubsetOf[Sub, Super]

type IsSupersetOf[Super, Sub] = IsSubsetOf[Sub, Super]

type IsSupertypeOf[Super, Sub] = IsSubtypeOf[Sub, Super]

type MatchingKeys[T, TMatch] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends TMatch? P : never}[keyof T] */ js.Any

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {-readonly [ P in keyof T ]: T[P]}
  }}}
  */
type Mutable[T] = T

type NonFunctionKeys[T, F /* <: js.Function */] = NonMatchingKeys[T, F]

type NonMatchingKeys[T, TMatch] = Exclude[/* keyof T */ String, MatchingKeys[T, TMatch]]

type Nullable[T] = js.UndefOr[T | Null]

type Optional[T] = js.UndefOr[T]

type Primitive = String | js.Symbol | Boolean | Double | js.BigInt

type Push[H /* <: js.Array[Any] */, T] = /* import warning: importer.ImportType#apply c repeated non-array type: H */ js.Array[H]

type Reshape[T /* <: js.Object */] = Pick[T, /* keyof T */ String]

type Union[A /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any

type Unshift[T /* <: js.Array[Any] */, H] = /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]

type constnumber = (Double & js.Object) | `0`

type conststring = String | _empty

type constsymbol = (js.Symbol & js.Object) | js.Symbol

type consttuple[T] = js.Array[Any | T]

type numbers255 = js.Array[Any]
