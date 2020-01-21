package typings.gapiPeople.gapi.client.people.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetResponse extends js.Object {
  var responses: js.Array[PersonResponse]
}

object BatchGetResponse {
  @scala.inline
  def apply(responses: js.Array[PersonResponse]): BatchGetResponse = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetResponse]
  }
}

