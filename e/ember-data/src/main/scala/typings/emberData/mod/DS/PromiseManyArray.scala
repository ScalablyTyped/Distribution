package typings.emberData.mod.DS

import typings.ember.mod.default.ArrayProxy
import typings.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PromiseManyArray is a PromiseArray that also proxies certain method calls
  * to the underlying manyArray.
  * Right now we proxy:
  */
@JSImport("ember-data", "DS.PromiseManyArray")
@js.native
class PromiseManyArray[T /* <: Model */] ()
  extends PromiseProxyMixin[ArrayProxy[T]]
     with typings.emberArray.proxyMod.ArrayProxy[T] {
  
  /**
    * Create a child record within the owner
    */
  def createRecord(): T = js.native
  def createRecord(inputProperties: js.Object): T = js.native
  
  /**
    * Reloads all of the records in the manyArray. If the manyArray
    * holds a relationship that was originally fetched using a links url
    * Ember Data will revisit the original links url to repopulate the
    * relationship.
    */
  def reload(): PromiseManyArray[T] = js.native
}
