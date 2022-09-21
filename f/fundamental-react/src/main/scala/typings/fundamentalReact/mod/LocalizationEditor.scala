package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialLocalizationEditor
import typings.fundamentalReact.anon.WeakValidationMapLocaliza
import typings.fundamentalReact.localizationEditorMod.LocalizationEditorProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LocalizationEditor/LocalizationEditor.LocalizationEditorProps> & {  displayName :'LocalizationEditor'} */
object LocalizationEditor {
  
  inline def apply(props: LocalizationEditorProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: LocalizationEditorProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "LocalizationEditor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "LocalizationEditor.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LocalizationEditor.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialLocalizationEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LocalizationEditor.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LocalizationEditor | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LocalizationEditor.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapLocaliza]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
