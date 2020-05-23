package typings.dynamodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeNames extends js.Object {
  var attributeNames: js.Any
  var attributeValues: js.Any
}

object AttributeNames {
  @scala.inline
  def apply(attributeNames: js.Any, attributeValues: js.Any): AttributeNames = {
    val __obj = js.Dynamic.literal(attributeNames = attributeNames.asInstanceOf[js.Any], attributeValues = attributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNames]
  }
}

