package typings.ecmarkup

import typings.commandLineUsage.mod.OptionDefinition
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libArgParserMod {
  
  @JSImport("ecmarkup/lib/arg-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse[T /* <: js.Array[OptionDefinition] */](options: T, printHelp: js.Function0[Unit]): ArgsFromOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], printHelp.asInstanceOf[js.Any])).asInstanceOf[ArgsFromOptions[T]]
  
  type ArgTypeForKey[T /* <: js.Array[OptionDefinition] */, key /* <: String */] = ReturnTypeOrNull[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<T[number], ecmarkup.anon.Name<key>>['type'] */ js.Any
  ]
  
  type ArgsFromOptions[T /* <: js.Array[OptionDefinition] */] = Spread[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ecmarkup.ecmarkup/lib/arg-parser.Multiples<T[number]>['name'] ]: std.Array<ecmarkup.ecmarkup/lib/arg-parser.ArgTypeForKey<T, key>>} */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ecmarkup.ecmarkup/lib/arg-parser.Defaulted<T[number]>['name'] ]: ecmarkup.ecmarkup/lib/arg-parser.ArgTypeForKey<T, key>} */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ecmarkup.ecmarkup/lib/arg-parser.Optional<T[number]>['name'] ]:? ecmarkup.ecmarkup/lib/arg-parser.ArgTypeForKey<T, key>} */ js.Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends unknown ? std.Extract<T, {  defaultValue :unknown}> : never
    }}}
    */
  @js.native
  trait Defaulted[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends infer U ? {[ K in keyof U ]: U[K]} : never
    }}}
    */
  @js.native
  trait Id[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends unknown ? std.Extract<T, {  multiple :true} | {  lazyMultiple :true}> : never
    }}}
    */
  @js.native
  trait Multiples[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends unknown ? std.Exclude<T, ecmarkup.ecmarkup/lib/arg-parser.Multiples<T> | ecmarkup.ecmarkup/lib/arg-parser.Defaulted<T>> : never
    }}}
    */
  @js.native
  trait Optional[T] extends StObject
  
  type OptionalPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends {[ P in K ]: T[K]}? K : never}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : ...unknown): unknown ? std.ReturnType<T> : null
    }}}
    */
  @js.native
  trait ReturnTypeOrNull[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends [infer L, ...infer R] ? ecmarkup.ecmarkup/lib/arg-parser.SpreadTwo<L, ecmarkup.ecmarkup/lib/arg-parser.Spread<R>> : unknown
    }}}
    */
  @js.native
  trait Spread[A /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in K ]: L[P] | std.Exclude<R[P], undefined>}
    }}}
    */
  @js.native
  trait SpreadProperties[L, R, K /* <: /* keyof L */ String */] extends StObject
  
  type SpreadTwo[L, R] = Id[
    (Pick[L, Exclude[/* keyof L */ String, /* keyof R */ String]]) & (Pick[R, Exclude[/* keyof R */ String, OptionalPropertyNames[R]]]) & (Pick[R, Exclude[OptionalPropertyNames[R], /* keyof L */ String]]) & (SpreadProperties[L, R, OptionalPropertyNames[R] & (/* keyof L */ String)])
  ]
}
