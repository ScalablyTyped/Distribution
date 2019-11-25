package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var makeRequestParams: js.UndefOr[js.Object] = js.undefined
  var sendMethod: js.UndefOr[String] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(makeRequestParams: js.Object = null, sendMethod: String = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (makeRequestParams != null) __obj.updateDynamic("makeRequestParams")(makeRequestParams.asInstanceOf[js.Any])
    if (sendMethod != null) __obj.updateDynamic("sendMethod")(sendMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

