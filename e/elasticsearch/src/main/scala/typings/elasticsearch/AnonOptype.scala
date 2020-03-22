package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptype extends js.Object {
  var index: String
  var op_type: js.UndefOr[String] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var version_type: js.UndefOr[String] = js.undefined
}

object AnonOptype {
  @scala.inline
  def apply(
    index: String,
    op_type: String = null,
    pipeline: String = null,
    routing: String = null,
    version_type: String = null
  ): AnonOptype = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (op_type != null) __obj.updateDynamic("op_type")(op_type.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptype]
  }
}

