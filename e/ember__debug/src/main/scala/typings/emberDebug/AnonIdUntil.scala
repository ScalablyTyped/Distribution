package typings.emberDebug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdUntil extends js.Object {
  /**
    * A unique id for this deprecation. The id can be used by Ember debugging
    * tools to change the behavior (raise, log or silence) for that specific
    * deprecation. The id should be namespaced by dots, e.g.
    * `"view.helper.select"`.
    */
  var id: String
  /**
    * The version of Ember when this deprecation warning will be removed.
    */
  var until: String
  /**
    * An optional url to the transition guide on the emberjs.com website.
    */
  var url: js.UndefOr[String] = js.undefined
}

object AnonIdUntil {
  @scala.inline
  def apply(id: String, until: String, url: String = null): AnonIdUntil = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdUntil]
  }
}

