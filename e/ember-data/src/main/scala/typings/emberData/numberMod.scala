package typings.emberData

import typings.emberData.mod.DS.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data/transforms/number", JSImport.Namespace)
@js.native
object numberMod extends js.Object {
  
  /**
    * The `DS.NumberTransform` class is used to serialize and deserialize
    * numeric attributes on Ember Data record objects. This transform is
    * used when `number` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class default () extends Transform
}
