package typings.emotionStyledBase

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelperMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, U>> : never
    }}}
    */
  @js.native
  trait Omit[T, U] extends StObject
  
  type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.emotionStyledBase.emotionStyledBaseStrings.a, typings.emotionStyledBase.emotionStyledBaseStrings.abbr, typings.emotionStyledBase.emotionStyledBaseStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}
