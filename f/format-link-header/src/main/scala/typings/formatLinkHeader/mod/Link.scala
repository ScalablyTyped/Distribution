package typings.formatLinkHeader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends /* queryParam */ StringDictionary[String] {
  var rel: String
  var url: String
}

object Link {
  @scala.inline
  def apply(rel: String, url: String, StringDictionary: /* name */ StringDictionary[String] = null): Link = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Link]
  }
}

