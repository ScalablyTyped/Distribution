package typings.googleapis

import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$ErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[js.Array[Schema$ErrorProto]] = js.native
  var index: js.UndefOr[Double] = js.native
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[Schema$ErrorProto] = null, index: Int | Double = null): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Errors]
  }
}

