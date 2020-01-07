package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an import request.
  */
@js.native
trait Schema$Import extends js.Object {
  /**
    * Type name: a template for an import request.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of rows received from the import request.
    */
  var numRowsReceived: js.UndefOr[String] = js.native
}

object Schema$Import {
  @scala.inline
  def apply(kind: String = null, numRowsReceived: String = null): Schema$Import = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numRowsReceived != null) __obj.updateDynamic("numRowsReceived")(numRowsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Import]
  }
}

