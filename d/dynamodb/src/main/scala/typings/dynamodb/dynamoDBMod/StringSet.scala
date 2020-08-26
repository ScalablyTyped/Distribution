package typings.dynamodb.dynamoDBMod

import typings.dynamodb.dynamodbStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSet extends DynamoDbSet {
  var `type`: String = js.native
  var values: js.Array[java.lang.String] = js.native
}

object StringSet {
  @scala.inline
  def apply(`type`: String, values: js.Array[java.lang.String]): StringSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringSet]
  }
  @scala.inline
  implicit class StringSetOps[Self <: StringSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: java.lang.String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[java.lang.String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

