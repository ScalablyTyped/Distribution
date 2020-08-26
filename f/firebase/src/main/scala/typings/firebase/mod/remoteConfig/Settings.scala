package typings.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * Defines the maximum amount of milliseconds to wait for a response when fetching
    * configuration from the Remote Config server. Defaults to 60000 (One minute).
    */
  var fetchTimeoutMillis: Double = js.native
  /**
    * Defines the maximum age in milliseconds of an entry in the config cache before
    * it is considered stale. Defaults to 43200000 (Twelve hours).
    */
  var minimumFetchIntervalMillis: Double = js.native
}

object Settings {
  @scala.inline
  def apply(fetchTimeoutMillis: Double, minimumFetchIntervalMillis: Double): Settings = {
    val __obj = js.Dynamic.literal(fetchTimeoutMillis = fetchTimeoutMillis.asInstanceOf[js.Any], minimumFetchIntervalMillis = minimumFetchIntervalMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchTimeoutMillis(value: Double): Self = this.set("fetchTimeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumFetchIntervalMillis(value: Double): Self = this.set("minimumFetchIntervalMillis", value.asInstanceOf[js.Any])
  }
  
}

