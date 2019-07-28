package typings.dynogels.dynogelsMod

import org.scalablytyped.runtime.StringDictionary
import typings.dynogels.dynogelsMod.AWSNs.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var log: Log = js.native
  def Set(args: js.Any*): js.Any = js.native
  def createTables(callback: js.Function1[/* err */ String, Unit]): Unit = js.native
  def createTables(options: StringDictionary[CreateTablesOptions], callback: js.Function1[/* err */ String, Unit]): Unit = js.native
  def createTables(options: DynogelsGlobalOptions, callback: js.Function1[/* err */ String, Unit]): Unit = js.native
  def define(modelName: String, config: ModelConfiguration): Model = js.native
  def dynamoDriver(dynamoDB: DynamoDB): DynamoDB = js.native
  def reset(): Unit = js.native
}

