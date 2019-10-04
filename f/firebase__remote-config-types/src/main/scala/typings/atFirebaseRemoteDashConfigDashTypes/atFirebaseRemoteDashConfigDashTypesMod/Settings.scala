package typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Defines the maximum amount of milliseconds to wait for a response when fetching
    * configuration from the Remote Config server. Defaults to 60000 (One minute).
    */
  var fetchTimeoutMillis: Double
  /**
    * Defines the maximum age in milliseconds of an entry in the config cache before
    * it is considered stale. Defaults to 43200000 (Twelve hours).
    */
  var minimumFetchIntervalMillis: Double
}

object Settings {
  @scala.inline
  def apply(fetchTimeoutMillis: Double, minimumFetchIntervalMillis: Double): Settings = {
    val __obj = js.Dynamic.literal(fetchTimeoutMillis = fetchTimeoutMillis, minimumFetchIntervalMillis = minimumFetchIntervalMillis)
  
    __obj.asInstanceOf[Settings]
  }
}

