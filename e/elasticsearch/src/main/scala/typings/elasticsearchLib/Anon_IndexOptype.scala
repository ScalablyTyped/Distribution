package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexOptype extends js.Object {
  var index: java.lang.String
  var op_type: js.UndefOr[java.lang.String] = js.undefined
  var pipeline: js.UndefOr[java.lang.String] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var version_type: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IndexOptype {
  @scala.inline
  def apply(
    index: java.lang.String,
    op_type: java.lang.String = null,
    pipeline: java.lang.String = null,
    routing: java.lang.String = null,
    version_type: java.lang.String = null
  ): Anon_IndexOptype = {
    val __obj = js.Dynamic.literal(index = index)
    if (op_type != null) __obj.updateDynamic("op_type")(op_type)
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (version_type != null) __obj.updateDynamic("version_type")(version_type)
    __obj.asInstanceOf[Anon_IndexOptype]
  }
}

