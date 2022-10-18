package typings.emscripten

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://emscripten.org/docs/porting/connecting_cpp_and_javascript/Interacting-with-code.html
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  R extends emscripten.Emscripten.JSType ? {  number :number,   string :string,   array :std.Array<number> | std.Array<string> | std.Array<boolean> | std.Uint8Array | std.Int8Array,   boolean :boolean,   null :null}[R] : never
  }}}
  */
@js.native
trait StringToType[R /* <: Any */] extends StObject
