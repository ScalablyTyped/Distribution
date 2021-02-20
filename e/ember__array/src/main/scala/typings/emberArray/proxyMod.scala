package typings.emberArray

import typings.emberArray.mutableMod.MutableArray
import typings.emberArray.nativeArrayMod.NativeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyMod {
  
  /**
    * An ArrayProxy wraps any other object that implements Ember.Array and/or Ember.MutableArray,
    * forwarding all requests. This makes it very useful for a number of binding use cases or other cases
    * where being able to swap out the underlying array is useful.
    */
  @JSImport("@ember/array/proxy", JSImport.Default)
  @js.native
  class default[T] () extends ArrayProxy[T]
  
  /**
    * An ArrayProxy wraps any other object that implements Ember.Array and/or Ember.MutableArray,
    * forwarding all requests. This makes it very useful for a number of binding use cases or other cases
    * where being able to swap out the underlying array is useful.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(MutableArray as {}) * / any */ @js.native
  trait ArrayProxy[T] extends MutableArray[T] {
    
    var content: NativeArray[T] = js.native
    
    /**
      * Should actually retrieve the object at the specified index from the
      * content. You can override this method in subclasses to transform the
      * content item to something new.
      */
    def objectAtContent(idx: Double): js.UndefOr[T] = js.native
  }
}
