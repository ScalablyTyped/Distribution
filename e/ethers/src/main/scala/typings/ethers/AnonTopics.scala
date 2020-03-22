package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTopics extends js.Object {
  var data: String
  var topics: js.Array[String]
}

object AnonTopics {
  @scala.inline
  def apply(data: String, topics: js.Array[String]): AnonTopics = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTopics]
  }
}

