package typings.dynamodb.dynamoDBMod

import typings.dynamodb.dynamodbStrings.ALL
import typings.dynamodb.dynamodbStrings.INCLUDE
import typings.dynamodb.dynamodbStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var NonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.undefined
}

object Projection {
  @scala.inline
  def apply(
    NonKeyAttributes: js.Array[String] = null,
    ProjectionType: ALL | KEYS_ONLY | INCLUDE | String = null
  ): Projection = {
    val __obj = js.Dynamic.literal()
    if (NonKeyAttributes != null) __obj.updateDynamic("NonKeyAttributes")(NonKeyAttributes)
    if (ProjectionType != null) __obj.updateDynamic("ProjectionType")(ProjectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

