package typings
package dynamodbLib.scanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scan extends js.Object {
  @JSName("exec")
  var exec_Original: dynamodbLib.executeFilterMod.ExecuteFilter = js.native
  def addFilterCondition(condition: dynamodbLib.Anon_AttributeNames): Scan = js.native
  def attributes(attrs: java.lang.String): Scan = js.native
  def attributes(attrs: js.Array[java.lang.String]): Scan = js.native
  def beginsWith(name: java.lang.String): Scan = js.native
  def between(start: java.lang.String, end: java.lang.String): Scan = js.native
  def buildRequest(): js.Any = js.native
  def contains(name: java.lang.String): Scan = js.native
  def eq(args: js.Any*): Scan = js.native
  def equals(args: js.Any*): Scan = js.native
  def exec(): nodeLib.streamMod.Readable = js.native
  def exec(callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def expressionAttributeNames(data: js.Any): Scan = js.native
  def expressionAttributeValues(data: js.Any): Scan = js.native
  def filterExpression(expression: js.Any): Scan = js.native
  def gt(args: js.Any*): Scan = js.native
  def gte(args: js.Any*): Scan = js.native
  def in(args: js.Any*): Scan = js.native
  def limit(num: scala.Double): Scan = js.native
  def loadAll(): Scan = js.native
  def lt(args: js.Any*): Scan = js.native
  def lte(args: js.Any*): Scan = js.native
  def ne(args: js.Any*): Scan = js.native
  def notContains(name: java.lang.String): Scan = js.native
  def notNull(): Scan = js.native
  def `null`(): Scan = js.native
  def projectionExpression(data: js.Any): Scan = js.native
  def returnConsumedCapacity(): Scan = js.native
  def returnConsumedCapacity(value: java.lang.String): Scan = js.native
  def segments(segment: js.Any, totalSegments: js.Any): Scan = js.native
  def select(value: java.lang.String): Scan = js.native
  def startKey(hashKey: java.lang.String): Scan = js.native
  def startKey(hashKey: java.lang.String, rangeKey: java.lang.String): Scan = js.native
  def where(keyName: java.lang.String): Scan = js.native
}

