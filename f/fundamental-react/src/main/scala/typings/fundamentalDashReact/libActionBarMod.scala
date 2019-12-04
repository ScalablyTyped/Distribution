package typings.fundamentalDashReact

import typings.fundamentalDashReact.libActionBarActionBarMod.ActionBarActionsProps
import typings.fundamentalDashReact.libActionBarActionBarMod.ActionBarBackProps
import typings.fundamentalDashReact.libActionBarActionBarMod.ActionBarHeaderProps
import typings.fundamentalDashReact.libActionBarActionBarMod.default
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/ActionBar", JSImport.Namespace)
@js.native
object libActionBarMod extends js.Object {
  @js.native
  class ActionBar () extends default
  
  /* static members */
  @js.native
  object ActionBar extends js.Object {
    var Actions: FunctionComponent[ActionBarActionsProps] = js.native
    var Back: FunctionComponent[ActionBarBackProps] = js.native
    var Header: FunctionComponent[ActionBarHeaderProps] = js.native
  }
  
}

