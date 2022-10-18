package typings.esfxTypeModel.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  @esfx/type-model.@esfx/type-model/dist.IsAny<T> extends true ? boolean : @esfx/type-model.@esfx/type-model/dist.IsNever<T> extends true ? never : @esfx/type-model.@esfx/type-model/dist.SameType<T, std.Function> extends true ? true : [T] extends [new (args : any): any] ? true : false
  }}}
  */
@js.native
trait IsConstructable[T] extends StObject
