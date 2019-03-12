package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scan extends js.Object {
  def addFilterCondition(condition: js.Any): Scan = js.native
  def attributes(attrs: js.Any): Scan = js.native
  def exec(): nodeLib.streamMod.Readable = js.native
  def exec(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def expressionAttributeNames(data: js.Any): Scan = js.native
  def expressionAttributeValues(data: js.Any): Scan = js.native
  def filterExpression(expression: js.Any): Scan = js.native
  def limit(number: scala.Double): Scan = js.native
  def loadAll(): Scan = js.native
  def projectionExpression(data: js.Any): Scan = js.native
  def returnConsumedCapacity(): Scan = js.native
  def segments(segment: js.Any, totalSegments: scala.Double): Scan = js.native
  def select(value: js.Any): Scan = js.native
  def startKey(hashKey: js.Any): Scan = js.native
  def startKey(hashKey: js.Any, rangeKey: js.Any): Scan = js.native
  def where(keyName: java.lang.String): ScanWhereChain = js.native
}

