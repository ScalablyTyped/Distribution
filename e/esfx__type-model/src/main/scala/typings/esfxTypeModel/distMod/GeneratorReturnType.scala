package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {[Symbol.iterator] : (): {next (args : any): infer R}} ? R extends {  done :boolean | undefined,   value :any} ? R['done'] extends false | undefined ? never : R['value'] : never : never
  }}}
  */
@js.native
trait GeneratorReturnType[T] extends StObject
