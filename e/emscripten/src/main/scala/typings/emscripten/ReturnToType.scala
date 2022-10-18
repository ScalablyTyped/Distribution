package typings.emscripten

import typings.emscripten.Emscripten.JSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  R extends null ? null : emscripten.StringToType<std.Exclude<R, null>>
  }}}
  */
@js.native
trait ReturnToType[R /* <: JSType | Null */] extends StObject
