package typings.esfxTypeModel

import typings.esfxTypeModel.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [@esfx/type-model.@esfx/type-model/dist.IsNever<Expected>] extends [true] ? [@esfx/type-model.@esfx/type-model/dist.IsNever<Actual>] extends [true] ? {  pass :true} : {  pass :false,   Expected :Expected,   Actual :Actual} : [@esfx/type-model.@esfx/type-model/dist.IsNever<Actual>] extends [true] ? {  pass :false,   Expected :Expected,   Actual :Actual} : [@esfx/type-model.@esfx/type-model/dist.IsAny<Expected>] extends [true] ? [@esfx/type-model.@esfx/type-model/dist.IsAny<Actual>] extends [true] ? {  pass :true} : {  pass :false,   Expected :Expected,   Actual :Actual} : [@esfx/type-model.@esfx/type-model/dist.IsAny<Actual>] extends [true] ? {  pass :false,   Expected :Expected,   Actual :Actual} : [Expected, Actual] extends [Actual, Expected] ? {  pass :true} : {  pass :false,   Expected :Expected,   Actual :Actual}
    }}}
    */
  @js.native
  trait ExpectType[Actual, Expected] extends StObject
  
  type Test[T /* <: Pass */] = T
}
