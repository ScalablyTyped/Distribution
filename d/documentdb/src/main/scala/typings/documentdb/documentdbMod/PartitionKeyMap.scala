package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionKeyMap extends js.Object {
  var link: String
  var range: Range
}

object PartitionKeyMap {
  @scala.inline
  def apply(link: String, range: Range): PartitionKeyMap = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PartitionKeyMap]
  }
}

