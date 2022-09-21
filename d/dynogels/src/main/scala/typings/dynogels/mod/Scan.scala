package typings.dynogels.mod

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scan extends StObject {
  
  def addFilterCondition(condition: Any): Scan = js.native
  
  def attributes(attrs: Any): Scan = js.native
  
  def exec(): Readable = js.native
  def exec(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
  
  def expressionAttributeNames(data: Any): Scan = js.native
  
  def expressionAttributeValues(data: Any): Scan = js.native
  
  def filterExpression(expression: Any): Scan = js.native
  
  def limit(number: Double): Scan = js.native
  
  def loadAll(): Scan = js.native
  
  def projectionExpression(data: Any): Scan = js.native
  
  def returnConsumedCapacity(): Scan = js.native
  
  def segments(segment: Any, totalSegments: Double): Scan = js.native
  
  def select(value: Any): Scan = js.native
  
  def startKey(hashKey: Any): Scan = js.native
  def startKey(hashKey: Any, rangeKey: Any): Scan = js.native
  
  def where(keyName: String): ScanWhereChain = js.native
}
