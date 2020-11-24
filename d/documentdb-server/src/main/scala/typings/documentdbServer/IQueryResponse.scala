package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object returned from a query function, namely chain, filter, map, pluck, flatten, or value.
  * If the query is part of a chained call, then this object can be used to chain further queries until the final terminating value call.
  */
@js.native
trait IQueryResponse extends IQueryAPI {
  
  /** True if the query has been queued, false if it is not queued because of a pending timeout. */
  var isAccepted: Boolean = js.native
}
