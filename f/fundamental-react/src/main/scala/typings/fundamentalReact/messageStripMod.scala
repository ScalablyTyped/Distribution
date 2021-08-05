package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialMessageStripProps
import typings.fundamentalReact.anon.WeakValidationMapMessageS
import typings.fundamentalReact.fundamentalReactStrings.MessageStrip
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageStripMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> & {  displayName :'MessageStrip'} */
  object default {
    
    inline def apply(props: PropsWithChildren[MessageStripProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: PropsWithChildren[MessageStripProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialMessageStripProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.displayName")
    @js.native
    def displayName: js.UndefOr[MessageStrip | String] = js.native
    inline def displayName_=(x: js.UndefOr[MessageStrip | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapMessageS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait MessageStripProps extends StObject {
    
    var buttonProps: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var dismissible: js.UndefOr[Boolean] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var linkProps: js.UndefOr[js.Any] = js.undefined
    
    var linkText: js.UndefOr[String] = js.undefined
    
    var localizedText: js.UndefOr[js.Any] = js.undefined
    
    var noGlyph: js.UndefOr[Boolean] = js.undefined
    
    var onCloseClicked: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var `type`: js.UndefOr[js.Any] = js.undefined
  }
  object MessageStripProps {
    
    inline def apply(): MessageStripProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStripProps]
    }
    
    extension [Self <: MessageStripProps](x: Self) {
      
      inline def setButtonProps(value: js.Any): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLocalizedText(value: js.Any): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setNoGlyph(value: Boolean): Self = StObject.set(x, "noGlyph", value.asInstanceOf[js.Any])
      
      inline def setNoGlyphUndefined: Self = StObject.set(x, "noGlyph", js.undefined)
      
      inline def setOnCloseClicked(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onCloseClicked", js.Any.fromFunction1(value))
      
      inline def setOnCloseClickedUndefined: Self = StObject.set(x, "onCloseClicked", js.undefined)
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
