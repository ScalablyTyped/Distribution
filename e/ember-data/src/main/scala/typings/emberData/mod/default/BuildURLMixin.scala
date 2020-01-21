package typings.emberData.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WARNING: This interface is likely to change in order to accomodate https://github.com/emberjs/rfcs/pull/4
  * ## Using BuildURLMixin
  * To use url building, include the mixin when extending an adapter, and call `buildURL` where needed.
  * The default behaviour is designed for RESTAdapter.
  * ### Example
  * ```javascript
  * export default DS.Adapter.extend(BuildURLMixin, {
  * findRecord: function(store, type, id, snapshot) {
  * var url = this.buildURL(type.modelName, id, snapshot, 'findRecord');
  * return this.ajax(url, 'GET');
  * }
  * });
  * ```
  * ### Attributes
  * The `host` and `namespace` attributes will be used if defined, and are optional.
  */
@JSImport("ember-data", "BuildURLMixin")
@js.native
class BuildURLMixin ()
  extends typings.emberData.mod.DS.BuildURLMixin

