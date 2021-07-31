package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialMessageStripProps
import typings.fundamentalReact.anon.WeakValidationMapMessageS
import typings.fundamentalReact.messageStripMod.MessageStripProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> & {  displayName :'MessageStrip'} */
object MessageStrip {
  
  @scala.inline
  def apply(props: PropsWithChildren[MessageStripProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  @scala.inline
  def apply(props: PropsWithChildren[MessageStripProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "MessageStrip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "MessageStrip.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "MessageStrip.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialMessageStripProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "MessageStrip.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.MessageStrip | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.MessageStrip | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "MessageStrip.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapMessageS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
