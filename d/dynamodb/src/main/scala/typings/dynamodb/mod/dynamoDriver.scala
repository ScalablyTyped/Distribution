package typings.dynamodb.mod

import typings.dynamodb.dynamoDBMod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", "dynamoDriver")
@js.native
object dynamoDriver extends js.Object {
  def apply(): DynamoDB = js.native
  def apply(driver: DynamoDB): DynamoDB = js.native
}

