package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  @esfx/type-model.@esfx/type-model/dist.IsNever<Sub> extends true ? true : @esfx/type-model.@esfx/type-model/dist.IsNever<Super> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsUnknown<Sub> extends true ? false : @esfx/type-model.@esfx/type-model/dist.IsUnknown<Super> extends true ? true : [Sub] extends [Super] ? true : false
  }}}
  */
@js.native
trait _IsSubsetOf[Sub, Super] extends StObject
