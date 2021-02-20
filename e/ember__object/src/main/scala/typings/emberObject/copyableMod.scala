package typings.emberObject

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyableMod extends Shortcut {
  
  @JSImport("@ember/object/-private/copyable", JSImport.Default)
  @js.native
  val default: typings.emberObject.mixinMod.default[Copyable, typings.emberObject.mod.default] = js.native
  
  /**
    * Implements some standard methods for copying an object. Add this mixin to
    * any object you create that can create a copy of itself. This mixin is
    * added automatically to the built-in array.
    */
  @js.native
  trait Copyable extends StObject {
    
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def copy(deep: Boolean): Copyable = js.native
    
    /**
      * If the object implements `Ember.Freezable`, then this will return a new
      * copy if the object is not frozen and the receiver if the object is frozen.
      */
    def frozenCopy(): Copyable = js.native
  }
  object Copyable {
    
    @scala.inline
    def apply(copy: Boolean => Copyable, frozenCopy: () => Copyable): Copyable = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), frozenCopy = js.Any.fromFunction0(frozenCopy))
      __obj.asInstanceOf[Copyable]
    }
    
    @scala.inline
    implicit class CopyableMutableBuilder[Self <: Copyable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Boolean => Copyable): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFrozenCopy(value: () => Copyable): Self = StObject.set(x, "frozenCopy", js.Any.fromFunction0(value))
    }
  }
  
  type _To = typings.emberObject.mixinMod.default[Copyable, typings.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `copyableMod.foo` */
  override def _to: typings.emberObject.mixinMod.default[Copyable, typings.emberObject.mod.default] = default
}
