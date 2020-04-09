package typings.gettextParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTextComment extends js.Object {
  var extracted: String
  var flag: String
  var previous: String
  var reference: String
  var translator: String
}

object GetTextComment {
  @scala.inline
  def apply(extracted: String, flag: String, previous: String, reference: String, translator: String): GetTextComment = {
    val __obj = js.Dynamic.literal(extracted = extracted.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTextComment]
  }
}

