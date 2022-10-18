package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  @esfx/type-model.@esfx/type-model/dist.IsNever<A> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsNever<B> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsAny<A> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsAny<B> extends true ? true : [A] extends [B] ? true : [B] extends [A] ? true : false
  }}}
  */
@js.native
trait Relatable[A, B] extends StObject
