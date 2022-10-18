package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  L extends [] ? never : @esfx/type-model.@esfx/type-model/dist.SameType<{[ P in keyof L ]: @esfx/type-model.@esfx/type-model/dist.SameType<L[P], L[number]>}[number], true>
  }}}
  */
@js.native
trait SameTypes[L /* <: js.Array[Any] */] extends StObject
