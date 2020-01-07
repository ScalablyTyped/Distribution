package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of text values.
  */
@js.native
trait Schema$TextValues extends js.Object {
  /**
    * The maximum allowable length for text values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TextValues {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$TextValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextValues]
  }
}

