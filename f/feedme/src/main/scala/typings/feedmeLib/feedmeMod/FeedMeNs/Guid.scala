package typings
package feedmeLib.feedmeMod.FeedMeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guid extends js.Object {
  var ispermalink: java.lang.String
  var text: java.lang.String
}

object Guid {
  @scala.inline
  def apply(ispermalink: java.lang.String, text: java.lang.String): Guid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ispermalink")(ispermalink)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Guid]
  }
}

