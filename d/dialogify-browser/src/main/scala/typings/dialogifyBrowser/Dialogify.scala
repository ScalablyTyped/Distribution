package typings.dialogifyBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.dialogifyBrowser.Dialogify.Button
import typings.dialogifyBrowser.Dialogify.ButtonImpl
import typings.dialogifyBrowser.Dialogify.ButtonOption
import typings.dialogifyBrowser.Dialogify.DialogifyEvent
import typings.dialogifyBrowser.dialogifyBrowserStrings.`btn-danger`
import typings.dialogifyBrowser.dialogifyBrowserStrings.`btn-primary`
import typings.dialogifyBrowser.dialogifyBrowserStrings.`text-center`
import typings.dialogifyBrowser.dialogifyBrowserStrings.`text-left`
import typings.dialogifyBrowser.dialogifyBrowserStrings.click
import typings.dialogifyBrowser.dialogifyBrowserStrings.dialogify__autowidth
import typings.jquery.JQuery
import typings.jquery.JQuery.TypeEventHandler
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialogify extends StObject {
  
  /** An object contain buttons, will use button order index as key or if `id` of button is set, will use `id` as key. */
  @JSName("$buttonList")
  var $buttonList: Record[String | Double, ButtonImpl] = js.native
  
  /** JQuery object referance to the dialog element. */
  @JSName("$content")
  var $content: JQuery[HTMLElement] = js.native
  
  /**
    * Set dialog buttons.
    * @param buttons Array of button object or html string, will auto set `id` as key in `$buttonList` if there is `id` property in html string.
    * @param options Button options.
    * @returns Dialogify instance for chaining.
    */
  def buttons(buttons: js.Array[Button | String]): Dialogify = js.native
  def buttons(buttons: js.Array[Button | String], options: ButtonOption): Dialogify = js.native
  
  /**
    * Close opened dialog.
    */
  def close(): Unit = js.native
  
  /**
    * Get dialog is opened or not.
    * @returns Is dialog opened or not.
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Set event listener.
    * @param event Event name.
    * @param callback Callback function.
    * @returns Dialogify instance for chaining.
    */
  def on[TType /* <: DialogifyEvent */](event: TType, callback: TypeEventHandler[Dialogify, Unit, Dialogify, Dialogify, TType]): Dialogify = js.native
  
  /**
    * Shows a dialog directly.
    */
  def show(): Unit = js.native
  
  /**
    * Shows a dialog modal, which has a background and disable interaction outside dialog.
    */
  def showModal(): Unit = js.native
  
  /**
    * Set dialog title.
    * @param title Dialog title.
    * @returns Dialogify instance for chaining.
    */
  def title(title: String): Dialogify = js.native
}
object Dialogify {
  
  trait AlertDialogOptions
    extends StObject
       with SimpleDialogOptions {
    
    /**
      * Callback function when dialog closed
      * @param this Dialogify instance.
      */
    var close: js.UndefOr[js.ThisFunction0[/* this */ Dialogify, Unit]] = js.undefined
  }
  object AlertDialogOptions {
    
    inline def apply(): AlertDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertDialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertDialogOptions] (val x: Self) extends AnyVal {
      
      inline def setClose(value: js.ThisFunction0[/* this */ Dialogify, Unit]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    }
  }
  
  type BUTTON_CENTER = `text-center`
  
  type BUTTON_DANGER = `btn-danger`
  
  type BUTTON_LEFT = `text-left`
  
  type BUTTON_PRIMARY = `btn-primary`
  
  trait Button extends StObject {
    
    /**
      * Callback function when button clicked
      * @param this Dialogify instance.
      * @param event Mouse click event
      */
    var click: js.UndefOr[
        TypeEventHandler[
          Dialogify, 
          Null, 
          Dialogify, 
          Dialogify, 
          typings.dialogifyBrowser.dialogifyBrowserStrings.click
        ]
      ] = js.undefined
    
    /** Set button as disabled or not, `false` by default. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Set `autofocus` property or not, `false` by default. */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** Set button id, if set, will also be key in `$buttonList`. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Button text content, "關閉" by default. */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Button style, will auto close dialog if set to `BUTTON_PRIMARY`.
      * Can be `Dialogify.BUTTON_PRIMARY`, `Dialogify.BUTTON_DANGER` or a class name.
      */
    var `type`: js.UndefOr[BUTTON_PRIMARY | BUTTON_DANGER | String] = js.undefined
  }
  object Button {
    
    inline def apply(): Button = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      inline def setClick(value: TypeEventHandler[Dialogify, Null, Dialogify, Dialogify, click]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: BUTTON_PRIMARY | BUTTON_DANGER | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ButtonImpl
    extends StObject
       with Button {
    
    /** Disable the button. */
    def disable(): Unit
    
    /** Enable the button. */
    def enable(): Unit
  }
  object ButtonImpl {
    
    inline def apply(disable: () => Unit, enable: () => Unit): ButtonImpl = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[ButtonImpl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonImpl] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
  
  trait ButtonOption extends StObject {
    
    /**
      * Button position style, right aligned by default.
      * Can be `Dialogify.BUTTON_CENTER`, `Dialogify.BUTTON_LEFT` or a class name.
      */
    var position: BUTTON_CENTER | BUTTON_LEFT | String
  }
  object ButtonOption {
    
    inline def apply(position: BUTTON_CENTER | BUTTON_LEFT | String): ButtonOption = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonOption] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: BUTTON_CENTER | BUTTON_LEFT | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ButtonStyle extends StObject {
    
    /** CSS class name to be used by button. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Image src to display as an icon. */
    var image: js.UndefOr[String] = js.undefined
    
    /** CSS styles in key-value pair object to be used by button. */
    var style: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object ButtonStyle {
    
    inline def apply(): ButtonStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonStyle] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ConfirmDialogOptions
    extends StObject
       with SimpleDialogOptions {
    
    /**
      * Callback function when dialog dismissed
      * @param this Dialogify instance.
      */
    var cancel: js.UndefOr[js.ThisFunction0[/* this */ Dialogify, Unit]] = js.undefined
    
    /**
      * Callback function when dialog confirmed
      * @param this Dialogify instance.
      */
    var ok: js.UndefOr[js.ThisFunction0[/* this */ Dialogify, Unit]] = js.undefined
  }
  object ConfirmDialogOptions {
    
    inline def apply(): ConfirmDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmDialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogOptions] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: js.ThisFunction0[/* this */ Dialogify, Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setOk(value: js.ThisFunction0[/* this */ Dialogify, Unit]): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    }
  }
  
  trait DialogOptions extends StObject {
    
    /**
      * Callback function when ajax done
      * @param this Dialogify instance.
      */
    var ajaxComplete: js.UndefOr[js.ThisFunction0[/* this */ Dialogify, Unit]] = js.undefined
    
    /** Query string or object to pass to ajax target. */
    var ajaxData: js.UndefOr[String | js.Object] = js.undefined
    
    /** A string to test source string is ajax or not. `/ajax/` by default, will match if source string includes `/ajax/`. */
    var ajaxPrefix: js.UndefOr[String] = js.undefined
    
    /** `true` by default. If `false`, will not show a close icon in right-top of dialog, and cannot close modal by click background or press esc button. */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /** Top=right close button style. */
    var closeButton: js.UndefOr[ButtonStyle] = js.undefined
    
    /** Custom dialog styles. */
    var dialog: js.UndefOr[DialogStyle] = js.undefined
    
    /** `true` by default. If `false`, will be able to scroll with page. */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** CSS class name to be used by dialog, or `Dialogify.SIZE_LARGE` to use style provided by Dialogify. */
    var size: js.UndefOr[SIZE_LARGE | String] = js.undefined
    
    /** `true` by default. If `false`, will not include a `<form method="dialog"></form>` form in dialog, and need to close dialog in `BUTTON_PRIMARY`. */
    var useDialogForm: js.UndefOr[Boolean] = js.undefined
  }
  object DialogOptions {
    
    inline def apply(): DialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
      
      inline def setAjaxComplete(value: js.ThisFunction0[/* this */ Dialogify, Unit]): Self = StObject.set(x, "ajaxComplete", value.asInstanceOf[js.Any])
      
      inline def setAjaxCompleteUndefined: Self = StObject.set(x, "ajaxComplete", js.undefined)
      
      inline def setAjaxData(value: String | js.Object): Self = StObject.set(x, "ajaxData", value.asInstanceOf[js.Any])
      
      inline def setAjaxDataUndefined: Self = StObject.set(x, "ajaxData", js.undefined)
      
      inline def setAjaxPrefix(value: String): Self = StObject.set(x, "ajaxPrefix", value.asInstanceOf[js.Any])
      
      inline def setAjaxPrefixUndefined: Self = StObject.set(x, "ajaxPrefix", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseButton(value: ButtonStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setDialog(value: DialogStyle): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setSize(value: SIZE_LARGE | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUseDialogForm(value: Boolean): Self = StObject.set(x, "useDialogForm", value.asInstanceOf[js.Any])
      
      inline def setUseDialogFormUndefined: Self = StObject.set(x, "useDialogForm", js.undefined)
    }
  }
  
  trait DialogStyle extends StObject {
    
    /** CSS class name to be used by dialog. */
    var className: js.UndefOr[String] = js.undefined
    
    /** CSS class name to be used by dialog content. */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /** CSS styles in key-value pair object to be used by dialog content. */
    var contentStyle: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** CSS styles in key-value pair object to be used by dialog. */
    var style: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object DialogStyle {
    
    inline def apply(): DialogStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogStyle] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: StringDictionary[String]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DialogifyConfig extends StObject {
    
    /** Top=right close button style. */
    var closeButton: js.UndefOr[ButtonStyle] = js.undefined
    
    /** Custom dialog styles. */
    var dialog: js.UndefOr[DialogStyle] = js.undefined
    
    /** Locale for default button text, `zh_TW` by default. */
    var locale: typings.dialogifyBrowser.Dialogify.locale
  }
  object DialogifyConfig {
    
    inline def apply(locale: locale): DialogifyConfig = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogifyConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogifyConfig] (val x: Self) extends AnyVal {
      
      inline def setCloseButton(value: ButtonStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setDialog(value: DialogStyle): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dialogifyBrowser.dialogifyBrowserStrings.show
    - typings.dialogifyBrowser.dialogifyBrowserStrings.close
    - typings.dialogifyBrowser.dialogifyBrowserStrings.cancel
  */
  trait DialogifyEvent extends StObject
  object DialogifyEvent {
    
    inline def cancel: typings.dialogifyBrowser.dialogifyBrowserStrings.cancel = "cancel".asInstanceOf[typings.dialogifyBrowser.dialogifyBrowserStrings.cancel]
    
    inline def close: typings.dialogifyBrowser.dialogifyBrowserStrings.close = "close".asInstanceOf[typings.dialogifyBrowser.dialogifyBrowserStrings.close]
    
    inline def show: typings.dialogifyBrowser.dialogifyBrowserStrings.show = "show".asInstanceOf[typings.dialogifyBrowser.dialogifyBrowserStrings.show]
  }
  
  trait LocalizableButtonActions extends StObject {
    
    var cancel: String
    
    var close: String
    
    var ok: String
  }
  object LocalizableButtonActions {
    
    inline def apply(cancel: String, close: String, ok: String): LocalizableButtonActions = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizableButtonActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizableButtonActions] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptDialogOptions
    extends StObject
       with SimpleDialogOptions {
    
    /**
      * Callback function when dialog dismissed
      * @param this Dialogify instance.
      */
    var cancel: js.UndefOr[js.ThisFunction0[/* this */ Dialogify, Unit]] = js.undefined
    
    /**
      * Callback function when dialog confirmed.
      * @param this Dialogify instance.
      * @param value User inputed value.
      */
    var ok: js.UndefOr[js.ThisFunction1[/* this */ Dialogify, /* value */ String, Unit]] = js.undefined
    
    /** Placeholder in text input. */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object PromptDialogOptions {
    
    inline def apply(): PromptDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptDialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptDialogOptions] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: js.ThisFunction0[/* this */ Dialogify, Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setOk(value: js.ThisFunction1[/* this */ Dialogify, /* value */ String, Unit]): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  type SIZE_LARGE = dialogify__autowidth
  
  trait SimpleDialogOptions extends StObject {
    
    /** Dialog options to be used to create a new Dialogify object. */
    var dialogOptions: js.UndefOr[DialogOptions] = js.undefined
  }
  object SimpleDialogOptions {
    
    inline def apply(): SimpleDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleDialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleDialogOptions] (val x: Self) extends AnyVal {
      
      inline def setDialogOptions(value: DialogOptions): Self = StObject.set(x, "dialogOptions", value.asInstanceOf[js.Any])
      
      inline def setDialogOptionsUndefined: Self = StObject.set(x, "dialogOptions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dialogifyBrowser.dialogifyBrowserStrings.zh_TW
    - typings.dialogifyBrowser.dialogifyBrowserStrings.zh_CN
    - typings.dialogifyBrowser.dialogifyBrowserStrings.en_US
  */
  trait locale extends StObject
  object locale {
    
    inline def en_US: typings.dialogifyBrowser.dialogifyBrowserStrings.en_US = "en_US".asInstanceOf[typings.dialogifyBrowser.dialogifyBrowserStrings.en_US]
    
    inline def zh_CN: typings.dialogifyBrowser.dialogifyBrowserStrings.zh_CN = "zh_CN".asInstanceOf[typings.dialogifyBrowser.dialogifyBrowserStrings.zh_CN]
    
    inline def zh_TW: typings.dialogifyBrowser.dialogifyBrowserStrings.zh_TW = "zh_TW".asInstanceOf[typings.dialogifyBrowser.dialogifyBrowserStrings.zh_TW]
  }
}
