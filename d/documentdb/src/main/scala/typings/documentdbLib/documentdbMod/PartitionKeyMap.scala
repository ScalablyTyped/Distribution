package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionKeyMap extends js.Object {
  var link: java.lang.String
  var range: Range
}

object PartitionKeyMap {
  @scala.inline
  def apply(link: java.lang.String, range: Range): PartitionKeyMap = {
    val __obj = js.Dynamic.literal(link = link, range = range)
  
    __obj.asInstanceOf[PartitionKeyMap]
  }
}

