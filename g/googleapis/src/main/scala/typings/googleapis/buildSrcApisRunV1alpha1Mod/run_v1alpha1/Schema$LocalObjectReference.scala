package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalObjectReference contains enough information to let you locate the
  * referenced object inside the same namespace.
  */
@js.native
trait Schema$LocalObjectReference extends js.Object {
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$LocalObjectReference {
  @scala.inline
  def apply(name: String = null): Schema$LocalObjectReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalObjectReference]
  }
}

