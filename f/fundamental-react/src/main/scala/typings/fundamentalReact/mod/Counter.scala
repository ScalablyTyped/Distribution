package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialCounterProps
import typings.fundamentalReact.anon.WeakValidationMapCounterP
import typings.fundamentalReact.libCounterCounterMod.CounterProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Counter/Counter.CounterProps> & {  displayName :'Counter'} */
object Counter {
  
  inline def apply(props: CounterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: CounterProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Counter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Counter.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Counter.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialCounterProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialCounterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Counter.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Counter | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Counter | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Counter.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapCounterP] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapCounterP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
