package typings.emberDashModalDashDialog

import typings.emberDashModalDashDialog.emberDashModalDashDialogStrings.parent
import typings.emberDashModalDashDialog.emberDashModalDashDialogStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-modal-dialog/components/modal-dialog", JSImport.Namespace)
@js.native
object componentsModalDashDialogMod extends js.Object {
  @js.native
  trait ModalDialog
    extends typings.atEmberComponent.atEmberComponentMod.default {
    /**
      * A boolean, when true makes modal animatable using liquid-fire
      * (requires liquid-wormhole to be installed, and for tethering situations
      * liquid-tether. Having these optional dependencies installed and NOT
      * explicitly specifying animatable is deprecated in 2.x and is equivalent
      * to animatable=false for backwards compatibility. As of 3.x, the implicit
      * default will be animatable=true when the optional
      * liquid-wormhole/liquid-tether dependency is present.
      */
    var animatable: Boolean = js.native
    /**
      * Indicates whether clicking outside a modal without an overlay should
      * close the modal. Useful if your modal isn't the focus of interaction, and
      * you want hover effects to still work outside the modal.
      */
    var clickOutsideToClose: Boolean = js.native
    /**
      * CSS class name(s) to append to container divs. Set this from template.
      */
    var containerClass: String = js.native
    /**
      * CSS class names to append to container divs. This is a concatenated
      * property, so it does not replace the default container class
      * (default: 'ember-modal-dialog'. If you subclass this component, you may
      * define this in your subclass.)
      */
    var containerClassNames: js.Array[String] = js.native
    /**
      * Toggles presence of overlay div in DOM
      */
    var hasOverlay: Boolean = js.native
    /**
      * CSS class name(s) to append to overlay divs. Set this from template.
      */
    var overlayClass: String = js.native
    /**
      * CSS class names to append to overlay divs. This is a concatenated
      * property, so it does not replace the default overlay class
      * (default: 'ember-modal-overlay'. If you subclass this component, you may
      * define this in your subclass.)
      */
    var overlayClassNames: js.Array[String] = js.native
    /**
      * either 'parent' or 'sibling', to control whether the overlay div is
      * rendered as a parent element of the container div or as a sibling to it
      * (default: 'parent')
      */
    var overlayPosition: parent | sibling = js.native
    /**
      * A boolean, when true renders the modal without wormholing or tethering,
      * useful for including a modal in a style guide
      */
    var renderInPlace: Boolean = js.native
    /**
      * Indicates translucence of overlay, toggles presence of translucent CSS
      * selector
      */
    var translucentOverlay: Boolean = js.native
    /**
      * CSS class name(s) to append to wrapper divs. Set this from template.
      */
    var wrapperClass: String = js.native
    /**
      * CSS class names to append to wrapper divs. This is a concatenated
      * property, so it does not replace the default container class
      * (default: 'ember-modal-wrapper'. If you subclass this component, you may
      * define this in your subclass.)
      */
    var wrapperClassNames: js.Array[String] = js.native
    /**
      * An action to be called when the overlay is clicked. If this action is
      * specified, clicking the overlay will invoke it instead of onClose.
      */
    def onClickOverlay(): Unit = js.native
    /**
      * The action handler for the dialog's onClose action. This action triggers
      * when the user clicks the modal overlay.
      */
    def onClose(): Unit = js.native
  }
  
  @js.native
  class default () extends ModalDialog
  
}

