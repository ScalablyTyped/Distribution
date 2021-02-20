package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialLocalizationEditor
import typings.fundamentalReact.anon.WeakValidationMapLocaliza
import typings.fundamentalReact.localizationEditorMod.LocalizationEditorProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LocalizationEditor/LocalizationEditor.LocalizationEditorProps> & {  displayName :'LocalizationEditor'} */
object LocalizationEditor {
  
  @JSImport("fundamental-react", "LocalizationEditor")
  @js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "LocalizationEditor")
  @js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "LocalizationEditor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "LocalizationEditor.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LocalizationEditor.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialLocalizationEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LocalizationEditor.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LocalizationEditor.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapLocaliza]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
