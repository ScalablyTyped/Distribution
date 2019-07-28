package typings.dynamodb.dynamoDBMod

import typings.dynamodb.dynamodbStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSet extends DynamoDbSet {
  var `type`: Number
  var values: js.Array[Double]
}

object NumberSet {
  @scala.inline
  def apply(`type`: Number, values: js.Array[Double]): NumberSet = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberSet]
  }
}

