package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialFormGroupProps
import typings.fundamentalReact.anon.WeakValidationMapFormGrou
import typings.fundamentalReact.formGroupMod.FormGroupProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> & {  displayName :'FormGroup'} */
object FormGroup {
  
  @JSImport("fundamental-react", "FormGroup")
  @js.native
  def apply(props: PropsWithChildren[FormGroupProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "FormGroup")
  @js.native
  def apply(props: PropsWithChildren[FormGroupProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "FormGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "FormGroup.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "FormGroup.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialFormGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "FormGroup.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.FormGroup | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.FormGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "FormGroup.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapFormGrou] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapFormGrou]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
