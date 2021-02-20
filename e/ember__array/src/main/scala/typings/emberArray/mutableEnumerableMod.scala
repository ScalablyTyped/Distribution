package typings.emberArray

import org.scalablytyped.runtime.Shortcut
import typings.emberArray.enumerableMod.Enumerable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutableEnumerableMod extends Shortcut {
  
  @JSImport("@ember/array/-private/mutable-enumerable", JSImport.Default)
  @js.native
  val default: typings.emberObject.mixinMod.default[MutableEnumerable[js.Any], typings.emberObject.mod.default] = js.native
  
  /**
    * This mixin defines the API for modifying generic enumerables. These methods
    * can be applied to an object regardless of whether it is ordered or
    * unordered.
    */
  @js.native
  trait MutableEnumerable[T] extends Enumerable[T] {
    
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def addObject(`object`: T): T = js.native
    
    /**
      * Adds each object in the passed enumerable to the receiver.
      */
    def addObjects(objects: Enumerable[T]): this.type = js.native
    
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def removeObject(`object`: T): T = js.native
    
    /**
      * Removes each object in the passed enumerable from the receiver.
      */
    def removeObjects(objects: Enumerable[T]): this.type = js.native
  }
  
  type _To = typings.emberObject.mixinMod.default[MutableEnumerable[js.Any], typings.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `mutableEnumerableMod.foo` */
  override def _to: typings.emberObject.mixinMod.default[MutableEnumerable[js.Any], typings.emberObject.mod.default] = default
}
