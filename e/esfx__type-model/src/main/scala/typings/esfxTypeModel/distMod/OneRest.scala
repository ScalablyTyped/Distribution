package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  'never' extends R ? never : 'boolean' extends R ? boolean : @esfx/type-model.@esfx/type-model/dist.IsNever<R> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsUnion<R> extends true ? false : true
  }}}
  */
@js.native
trait OneRest[R] extends StObject
