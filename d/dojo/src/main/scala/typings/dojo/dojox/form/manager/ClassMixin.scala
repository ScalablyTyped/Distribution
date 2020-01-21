package typings.dojo.dojox.form.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_ClassMixin.html
  *
  * Form manager's mixin for testing/assigning/removing
  * classes of controlled elements.
  * This mixin provides unified way to check/add/remove a class
  * of controlled elements.
  * It should be used together with dojox.form.manager.Mixin.
  *
  */
@JSGlobal("dojox.form.manager._ClassMixin")
@js.native
class ClassMixin () extends js.Object {
  /**
    * Add a class to nodes according to the supplied set of names
    *
    * @param className Class name to add.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def addClass(className: String, names: js.Object): js.Function = js.native
  /**
    * Gather the presence of a certain class in all controlled elements.
    *
    * @param className The class name to test for.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def gatherClassState(className: String, names: js.Object): js.Any = js.native
  /**
    * Remove a class from nodes according to the supplied set of names
    *
    * @param className Class name to remove.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def removeClass(className: String, names: js.Object): js.Function = js.native
}

