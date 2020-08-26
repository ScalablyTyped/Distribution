package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SMART client settings for browser behaviour
  */
@js.native
trait Settings extends js.Object {
  /**
    * When set to true, this variable will fully utilize HTML5 sessionStorage API.
    * Default to true
    * This variable can be overriden to false by setting FHIR.oauth2.settings.fullSessionStorageSupport = false.
    * When set to false, the sessionStorage will be keyed by a state variable. This is to allow the embedded IE browser
    * instances instantiated on a single thread to continue to function without having sessionStorage data shared
    * across the embedded IE instances.
    */
  var fullSessionStorageSupport: Boolean = js.native
  /**
    * Replaces the browser's current URL using window.history.replaceState API.
    * Default to true
    */
  var replaceBrowserHistory: Boolean = js.native
}

object Settings {
  @scala.inline
  def apply(fullSessionStorageSupport: Boolean, replaceBrowserHistory: Boolean): Settings = {
    val __obj = js.Dynamic.literal(fullSessionStorageSupport = fullSessionStorageSupport.asInstanceOf[js.Any], replaceBrowserHistory = replaceBrowserHistory.asInstanceOf[js.Any])
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
    def setFullSessionStorageSupport(value: Boolean): Self = this.set("fullSessionStorageSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceBrowserHistory(value: Boolean): Self = this.set("replaceBrowserHistory", value.asInstanceOf[js.Any])
  }
  
}

