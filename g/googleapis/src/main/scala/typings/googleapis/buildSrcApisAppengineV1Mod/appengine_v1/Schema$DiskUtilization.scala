package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by disk usage. Only applicable in the App Engine flexible
  * environment.
  */
@js.native
trait Schema$DiskUtilization extends js.Object {
  /**
    * Target bytes read per second.
    */
  var targetReadBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target ops read per seconds.
    */
  var targetReadOpsPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target bytes written per second.
    */
  var targetWriteBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target ops written per second.
    */
  var targetWriteOpsPerSecond: js.UndefOr[Double] = js.native
}

object Schema$DiskUtilization {
  @scala.inline
  def apply(
    targetReadBytesPerSecond: Int | Double = null,
    targetReadOpsPerSecond: Int | Double = null,
    targetWriteBytesPerSecond: Int | Double = null,
    targetWriteOpsPerSecond: Int | Double = null
  ): Schema$DiskUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetReadBytesPerSecond != null) __obj.updateDynamic("targetReadBytesPerSecond")(targetReadBytesPerSecond.asInstanceOf[js.Any])
    if (targetReadOpsPerSecond != null) __obj.updateDynamic("targetReadOpsPerSecond")(targetReadOpsPerSecond.asInstanceOf[js.Any])
    if (targetWriteBytesPerSecond != null) __obj.updateDynamic("targetWriteBytesPerSecond")(targetWriteBytesPerSecond.asInstanceOf[js.Any])
    if (targetWriteOpsPerSecond != null) __obj.updateDynamic("targetWriteOpsPerSecond")(targetWriteOpsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskUtilization]
  }
}

