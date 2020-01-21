package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerVersion extends js.Object {
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * Name of the version. Unique among all versions in the scope of this
    * managed instance group.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Tag describing the version. Used to trigger rollout of a target version
    * even if instance_template remains unchanged. Deprecated in favor of
    * &#39;name&#39;.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * Specifies the intended number of instances to be created from the
    * instanceTemplate. The final number of instances created from the template
    * will be equal to:   - If expressed as a fixed number, the minimum of
    * either targetSize.fixed or instanceGroupManager.targetSize is used.  - if
    * expressed as a percent, the targetSize would be (targetSize.percent/100 *
    * InstanceGroupManager.targetSize) If there is a remainder, the number is
    * rounded up.  If unset, this version will update any remaining instances
    * not updated by another version. Read Starting a canary update for more
    * information.
    */
  var targetSize: js.UndefOr[SchemaFixedOrPercent] = js.native
}

object SchemaInstanceGroupManagerVersion {
  @scala.inline
  def apply(
    instanceTemplate: String = null,
    name: String = null,
    tag: String = null,
    targetSize: SchemaFixedOrPercent = null
  ): SchemaInstanceGroupManagerVersion = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (targetSize != null) __obj.updateDynamic("targetSize")(targetSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagerVersion]
  }
}

