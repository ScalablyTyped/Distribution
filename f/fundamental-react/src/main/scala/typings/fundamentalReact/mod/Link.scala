package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialLinkProps
import typings.fundamentalReact.anon.WeakValidationMapLinkProp
import typings.fundamentalReact.libLinkLinkMod.LinkProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Link/Link.LinkProps> & {  displayName :'Link'} */
object Link {
  
  inline def apply(props: LinkProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: LinkProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Link")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Link.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Link.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialLinkProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialLinkProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Link.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Link | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Link | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Link.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapLinkProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
