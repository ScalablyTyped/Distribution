package typings.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributeNames extends js.Object {
  var attributeNames: js.Any
  var attributeValues: js.Any
}

object AnonAttributeNames {
  @scala.inline
  def apply(attributeNames: js.Any, attributeValues: js.Any): AnonAttributeNames = {
    val __obj = js.Dynamic.literal(attributeNames = attributeNames.asInstanceOf[js.Any], attributeValues = attributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeNames]
  }
}

