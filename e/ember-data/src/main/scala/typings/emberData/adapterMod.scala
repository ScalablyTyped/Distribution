package typings.emberData

import typings.emberData.mod.DS.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/adapter", JSImport.Namespace)
@js.native
object adapterMod extends js.Object {
  /**
    * An adapter is an object that receives requests from a store and
    * translates them into the appropriate action to take against your
    * persistence layer. The persistence layer is usually an HTTP API, but
    * may be anything, such as the browser's local storage. Typically the
    * adapter is not invoked directly instead its functionality is accessed
    * through the `store`.
    */
  @js.native
  class default () extends Adapter
  
}

