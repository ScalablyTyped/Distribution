package typings.fundamentalReact

import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/ActionBar/ActionBar", JSImport.Namespace)
@js.native
object actionBarMod extends js.Object {
  val ActionBar: FunctionComponent[ActionBarProps] with AnonActionBar = js.native
  val default: FunctionComponent[ActionBarProps] with AnonActionBar = js.native
  type ActionBarActionsProps = AnonClassNameRef with HTMLAttributes[HTMLDivElement]
  type ActionBarBackProps = AnonButtonProps with HTMLAttributes[HTMLDivElement]
  type ActionBarHeaderProps = Anon1 with HTMLAttributes[HTMLDivElement]
  type ActionBarProps = AnonClassName with HTMLAttributes[HTMLDivElement]
}

