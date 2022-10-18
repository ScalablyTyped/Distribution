package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  List extends [frida-gum.Variadic, ...infer Tail] ? [...std.Array<Tail[0]>] : List extends [infer Head, ...infer Tail] ? [Head, ...frida-gum.ResolveVariadic<Tail>] : []
  }}}
  */
@js.native
trait ResolveVariadic[List /* <: js.Array[Any] */] extends StObject
