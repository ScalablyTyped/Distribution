package typings.emotionStyledBase

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  type Omit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  
  type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}
