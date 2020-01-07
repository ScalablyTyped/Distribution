package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hash values.
  */
@js.native
trait Schema$Hash extends js.Object {
  /**
    * The type of hash that was performed.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The hash value.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Hash {
  @scala.inline
  def apply(`type`: String = null, value: String = null): Schema$Hash = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Hash]
  }
}

