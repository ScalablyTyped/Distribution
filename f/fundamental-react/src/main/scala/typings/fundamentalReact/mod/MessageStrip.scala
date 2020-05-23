package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialMessageStripProps
import typings.fundamentalReact.anon.WeakValidationMapMessageS
import typings.fundamentalReact.messageStripMod.MessageStripProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "MessageStrip")
@js.native
object MessageStrip extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.MessageStrip | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
  def apply(props: PropsWithChildren[MessageStripProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MessageStripProps], context: js.Any): ReactElement | Null = js.native
}

