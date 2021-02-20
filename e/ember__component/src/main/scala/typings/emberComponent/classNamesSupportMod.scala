package typings.emberComponent

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classNamesSupportMod extends Shortcut {
  
  @JSImport("@ember/component/-private/class-names-support", JSImport.Default)
  @js.native
  val default: typings.emberObject.mixinMod.default[ClassNamesSupport, typings.emberObject.mod.default] = js.native
  
  @js.native
  trait ClassNamesSupport extends StObject {
    
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
    implicit class ClassNamesSupportMutableBuilder[Self <: ClassNamesSupport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNameBindings(value: js.Array[String]): Self = StObject.set(x, "classNameBindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameBindingsVarargs(value: String*): Self = StObject.set(x, "classNameBindings", js.Array(value :_*))
      
      @scala.inline
      def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value :_*))
    }
  }
  
  type _To = typings.emberObject.mixinMod.default[ClassNamesSupport, typings.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `classNamesSupportMod.foo` */
  override def _to: typings.emberObject.mixinMod.default[ClassNamesSupport, typings.emberObject.mod.default] = default
}
