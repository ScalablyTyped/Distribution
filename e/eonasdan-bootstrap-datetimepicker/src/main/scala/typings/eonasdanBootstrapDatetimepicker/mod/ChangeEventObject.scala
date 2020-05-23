package typings.eonasdanBootstrapDatetimepicker.mod

import typings.jquery.JQueryMouseEventObject
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.jquery.BaseJQueryEventObject because Already inherited
- typings.jquery.JQueryInputEventObject because Already inherited
- typings.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
trait ChangeEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: String = js.native
  /** @deprecated */
  var charCode: Double = js.native
  /**
    * Date the picker changed to. Type: moment object (clone)
    */
  var date: Moment = js.native
  var key: String = js.native
  /** @deprecated */
  var keyCode: Double = js.native
  /**
    * Previous date. Type: moment object (clone) or false in the event of a null
    */
  var oldDate: Moment | Boolean = js.native
}

