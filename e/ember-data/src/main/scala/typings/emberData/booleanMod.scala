package typings.emberData

import typings.emberData.mod.DS.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/transforms/boolean", JSImport.Namespace)
@js.native
object booleanMod extends js.Object {
  /**
    * The `DS.BooleanTransform` class is used to serialize and deserialize
    * boolean attributes on Ember Data record objects. This transform is
    * used when `boolean` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class default () extends Transform
  
}

