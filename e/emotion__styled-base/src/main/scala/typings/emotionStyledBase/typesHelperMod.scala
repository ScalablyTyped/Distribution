package typings.emotionStyledBase

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelperMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, U>> : never
    }}}
    */
  type Omit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  
  type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.emotionStyledBase.emotionStyledBaseStrings.a, typings.emotionStyledBase.emotionStyledBaseStrings.abbr, typings.emotionStyledBase.emotionStyledBaseStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}
