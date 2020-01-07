package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of html values.
  */
@js.native
trait Schema$HtmlValues extends js.Object {
  /**
    * The maximum allowable length for html values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$HtmlValues {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$HtmlValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HtmlValues]
  }
}

