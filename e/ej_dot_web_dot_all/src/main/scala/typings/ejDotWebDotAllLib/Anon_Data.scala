package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var url: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, url: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Data]
  }
}

