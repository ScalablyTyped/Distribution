package typings.dynogels.mod

import typings.awsSdk.clientsDynamodbMod.AttributeName
import typings.awsSdk.clientsDynamodbMod.AttributeNameList
import typings.awsSdk.clientsDynamodbMod.ConsistentRead
import typings.awsSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typings.awsSdk.clientsDynamodbMod.ProjectionExpression
import typings.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemOptions extends StObject {
  
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  
  var ConsistentRead: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ConsistentRead] = js.undefined
  
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  
  var ProjectionExpression: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ProjectionExpression] = js.undefined
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
}
object GetItemOptions {
  
  inline def apply(): GetItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetItemOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    inline def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
    
    inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
  }
}
