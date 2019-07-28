package typings.fuzzaldrinDashPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var maxInners: js.UndefOr[Double] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: String = null, maxInners: Int | Double = null, maxResults: Int | Double = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxInners != null) __obj.updateDynamic("maxInners")(maxInners.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

