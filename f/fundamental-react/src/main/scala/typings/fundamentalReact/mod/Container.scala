package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialContainerProps
import typings.fundamentalReact.anon.WeakValidationMapContaine
import typings.fundamentalReact.libContainerContainerMod.ContainerProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Container/Container.ContainerProps> & {  displayName :'Container'} */
object Container {
  
  inline def apply(props: ContainerProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: ContainerProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Container")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Container.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Container.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialContainerProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialContainerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Container.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Container | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Container | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Container.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapContaine] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapContaine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
