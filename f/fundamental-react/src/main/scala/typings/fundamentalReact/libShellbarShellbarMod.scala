package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Glyph
import typings.fundamentalReact.anon.Image
import typings.fundamentalReact.anon.Label
import typings.fundamentalReact.anon.Link
import typings.fundamentalReact.anon.NotificationsButton
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShellbarShellbarMod {
  
  @JSImport("fundamental-react/lib/Shellbar/Shellbar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ShellbarProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/Shellbar/Shellbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/Shellbar/Shellbar", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.Shellbar = js.native
    inline def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.Shellbar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Shellbar = Component[ShellbarProps, js.Object, Any]
  
  trait ShellbarProps
    extends StObject
       with HTMLAttributes[Element] {
    
    var actions: js.UndefOr[js.Array[Glyph]] = js.undefined
    
    var backAction: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var copilot: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var localizedText: js.UndefOr[NotificationsButton] = js.undefined
    
    var logo: js.UndefOr[ReactNode] = js.undefined
    
    var logoSAP: js.UndefOr[Boolean] = js.undefined
    
    var notifications: js.UndefOr[Label] = js.undefined
    
    var productMenu: js.UndefOr[js.Array[Link]] = js.undefined
    
    var productSwitch: js.UndefOr[js.Object] = js.undefined
    
    var productSwitchList: js.UndefOr[js.Array[Image]] = js.undefined
    
    var productTitle: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var profileMenu: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
    
    var searchInput: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
  }
  object ShellbarProps {
    
    inline def apply(): ShellbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellbarProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[Glyph]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Glyph*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBackAction(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "backAction", js.Any.fromFunction1(value))
      
      inline def setBackActionUndefined: Self = StObject.set(x, "backAction", js.undefined)
      
      inline def setCopilot(value: Boolean): Self = StObject.set(x, "copilot", value.asInstanceOf[js.Any])
      
      inline def setCopilotUndefined: Self = StObject.set(x, "copilot", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setLocalizedText(value: NotificationsButton): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setLogo(value: ReactNode): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoSAP(value: Boolean): Self = StObject.set(x, "logoSAP", value.asInstanceOf[js.Any])
      
      inline def setLogoSAPUndefined: Self = StObject.set(x, "logoSAP", js.undefined)
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setNotifications(value: Label): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setProductMenu(value: js.Array[Link]): Self = StObject.set(x, "productMenu", value.asInstanceOf[js.Any])
      
      inline def setProductMenuUndefined: Self = StObject.set(x, "productMenu", js.undefined)
      
      inline def setProductMenuVarargs(value: Link*): Self = StObject.set(x, "productMenu", js.Array(value*))
      
      inline def setProductSwitch(value: js.Object): Self = StObject.set(x, "productSwitch", value.asInstanceOf[js.Any])
      
      inline def setProductSwitchList(value: js.Array[Image]): Self = StObject.set(x, "productSwitchList", value.asInstanceOf[js.Any])
      
      inline def setProductSwitchListUndefined: Self = StObject.set(x, "productSwitchList", js.undefined)
      
      inline def setProductSwitchListVarargs(value: Image*): Self = StObject.set(x, "productSwitchList", js.Array(value*))
      
      inline def setProductSwitchUndefined: Self = StObject.set(x, "productSwitch", js.undefined)
      
      inline def setProductTitle(value: String): Self = StObject.set(x, "productTitle", value.asInstanceOf[js.Any])
      
      inline def setProductTitleUndefined: Self = StObject.set(x, "productTitle", js.undefined)
      
      inline def setProfile(value: StringDictionary[Any]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileMenu(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "profileMenu", value.asInstanceOf[js.Any])
      
      inline def setProfileMenuUndefined: Self = StObject.set(x, "profileMenu", js.undefined)
      
      inline def setProfileMenuVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "profileMenu", js.Array(value*))
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSearchInput(value: StringDictionary[Any]): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
      
      inline def setSearchInputUndefined: Self = StObject.set(x, "searchInput", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    }
  }
}
