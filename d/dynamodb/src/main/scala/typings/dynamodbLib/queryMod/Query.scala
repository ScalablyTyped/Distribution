package typings
package dynamodbLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  @JSName("exec")
  var exec_Original: dynamodbLib.executeFilterMod.ExecuteFilter = js.native
  def apply(hashKey: java.lang.String, table: js.Any, serializer: js.Any): scala.Unit = js.native
  def addFilterCondition(condition: dynamodbLib.Anon_AttributeNames): Query = js.native
  def addKeyCondition(condition: dynamodbLib.Anon_AttributeNames): Query = js.native
  def ascending(): Query = js.native
  def attributes(attrs: java.lang.String): Query = js.native
  def attributes(attrs: js.Array[java.lang.String]): Query = js.native
  def beginsWith(args: js.Any*): Query = js.native
  def between(args: js.Any*): Query = js.native
  def buildKey(): java.lang.String = js.native
  def buildRequest(): js.Any = js.native
  def consistentRead(read: scala.Boolean): Query = js.native
  def contains(name: java.lang.String): Query = js.native
  def descending(): Query = js.native
  def eq(args: js.Any*): Query = js.native
  def equals(args: js.Any*): Query = js.native
  def exec(): nodeLib.streamMod.Readable = js.native
  def exec(callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def expressionAttributeNames(data: js.Any): Query = js.native
  def expressionAttributeValues(data: js.Any): Query = js.native
  def filter(keyName: java.lang.String): Query = js.native
  def filterExpression(expression: js.Any): Query = js.native
  def gt(args: js.Any*): Query = js.native
  def gte(args: js.Any*): Query = js.native
  def limit(num: scala.Double): Query = js.native
  def loadAll(): Query = js.native
  def lt(args: js.Any*): Query = js.native
  def lte(args: js.Any*): Query = js.native
  def notContains(name: java.lang.String): Query = js.native
  def projectionExpression(data: js.Any): Query = js.native
  def returnConsumedCapacity(): Query = js.native
  def returnConsumedCapacity(value: java.lang.String): Query = js.native
  def select(value: java.lang.String): Query = js.native
  def startKey(hashKey: java.lang.String, rangeKey: java.lang.String): Query = js.native
  def usingIndex(name: java.lang.String): Query = js.native
  def where(keyName: java.lang.String): Query = js.native
}

