package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialLinkProps
import typings.fundamentalReact.anon.WeakValidationMapLinkProp
import typings.fundamentalReact.fundamentalReactStrings.Link
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.ValidationMap
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Link/Link.LinkProps> & {  displayName :'Link'} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[LinkProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[LinkProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Link/Link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Link/Link", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Link/Link", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLinkProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialLinkProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Link/Link", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Link | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[Link | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Link/Link", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapLinkProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LinkProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  }
  object LinkProps {
    
    @scala.inline
    def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
