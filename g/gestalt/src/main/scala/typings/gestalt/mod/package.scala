package typings.gestalt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbstractEventHandler[T /* <: (typings.react.mod.SyntheticEvent[typings.std.HTMLElement, typings.std.Event]) | typings.std.Event */, U] = js.Function1[/* arg */ U with typings.gestalt.anon.Event[T], scala.Unit]
  
  type ReactForwardRef[T, P] = typings.react.mod.ForwardRefExoticComponent[typings.react.mod.PropsWithoutRef[P] with typings.react.mod.RefAttributes[T]]
  
  type SheetNodeOrRenderProp = (js.Function1[/* prop */ typings.gestalt.anon.OnDismissStart, typings.react.mod.ReactNode]) | typings.react.mod.ReactNode
}
