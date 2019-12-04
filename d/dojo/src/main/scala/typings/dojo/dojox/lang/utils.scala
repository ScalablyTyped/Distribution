package typings.dojo.dojox.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/utils.html
  *
  *
  */
trait utils extends js.Object {
  /**
    * Coerces one object to the type of another.
    *
    * @param target object, which typeof result is used to coerce "source" object.
    * @param source object, which will be forced to change type.
    */
  def coerceType(target: js.Object, source: js.Object): js.Any
  /**
    * Merge two objects structurally, mixin properties will override object's properties.
    *
    * @param object original object.
    * @param mixin additional object, which properties will override object's properties.
    */
  def merge(`object`: js.Object, mixin: js.Object): js.Any
  /**
    * Updates an existing object in place with properties from an "source" object.
    *
    * @param target the "target" object to be updated
    * @param source the "source" object, whose properties will be used to source the existed object.
    * @param conv               Optionalforce conversion to the original type
    */
  def updateWithObject(target: js.Object, source: js.Object, conv: Boolean): js.Object
  /**
    * Updates an existing object in place with properties from an "source" object.
    *
    * @param target the "target" object to be updated
    * @param source the "source" object, whose properties will be used to source the existed object.
    * @param pattern object, whose properties will be used to pull values from the "source"
    * @param conv               Optionalforce conversion to the original type
    */
  def updateWithPattern(target: js.Object, source: js.Object, pattern: js.Object, conv: Boolean): js.Object
}

object utils {
  @scala.inline
  def apply(
    coerceType: (js.Object, js.Object) => js.Any,
    merge: (js.Object, js.Object) => js.Any,
    updateWithObject: (js.Object, js.Object, Boolean) => js.Object,
    updateWithPattern: (js.Object, js.Object, js.Object, Boolean) => js.Object
  ): utils = {
    val __obj = js.Dynamic.literal(coerceType = js.Any.fromFunction2(coerceType), merge = js.Any.fromFunction2(merge), updateWithObject = js.Any.fromFunction3(updateWithObject), updateWithPattern = js.Any.fromFunction4(updateWithPattern))
  
    __obj.asInstanceOf[utils]
  }
}

