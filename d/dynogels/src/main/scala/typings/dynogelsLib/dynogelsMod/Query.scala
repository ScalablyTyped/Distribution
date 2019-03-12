package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def addFilterCondition(condition: js.Any): Query = js.native
  def addKeyCondition(condition: js.Any): Query = js.native
  def ascending(): Query = js.native
  def attributes(attrs: js.Any): Query = js.native
  def consistentRead(read: scala.Boolean): Query = js.native
  def descending(): Query = js.native
  def exec(): nodeLib.streamMod.Readable = js.native
  def exec(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def expressionAttributeNames(data: js.Any): Query = js.native
  def expressionAttributeValues(data: js.Any): Query = js.native
  def filter(keyName: java.lang.String): QueryFilterChain = js.native
  def filterExpression(expression: js.Any): Query = js.native
  def limit(number: scala.Double): Query = js.native
  def loadAll(): Query = js.native
  def projectionExpression(data: js.Any): Query = js.native
  def returnConsumedCapacity(value: js.Any): Query = js.native
  def select(value: js.Any): Query = js.native
  def startKey(hashKey: js.Any, rangeKey: js.Any): Query = js.native
  def usingIndex(name: java.lang.String): Query = js.native
  def where(keyName: java.lang.String): QueryWhereChain = js.native
}

