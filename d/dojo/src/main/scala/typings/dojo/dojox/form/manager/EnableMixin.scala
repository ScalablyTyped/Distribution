package typings.dojo.dojox.form.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_EnableMixin.html
  *
  * Form manager's mixin for controlling enable/disable state of
  * form elements.
  * This mixin provides unified enable/disable functionality for
  * form widgets and form elements. It should be used together
  * with dojox.form.manager.Mixin.
  *
  */
@JSGlobal("dojox.form.manager._EnableMixin")
@js.native
class EnableMixin () extends js.Object {
  /**
    * Disable form controls according to the supplied state object
    * returning the previous state.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto enable and false to disable. If an array, all names in thearray will be disabled. If omitted, disables all.
    */
  def disable(state: js.Object): js.Any = js.native
  /**
    * Enable form controls according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto enable and false to disable. If an array, all names in thearray will be set to defaultState. If omitted, all formelements will be set to defaultState.
    * @param defaultState The default state (true, if omitted).
    */
  def enable(state: js.Object, defaultState: Boolean): js.Function = js.native
  /**
    * Gather enable state of all form elements and return as a dictionary.
    *
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def gatherEnableState(names: js.Object): js.Any = js.native
}

