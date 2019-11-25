package typings.dynamodb.dynamoDBMod

import typings.dynamodb.dynamodbStrings.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinarySet extends DynamoDbSet {
  var `type`: Binary
  var values: js.Array[binaryType]
}

object BinarySet {
  @scala.inline
  def apply(`type`: Binary, values: js.Array[binaryType]): BinarySet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySet]
  }
}

