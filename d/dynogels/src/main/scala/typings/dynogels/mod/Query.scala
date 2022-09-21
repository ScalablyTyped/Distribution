package typings.dynogels.mod

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def addFilterCondition(condition: Any): Query = js.native
  
  def addKeyCondition(condition: Any): Query = js.native
  
  def ascending(): Query = js.native
  
  def attributes(attrs: Any): Query = js.native
  
  def consistentRead(read: Boolean): Query = js.native
  
  def descending(): Query = js.native
  
  def exec(): Readable = js.native
  def exec(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  def expressionAttributeNames(data: Any): Query = js.native
  
  def expressionAttributeValues(data: Any): Query = js.native
  
  def filter(keyName: String): QueryFilterChain = js.native
  
  def filterExpression(expression: Any): Query = js.native
  
  def limit(number: Double): Query = js.native
  
  def loadAll(): Query = js.native
  
  def projectionExpression(data: Any): Query = js.native
  
  def returnConsumedCapacity(value: Any): Query = js.native
  
  def select(value: Any): Query = js.native
  
  def startKey(hashKey: Any): Query = js.native
  def startKey(hashKey: Any, rangeKey: Any): Query = js.native
  
  def usingIndex(name: String): Query = js.native
  
  def where(keyName: String): QueryWhereChain = js.native
}
