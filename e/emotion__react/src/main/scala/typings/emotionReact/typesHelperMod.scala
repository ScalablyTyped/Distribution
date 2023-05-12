package typings.emotionReact

import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
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
  type DistributiveOmit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.emotionReact.emotionReactStrings.a_, typings.emotionReact.emotionReactStrings.abbr, typings.emotionReact.emotionReactStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentProps[C]]
}
