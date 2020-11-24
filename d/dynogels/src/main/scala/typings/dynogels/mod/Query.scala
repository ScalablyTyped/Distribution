package typings.dynogels.mod

import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  def addFilterCondition(condition: js.Any): Query = js.native
  
  def addKeyCondition(condition: js.Any): Query = js.native
  
  def ascending(): Query = js.native
  
  def attributes(attrs: js.Any): Query = js.native
  
  def consistentRead(read: Boolean): Query = js.native
  
  def descending(): Query = js.native
  
  def exec(): Readable = js.native
  def exec(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def expressionAttributeNames(data: js.Any): Query = js.native
  
  def expressionAttributeValues(data: js.Any): Query = js.native
  
  def filter(keyName: String): QueryFilterChain = js.native
  
  def filterExpression(expression: js.Any): Query = js.native
  
  def limit(number: Double): Query = js.native
  
  def loadAll(): Query = js.native
  
  def projectionExpression(data: js.Any): Query = js.native
  
  def returnConsumedCapacity(value: js.Any): Query = js.native
  
  def select(value: js.Any): Query = js.native
  
  def startKey(hashKey: js.Any): Query = js.native
  def startKey(hashKey: js.Any, rangeKey: js.Any): Query = js.native
  
  def usingIndex(name: String): Query = js.native
  
  def where(keyName: String): QueryWhereChain = js.native
}
