package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {[Symbol.asyncIterator] : (): {next (args : any): std.PromiseLike<infer R>}} ? R extends {  done :boolean | undefined,   value :any | undefined} ? R['done'] extends false | undefined ? never : @esfx/type-model.@esfx/type-model/dist.Await<R['value']> : never : never
  }}}
  */
@js.native
trait AsyncGeneratorReturnType[T] extends StObject
