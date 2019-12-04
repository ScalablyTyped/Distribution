package typings.emberDashData

import typings.emberDashData.emberDashDataMod.DS.JSONAPIAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/adapters/json-api", JSImport.Namespace)
@js.native
object adaptersJsonDashApiMod extends js.Object {
  /**
    * The `JSONAPIAdapter` is the default adapter used by Ember Data. It
    * is responsible for transforming the store's requests into HTTP
    * requests that follow the [JSON API](http://jsonapi.org/format/)
    * format.
    */
  @js.native
  class default () extends JSONAPIAdapter
  
}

