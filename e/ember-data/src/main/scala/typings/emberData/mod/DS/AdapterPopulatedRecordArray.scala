package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ordered list of records whose order and membership is
  * determined by the adapter. For example, a query sent to the adapter
  * may trigger a search on the server, whose results would be loaded
  * into an instance of the `AdapterPopulatedRecordArray`.
  */
@JSImport("ember-data", "DS.AdapterPopulatedRecordArray")
@js.native
class AdapterPopulatedRecordArray[T] () extends RecordArray[T]
