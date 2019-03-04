package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetResponse extends js.Object {
  var responses: js.Array[PersonResponse]
}

object BatchGetResponse {
  @scala.inline
  def apply(responses: js.Array[PersonResponse]): BatchGetResponse = {
    val __obj = js.Dynamic.literal(responses = responses)
  
    __obj.asInstanceOf[BatchGetResponse]
  }
}

