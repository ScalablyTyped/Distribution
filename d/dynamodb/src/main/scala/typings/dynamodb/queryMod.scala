package typings.dynamodb

import typings.dynamodb.anon.AttributeNames
import typings.dynamodb.callbackMod.Callback
import typings.dynamodb.executeFilterMod.ExecuteFilter
import typings.dynamodb.executeFilterMod.PromisedReadable
import typings.dynamodb.modelMod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @js.native
  trait Query[T] extends StObject {
    
    def apply(hashKey: String, table: Any, serializer: Any): Unit = js.native
    
    def addFilterCondition(condition: AttributeNames): Query[T] = js.native
    
    def addKeyCondition(condition: AttributeNames): Query[T] = js.native
    
    def ascending(): Query[T] = js.native
    
    def attributes(attrs: String): Query[T] = js.native
    def attributes(attrs: js.Array[String]): Query[T] = js.native
    
    def beginsWith(args: Any*): Query[T] = js.native
    
    def between(args: Any*): Query[T] = js.native
    
    def buildKey(): String = js.native
    
    def buildRequest(): Any = js.native
    
    def consistentRead(read: Boolean): Query[T] = js.native
    
    def contains(name: String): Query[T] = js.native
    
    def descending(): Query[T] = js.native
    
    def eq(args: Any*): Query[T] = js.native
    
    def equals(args: Any*): Query[T] = js.native
    
    def exec(): PromisedReadable[Page[T]] = js.native
    def exec(callback: Callback[Page[T]]): Unit = js.native
    @JSName("exec")
    var exec_Original: ExecuteFilter[Page[T]] = js.native
    
    def exists(): Query[T] = js.native
    def exists(exists: Boolean): Query[T] = js.native
    
    def expressionAttributeNames(data: Any): Query[T] = js.native
    
    def expressionAttributeValues(data: Any): Query[T] = js.native
    
    def filter(keyName: String): Query[T] = js.native
    
    def filterExpression(expression: Any): Query[T] = js.native
    
    def gt(args: Any*): Query[T] = js.native
    
    def gte(args: Any*): Query[T] = js.native
    
    def limit(num: Double): Query[T] = js.native
    
    def loadAll(): Query[T] = js.native
    
    def lt(args: Any*): Query[T] = js.native
    
    def lte(args: Any*): Query[T] = js.native
    
    def notContains(name: String): Query[T] = js.native
    
    def projectionExpression(data: Any): Query[T] = js.native
    
    def returnConsumedCapacity(): Query[T] = js.native
    def returnConsumedCapacity(value: String): Query[T] = js.native
    
    def select(value: String): Query[T] = js.native
    
    def startKey(hashKey: String, rangeKey: String): Query[T] = js.native
    
    def usingIndex(name: String): Query[T] = js.native
    
    def where(keyName: String): Query[T] = js.native
  }
}
