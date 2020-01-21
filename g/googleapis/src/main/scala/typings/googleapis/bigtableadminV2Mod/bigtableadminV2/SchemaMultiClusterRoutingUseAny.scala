package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read/write requests may be routed to any cluster in the instance, and will
  * fail over to another cluster in the event of transient errors or delays.
  * Choosing this option sacrifices read-your-writes consistency to improve
  * availability.
  */
@js.native
trait SchemaMultiClusterRoutingUseAny extends js.Object

