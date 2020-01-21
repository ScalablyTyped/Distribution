package typings.dojo.dojox.form.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_DisplayMixin.html
  *
  * Form manager's mixin for controlling show/hide state of
  * controlled elements (defined by dojoAttachPoint attributes).
  * This mixin provides unified show/hide functionality for
  * controlled elements (indicated by dojoAttachPoint attribute).
  * Essentially it provides a way to change "style.display"
  * parameter of controlled nodes.
  * It should be used together with dojox.form.manager.Mixin.
  *
  */
@JSGlobal("dojox.form.manager._DisplayMixin")
@js.native
class DisplayMixin () extends js.Object {
  /**
    * Gather display state of all attached elements and return as a dictionary.
    *
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known attach point nodes are to be processed.
    */
  def gatherDisplayState(names: js.Object): js.Any = js.native
  /**
    * Hide attached nodes according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto show and false to hide. If an array, all names in thearray will be hidden. If omitted, all form elementswill be hidden.
    */
  def hide(state: js.Object): js.Any = js.native
  /**
    * Show attached nodes according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto show and false to hide. If an array, all names in thearray will be set to defaultState. If omitted, all formelements will be set to defaultState.
    * @param defaultState               OptionalThe default state (true, if omitted).
    */
  def show(state: js.Object, defaultState: Boolean): js.Function = js.native
}

