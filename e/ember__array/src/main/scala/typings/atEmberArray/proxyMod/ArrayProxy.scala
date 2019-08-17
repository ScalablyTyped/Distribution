package typings.atEmberArray.proxyMod

import typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray
import typings.atEmberArray.mutableMod.MutableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ArrayProxy wraps any other object that implements Ember.Array and/or Ember.MutableArray,
  * forwarding all requests. This makes it very useful for a number of binding use cases or other cases
  * where being able to swap out the underlying array is useful.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : EmberObject.extend(MutableArray as object) * / any */ @js.native
trait ArrayProxy[T] extends MutableArray[T] {
  var content: NativeArray[T] = js.native
  /**
    * Should actually retrieve the object at the specified index from the
    * content. You can override this method in subclasses to transform the
    * content item to something new.
    */
  def objectAtContent(idx: Double): js.UndefOr[T] = js.native
}

