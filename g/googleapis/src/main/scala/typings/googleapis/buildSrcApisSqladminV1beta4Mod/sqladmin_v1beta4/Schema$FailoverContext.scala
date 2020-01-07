package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance failover context.
  */
@js.native
trait Schema$FailoverContext extends js.Object {
  /**
    * This is always sql#failoverContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current settings version of this instance. Request will be rejected
    * if this version doesn&#39;t match the current settings version.
    */
  var settingsVersion: js.UndefOr[String] = js.native
}

object Schema$FailoverContext {
  @scala.inline
  def apply(kind: String = null, settingsVersion: String = null): Schema$FailoverContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (settingsVersion != null) __obj.updateDynamic("settingsVersion")(settingsVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FailoverContext]
  }
}

