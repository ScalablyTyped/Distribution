package typings
package feedparserLib.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var title: java.lang.String
  var url: java.lang.String
}

object Image {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): Image = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[Image]
  }
}

