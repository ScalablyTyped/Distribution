package typings.fundamentalReact.mod

import typings.fundamentalReact.PartialLocalizationEditor
import typings.fundamentalReact.WeakValidationMapLocaliza
import typings.fundamentalReact.localizationEditorMod.LocalizationEditorProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "LocalizationEditor")
@js.native
object LocalizationEditor extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): ReactElement | Null = js.native
}

