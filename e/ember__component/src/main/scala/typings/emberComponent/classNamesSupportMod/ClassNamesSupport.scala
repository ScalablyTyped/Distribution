package typings.emberComponent.classNamesSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var classNameBindings: js.Array[String] = js.native
  
  /**
    * Standard CSS class names to apply to the view's outer element. This
    * property automatically inherits any class names defined by the view's
    * superclasses as well.
    */
  var classNames: js.Array[String] = js.native
}
object ClassNamesSupport {
  
  @scala.inline
  def apply(classNameBindings: js.Array[String], classNames: js.Array[String]): ClassNamesSupport = {
    val __obj = js.Dynamic.literal(classNameBindings = classNameBindings.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNamesSupport]
  }
  
  @scala.inline
  implicit class ClassNamesSupportOps[Self <: ClassNamesSupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassNameBindingsVarargs(value: String*): Self = this.set("classNameBindings", js.Array(value :_*))
    
    @scala.inline
    def setClassNameBindings(value: js.Array[String]): Self = this.set("classNameBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesVarargs(value: String*): Self = this.set("classNames", js.Array(value :_*))
    
    @scala.inline
    def setClassNames(value: js.Array[String]): Self = this.set("classNames", value.asInstanceOf[js.Any])
  }
}
