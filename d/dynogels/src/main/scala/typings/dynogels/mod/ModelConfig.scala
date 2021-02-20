package typings.dynogels.mod

import typings.dynogels.mod.AWS.DynamoDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelConfig extends StObject {
  
  var docClient: js.UndefOr[js.Any] = js.native
  
  var dynamodb: js.UndefOr[DynamoDB] = js.native
  
  var tableName: js.UndefOr[String] = js.native
}
object ModelConfig {
  
  @scala.inline
  def apply(): ModelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelConfig]
  }
  
  @scala.inline
  implicit class ModelConfigMutableBuilder[Self <: ModelConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocClient(value: js.Any): Self = StObject.set(x, "docClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocClientUndefined: Self = StObject.set(x, "docClient", js.undefined)
    
    @scala.inline
    def setDynamodb(value: DynamoDB): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
