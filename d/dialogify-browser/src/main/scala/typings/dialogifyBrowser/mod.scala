package typings.dialogifyBrowser

import typings.dialogifyBrowser.Dialogify.AlertDialogOptions
import typings.dialogifyBrowser.Dialogify.BUTTON_CENTER
import typings.dialogifyBrowser.Dialogify.BUTTON_DANGER
import typings.dialogifyBrowser.Dialogify.BUTTON_LEFT
import typings.dialogifyBrowser.Dialogify.BUTTON_PRIMARY
import typings.dialogifyBrowser.Dialogify.ConfirmDialogOptions
import typings.dialogifyBrowser.Dialogify.DialogOptions
import typings.dialogifyBrowser.Dialogify.DialogifyConfig
import typings.dialogifyBrowser.Dialogify.LocalizableButtonActions
import typings.dialogifyBrowser.Dialogify.PromptDialogOptions
import typings.dialogifyBrowser.Dialogify.SIZE_LARGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dialogify-browser", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Dialogify {
    /**
      * @param source id selector | ajax target url | HTML string that to be used for dialog content.
      * @param dialogOptions Dialog options to be used to create a new Dialogify object.
      */
    def this(source: String) = this()
    def this(source: String, dialogOptions: DialogOptions) = this()
  }
  @JSImport("dialogify-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("dialogify-browser", "BUTTON_CENTER")
  @js.native
  def BUTTON_CENTER: typings.dialogifyBrowser.Dialogify.BUTTON_CENTER = js.native
  inline def BUTTON_CENTER_=(x: BUTTON_CENTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_CENTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dialogify-browser", "BUTTON_DANGER")
  @js.native
  def BUTTON_DANGER: typings.dialogifyBrowser.Dialogify.BUTTON_DANGER = js.native
  inline def BUTTON_DANGER_=(x: BUTTON_DANGER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_DANGER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dialogify-browser", "BUTTON_LEFT")
  @js.native
  def BUTTON_LEFT: typings.dialogifyBrowser.Dialogify.BUTTON_LEFT = js.native
  inline def BUTTON_LEFT_=(x: BUTTON_LEFT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_LEFT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dialogify-browser", "BUTTON_PRIMARY")
  @js.native
  def BUTTON_PRIMARY: typings.dialogifyBrowser.Dialogify.BUTTON_PRIMARY = js.native
  inline def BUTTON_PRIMARY_=(x: BUTTON_PRIMARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_PRIMARY")(x.asInstanceOf[js.Any])
  
  /* Inlined {[ key in dialogify-browser.Dialogify.locale ]: dialogify-browser.Dialogify.LocalizableButtonActions} */
  object LOCALE {
    
    @JSImport("dialogify-browser", "LOCALE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dialogify-browser", "LOCALE.en_US")
    @js.native
    def enUS: LocalizableButtonActions = js.native
    
    inline def enUS_=(x: LocalizableButtonActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("en_US")(x.asInstanceOf[js.Any])
    
    @JSImport("dialogify-browser", "LOCALE.zh_CN")
    @js.native
    def zhCN: LocalizableButtonActions = js.native
    
    inline def zhCN_=(x: LocalizableButtonActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh_CN")(x.asInstanceOf[js.Any])
    
    @JSImport("dialogify-browser", "LOCALE.zh_TW")
    @js.native
    def zhTW: LocalizableButtonActions = js.native
    
    inline def zhTW_=(x: LocalizableButtonActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zh_TW")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("dialogify-browser", "SIZE_LARGE")
  @js.native
  def SIZE_LARGE: typings.dialogifyBrowser.Dialogify.SIZE_LARGE = js.native
  inline def SIZE_LARGE_=(x: SIZE_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIZE_LARGE")(x.asInstanceOf[js.Any])
  
  /**
    * Display a dialog with a message, and to wait until the user dismisses the dialog.
    * @param message content to diaplay in dialog, can be html or text.
    * @param options options of a dialog.
    */
  /* static member */
  inline def alert(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def alert(message: String, options: AlertDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Close all active dialogs.
    */
  /* static member */
  inline def closeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[Unit]
  
  /**
    * Display a dialog with a message, and to wait until the user either confirms or cancels the dialog.
    * @param message content to diaplay in dialog, can be html or text.
    * @param options options of a dialog.
    */
  /* static member */
  inline def confirm(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def confirm(message: String, options: ConfirmDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Display a dialog with a message prompting the user to input some text, and to wait until the user either submits the text or cancels the dialog.
    * @param message content to diaplay in dialog, can be html or text.
    * @param options options of a dialog.
    */
  /* static member */
  inline def prompt(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def prompt(message: String, options: PromptDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    trait Window extends StObject {
      
      var dialogifyConfig: js.UndefOr[DialogifyConfig] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setDialogifyConfig(value: DialogifyConfig): Self = StObject.set(x, "dialogifyConfig", value.asInstanceOf[js.Any])
        
        inline def setDialogifyConfigUndefined: Self = StObject.set(x, "dialogifyConfig", js.undefined)
      }
    }
  }
}
