package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of fields that make up a displayed line
  */
@js.native
trait Schema$ResultDisplayLine extends js.Object {
  var fields: js.UndefOr[js.Array[Schema$ResultDisplayField]] = js.native
}

object Schema$ResultDisplayLine {
  @scala.inline
  def apply(fields: js.Array[Schema$ResultDisplayField] = null): Schema$ResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultDisplayLine]
  }
}

