package typings
package dynamodbLib.dynamoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringSet extends DynamoDbSet {
  var `type`: dynamodbLib.dynamodbLibStrings.String
  var values: js.Array[java.lang.String]
}

object StringSet {
  @scala.inline
  def apply(`type`: dynamodbLib.dynamodbLibStrings.String, values: js.Array[java.lang.String]): StringSet = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringSet]
  }
}

