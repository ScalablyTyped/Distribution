package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialLinkProps
import typings.fundamentalReact.anon.WeakValidationMapLinkProp
import typings.fundamentalReact.fundamentalReactStrings.Link
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.ValidationMap
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLinkLinkMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Link/Link.LinkProps> & {  displayName :'Link'} */
  object default {
    
    inline def apply(props: LinkProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: LinkProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("fundamental-react/lib/Link/Link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Link/Link", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Link/Link", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLinkProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialLinkProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Link/Link", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Link | String] = js.native
    inline def displayName_=(x: js.UndefOr[Link | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Link/Link", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapLinkProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
