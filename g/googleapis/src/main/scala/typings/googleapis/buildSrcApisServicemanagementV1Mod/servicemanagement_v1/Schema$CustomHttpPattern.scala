package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom pattern is used for defining custom HTTP verb.
  */
@js.native
trait Schema$CustomHttpPattern extends js.Object {
  /**
    * The name of this custom HTTP verb.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The path matched by this custom verb.
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$CustomHttpPattern {
  @scala.inline
  def apply(kind: String = null, path: String = null): Schema$CustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomHttpPattern]
  }
}

