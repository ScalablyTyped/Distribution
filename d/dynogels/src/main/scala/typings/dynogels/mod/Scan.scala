package typings.dynogels.mod

import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scan extends StObject {
  
  def addFilterCondition(condition: js.Any): Scan = js.native
  
  def attributes(attrs: js.Any): Scan = js.native
  
  def exec(): Readable = js.native
  def exec(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def expressionAttributeNames(data: js.Any): Scan = js.native
  
  def expressionAttributeValues(data: js.Any): Scan = js.native
  
  def filterExpression(expression: js.Any): Scan = js.native
  
  def limit(number: Double): Scan = js.native
  
  def loadAll(): Scan = js.native
  
  def projectionExpression(data: js.Any): Scan = js.native
  
  def returnConsumedCapacity(): Scan = js.native
  
  def segments(segment: js.Any, totalSegments: Double): Scan = js.native
  
  def select(value: js.Any): Scan = js.native
  
  def startKey(hashKey: js.Any): Scan = js.native
  def startKey(hashKey: js.Any, rangeKey: js.Any): Scan = js.native
  
  def where(keyName: String): ScanWhereChain = js.native
}
