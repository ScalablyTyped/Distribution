package typings.ethersprojectAbi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topics extends js.Object {
  var data: String
  var topics: js.Array[String]
}

object Topics {
  @scala.inline
  def apply(data: String, topics: js.Array[String]): Topics = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topics]
  }
}

