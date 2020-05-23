package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optype extends js.Object {
  var index: String
  var op_type: js.UndefOr[String] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var version_type: js.UndefOr[String] = js.undefined
}

object Optype {
  @scala.inline
  def apply(
    index: String,
    op_type: String = null,
    pipeline: String = null,
    routing: String = null,
    version_type: String = null
  ): Optype = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (op_type != null) __obj.updateDynamic("op_type")(op_type.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optype]
  }
}

