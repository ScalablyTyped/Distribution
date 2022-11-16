package typings.esfxTypeModel

import org.scalablytyped.runtime.Instantiable1
import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import typings.esfxTypeModel.esfxTypeModelInts.`0`
import typings.esfxTypeModel.esfxTypeModelStrings._empty
import typings.std.Exclude
import typings.std.Extract
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? never : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? never : A extends false ? false : B extends false ? false : true
    }}}
    */
  type And[A /* <: Boolean */, B /* <: Boolean */] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? std.Exclude<T, U> : never
    }}}
    */
  type AnyExclude[T, U] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? std.Extract<T, U> : never
    }}}
    */
  type AnyExtract[T, U] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? keyof T : never
    }}}
    */
  type AnyKeyof[T] = /* keyof T */ String
  
  type Assign[A /* <: js.Object */, B /* <: js.Object */] = Reshape[(Diff[A, B]) & B]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {[Symbol.asyncIterator] : (): {next (): any, next (value : infer U): any}} ? U : never
    }}}
    */
  @js.native
  trait AsyncGeneratorNextType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {[Symbol.asyncIterator] : (): {next (args : any): std.PromiseLike<infer R>}} ? R extends {  done :boolean | undefined,   value :any | undefined} ? R['done'] extends false | undefined ? never : @esfx/type-model.@esfx/type-model/dist.Await<R['value']> : never : never
    }}}
    */
  @js.native
  trait AsyncGeneratorReturnType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {[Symbol.asyncIterator] : (): {next (args : any): std.PromiseLike<infer R>}} ? R extends {  done :boolean | undefined,   value :any | undefined} ? R['done'] extends true ? never : @esfx/type-model.@esfx/type-model/dist.Await<R['value']> : never : never
    }}}
    */
  @js.native
  trait AsyncIteratedType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {then (onfulfilled : infer U): any} ? U extends (value : infer V): any ? @esfx/type-model.@esfx/type-model/dist.Await<V> : never : T
    }}}
    */
  type Await[T] = T
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: @esfx/type-model.@esfx/type-model/dist.Await<T[P]>}
    }}}
    */
  @js.native
  trait AwaitAll[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in @esfx/type-model.@esfx/type-model/dist.AnyKeyof<T> ]: @esfx/type-model.@esfx/type-model/dist.AnyExtract<T, {readonly [ U in P ]: unknown}>[P]}
    }}}
    */
  type Conjoin[T /* <: js.Object */] = AnyExtract[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ U in P ]: unknown} */ js.Any
  ]
  
  type Constructor[T, A /* <: js.Array[Any] */] = Instantiable1[/* args */ A, T]
  
  type Diff[A /* <: js.Object */, B /* <: js.Object */] = Omit[A, /* keyof B */ String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<T> extends true ? never : @esfx/type-model.@esfx/type-model/dist.IsAny<T> extends true ? any : @esfx/type-model.@esfx/type-model/dist.__DisjoinRest<{[ K in keyof T ]: {[ P in K ]: T[P]}}[keyof T]>
    }}}
    */
  @js.native
  trait Disjoin[T /* <: js.Object */] extends StObject
  
  type DisjoinOverlaps[A, B] = Overlaps[
    /* import warning: importer.ImportType#apply Failed type conversion: A extends object ? @esfx/type-model.@esfx/type-model/dist.Disjoin<A> : A */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: B extends object ? @esfx/type-model.@esfx/type-model/dist.Disjoin<B> : B */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<T> extends true ? {} : T
    }}}
    */
  type DisjoinRest[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [] ? never : @esfx/type-model.@esfx/type-model/dist.__EveryRest<{[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends false? 'false' : never}[number]>
    }}}
    */
  type Every[L /* <: js.Array[Boolean] */] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    'never' extends R ? never : 'false' extends R ? false : 'boolean' extends R ? boolean : true
    }}}
    */
  type EveryRest[R] = `false`
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {[Symbol.iterator] : (): {next (): any, next (value : infer U): any}} ? U : never
    }}}
    */
  @js.native
  trait GeneratorNextType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {[Symbol.iterator] : (): {next (args : any): infer R}} ? R extends {  done :boolean | undefined,   value :any} ? R['done'] extends false | undefined ? never : R['value'] : never : never
    }}}
    */
  @js.native
  trait GeneratorReturnType[T] extends StObject
  
  type Intersect[A /* <: js.Object */, B /* <: js.Object */] = Pick[A & B, Extract[/* keyof A */ String, /* keyof B */ String]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    A extends [infer H, ...infer T] ? H & @esfx/type-model.@esfx/type-model/dist.Intersection<T> : unknown
    }}}
    */
  @js.native
  trait Intersection[A /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    1 | 2 extends A extends never ? 1 : 2 ? true : false
    }}}
    */
  type IsAny[A] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsAny<T> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.IsNever<T> extends true ? never : @esfx/type-model.@esfx/type-model/dist.SameType<T, std.Function> extends true ? true : [T] extends [(args : any): any] ? true : false
    }}}
    */
  type IsCallable[T] = Boolean
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsAny<T> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.IsNever<T> extends true ? never : @esfx/type-model.@esfx/type-model/dist.SameType<T, std.Function> extends true ? true : [T] extends [new (args : any): any] ? true : false
    }}}
    */
  type IsConstructable[T] = Boolean
  
  type IsEmpty[T /* <: js.Object */] = IsNever[/* keyof T */ String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends never ? true : false extends true ? true : false
    }}}
    */
  type IsNever[A] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsAny<Sub> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.IsAny<Super> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.SameType<Sub, Super> extends true ? false : @esfx/type-model.@esfx/type-model/dist.__IsSubsetOf<Sub, Super>
    }}}
    */
  type IsProperSubsetOf[Sub, Super] = Boolean
  
  type IsProperSupersetOf[Super, Sub] = IsProperSubsetOf[Sub, Super]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsAny<Sub> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.IsAny<Super> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.__IsSubsetOf<Sub, Super>
    }}}
    */
  type IsSubsetOf[Sub, Super] = Boolean
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<Super> extends true ? @esfx/type-model.@esfx/type-model/dist.IsNever<Sub> : @esfx/type-model.@esfx/type-model/dist.IsNever<Sub> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsAny<Super> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsAny<Sub> extends true ? true : Sub extends Super ? true : false
    }}}
    */
  type IsSubtypeOf[Sub, Super] = `true`
  
  type IsSupersetOf[Super, Sub] = IsSubsetOf[Sub, Super]
  
  type IsSupertypeOf[Super, Sub] = IsSubtypeOf[Sub, Super]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<T> extends true ? false : @esfx/type-model.@esfx/type-model/dist.__IsUnionRest<T, [T]>
    }}}
    */
  type IsUnion[T] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? @esfx/type-model.@esfx/type-model/dist.Not<@esfx/type-model.@esfx/type-model/dist.SameType<[T], Q>> : never
    }}}
    */
  type IsUnionRest[T, Q] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsAny<A> extends true ? false : unknown extends A ? true : false
    }}}
    */
  type IsUnknown[A] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {[Symbol.iterator] : (): {next (args : any): infer R}} ? R extends {  done :boolean | undefined,   value :any} ? R['done'] extends true ? never : R['value'] : never : never
    }}}
    */
  @js.native
  trait IteratedType[T] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined ? never : T
    }}}
    */
  type NonOptional[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? never : A extends false ? true : false
    }}}
    */
  type Not[A /* <: Boolean */] = `true`
  
  type Nullable[T] = js.UndefOr[T | Null]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [] ? never : @esfx/type-model.@esfx/type-model/dist.__OneRest<{[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? [P] : never}[number]>
    }}}
    */
  type One[L /* <: js.Array[Boolean] */] = Boolean
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    'never' extends R ? never : 'boolean' extends R ? boolean : @esfx/type-model.@esfx/type-model/dist.IsNever<R> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsUnion<R> extends true ? false : true
    }}}
    */
  type OneRest[R] = Boolean
  
  type Optional[T] = js.UndefOr[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? never : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? never : A extends true ? true : B extends true ? true : false
    }}}
    */
  type Or[A /* <: Boolean */, B /* <: Boolean */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsAny<A> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsAny<B> extends true ? true : 1 extends A extends unknown ? A extends B ? 1 : 2 : 3 ? true : 1 extends B extends unknown ? B extends A ? 1 : 2 : 3 ? true : false
    }}}
    */
  type Overlaps[A, B] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [...infer H, infer T] ? [T, H] : [never, never]
    }}}
    */
  type Pop[L /* <: js.Array[Any] */] = js.Tuple2[scala.Nothing, scala.Nothing]
  
  type Primitive = String | js.Symbol | Boolean | Double | js.BigInt
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {then (onfulfilled : infer U): any} ? U extends (value : infer V): any ? V : never : never
    }}}
    */
  @js.native
  trait PromisedType[T] extends StObject
  
  type Push[H /* <: js.Array[Any] */, T] = /* import warning: importer.ImportType#apply c repeated non-array type: H */ js.Array[H]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsAny<A> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsAny<B> extends true ? true : [A] extends [B] ? true : [B] extends [A] ? true : false
    }}}
    */
  type Relatable[A, B] = `false`
  
  type Reshape[T /* <: js.Object */] = Pick[T, /* keyof T */ String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [infer H, ...infer T] ? [...@esfx/type-model.@esfx/type-model/dist.Reverse<T>, H] : []
    }}}
    */
  type Reverse[L /* <: js.Array[Any] */] = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? @esfx/type-model.@esfx/type-model/dist.IsNever<B> : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? false : [A, B] extends [B, A] ? true : false
    }}}
    */
  type SameType[A, B] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [] ? never : @esfx/type-model.@esfx/type-model/dist.SameType<{[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.SameType<L[P], L[number]>}[number], true>
    }}}
    */
  type SameTypes[L /* <: js.Array[Any] */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [infer H, ...infer T] ? [H, T] : [never, never]
    }}}
    */
  type Shift[L /* <: js.Array[Any] */] = js.Tuple2[scala.Nothing, scala.Nothing]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends [] ? never : @esfx/type-model.@esfx/type-model/dist.__SomeRest<{[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.IsNever<L[P]> extends true? 'never' : @esfx/type-model.@esfx/type-model/dist.IsAny<L[P]> extends true? 'boolean' : boolean extends L[P]? 'boolean' : L[P] extends true? 'true' : never}[number]>
    }}}
    */
  type Some[L /* <: js.Array[Boolean] */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    'never' extends R ? never : 'true' extends R ? true : 'boolean' extends R ? boolean : false
    }}}
    */
  type SomeRest[R] = `true`
  
  type Union[A /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  
  type Unshift[T /* <: js.Array[Any] */, H] = /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? never : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? never : A extends true ? @esfx/type-model.@esfx/type-model/dist.Not<B> : B extends true ? @esfx/type-model.@esfx/type-model/dist.Not<A> : false
    }}}
    */
  type XOr[A /* <: Boolean */, B /* <: Boolean */] = Not[B]
  
  trait _Falsy extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.IsNever<Sub> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsNever<Super> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsUnknown<Sub> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsUnknown<Super> extends true ? true : [Sub] extends [Super] ? true : false
    }}}
    */
  type _IsSubsetOf[Sub, Super] = `true`
  
  type constnumber = (Double & js.Object) | `0`
  
  type conststring = String | _empty
  
  type constsymbol = (js.Symbol & js.Object) | js.Symbol
  
  type consttuple[T] = js.Array[Any | T]
  
  type numbers255 = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends @esfx/type-model.@esfx/type-model/dist.numbers255[number] ? I | @esfx/type-model.@esfx/type-model/dist.strings255[I] : I extends @esfx/type-model.@esfx/type-model/dist.strings255[number] ? I | @esfx/type-model.@esfx/type-model/dist.numbers255[I] : never
    }}}
    */
  type numstr[I /* <: /* keyof any */ String */] = I | (/* import warning: importer.ImportType#apply Failed type conversion: @esfx/type-model.@esfx/type-model/dist.strings255[I] */ js.Any)
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    @esfx/type-model.@esfx/type-model/dist.numbers255 extends infer T ? {[ P in keyof T ]: P} : never
    }}}
    */
  @js.native
  trait strings255 extends StObject
}
