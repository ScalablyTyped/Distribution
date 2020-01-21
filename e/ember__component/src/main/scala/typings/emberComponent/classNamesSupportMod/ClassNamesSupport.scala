package typings.emberComponent.classNamesSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesSupport extends js.Object {
  /**
    * A list of properties of the view to apply as class names. If the property is a string value,
    * the value of that string will be applied as a class name.
    *
    * If the value of the property is a Boolean, the name of that property is added as a dasherized
    * class name.
    *
    * If you would prefer to use a custom value instead of the dasherized property name, you can
    * pass a binding like this: `classNameBindings: ['isUrgent:urgent']`
    *
    * This list of properties is inherited from the component's superclasses as well.
    */
  var classNameBindings: js.Array[String]
  /**
    * Standard CSS class names to apply to the view's outer element. This
    * property automatically inherits any class names defined by the view's
    * superclasses as well.
    */
  var classNames: js.Array[String]
}

object ClassNamesSupport {
  @scala.inline
  def apply(classNameBindings: js.Array[String], classNames: js.Array[String]): ClassNamesSupport = {
    val __obj = js.Dynamic.literal(classNameBindings = classNameBindings.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClassNamesSupport]
  }
}

