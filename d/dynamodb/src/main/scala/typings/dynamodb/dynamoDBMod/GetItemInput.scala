package typings.dynamodb.dynamoDBMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetItemInput extends js.Object {
  
  var AttributesToGet: js.UndefOr[js.Array[String]] = js.native
  
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  
  var ExpressionAttributeNames: js.UndefOr[StringDictionary[String]] = js.native
  
  var Key: js.Object = js.native
  
  var ProjectionExpression: js.UndefOr[String] = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[String] = js.native
  
  var TableName: String = js.native
}
object GetItemInput {
  
  @scala.inline
  def apply(Key: js.Object, TableName: String): GetItemInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemInput]
  }
  
  @scala.inline
  implicit class GetItemInputOps[Self <: GetItemInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: js.Object): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToGetVarargs(value: String*): Self = this.set("AttributesToGet", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToGet(value: js.Array[String]): Self = this.set("AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToGet: Self = this.set("AttributesToGet", js.undefined)
    
    @scala.inline
    def setConsistentRead(value: Boolean): Self = this.set("ConsistentRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistentRead: Self = this.set("ConsistentRead", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: StringDictionary[String]): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setProjectionExpression(value: String): Self = this.set("ProjectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionExpression: Self = this.set("ProjectionExpression", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: String): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
  }
}
