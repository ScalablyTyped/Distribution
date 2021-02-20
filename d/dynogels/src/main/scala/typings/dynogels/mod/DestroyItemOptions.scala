package typings.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.dynamodbMod.ConditionExpression
import typings.awsSdk.dynamodbMod.ConditionalOperator
import typings.awsSdk.dynamodbMod.ExpectedAttributeMap
import typings.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typings.awsSdk.dynamodbMod.ReturnConsumedCapacity
import typings.awsSdk.dynamodbMod.ReturnItemCollectionMetrics
import typings.awsSdk.dynamodbMod.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestroyItemOptions extends StObject {
  
  var ConditionExpression: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionExpression] = js.native
  
  var ConditionalOperator: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionalOperator] = js.native
  
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
  
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  
  var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.native
  
  var ReturnValues: js.UndefOr[ReturnValue] = js.native
}
object DestroyItemOptions {
  
  @scala.inline
  def apply(): DestroyItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyItemOptions]
  }
  
  @scala.inline
  implicit class DestroyItemOptionsMutableBuilder[Self <: DestroyItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
    
    @scala.inline
    def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    
    @scala.inline
    def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
  }
}
