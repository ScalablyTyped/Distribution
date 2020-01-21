package typings.emberData

import typings.emberData.mod.DS.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/serializer", JSImport.Namespace)
@js.native
object serializerMod extends js.Object {
  /**
    * `DS.Serializer` is an abstract base class that you should override in your
    * application to customize it for your backend. The minimum set of methods
    * that you should implement is:
    */
  @js.native
  class default () extends Serializer
  
}

