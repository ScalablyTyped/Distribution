package typings.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomParser extends js.Object {
  def parseFromString(html: String): Dom
}

object DomParser {
  @scala.inline
  def apply(parseFromString: String => Dom): DomParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction1(parseFromString))
  
    __obj.asInstanceOf[DomParser]
  }
}

