package typings.emberData.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of records whose membership is determined by the
  * store. As records are created, loaded, or modified, the store
  * evaluates them to determine if they should be part of the record
  * array.
  */
@JSImport("ember-data", "FilteredRecordArray")
@js.native
class FilteredRecordArray[T] ()
  extends typings.emberData.mod.DS.FilteredRecordArray[T]
