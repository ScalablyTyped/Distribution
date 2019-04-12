package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOutSuggestion extends js.Object {
  var destinationName: java.lang.String
  var uri: java.lang.String
}

object LinkOutSuggestion {
  @scala.inline
  def apply(destinationName: java.lang.String, uri: java.lang.String): LinkOutSuggestion = {
    val __obj = js.Dynamic.literal(destinationName = destinationName, uri = uri)
  
    __obj.asInstanceOf[LinkOutSuggestion]
  }
}

