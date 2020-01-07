package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the cluster auto-delete schedule configuration.
  */
@js.native
trait Schema$LifecycleConfig extends js.Object {
  /**
    * Optional. The time when cluster will be auto-deleted.
    */
  var autoDeleteTime: js.UndefOr[String] = js.native
  /**
    * Optional. The lifetime duration of cluster. The cluster will be
    * auto-deleted at the end of this period. Valid range: 10m, 14d.Example:
    * &quot;1d&quot;, to delete the cluster 1 day after its creation..
    */
  var autoDeleteTtl: js.UndefOr[String] = js.native
  /**
    * Optional. The duration to keep the cluster alive while idling. Passing
    * this threshold will cause the cluster to be deleted. Valid range: 10m,
    * 14d.Example: &quot;10m&quot;, the minimum value, to delete the cluster
    * when it has had no jobs running for 10 minutes.
    */
  var idleDeleteTtl: js.UndefOr[String] = js.native
}

object Schema$LifecycleConfig {
  @scala.inline
  def apply(autoDeleteTime: String = null, autoDeleteTtl: String = null, idleDeleteTtl: String = null): Schema$LifecycleConfig = {
    val __obj = js.Dynamic.literal()
    if (autoDeleteTime != null) __obj.updateDynamic("autoDeleteTime")(autoDeleteTime.asInstanceOf[js.Any])
    if (autoDeleteTtl != null) __obj.updateDynamic("autoDeleteTtl")(autoDeleteTtl.asInstanceOf[js.Any])
    if (idleDeleteTtl != null) __obj.updateDynamic("idleDeleteTtl")(idleDeleteTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LifecycleConfig]
  }
}

