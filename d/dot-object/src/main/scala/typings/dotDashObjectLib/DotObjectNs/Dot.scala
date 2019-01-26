package typings
package dotDashObjectLib.DotObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dot extends js.Object {
  /**
    *
    * Copy a property from one object to another object.
    *
    * If the source path does not exist (undefined)
    * the property on the other object will not be set.
    *
    * @param {String} source
    * @param {String} target
    * @param {Object} obj1
    * @param {Object} obj2
    * @param {Function|Array} mods
    * @param {Boolean} merge
    */
  def copy(source: java.lang.String, target: java.lang.String, obj1: js.Any, obj2: js.Any): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: ModifierFunctionWrapper
  ): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: ModifierFunctionWrapper,
    merge: scala.Boolean
  ): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: js.Array[ModifierFunctionWrapper]
  ): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: js.Array[ModifierFunctionWrapper],
    merge: scala.Boolean
  ): scala.Unit = js.native
  /**
    *
    * Remove value from an object using dot notation.
    *
    * @param {String} path
    * @param {Object} obj
    * @return {Mixed} The removed value
    */
  def del(path: java.lang.String, obj: js.Any): js.Any = js.native
  /**
    *
    * Convert object to dotted-key/value pair
    *
    * Usage:
    *
    *   var tgt = dot.dot(obj)
    * @param {Object} obj source object
    * @return {Object} result
    */
  def dot(obj: js.Any): js.Any = js.native
  /**
    *
    * Convert object to dotted-key/value pair
    *
    * Usage:
    *   var tgt = {}
    *   dot.dot(obj, tgt)
    *
    * @param {Object} obj source object
    * @param {Object} tgt target object
    */
  def dot(obj: js.Any, tgt: js.Any): scala.Unit = js.native
  /**
    *
    * Move a property from one place to the other.
    *
    * If the source path does not exist (undefined)
    * the target property will not be set.
    *
    * @param {String} source
    * @param {String} target
    * @param {Object} obj
    * @param {Function|Array} mods
    * @param {Boolean} merge
    */
  def move(source: java.lang.String, target: java.lang.String, obj: js.Any): scala.Unit = js.native
  def move(source: java.lang.String, target: java.lang.String, obj: js.Any, mods: ModifierFunctionWrapper): scala.Unit = js.native
  def move(
    source: java.lang.String,
    target: java.lang.String,
    obj: js.Any,
    mods: ModifierFunctionWrapper,
    merge: scala.Boolean
  ): scala.Unit = js.native
  def move(
    source: java.lang.String,
    target: java.lang.String,
    obj: js.Any,
    mods: js.Array[ModifierFunctionWrapper]
  ): scala.Unit = js.native
  def move(
    source: java.lang.String,
    target: java.lang.String,
    obj: js.Any,
    mods: js.Array[ModifierFunctionWrapper],
    merge: scala.Boolean
  ): scala.Unit = js.native
  /**
    *
    * Converts an object with dotted-key/value pairs to it's expanded version
    *
    * Optionally transformed by a set of modifiers.
    *
    * Usage:
    *
    *   var row = {
    *     'nr': 200,
    *     'doc.name': '  My Document  '
    *   }
    *
    *   var mods = {
    *     'doc.name': [_s.trim, _s.underscored]
    *   }
    *
    *   dot.object(row, mods)
    *
    * @param {Object} obj
    * @param {Object} mods
    */
  def `object`(obj: js.Any): scala.Unit = js.native
  def `object`(obj: js.Any, mods: ModifierFunctionWrapper): scala.Unit = js.native
  def `object`(obj: js.Any, mods: js.Array[ModifierFunctionWrapper]): scala.Unit = js.native
  /**
    *
    * Pick a value from an object using dot notation.
    *
    * Optionally remove the value
    *
    * @param {String} path
    * @param {Object} obj
    * @param {Boolean} remove
    */
  def pick(path: java.lang.String, obj: js.Any): js.Any = js.native
  def pick(path: java.lang.String, obj: js.Any, remove: scala.Boolean): js.Any = js.native
  /**
    *
    * Remove value from an object using dot notation.
    *
    * @param {String} path
    * @param {Object} obj
    * @return {Mixed} The removed value
    */
  def remove(path: java.lang.String, obj: js.Any): js.Any = js.native
  /**
    *
    * Replace/merge an object to an existing object property
    *
    * @param {String} path dotted path
    * @param {Object} v object to be set
    * @param {Object} obj object to be modified
    * @param {Boolean} merge optional merge
    */
  def set(path: java.lang.String, v: js.Any, obj: js.Object): scala.Unit = js.native
  def set(path: java.lang.String, v: js.Any, obj: js.Object, merge: scala.Boolean): scala.Unit = js.native
  /**
    *
    * Replace/create with a string
    *
    * @param {String} path dotted path
    * @param {String} v value to be set
    * @param {Object} obj object to be modified
    * @param {Function|Array} mods optional modifier
    */
  def str(path: java.lang.String, v: js.Any, obj: js.Object): scala.Unit = js.native
  def str(path: java.lang.String, v: js.Any, obj: js.Object, mods: ModifierFunctionWrapper): scala.Unit = js.native
  def str(path: java.lang.String, v: js.Any, obj: js.Object, mods: js.Array[ModifierFunctionWrapper]): scala.Unit = js.native
  /**
    *
    * Transfer a property from one object to another object.
    *
    * If the source path does not exist (undefined)
    * the property on the other object will not be set.
    *
    * @param {String} source
    * @param {String} target
    * @param {Object} obj1
    * @param {Object} obj2
    * @param {Function|Array} mods
    * @param {Boolean} merge
    */
  def transfer(source: java.lang.String, target: java.lang.String, obj1: js.Any, obj2: js.Any): scala.Unit = js.native
  def transfer(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: ModifierFunctionWrapper
  ): scala.Unit = js.native
  def transfer(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: ModifierFunctionWrapper,
    merge: scala.Boolean
  ): scala.Unit = js.native
  def transfer(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: js.Array[ModifierFunctionWrapper]
  ): scala.Unit = js.native
  def transfer(
    source: java.lang.String,
    target: java.lang.String,
    obj1: js.Any,
    obj2: js.Any,
    mods: js.Array[ModifierFunctionWrapper],
    merge: scala.Boolean
  ): scala.Unit = js.native
  /**
    *
    * Transform an object
    *
    * Usage:
    *
    *   var obj = {
    *     "id": 1,
    *    "some": {
    *      "thing": "else"
    *    }
    *   }
    *
    *   var transform = {
    *     "id": "nr",
    *    "some.thing": "name"
    *   }
    *
    *   var tgt = dot.transform(transform, obj)
    *
    * @param {Object} recipe Transform recipe
    * @param {Object} obj Object to be transformed
    * @param {Array} mods modifiers for the target
    */
  def transform(recipe: js.Any, obj: js.Any): scala.Unit = js.native
  def transform(recipe: js.Any, obj: js.Any, mods: ModifierFunctionWrapper): scala.Unit = js.native
  def transform(recipe: js.Any, obj: js.Any, mods: js.Array[ModifierFunctionWrapper]): scala.Unit = js.native
}

