package typings.emberData

import typings.emberData.mod.DS.RESTAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data/adapters/json-api", JSImport.Namespace)
@js.native
object jsonApiMod extends js.Object {
  
  /**
    * The `JSONAPIAdapter` is the default adapter used by Ember Data. It
    * is responsible for transforming the store's requests into HTTP
    * requests that follow the [JSON API](http://jsonapi.org/format/)
    * format.
    */
  @js.native
  class default () extends RESTAdapter
}
