package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialInputGroupAddonPro
import typings.fundamentalReact.anon.WeakValidationMapInputGro
import typings.fundamentalReact.fundamentalReactStrings.InputGroupDotAddon
import typings.fundamentalReact.libInputGroupInputGroupMod.InputGroupAddonProps
import typings.fundamentalReact.libInputGroupInputGroupMod.default
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "InputGroup")
@js.native
open class InputGroup () extends default
object InputGroup {
  
  @JSImport("fundamental-react", "InputGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> & {  displayName :'InputGroup.Addon'} */
  object Addon {
    
    inline def apply(props: InputGroupAddonProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: InputGroupAddonProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react", "InputGroup.Addon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "InputGroup.Addon.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "InputGroup.Addon.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialInputGroupAddonPro] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialInputGroupAddonPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "InputGroup.Addon.displayName")
    @js.native
    def displayName: js.UndefOr[InputGroupDotAddon | String] = js.native
    inline def displayName_=(x: js.UndefOr[InputGroupDotAddon | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "InputGroup.Addon.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapInputGro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapInputGro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("fundamental-react", "InputGroup.displayName")
  @js.native
  def displayName: typings.fundamentalReact.fundamentalReactStrings.InputGroup = js.native
  inline def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.InputGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
