package typings.atEntriaRelayDashExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libQueryResourceMod {
  import typings.atEntriaRelayDashExperimental.libLRUCacheMod.Cache

  type QueryResource = QueryResourceImpl
  type QueryResourceCache = Cache[QueryResourceCacheEntry]
}
