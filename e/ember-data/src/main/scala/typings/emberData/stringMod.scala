package typings.emberData

import typings.emberData.mod.DS.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/transforms/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  /**
    * The `DS.StringTransform` class is used to serialize and deserialize
    * string attributes on Ember Data record objects. This transform is
    * used when `string` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class default () extends Transform
  
}

