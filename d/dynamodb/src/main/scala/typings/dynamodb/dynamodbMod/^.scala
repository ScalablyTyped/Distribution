package typings.dynamodb.dynamodbMod

import org.scalablytyped.runtime.Instantiable1
import typings.dynamodb.TypeofModel
import typings.dynamodb.dynamoDBMod.DocumentClient
import typings.dynamodb.dynamoDBMod.DynamoDB
import typings.dynamodb.dynamoDBMod.DynamoDbSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AWS: js.Any = js.native
  val createTables: CreateTables = js.native
  val log: typings.bunyan.bunyanMod.^ = js.native
  def Set(data: js.Array[_], `type`: String): DynamoDbSet = js.native
  def define(name: String, config: DefineConfig): (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) with TypeofModel = js.native
  def documentClient(): DocumentClient = js.native
  def documentClient(docClient: DocumentClient): DocumentClient = js.native
  def dynamoDriver(): DynamoDB = js.native
  def dynamoDriver(driver: DynamoDB): DynamoDB = js.native
  def model(name: String): (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) with TypeofModel = js.native
  def model(name: String, model: typings.dynamodb.modelMod.Model): (Instantiable1[/* attrs */ js.Any, typings.dynamodb.modelMod.Model]) with TypeofModel = js.native
  def reset(): Unit = js.native
}

