package typings.dynogels.mod

import typings.dynogels.mod.AWS.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelConfig extends js.Object {
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
  implicit class ModelConfigOps[Self <: ModelConfig] (val x: Self) extends AnyVal {
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
    def setDocClient(value: js.Any): Self = this.set("docClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocClient: Self = this.set("docClient", js.undefined)
    @scala.inline
    def setDynamodb(value: DynamoDB): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
  
}

