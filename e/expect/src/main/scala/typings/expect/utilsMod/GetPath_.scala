package typings.expect.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPath_ extends js.Object {
  var hasEndProp: js.UndefOr[Boolean] = js.undefined
  var lastTraversedObject: js.Any
  var traversedPath: js.Array[String]
  var value: js.UndefOr[js.Any] = js.undefined
}

object GetPath_ {
  @scala.inline
  def apply(
    lastTraversedObject: js.Any,
    traversedPath: js.Array[String],
    hasEndProp: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): GetPath_ = {
    val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
    if (!js.isUndefined(hasEndProp)) __obj.updateDynamic("hasEndProp")(hasEndProp.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPath_]
  }
}

