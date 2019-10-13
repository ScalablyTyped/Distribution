package typings.emberDashData.emberDashDataMod.DS

import typings.atEmberArray.proxyMod.ArrayProxy
import typings.atEmberObject.eventedMod.Evented
import typings.ember.emberMod.default.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record array is an array that contains records of a certain modelName. The record
  * array materializes records as needed when they are retrieved for the first
  * time. You should not create record arrays yourself. Instead, an instance of
  * `DS.RecordArray` or its subclasses will be returned by your application's store
  * in response to queries.
  */
@JSImport("ember-data", "DS.RecordArray")
@js.native
class RecordArray[T] ()
  extends ArrayProxy[T]
     with Evented {
  /**
    * The flag to signal a `RecordArray` is finished loading data.
    */
  var isLoaded: Boolean = js.native
  /**
    * The flag to signal a `RecordArray` is currently loading data.
    */
  var isUpdating: Boolean = js.native
  /**
    * The modelClass represented by this record array.
    */
  var `type`: ComputedProperty[Model, Model] = js.native
  /**
    * Saves all of the records in the `RecordArray`.
    */
  def save(): PromiseArray[T] = js.native
  /**
    * Used to get the latest version of all of the records in this array
    * from the adapter.
    */
  def update(): PromiseArray[T] = js.native
}

