package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Read/write requests may be routed to any cluster in the instance, and will
  * fail over to another cluster in the event of transient errors or delays.
  * Choosing this option sacrifices read-your-writes consistency to improve
  * availability.
  */
trait SchemaMultiClusterRoutingUseAny extends StObject
