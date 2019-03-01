package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: java.lang.String
  var data: js.Any
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: java.lang.String, data: js.Any, `type`: java.lang.String, url: java.lang.String): Anon_Accept = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Accept]
  }
}

