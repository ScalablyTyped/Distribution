package typings.durandal

import typings.durandal.compositionMod.CompositionContext
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The dialog module enables the display of message boxes, custom modal dialogs and other overlays or slide-out UI abstractions. Dialogs are constructed by the composition system which interacts with a user defined dialog context. The dialog module enforced the activator lifecycle.
  * @requires system
  * @requires app
  * @requires composition
  * @requires activator
  * @requires viewEngine
  * @requires jquery
  * @requires knockout
  */
object dialogMod {
  
  @JSImport("plugins/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plugins/dialog", "MessageBox")
  @js.native
  def MessageBox: Box = js.native
  inline def MessageBox_=(x: Box): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageBox")(x.asInstanceOf[js.Any])
  
  inline def addContext(name: String, modalContext: DialogContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContext")(name.asInstanceOf[js.Any], modalContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def close(obj: js.Any, results: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(obj.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("plugins/dialog", "currentZIndex")
  @js.native
  def currentZIndex: Double = js.native
  inline def currentZIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentZIndex")(x.asInstanceOf[js.Any])
  
  inline def getContext(): DialogContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[DialogContext]
  inline def getContext(name: String): DialogContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(name.asInstanceOf[js.Any]).asInstanceOf[DialogContext]
  
  inline def getDialog(obj: js.Any): Dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialog")(obj.asInstanceOf[js.Any]).asInstanceOf[Dialog]
  
  inline def getNextZIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextZIndex")().asInstanceOf[Double]
  
  inline def install(config: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isOpen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[Boolean]
  
  inline def show(obj: js.Any): DurandalPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[js.Any]]
  inline def show(obj: js.Any, activationData: js.Any): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any], activationData.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  inline def show(obj: js.Any, activationData: js.Any, context: String): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any], activationData.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  inline def show(obj: js.Any, activationData: Unit, context: String): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any], activationData.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  
  inline def showMessage(message: String): DurandalPromise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Unit,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: Unit, autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: Unit, autoclose: Boolean, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: Unit, autoclose: Unit, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: js.Array[DialogButton | String]): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: Unit,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: Unit,
    options: js.Array[DialogButton | String],
    autoclose: Unit,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: Unit, autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: Unit, autoclose: Boolean, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: Unit, autoclose: Unit, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  
  /**
    * Models a message box's message, title and options.
    * @class
    */
  trait Box extends StObject {
    
    /**
      * Provides the view to the composition system.
      * @returns {DOMElement} The view of the message box.
      */
    def getView(): HTMLElement
    
    /**
      * Selects an option and closes the message box, returning the selected option through the dialog system's promise.
      * @param {string} dialogResult The result to select.
      */
    def selectOption(dialogResult: String): Unit
  }
  object Box {
    
    inline def apply(getView: () => HTMLElement, selectOption: String => Unit): Box = {
      val __obj = js.Dynamic.literal(getView = js.Any.fromFunction0(getView), selectOption = js.Any.fromFunction1(selectOption))
      __obj.asInstanceOf[Box]
    }
    
    extension [Self <: Box](x: Self) {
      
      inline def setGetView(value: () => HTMLElement): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
      
      inline def setSelectOption(value: String => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
    }
  }
  
  trait Dialog extends StObject {
    
    var activator: DurandalActivator[js.Any]
    
    def close(): DurandalPromise[js.Any]
    
    var context: DialogContext
    
    var host: HTMLElement
    
    var owner: js.Any
    
    var settings: CompositionContext
  }
  object Dialog {
    
    inline def apply(
      activator: DurandalActivator[js.Any],
      close: () => DurandalPromise[js.Any],
      context: DialogContext,
      host: HTMLElement,
      owner: js.Any,
      settings: CompositionContext
    ): Dialog = {
      val __obj = js.Dynamic.literal(activator = activator.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), context = context.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialog]
    }
    
    extension [Self <: Dialog](x: Self) {
      
      inline def setActivator(value: DurandalActivator[js.Any]): Self = StObject.set(x, "activator", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => DurandalPromise[js.Any]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setContext(value: DialogContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: CompositionContext): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogContext extends StObject {
    
    /**
      * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
      * @param {Dialog} theDialog The dialog model.
      */
    def addHost(theDialog: Dialog): Unit
    
    /**
      * Opacity of the blockout. The default is 0.6.
      */
    var blockoutOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
      * @param {DOMElement} child The dialog view.
      * @param {DOMElement} parent The parent view.
      * @param {object} context The composition context.
      */
    def compositionComplete(child: HTMLElement, parent: HTMLElement, context: CompositionContext): Unit
    
    /**
      * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
      * @param {Dialog} theDialog The dialog model.
      */
    def removeHost(theDialog: Dialog): Unit
  }
  object DialogContext {
    
    inline def apply(
      addHost: Dialog => Unit,
      compositionComplete: (HTMLElement, HTMLElement, CompositionContext) => Unit,
      removeHost: Dialog => Unit
    ): DialogContext = {
      val __obj = js.Dynamic.literal(addHost = js.Any.fromFunction1(addHost), compositionComplete = js.Any.fromFunction3(compositionComplete), removeHost = js.Any.fromFunction1(removeHost))
      __obj.asInstanceOf[DialogContext]
    }
    
    extension [Self <: DialogContext](x: Self) {
      
      inline def setAddHost(value: Dialog => Unit): Self = StObject.set(x, "addHost", js.Any.fromFunction1(value))
      
      inline def setBlockoutOpacity(value: Double): Self = StObject.set(x, "blockoutOpacity", value.asInstanceOf[js.Any])
      
      inline def setBlockoutOpacityUndefined: Self = StObject.set(x, "blockoutOpacity", js.undefined)
      
      inline def setCompositionComplete(value: (HTMLElement, HTMLElement, CompositionContext) => Unit): Self = StObject.set(x, "compositionComplete", js.Any.fromFunction3(value))
      
      inline def setRemoveHost(value: Dialog => Unit): Self = StObject.set(x, "removeHost", js.Any.fromFunction1(value))
    }
  }
}
