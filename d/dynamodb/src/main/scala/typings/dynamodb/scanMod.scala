package typings.dynamodb

import typings.dynamodb.anon.AttributeNames
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.executeFilterMod.ExecuteFilter
import typings.dynamodb.executeFilterMod.PromisedReadable
import typings.dynamodb.modelMod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanMod {
  
  type ParallelScan[T] = Scan[T]
  
  @js.native
  trait Scan[T] extends StObject {
    
    def addFilterCondition(condition: AttributeNames): Scan[T] = js.native
    
    def attributes(attrs: String): Scan[T] = js.native
    def attributes(attrs: js.Array[String]): Scan[T] = js.native
    
    def beginsWith(name: String): Scan[T] = js.native
    
    def between(start: String, end: String): Scan[T] = js.native
    
    def buildRequest(): Any = js.native
    
    def contains(name: String): Scan[T] = js.native
    
    def eq(args: Any*): Scan[T] = js.native
    
    def equals(args: Any*): Scan[T] = js.native
    
    def exec(): PromisedReadable[Page[T]] = js.native
    def exec(callback: Callback[Page[T]]): Unit = js.native
    @JSName("exec")
    var exec_Original: ExecuteFilter[Page[T]] = js.native
    
    def expressionAttributeNames(data: Any): Scan[T] = js.native
    
    def expressionAttributeValues(data: Any): Scan[T] = js.native
    
    def filterExpression(expression: Any): Scan[T] = js.native
    
    def gt(args: Any*): Scan[T] = js.native
    
    def gte(args: Any*): Scan[T] = js.native
    
    def in(args: Any*): Scan[T] = js.native
    
    def limit(num: Double): Scan[T] = js.native
    
    def loadAll(): Scan[T] = js.native
    
    def lt(args: Any*): Scan[T] = js.native
    
    def lte(args: Any*): Scan[T] = js.native
    
    def ne(args: Any*): Scan[T] = js.native
    
    def notContains(name: String): Scan[T] = js.native
    
    def notNull(): Scan[T] = js.native
    
    def `null`(): Scan[T] = js.native
    
    def projectionExpression(data: Any): Scan[T] = js.native
    
    def returnConsumedCapacity(): Scan[T] = js.native
    def returnConsumedCapacity(value: String): Scan[T] = js.native
    
    def segments(segment: Any, totalSegments: Any): Scan[T] = js.native
    
    def select(value: String): Scan[T] = js.native
    
    def startKey(hashKey: String): Scan[T] = js.native
    def startKey(hashKey: String, rangeKey: String): Scan[T] = js.native
    
    def where(keyName: String): Scan[T] = js.native
  }
}
