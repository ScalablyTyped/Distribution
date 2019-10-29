package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTopics extends js.Object {
  var data: String
  var topics: js.Array[String]
}

object Anon_DataTopics {
  @scala.inline
  def apply(data: String, topics: js.Array[String]): Anon_DataTopics = {
    val __obj = js.Dynamic.literal(data = data, topics = topics)
  
    __obj.asInstanceOf[Anon_DataTopics]
  }
}

