package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This is the abstract base class for all graphical objects.
    */
@JSImport("go", "GraphObject")
@js.native
abstract class GraphObject ()
  extends goLib.goMod.goNs.GraphObject

/**
    * This is the abstract base class for all graphical objects.
    */
@JSImport("go", "GraphObject")
@js.native
object GraphObject extends js.Object {
  /**GraphObjects with this as the value of GraphObject.stretch are stretched depending on the context they are used.*/
  var Default: goLib.goMod.goNs.EnumValue = js.native
  /**GraphObjects with this as the value of GraphObject.stretch are scaled in both directions so as to fit exactly in the given bounds; there is no clipping but the aspect ratio may change, causing the object to appear stretched.*/
  var Fill: goLib.goMod.goNs.EnumValue = js.native
  /**GraphObjects with this as the value of GraphObject.stretch are scaled as much as possible in the x-axis*/
  var Horizontal: goLib.goMod.goNs.EnumValue = js.native
  /**GraphObjects with this as the value of GraphObject.stretch are not automatically scaled to fit in the given bounds; there may be clipping in one or both directions.*/
  var None: goLib.goMod.goNs.EnumValue = js.native
  /**Pictures with this as the value of Picture.imageStretch are drawn with equal scale in both directions to fit the arranged (actual) bounds.*/
  var Uniform: goLib.goMod.goNs.EnumValue = js.native
  /**Pictures with this as the value of Picture.imageStretch are drawn with equal scale in both directions to fit the larger side of the image bounds.*/
  var UniformToFill: goLib.goMod.goNs.EnumValue = js.native
  /**GraphObjects with this as the value of GraphObject.stretch are scaled as much as possible in the y-axis*/
  var Vertical: goLib.goMod.goNs.EnumValue = js.native
  /**
          * This static function defines a named function that GraphObject.make can use to build objects.
          * @param {string} name a capitalized name; must not be "" or "None"
          * @param {function(Array<*>):Object} func
          */
  def defineBuilder(name: java.lang.String, func: js.Function1[/* args */ js.Array[_], js.Object]): scala.Unit = js.native
    // undocumented
  def getBuilders(): goLib.goMod.goNs.Map[java.lang.String, js.Function1[/* args */ js.Array[_], js.Object]] = js.native
  /**
          * This static function builds an object given its class and additional arguments providing initial properties or GraphObjects that become Panel elements.
          * @param {function()|string} type a class function or the name of a class in the "go" namespace,
          * or one of several predefined kinds of Panels: "Button", "TreeExpanderButton",
          * "SubGraphExpanderButton", or "ContextMenuButton".
          * @param {...*} initializers zero or more values that initialize the new object,
          * typically an Object with properties whose values that get set on the new object,
          * or a GraphObject that is added to a Panel,
          * or a Binding for one of the new object's properties,
          * or an EnumValue as the initial value of a single property of the new object that
          * is recognized to take that value,
          * or a string that is used as the value of a commonly set property.
          */
  def make(`type`: goLib.goMod.goNs.Constructor, initializers: js.Any*): js.Any = js.native
  /**
          * This static function builds an object given its class and additional arguments providing initial properties or GraphObjects that become Panel elements.
          * @param {function()|string} type a class function or the name of a class in the "go" namespace,
          * or one of several predefined kinds of Panels: "Button", "TreeExpanderButton",
          * "SubGraphExpanderButton", or "ContextMenuButton".
          * @param {...*} initializers zero or more values that initialize the new object,
          * typically an Object with properties whose values that get set on the new object,
          * or a GraphObject that is added to a Panel,
          * or a Binding for one of the new object's properties,
          * or an EnumValue as the initial value of a single property of the new object that
          * is recognized to take that value,
          * or a string that is used as the value of a commonly set property.
          */
  def make(`type`: java.lang.String, initializers: js.Any*): js.Any = js.native
  /**
          * This static function returns the first argument from the arguments array passed
          * to a GraphObject.defineBuilder function by GraphObject.make.
          * By default this requires the first argument to be a string,
          * but you can provide a predicate to determine whether the argument is suitable.
          * @param {Array} args
          * @param {*=} defval the default value to return if the argument is optional and not present as the first argument
          * @param {function(*):boolean|null=} pred a predicate to determine the acceptability of the argument;
          *        the default predicate checks whether the argument is a string
          * @return {*}
          */
  def takeBuilderArgument(args: js.Array[_]): js.Any = js.native
  /**
          * This static function returns the first argument from the arguments array passed
          * to a GraphObject.defineBuilder function by GraphObject.make.
          * By default this requires the first argument to be a string,
          * but you can provide a predicate to determine whether the argument is suitable.
          * @param {Array} args
          * @param {*=} defval the default value to return if the argument is optional and not present as the first argument
          * @param {function(*):boolean|null=} pred a predicate to determine the acceptability of the argument;
          *        the default predicate checks whether the argument is a string
          * @return {*}
          */
  def takeBuilderArgument(args: js.Array[_], defval: js.Any): js.Any = js.native
  /**
          * This static function returns the first argument from the arguments array passed
          * to a GraphObject.defineBuilder function by GraphObject.make.
          * By default this requires the first argument to be a string,
          * but you can provide a predicate to determine whether the argument is suitable.
          * @param {Array} args
          * @param {*=} defval the default value to return if the argument is optional and not present as the first argument
          * @param {function(*):boolean|null=} pred a predicate to determine the acceptability of the argument;
          *        the default predicate checks whether the argument is a string
          * @return {*}
          */
  def takeBuilderArgument(args: js.Array[_], defval: js.Any, pred: js.Function1[/* arg */ js.Any, scala.Boolean]): js.Any = js.native
}

