package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? never : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? never : A extends true ? @esfx/type-model.@esfx/type-model/dist.Not<B> : B extends true ? @esfx/type-model.@esfx/type-model/dist.Not<A> : false
  }}}
  */
@js.native
trait XOr[A /* <: Boolean */, B /* <: Boolean */] extends StObject
