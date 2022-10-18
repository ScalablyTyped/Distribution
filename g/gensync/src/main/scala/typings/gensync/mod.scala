package typings.gensync

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[A /* <: js.Array[Any] */, R, E](generatorFnOrOptions: js.Function1[/* args */ A, Generator[Handler[Any], R, Any]]): Gensync[A, R, E] = ^.asInstanceOf[js.Dynamic].apply(generatorFnOrOptions.asInstanceOf[js.Any]).asInstanceOf[Gensync[A, R, E]]
  inline def apply[A /* <: js.Array[Any] */, R, E](generatorFnOrOptions: Options[A, R, E]): Gensync[A, R, E] = ^.asInstanceOf[js.Dynamic].apply(generatorFnOrOptions.asInstanceOf[js.Any]).asInstanceOf[Gensync[A, R, E]]
  
  @JSImport("gensync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // "all" and "race"'s types are pretty much copied from Promise.all and Promise.race,
  // replacing Awaited with Handled.
  /**
    * `Promise.all`-like combinator that works with an iterable of generator objects
    * that could be passed to `yield*` within a gensync generator.
    * @param args An array of gensync generators
    * @returns A new gensync generator
    */
  inline def all[T /* <: js.Array[Any | Handler[Any]] */](args: T): Handler[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: gensync.gensync.Handled<T[P]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[js.Any]).asInstanceOf[Handler[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: gensync.gensync.Handled<T[P]>} */ js.Any
  ]]
  /**
    * `Promise.all`-like combinator that works with an iterable of generator objects
    * that could be passed to `yield*` within a gensync generator.
    * @param args An iterable of gensync generators
    * @returns A new gensync generator
    */
  inline def all[T](args: js.Iterable[Handler[T]]): Handler[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[js.Any]).asInstanceOf[Handler[js.Array[T]]]
  
  /**
    * `Promise.race`-like combinator that works with an iterable of generator objects
    * that could be passed to `yield*` within a gensync generator.
    * @param args An array of gensync generators
    * @returns A new gensync generator
    */
  inline def race[T /* <: js.Array[Any | Handler[Any]] */](args: T): Handler[
    Handled[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(args.asInstanceOf[js.Any]).asInstanceOf[Handler[
    Handled[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]]
  /**
    * `Promise.race`-like combinator that works with an iterable of generator objects
    * that could be passed to `yield*` within a gensync generator.
    * @param args An iterable of gensync generators
    * @returns A new gensync generator
    */
  inline def race[T](args: js.Iterable[Handler[T]]): Handler[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(args.asInstanceOf[js.Any]).asInstanceOf[Handler[T]]
  
  /* Inlined parent std.Omit<gensync.gensync.SyncOptions<A, R>, 'async'> */
  trait AsyncOptions[A /* <: js.Array[Any] */, R]
    extends StObject
       with Options[A, R, Any] {
    
    var arity: js.UndefOr[Double] = js.undefined
    
    /**
      * A function that will be called when `.async()` or `.errback()` is called on
      * the `gensync()` result, or when the result is passed to `yield*` in another
      * generator that is being run asynchronously.
      *
      * Must not be specified with `errback`.
      */
    def async(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): js.Promise[R]
    
    var errback: Unit
    
    var name: js.UndefOr[String] = js.undefined
    
    def sync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): R
    @JSName("sync")
    var sync_Original: js.Function1[/* args */ A, R]
  }
  object AsyncOptions {
    
    inline def apply[A /* <: js.Array[Any] */, R](async: A => js.Promise[R], errback: Unit, sync: /* args */ A => R): AsyncOptions[A, R] = {
      val __obj = js.Dynamic.literal(async = js.Any.fromFunction1(async), errback = errback.asInstanceOf[js.Any], sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[AsyncOptions[A, R]]
    }
    
    extension [Self <: AsyncOptions[?, ?], A /* <: js.Array[Any] */, R](x: Self & (AsyncOptions[A, R])) {
      
      inline def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      inline def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
      
      inline def setAsync(value: A => js.Promise[R]): Self = StObject.set(x, "async", js.Any.fromFunction1(value))
      
      inline def setErrback(value: Unit): Self = StObject.set(x, "errback", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSync(value: /* args */ A => R): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A callback function such that if the result is void, there is no result parameter.
    */
  // tslint:disable-next-line void-return
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [R] extends [void] ? (err : E): void : (err : E, result : R): void
    }}}
    */
  @js.native
  trait Callback[R, E] extends StObject
  
  /* Inlined parent std.Omit<gensync.gensync.SyncOptions<A, R>, 'errback'> */
  trait ErrbackOptions[A /* <: js.Array[Any] */, R, E]
    extends StObject
       with Options[A, R, E] {
    
    var arity: js.UndefOr[Double] = js.undefined
    
    var async: Unit
    
    /**
      * A function that will be called when `.async()` or `.errback()` is called on
      * the `gensync()` result, or when the result is passed to `yield*` in another
      * generator that is being run asynchronously.
      *
      * This option allows for simpler compatibility with many existing Node APIs,
      * and also avoids introducing the extra even loop turns that promises introduce
      * to access the result value.
      *
      * Must not be specified with `async`.
      */
    def errback(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...A, Callback<R, E>] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
    ): Unit
    
    var name: js.UndefOr[String] = js.undefined
    
    def sync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): R
    @JSName("sync")
    var sync_Original: js.Function1[/* args */ A, R]
  }
  object ErrbackOptions {
    
    inline def apply[A /* <: js.Array[Any] */, R, E](
      async: Unit,
      errback: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A] => Unit,
      sync: /* args */ A => R
    ): ErrbackOptions[A, R, E] = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], errback = js.Any.fromFunction1(errback), sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[ErrbackOptions[A, R, E]]
    }
    
    extension [Self <: ErrbackOptions[?, ?, ?], A /* <: js.Array[Any] */, R, E](x: Self & (ErrbackOptions[A, R, E])) {
      
      inline def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      inline def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
      
      inline def setAsync(value: Unit): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setErrback(
        value: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A] => Unit
      ): Self = StObject.set(x, "errback", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSync(value: /* args */ A => R): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A function that can be "awaited" (with `yield*`) in another `gensync` generator,
    * or executed via
    *
    *   - `.sync(...args)` - Returns the computed value, or throws.
    *   - `.async(...args)` - Returns a promise for the computed value.
    *   - `.errback(...args, (err, result) => {})` - Calls the callback wit
    */
  @js.native
  trait Gensync[A /* <: js.Array[Any] */, R, E] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): Handler[R] = js.native
    
    def async(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): js.Promise[R] = js.native
    
    def errback(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [args: ...A, callback: Callback<R, E>] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A]
    ): Unit = js.native
    
    def sync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): R = js.native
  }
  
  /**
    * Given a `gensync` generator, produces the "awaited" type of that generator
    * when "yield*"'d in another `gensync` generator.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends gensync.gensync.Handler<infer U> ? U : never
    }}}
    */
  @js.native
  trait Handled[T] extends StObject
  
  /**
    * A generator produced by `gensync`, which can only "await" (with `yield*`) other
    * generators produced by `gensync`.
    */
  @js.native
  trait Handler[R]
    extends StObject
       with Generator[Handler[Any], R, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gensync.mod.SyncOptions[A, R]
    - typings.gensync.mod.AsyncOptions[A, R]
    - typings.gensync.mod.ErrbackOptions[A, R, E]
  */
  trait Options[A /* <: js.Array[Any] */, R, E] extends StObject
  object Options {
    
    inline def AsyncOptions[A /* <: js.Array[Any] */, R](async: A => js.Promise[R], errback: Unit, sync: A => R): typings.gensync.mod.AsyncOptions[A, R] = {
      val __obj = js.Dynamic.literal(async = js.Any.fromFunction1(async), errback = errback.asInstanceOf[js.Any], sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[typings.gensync.mod.AsyncOptions[A, R]]
    }
    
    inline def ErrbackOptions[A /* <: js.Array[Any] */, R, E](
      async: Unit,
      errback: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A] => Unit,
      sync: A => R
    ): typings.gensync.mod.ErrbackOptions[A, R, E] = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], errback = js.Any.fromFunction1(errback), sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[typings.gensync.mod.ErrbackOptions[A, R, E]]
    }
    
    inline def SyncOptions[A /* <: js.Array[Any] */, R](async: Unit, errback: Unit, sync: A => R): typings.gensync.mod.SyncOptions[A, R] = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], errback = errback.asInstanceOf[js.Any], sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[typings.gensync.mod.SyncOptions[A, R]]
    }
  }
  
  trait SyncOptions[A /* <: js.Array[Any] */, R]
    extends StObject
       with Options[A, R, Any] {
    
    /**
      * A number for the length to set on the returned function. If no value
      * is provided, the length will be carried over from the `sync` function's
      * `length` value.
      */
    var arity: js.UndefOr[Double] = js.undefined
    
    // Mutually exclusive options.
    var async: Unit
    
    var errback: Unit
    
    /**
      * A string name to apply to the returned function. If no value is provided,
      * the name of `errback`/`async`/`sync` functions will be used, with any
      * `Sync` or `Async` suffix stripped off. If the callback is simply named
      * with ES6 inference (same name as the options property), the name is ignored.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A function that will be called when `.sync()` is called on the `gensync()`
      * result, or when the result is passed to `yield*` in another generator that
      * is being run synchronously.
      *
      * Also called for `.async()` calls if no async handlers are provided.
      */
    def sync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): R
  }
  object SyncOptions {
    
    inline def apply[A /* <: js.Array[Any] */, R](async: Unit, errback: Unit, sync: A => R): SyncOptions[A, R] = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], errback = errback.asInstanceOf[js.Any], sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[SyncOptions[A, R]]
    }
    
    extension [Self <: SyncOptions[?, ?], A /* <: js.Array[Any] */, R](x: Self & (SyncOptions[A, R])) {
      
      inline def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      inline def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
      
      inline def setAsync(value: Unit): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setErrback(value: Unit): Self = StObject.set(x, "errback", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSync(value: A => R): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    }
  }
}
