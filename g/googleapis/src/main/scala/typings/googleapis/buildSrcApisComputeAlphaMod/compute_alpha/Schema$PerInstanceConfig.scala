package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PerInstanceConfig extends js.Object {
  /**
    * Fingerprint of this per-instance config. This field may be used in
    * optimistic locking. It will be ignored when inserting a per-instance
    * config. An up-to-date fingerprint must be provided in order to update an
    * existing per-instance config or the field needs to be unset.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The URL of the instance. Serves as a merge key during
    * UpdatePerInstanceConfigs operation, i.e. if per-instance config with the
    * same instance URL exists then it will be updated, otherwise a new one
    * will be created.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The name of the per-instance config and the corresponding instance.
    * Serves as a merge key during UpdatePerInstanceConfigs operation, i.e. if
    * per-instance config with the same name exists then it will be updated,
    * otherwise a new one will be created for the VM instance with the same
    * name. An attempt to create a per-instance config for a VM instance that
    * either doesn&#39;t exist or is not part of the group will result in a
    * failure.
    */
  var name: js.UndefOr[String] = js.native
  var `override`: js.UndefOr[Schema$ManagedInstanceOverride] = js.native
  /**
    * Intended preserved state for the given instance. Does not contain state
    * generated based on Stateful Policy.
    */
  var preservedState: js.UndefOr[Schema$PreservedState] = js.native
}

object Schema$PerInstanceConfig {
  @scala.inline
  def apply(
    fingerprint: String = null,
    instance: String = null,
    name: String = null,
    `override`: Schema$ManagedInstanceOverride = null,
    preservedState: Schema$PreservedState = null
  ): Schema$PerInstanceConfig = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`override` != null) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (preservedState != null) __obj.updateDynamic("preservedState")(preservedState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PerInstanceConfig]
  }
}

