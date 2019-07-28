package typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailoverContext extends js.Object {
  /** This is always sql#failoverContext. */
  var kind: js.UndefOr[String] = js.undefined
  /** The current settings version of this instance. Request will be rejected if this version doesn't match the current settings version. */
  var settingsVersion: js.UndefOr[String] = js.undefined
}

object FailoverContext {
  @scala.inline
  def apply(kind: String = null, settingsVersion: String = null): FailoverContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (settingsVersion != null) __obj.updateDynamic("settingsVersion")(settingsVersion)
    __obj.asInstanceOf[FailoverContext]
  }
}

