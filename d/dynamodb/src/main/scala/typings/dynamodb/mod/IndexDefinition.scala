package typings.dynamodb.mod

import typings.dynamodb.dynamoDBMod.Projection
import typings.dynamodb.dynamodbStrings.global
import typings.dynamodb.dynamodbStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDefinition extends js.Object {
  var hashKey: String = js.native
  var name: String = js.native
  var projection: js.UndefOr[Projection] = js.native
  var rangeKey: js.UndefOr[String] = js.native
  var `type`: local | global = js.native
}

object IndexDefinition {
  @scala.inline
  def apply(hashKey: String, name: String, `type`: local | global): IndexDefinition = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDefinition]
  }
  @scala.inline
  implicit class IndexDefinitionOps[Self <: IndexDefinition] (val x: Self) extends AnyVal {
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
    def setHashKey(value: String): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: local | global): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRangeKey(value: String): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKey: Self = this.set("rangeKey", js.undefined)
  }
  
}

