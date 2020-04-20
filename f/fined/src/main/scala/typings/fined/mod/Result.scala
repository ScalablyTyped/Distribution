package typings.fined.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var extension: String | StringDictionary[String]
  var path: String
}

object Result {
  @scala.inline
  def apply(extension: String | StringDictionary[String], path: String): Result = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

