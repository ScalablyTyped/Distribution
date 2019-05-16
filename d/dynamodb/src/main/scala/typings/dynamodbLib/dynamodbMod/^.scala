package typings
package dynamodbLib.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AWS: js.Any = js.native
  val createTables: CreateTables = js.native
  val log: bunyanLib.bunyanMod.^ = js.native
  def Set(data: js.Array[_], `type`: java.lang.String): dynamodbLib.dynamoDBMod.DynamoDbSet = js.native
  def define(name: java.lang.String, config: DefineConfig): (org.scalablytyped.runtime.Instantiable1[/* attrs */ js.Any, dynamodbLib.modelMod.Model]) with dynamodbLib.Anon_After = js.native
  def documentClient(): dynamodbLib.dynamoDBMod.DocumentClient = js.native
  def documentClient(docClient: dynamodbLib.dynamoDBMod.DocumentClient): dynamodbLib.dynamoDBMod.DocumentClient = js.native
  def dynamoDriver(): dynamodbLib.dynamoDBMod.DynamoDB = js.native
  def dynamoDriver(driver: dynamodbLib.dynamoDBMod.DynamoDB): dynamodbLib.dynamoDBMod.DynamoDB = js.native
  def model(name: java.lang.String): (org.scalablytyped.runtime.Instantiable1[/* attrs */ js.Any, dynamodbLib.modelMod.Model]) with dynamodbLib.Anon_After = js.native
  def model(name: java.lang.String, model: dynamodbLib.modelMod.Model): (org.scalablytyped.runtime.Instantiable1[/* attrs */ js.Any, dynamodbLib.modelMod.Model]) with dynamodbLib.Anon_After = js.native
  def reset(): scala.Unit = js.native
}

