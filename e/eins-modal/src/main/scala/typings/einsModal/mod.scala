package typings.einsModal

import org.scalablytyped.runtime.Shortcut
import typings.einsModal.einsModalStrings.hide
import typings.einsModal.einsModalStrings.show
import typings.einsModal.einsModalStrings.toggle
import typings.einsModal.mod.global.HTMLElement
import typings.einsModal.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("eins-modal", JSImport.Default)
  @js.native
  val default: EinsModal = js.native
  
  @js.native
  trait EinsModal extends StObject {
    
    /**
      * Add an event listener to a element and/or assign it to a modal.
      * @param triggerElementOrId
      * @param modalElementOrId
      * @param options
      */
    def addButton(triggerElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: Null, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: Null, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: Null, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    
    /**
      * Add ".modal()" function to a modal
      * @param modalElementOrId
      */
    def addModalFunction(modalElementOrId: String): Unit = js.native
    def addModalFunction(modalElementOrId: HTMLElement): Unit = js.native
    def addModalFunction(modalElementOrId: JQuery): Unit = js.native
    
    /**
      * Close a modal.
      * @param modalElementOrId
      * @param options
      */
    def close(): Unit = js.native
    def close(modalElementOrId: String): Unit = js.native
    def close(modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def close(modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def close(modalElementOrId: HTMLElement): Unit = js.native
    def close(modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def close(modalElementOrId: JQuery): Unit = js.native
    def close(modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    
    /**
      * Get a list of all open modal objects
      */
    def getOpenModals(): js.Array[Any | HTMLElement | JQuery] = js.native
    
    /**
      * Check if modal is open
      * @param modalElementOrId
      */
    def isOpen(modalElementOrId: String): Boolean = js.native
    def isOpen(modalElementOrId: HTMLElement): Boolean = js.native
    
    /**
      * Open a modal.
      * @param modalElementOrId
      * @param options
      */
    def open(modalElementOrId: String): Unit = js.native
    def open(modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def open(modalElementOrId: HTMLElement): Unit = js.native
    def open(modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def open(modalElementOrId: JQuery): Unit = js.native
    def open(modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    
    /**
      * Remove all event listeners from an element.
      * @param triggerElementOrId
      */
    def removeButton(triggerElementOrId: String): Unit = js.native
    def removeButton(triggerElementOrId: HTMLElement): Unit = js.native
    def removeButton(triggerElementOrId: JQuery): Unit = js.native
    
    /**
      * Override default options.
      * @param options
      */
    def setDefaultOptions(options: EinsModalOptions): Unit = js.native
  }
  
  trait EinsModalOptions extends StObject {
    
    /**
      * Close modal with click/ touch on backdrop
      * @default false
      */
    var backdropClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration it takes to close the modal in milliseconds
      * @default 200
      */
    var closeDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation when closing modal
      * @default 'expandOut'
      */
    var closeTransition: js.UndefOr[typings.einsModal.mod.closeTransition] = js.undefined
    
    /**
      * Enable/ Disable showing multiple modals on screen
      * @default true
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration it takes to open the modal in milliseconds
      * @default 400
      */
    var openDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation when opening modal
      * @default 'bounceIn'
      */
    var openTransition: js.UndefOr[typings.einsModal.mod.openTransition] = js.undefined
    
    /**
      * Wait for next action (open/close) before opening modal
      * @default true
      */
    @JSName("wait")
    var wait_FEinsModalOptions: js.UndefOr[Boolean] = js.undefined
  }
  object EinsModalOptions {
    
    inline def apply(): EinsModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EinsModalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EinsModalOptions] (val x: Self) extends AnyVal {
      
      inline def setBackdropClose(value: Boolean): Self = StObject.set(x, "backdropClose", value.asInstanceOf[js.Any])
      
      inline def setBackdropCloseUndefined: Self = StObject.set(x, "backdropClose", js.undefined)
      
      inline def setCloseDuration(value: Double): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
      
      inline def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
      
      inline def setCloseTransition(value: closeTransition): Self = StObject.set(x, "closeTransition", value.asInstanceOf[js.Any])
      
      inline def setCloseTransitionUndefined: Self = StObject.set(x, "closeTransition", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOpenDuration(value: Double): Self = StObject.set(x, "openDuration", value.asInstanceOf[js.Any])
      
      inline def setOpenDurationUndefined: Self = StObject.set(x, "openDuration", js.undefined)
      
      inline def setOpenTransition(value: openTransition): Self = StObject.set(x, "openTransition", value.asInstanceOf[js.Any])
      
      inline def setOpenTransitionUndefined: Self = StObject.set(x, "openTransition", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  type ModalFunction = js.Function2[/* action */ show | hide | toggle, /* options */ js.UndefOr[EinsModalOptions], Unit]
  
  type _To = EinsModal
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: EinsModal = default
  
  /* Rewritten from type alias, can be one of: 
    - typings.einsModal.einsModalStrings.fadeOut
    - typings.einsModal.einsModalStrings.flipXOut
    - typings.einsModal.einsModalStrings.flipYOut
    - typings.einsModal.einsModalStrings.flipBounceXOut
    - typings.einsModal.einsModalStrings.flipBounceYOut
    - typings.einsModal.einsModalStrings.swoopOut
    - typings.einsModal.einsModalStrings.whirlOut
    - typings.einsModal.einsModalStrings.shrinkOut
    - typings.einsModal.einsModalStrings.expandOut
    - typings.einsModal.einsModalStrings.bounceOut
    - typings.einsModal.einsModalStrings.bounceUpOut
    - typings.einsModal.einsModalStrings.bounceDownOut
    - typings.einsModal.einsModalStrings.bounceLeftOut
    - typings.einsModal.einsModalStrings.bounceRightOut
    - typings.einsModal.einsModalStrings.slideUpOut
    - typings.einsModal.einsModalStrings.slideDownOut
    - typings.einsModal.einsModalStrings.slideLeftOut
    - typings.einsModal.einsModalStrings.slideUpBigOut
    - typings.einsModal.einsModalStrings.slideDownBigOut
    - typings.einsModal.einsModalStrings.slideLeftBigOut
    - typings.einsModal.einsModalStrings.slideRightBigOut
    - typings.einsModal.einsModalStrings.perspectiveUpOut
    - typings.einsModal.einsModalStrings.perspectiveDownOut
    - typings.einsModal.einsModalStrings.perspectiveLeftOut
    - typings.einsModal.einsModalStrings.perspectiveRightOut
  */
  trait closeTransition extends StObject
  object closeTransition {
    
    inline def bounceDownOut: typings.einsModal.einsModalStrings.bounceDownOut = "bounceDownOut".asInstanceOf[typings.einsModal.einsModalStrings.bounceDownOut]
    
    inline def bounceLeftOut: typings.einsModal.einsModalStrings.bounceLeftOut = "bounceLeftOut".asInstanceOf[typings.einsModal.einsModalStrings.bounceLeftOut]
    
    inline def bounceOut: typings.einsModal.einsModalStrings.bounceOut = "bounceOut".asInstanceOf[typings.einsModal.einsModalStrings.bounceOut]
    
    inline def bounceRightOut: typings.einsModal.einsModalStrings.bounceRightOut = "bounceRightOut".asInstanceOf[typings.einsModal.einsModalStrings.bounceRightOut]
    
    inline def bounceUpOut: typings.einsModal.einsModalStrings.bounceUpOut = "bounceUpOut".asInstanceOf[typings.einsModal.einsModalStrings.bounceUpOut]
    
    inline def expandOut: typings.einsModal.einsModalStrings.expandOut = "expandOut".asInstanceOf[typings.einsModal.einsModalStrings.expandOut]
    
    inline def fadeOut: typings.einsModal.einsModalStrings.fadeOut = "fadeOut".asInstanceOf[typings.einsModal.einsModalStrings.fadeOut]
    
    inline def flipBounceXOut: typings.einsModal.einsModalStrings.flipBounceXOut = "flipBounceXOut".asInstanceOf[typings.einsModal.einsModalStrings.flipBounceXOut]
    
    inline def flipBounceYOut: typings.einsModal.einsModalStrings.flipBounceYOut = "flipBounceYOut".asInstanceOf[typings.einsModal.einsModalStrings.flipBounceYOut]
    
    inline def flipXOut: typings.einsModal.einsModalStrings.flipXOut = "flipXOut".asInstanceOf[typings.einsModal.einsModalStrings.flipXOut]
    
    inline def flipYOut: typings.einsModal.einsModalStrings.flipYOut = "flipYOut".asInstanceOf[typings.einsModal.einsModalStrings.flipYOut]
    
    inline def perspectiveDownOut: typings.einsModal.einsModalStrings.perspectiveDownOut = "perspectiveDownOut".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveDownOut]
    
    inline def perspectiveLeftOut: typings.einsModal.einsModalStrings.perspectiveLeftOut = "perspectiveLeftOut".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveLeftOut]
    
    inline def perspectiveRightOut: typings.einsModal.einsModalStrings.perspectiveRightOut = "perspectiveRightOut".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveRightOut]
    
    inline def perspectiveUpOut: typings.einsModal.einsModalStrings.perspectiveUpOut = "perspectiveUpOut".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveUpOut]
    
    inline def shrinkOut: typings.einsModal.einsModalStrings.shrinkOut = "shrinkOut".asInstanceOf[typings.einsModal.einsModalStrings.shrinkOut]
    
    inline def slideDownBigOut: typings.einsModal.einsModalStrings.slideDownBigOut = "slideDownBigOut".asInstanceOf[typings.einsModal.einsModalStrings.slideDownBigOut]
    
    inline def slideDownOut: typings.einsModal.einsModalStrings.slideDownOut = "slideDownOut".asInstanceOf[typings.einsModal.einsModalStrings.slideDownOut]
    
    inline def slideLeftBigOut: typings.einsModal.einsModalStrings.slideLeftBigOut = "slideLeftBigOut".asInstanceOf[typings.einsModal.einsModalStrings.slideLeftBigOut]
    
    inline def slideLeftOut: typings.einsModal.einsModalStrings.slideLeftOut = "slideLeftOut".asInstanceOf[typings.einsModal.einsModalStrings.slideLeftOut]
    
    inline def slideRightBigOut: typings.einsModal.einsModalStrings.slideRightBigOut = "slideRightBigOut".asInstanceOf[typings.einsModal.einsModalStrings.slideRightBigOut]
    
    inline def slideUpBigOut: typings.einsModal.einsModalStrings.slideUpBigOut = "slideUpBigOut".asInstanceOf[typings.einsModal.einsModalStrings.slideUpBigOut]
    
    inline def slideUpOut: typings.einsModal.einsModalStrings.slideUpOut = "slideUpOut".asInstanceOf[typings.einsModal.einsModalStrings.slideUpOut]
    
    inline def swoopOut: typings.einsModal.einsModalStrings.swoopOut = "swoopOut".asInstanceOf[typings.einsModal.einsModalStrings.swoopOut]
    
    inline def whirlOut: typings.einsModal.einsModalStrings.whirlOut = "whirlOut".asInstanceOf[typings.einsModal.einsModalStrings.whirlOut]
  }
  
  object global {
    
    trait HTMLElement extends StObject {
      
      var modal: js.UndefOr[ModalFunction] = js.undefined
    }
    object HTMLElement {
      
      inline def apply(): HTMLElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLElement]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
        
        inline def setModal(value: (/* action */ show | hide | toggle, /* options */ js.UndefOr[EinsModalOptions]) => Unit): Self = StObject.set(x, "modal", js.Any.fromFunction2(value))
        
        inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      }
    }
    
    trait JQuery extends StObject {
      
      var modal: js.UndefOr[ModalFunction] = js.undefined
    }
    object JQuery {
      
      inline def apply(): JQuery = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        inline def setModal(value: (/* action */ show | hide | toggle, /* options */ js.UndefOr[EinsModalOptions]) => Unit): Self = StObject.set(x, "modal", js.Any.fromFunction2(value))
        
        inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      }
    }
    
    trait Window extends StObject {
      
      var einsModal: EinsModal
    }
    object Window {
      
      inline def apply(einsModal: EinsModal): Window = {
        val __obj = js.Dynamic.literal(einsModal = einsModal.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setEinsModal(value: EinsModal): Self = StObject.set(x, "einsModal", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.einsModal.einsModalStrings.fadeIn
    - typings.einsModal.einsModalStrings.flipXIn
    - typings.einsModal.einsModalStrings.flipYIn
    - typings.einsModal.einsModalStrings.flipBounceXIn
    - typings.einsModal.einsModalStrings.flipBounceYIn
    - typings.einsModal.einsModalStrings.swoopIn
    - typings.einsModal.einsModalStrings.whirlIn
    - typings.einsModal.einsModalStrings.shrinkIn
    - typings.einsModal.einsModalStrings.expandIn
    - typings.einsModal.einsModalStrings.bounceIn
    - typings.einsModal.einsModalStrings.bounceUpIn
    - typings.einsModal.einsModalStrings.bounceDownIn
    - typings.einsModal.einsModalStrings.bounceLeftIn
    - typings.einsModal.einsModalStrings.bounceRightIn
    - typings.einsModal.einsModalStrings.slideUpIn
    - typings.einsModal.einsModalStrings.slideDownIn
    - typings.einsModal.einsModalStrings.slideLeftIn
    - typings.einsModal.einsModalStrings.slideUpBigIn
    - typings.einsModal.einsModalStrings.slideDownBigIn
    - typings.einsModal.einsModalStrings.slideLeftBigIn
    - typings.einsModal.einsModalStrings.slideRightBigIn
    - typings.einsModal.einsModalStrings.perspectiveUpIn
    - typings.einsModal.einsModalStrings.perspectiveDownIn
    - typings.einsModal.einsModalStrings.perspectiveLeftIn
    - typings.einsModal.einsModalStrings.perspectiveRightIn
  */
  trait openTransition extends StObject
  object openTransition {
    
    inline def bounceDownIn: typings.einsModal.einsModalStrings.bounceDownIn = "bounceDownIn".asInstanceOf[typings.einsModal.einsModalStrings.bounceDownIn]
    
    inline def bounceIn: typings.einsModal.einsModalStrings.bounceIn = "bounceIn".asInstanceOf[typings.einsModal.einsModalStrings.bounceIn]
    
    inline def bounceLeftIn: typings.einsModal.einsModalStrings.bounceLeftIn = "bounceLeftIn".asInstanceOf[typings.einsModal.einsModalStrings.bounceLeftIn]
    
    inline def bounceRightIn: typings.einsModal.einsModalStrings.bounceRightIn = "bounceRightIn".asInstanceOf[typings.einsModal.einsModalStrings.bounceRightIn]
    
    inline def bounceUpIn: typings.einsModal.einsModalStrings.bounceUpIn = "bounceUpIn".asInstanceOf[typings.einsModal.einsModalStrings.bounceUpIn]
    
    inline def expandIn: typings.einsModal.einsModalStrings.expandIn = "expandIn".asInstanceOf[typings.einsModal.einsModalStrings.expandIn]
    
    inline def fadeIn: typings.einsModal.einsModalStrings.fadeIn = "fadeIn".asInstanceOf[typings.einsModal.einsModalStrings.fadeIn]
    
    inline def flipBounceXIn: typings.einsModal.einsModalStrings.flipBounceXIn = "flipBounceXIn".asInstanceOf[typings.einsModal.einsModalStrings.flipBounceXIn]
    
    inline def flipBounceYIn: typings.einsModal.einsModalStrings.flipBounceYIn = "flipBounceYIn".asInstanceOf[typings.einsModal.einsModalStrings.flipBounceYIn]
    
    inline def flipXIn: typings.einsModal.einsModalStrings.flipXIn = "flipXIn".asInstanceOf[typings.einsModal.einsModalStrings.flipXIn]
    
    inline def flipYIn: typings.einsModal.einsModalStrings.flipYIn = "flipYIn".asInstanceOf[typings.einsModal.einsModalStrings.flipYIn]
    
    inline def perspectiveDownIn: typings.einsModal.einsModalStrings.perspectiveDownIn = "perspectiveDownIn".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveDownIn]
    
    inline def perspectiveLeftIn: typings.einsModal.einsModalStrings.perspectiveLeftIn = "perspectiveLeftIn".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveLeftIn]
    
    inline def perspectiveRightIn: typings.einsModal.einsModalStrings.perspectiveRightIn = "perspectiveRightIn".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveRightIn]
    
    inline def perspectiveUpIn: typings.einsModal.einsModalStrings.perspectiveUpIn = "perspectiveUpIn".asInstanceOf[typings.einsModal.einsModalStrings.perspectiveUpIn]
    
    inline def shrinkIn: typings.einsModal.einsModalStrings.shrinkIn = "shrinkIn".asInstanceOf[typings.einsModal.einsModalStrings.shrinkIn]
    
    inline def slideDownBigIn: typings.einsModal.einsModalStrings.slideDownBigIn = "slideDownBigIn".asInstanceOf[typings.einsModal.einsModalStrings.slideDownBigIn]
    
    inline def slideDownIn: typings.einsModal.einsModalStrings.slideDownIn = "slideDownIn".asInstanceOf[typings.einsModal.einsModalStrings.slideDownIn]
    
    inline def slideLeftBigIn: typings.einsModal.einsModalStrings.slideLeftBigIn = "slideLeftBigIn".asInstanceOf[typings.einsModal.einsModalStrings.slideLeftBigIn]
    
    inline def slideLeftIn: typings.einsModal.einsModalStrings.slideLeftIn = "slideLeftIn".asInstanceOf[typings.einsModal.einsModalStrings.slideLeftIn]
    
    inline def slideRightBigIn: typings.einsModal.einsModalStrings.slideRightBigIn = "slideRightBigIn".asInstanceOf[typings.einsModal.einsModalStrings.slideRightBigIn]
    
    inline def slideUpBigIn: typings.einsModal.einsModalStrings.slideUpBigIn = "slideUpBigIn".asInstanceOf[typings.einsModal.einsModalStrings.slideUpBigIn]
    
    inline def slideUpIn: typings.einsModal.einsModalStrings.slideUpIn = "slideUpIn".asInstanceOf[typings.einsModal.einsModalStrings.slideUpIn]
    
    inline def swoopIn: typings.einsModal.einsModalStrings.swoopIn = "swoopIn".asInstanceOf[typings.einsModal.einsModalStrings.swoopIn]
    
    inline def whirlIn: typings.einsModal.einsModalStrings.whirlIn = "whirlIn".asInstanceOf[typings.einsModal.einsModalStrings.whirlIn]
  }
}
