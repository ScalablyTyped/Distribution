package typings.fundamentalReact.mod

import typings.fundamentalReact.PartialLinkProps
import typings.fundamentalReact.WeakValidationMapLinkProp
import typings.fundamentalReact.linkMod.LinkProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Link")
@js.native
object Link extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLinkProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Link | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
  def apply(props: PropsWithChildren[LinkProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LinkProps], context: js.Any): ReactElement | Null = js.native
}

