package typings
package fullpageDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  var fullpage: FullPageJs
}

object JQuery {
  @scala.inline
  def apply(fullpage: FullPageJs): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullpage")(fullpage)
    __obj.asInstanceOf[JQuery]
  }
}

