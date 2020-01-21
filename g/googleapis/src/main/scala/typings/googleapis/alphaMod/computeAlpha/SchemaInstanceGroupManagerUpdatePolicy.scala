package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerUpdatePolicy extends js.Object {
  var instanceRedistributionType: js.UndefOr[String] = js.native
  /**
    * The maximum number of instances that can be created above the specified
    * targetSize during the update process. By default, a fixed value of 1 is
    * used. This value can be either a fixed number or a percentage if the
    * instance group has 10 or more instances. If you set a percentage, the
    * number of instances will be rounded up if necessary.  At least one of
    * either maxSurge or maxUnavailable must be greater than 0. Learn more
    * about maxSurge.
    */
  var maxSurge: js.UndefOr[SchemaFixedOrPercent] = js.native
  /**
    * The maximum number of instances that can be unavailable during the update
    * process. An instance is considered available if all of the following
    * conditions are satisfied:    - The instance&#39;s status is RUNNING.  -
    * If there is a health check on the instance group, the instance&#39;s
    * liveness health check result must be HEALTHY at least once. If there is
    * no health check on the group, then the instance only needs to have a
    * status of RUNNING to be considered available.  By default, a fixed value
    * of 1 is used. This value can be either a fixed number or a percentage if
    * the instance group has 10 or more instances. If you set a percentage, the
    * number of instances will be rounded up if necessary.  At least one of
    * either maxSurge or maxUnavailable must be greater than 0. Learn more
    * about maxUnavailable.
    */
  var maxUnavailable: js.UndefOr[SchemaFixedOrPercent] = js.native
  /**
    * Minimum number of seconds to wait for after a newly created instance
    * becomes available. This value must be from range [0, 3600].
    */
  var minReadySec: js.UndefOr[Double] = js.native
  /**
    * Minimal action to be taken on an instance. You can specify either RESTART
    * to restart existing instances or REPLACE to delete and create new
    * instances from the target template. If you specify a RESTART, the Updater
    * will attempt to perform that action only. However, if the Updater
    * determines that the minimal action you specify is not enough to perform
    * the update, it might perform a more disruptive action.
    */
  var minimalAction: js.UndefOr[String] = js.native
  /**
    * What action should be used to replace instances. See
    * minimal_action.REPLACE
    */
  var replacementMethod: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInstanceGroupManagerUpdatePolicy {
  @scala.inline
  def apply(
    instanceRedistributionType: String = null,
    maxSurge: SchemaFixedOrPercent = null,
    maxUnavailable: SchemaFixedOrPercent = null,
    minReadySec: Int | Double = null,
    minimalAction: String = null,
    replacementMethod: String = null,
    `type`: String = null
  ): SchemaInstanceGroupManagerUpdatePolicy = {
    val __obj = js.Dynamic.literal()
    if (instanceRedistributionType != null) __obj.updateDynamic("instanceRedistributionType")(instanceRedistributionType.asInstanceOf[js.Any])
    if (maxSurge != null) __obj.updateDynamic("maxSurge")(maxSurge.asInstanceOf[js.Any])
    if (maxUnavailable != null) __obj.updateDynamic("maxUnavailable")(maxUnavailable.asInstanceOf[js.Any])
    if (minReadySec != null) __obj.updateDynamic("minReadySec")(minReadySec.asInstanceOf[js.Any])
    if (minimalAction != null) __obj.updateDynamic("minimalAction")(minimalAction.asInstanceOf[js.Any])
    if (replacementMethod != null) __obj.updateDynamic("replacementMethod")(replacementMethod.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagerUpdatePolicy]
  }
}

