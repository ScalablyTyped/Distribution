package typings.fastifyDeepmerge

import typings.fastifyDeepmerge.anon.Optionsalltrue
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fastify/deepmerge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): DeepMergeFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[DeepMergeFn]
  inline def default(options: Optionsalltrue): DeepMergeAllFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[DeepMergeAllFn]
  inline def default(options: Options): DeepMergeFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[DeepMergeFn]
  
  inline def deepmerge(): DeepMergeFn = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")().asInstanceOf[DeepMergeFn]
  inline def deepmerge(options: Optionsalltrue): DeepMergeAllFn = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(options.asInstanceOf[js.Any]).asInstanceOf[DeepMergeAllFn]
  inline def deepmerge(options: Options): DeepMergeFn = ^.asInstanceOf[js.Dynamic].applyDynamic("deepmerge")(options.asInstanceOf[js.Any]).asInstanceOf[DeepMergeFn]
  
  type BuiltIns = Primitive | js.Date | js.RegExp
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @fastify/deepmerge.@fastify/deepmerge.First<T> extends never ? R : @fastify/deepmerge.@fastify/deepmerge.DeepMergeAll<@fastify/deepmerge.@fastify/deepmerge.DeepMerge<R, @fastify/deepmerge.@fastify/deepmerge.First<T>>, @fastify/deepmerge.@fastify/deepmerge.Rest<T>>
    }}}
    */
  type DeepMergeAll[R, T] = R
  
  type DeepMergeAllFn = js.Function1[/* targets */ js.Array[Any], DeepMergeAll[js.Object, js.Array[Any]]]
  
  type DeepMergeFn = js.Function2[/* target */ Any, /* source */ Any, DeepMerge_[Any, Any]]
  
  type DeepMergeHelper[T, U, T0, T1] = T1
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    U extends @fastify/deepmerge.@fastify/deepmerge.BuiltIns ? U : [T, U] extends [std.Array<any>, std.Array<any>] ? @fastify/deepmerge.@fastify/deepmerge.MergeTypes<T, U> : [T, U] extends [{[key: string] : unknown}, {[key: string] : unknown}] ? @fastify/deepmerge.@fastify/deepmerge.DeepMergeHelper<T, U, @fastify/deepmerge.@fastify/deepmerge.DifferenceKeys<T, U, std.Omit<T, keyof U> & std.Omit<U, keyof T>, {[ K in keyof std.Omit<T, keyof U> & std.Omit<U, keyof T> ]: std.Omit<T, keyof U> & std.Omit<U, keyof T>[K]}> & {[ K in keyof @fastify/deepmerge.@fastify/deepmerge.IntersectionKeys<T, U> ]: @fastify/deepmerge.@fastify/deepmerge.DeepMerge<T[K], U[K]>}, {[ K in keyof @fastify/deepmerge.@fastify/deepmerge.DifferenceKeys<T, U, std.Omit<T, keyof U> & std.Omit<U, keyof T>, {[ K in keyof std.Omit<T, keyof U> & std.Omit<U, keyof T> ]: std.Omit<T, keyof U> & std.Omit<U, keyof T>[K]}> & {[ K in keyof @fastify/deepmerge.@fastify/deepmerge.IntersectionKeys<T, U> ]: @fastify/deepmerge.@fastify/deepmerge.DeepMerge<T[K], U[K]>} ]: @fastify/deepmerge.@fastify/deepmerge.DifferenceKeys<T, U, std.Omit<T, keyof U> & std.Omit<U, keyof T>, {[ K in keyof std.Omit<T, keyof U> & std.Omit<U, keyof T> ]: std.Omit<T, keyof U> & std.Omit<U, keyof T>[K]}> & {[ K in keyof @fastify/deepmerge.@fastify/deepmerge.IntersectionKeys<T, U> ]: @fastify/deepmerge.@fastify/deepmerge.DeepMerge<T[K], U[K]>}[K]}> : U
    }}}
    */
  type DeepMerge_[T, U] = U
  
  type DifferenceKeys[T, U, T0, T1] = T1
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [infer _I, ...infer _Rest] ? _I : never
    }}}
    */
  @js.native
  trait First[T] extends StObject
  
  type IntersectionKeys[T, U] = Omit[
    T | U, 
    /* keyof @fastify/deepmerge.@fastify/deepmerge.DifferenceKeys<T, U, std.Omit<T, keyof U> & std.Omit<U, keyof T>, {[ K in keyof std.Omit<T, keyof U> & std.Omit<U, keyof T> ]: std.Omit<T, keyof U> & std.Omit<U, keyof T>[K]}> */ String
  ]
  
  type MergeArrayFn = js.Function1[
    /* options */ MergeArrayFnOptions, 
    js.Function2[/* target */ js.Array[Any], /* source */ js.Array[Any], js.Array[Any]]
  ]
  
  trait MergeArrayFnOptions extends StObject {
    
    def clone(value: Any): Any
    
    def deepmerge[T1, T2](target: T1, source: T2): DeepMerge_[T1, T2]
    @JSName("deepmerge")
    var deepmerge_Original: DeepMergeFn
    
    def getKeys(value: js.Object): js.Array[String]
    
    def isMergeableObject(value: Any): Boolean
  }
  object MergeArrayFnOptions {
    
    inline def apply(
      clone_ : Any => Any,
      deepmerge: (/* target */ Any, /* source */ Any) => DeepMerge_[Any, Any],
      getKeys: js.Object => js.Array[String],
      isMergeableObject: Any => Boolean
    ): MergeArrayFnOptions = {
      val __obj = js.Dynamic.literal(deepmerge = js.Any.fromFunction2(deepmerge), getKeys = js.Any.fromFunction1(getKeys), isMergeableObject = js.Any.fromFunction1(isMergeableObject))
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[MergeArrayFnOptions]
    }
    
    extension [Self <: MergeArrayFnOptions](x: Self) {
      
      inline def setClone_(value: Any => Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      inline def setDeepmerge(value: (/* target */ Any, /* source */ Any) => DeepMerge_[Any, Any]): Self = StObject.set(x, "deepmerge", js.Any.fromFunction2(value))
      
      inline def setGetKeys(value: js.Object => js.Array[String]): Self = StObject.set(x, "getKeys", js.Any.fromFunction1(value))
      
      inline def setIsMergeableObject(value: Any => Boolean): Self = StObject.set(x, "isMergeableObject", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<infer A1> ? U extends std.Array<infer A2> ? std.Array<A1 | A2> : T : U
    }}}
    */
  type MergeTypes[T, U] = T
  
  trait Options extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var mergeArray: js.UndefOr[MergeArrayFn] = js.undefined
    
    var symbols: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setMergeArray(
        value: /* options */ MergeArrayFnOptions => js.Function2[/* target */ js.Array[Any], /* source */ js.Array[Any], js.Array[Any]]
      ): Self = StObject.set(x, "mergeArray", js.Any.fromFunction1(value))
      
      inline def setMergeArrayUndefined: Self = StObject.set(x, "mergeArray", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [infer _I, ...infer _Rest] ? _Rest : never
    }}}
    */
  @js.native
  trait Rest[T] extends StObject
}
