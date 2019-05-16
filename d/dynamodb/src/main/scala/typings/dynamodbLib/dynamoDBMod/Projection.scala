package typings
package dynamodbLib.dynamoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var NonKeyAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ProjectionType: js.UndefOr[
    dynamodbLib.dynamodbLibStrings.ALL | dynamodbLib.dynamodbLibStrings.KEYS_ONLY | dynamodbLib.dynamodbLibStrings.INCLUDE | java.lang.String
  ] = js.undefined
}

object Projection {
  @scala.inline
  def apply(
    NonKeyAttributes: js.Array[java.lang.String] = null,
    ProjectionType: dynamodbLib.dynamodbLibStrings.ALL | dynamodbLib.dynamodbLibStrings.KEYS_ONLY | dynamodbLib.dynamodbLibStrings.INCLUDE | java.lang.String = null
  ): Projection = {
    val __obj = js.Dynamic.literal()
    if (NonKeyAttributes != null) __obj.updateDynamic("NonKeyAttributes")(NonKeyAttributes)
    if (ProjectionType != null) __obj.updateDynamic("ProjectionType")(ProjectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

