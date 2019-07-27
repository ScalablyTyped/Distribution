package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var log: Log = js.native
  def Set(args: js.Any*): js.Any = js.native
  def createTables(callback: js.Function1[/* err */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def createTables(options: DynogelsGlobalOptions, callback: js.Function1[/* err */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def createTables(
    options: org.scalablytyped.runtime.StringDictionary[CreateTablesOptions],
    callback: js.Function1[/* err */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def define(modelName: java.lang.String, config: ModelConfiguration): Model = js.native
  def dynamoDriver(
    dynamoDB: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB */ js.Any
  ): js.Any = js.native
  def reset(): scala.Unit = js.native
}

