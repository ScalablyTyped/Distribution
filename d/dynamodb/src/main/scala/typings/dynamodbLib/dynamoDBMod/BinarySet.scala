package typings
package dynamodbLib.dynamoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinarySet extends DynamoDbSet {
  var `type`: dynamodbLib.dynamodbLibStrings.Binary
  var values: js.Array[binaryType]
}

object BinarySet {
  @scala.inline
  def apply(`type`: dynamodbLib.dynamodbLibStrings.Binary, values: js.Array[binaryType]): BinarySet = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BinarySet]
  }
}

