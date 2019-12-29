package typings.dynamodb

import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.executeFilterMod.ExecuteFilter
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  @js.native
  trait Query extends js.Object {
    @JSName("exec")
    var exec_Original: ExecuteFilter = js.native
    def apply(hashKey: String, table: js.Any, serializer: js.Any): Unit = js.native
    def addFilterCondition(condition: Anon_AttributeNames): Query = js.native
    def addKeyCondition(condition: Anon_AttributeNames): Query = js.native
    def ascending(): Query = js.native
    def attributes(attrs: String): Query = js.native
    def attributes(attrs: js.Array[String]): Query = js.native
    def beginsWith(args: js.Any*): Query = js.native
    def between(args: js.Any*): Query = js.native
    def buildKey(): String = js.native
    def buildRequest(): js.Any = js.native
    def consistentRead(read: Boolean): Query = js.native
    def contains(name: String): Query = js.native
    def descending(): Query = js.native
    def eq(args: js.Any*): Query = js.native
    def equals(args: js.Any*): Query = js.native
    def exec(): Readable = js.native
    def exec(callback: Callback): Unit = js.native
    def expressionAttributeNames(data: js.Any): Query = js.native
    def expressionAttributeValues(data: js.Any): Query = js.native
    def filter(keyName: String): Query = js.native
    def filterExpression(expression: js.Any): Query = js.native
    def gt(args: js.Any*): Query = js.native
    def gte(args: js.Any*): Query = js.native
    def limit(num: Double): Query = js.native
    def loadAll(): Query = js.native
    def lt(args: js.Any*): Query = js.native
    def lte(args: js.Any*): Query = js.native
    def notContains(name: String): Query = js.native
    def projectionExpression(data: js.Any): Query = js.native
    def returnConsumedCapacity(): Query = js.native
    def returnConsumedCapacity(value: String): Query = js.native
    def select(value: String): Query = js.native
    def startKey(hashKey: String, rangeKey: String): Query = js.native
    def usingIndex(name: String): Query = js.native
    def where(keyName: String): Query = js.native
  }
  
}

