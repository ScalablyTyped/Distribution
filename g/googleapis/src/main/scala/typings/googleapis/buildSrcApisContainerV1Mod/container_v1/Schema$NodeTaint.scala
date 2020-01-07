package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kubernetes taint is comprised of three fields: key, value, and effect.
  * Effect can only be one of three types:  NoSchedule, PreferNoSchedule or
  * NoExecute.  For more information, including usage and the valid values,
  * see:
  * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
  */
@js.native
trait Schema$NodeTaint extends js.Object {
  /**
    * Effect for taint.
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * Key for taint.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for taint.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$NodeTaint {
  @scala.inline
  def apply(effect: String = null, key: String = null, value: String = null): Schema$NodeTaint = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeTaint]
  }
}

