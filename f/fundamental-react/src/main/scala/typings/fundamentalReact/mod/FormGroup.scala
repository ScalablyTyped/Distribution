package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialFormGroupProps
import typings.fundamentalReact.anon.WeakValidationMapFormGrou
import typings.fundamentalReact.formGroupMod.FormGroupProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> & {  displayName :'FormGroup'} */
object FormGroup {
  
  inline def apply(props: FormGroupProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: FormGroupProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "FormGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "FormGroup.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "FormGroup.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialFormGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "FormGroup.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.FormGroup | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.FormGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "FormGroup.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapFormGrou] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapFormGrou]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
