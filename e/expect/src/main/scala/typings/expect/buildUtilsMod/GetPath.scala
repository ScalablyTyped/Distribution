package typings.expect.buildUtilsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPath extends js.Object {
  var hasEndProp: js.UndefOr[Boolean] = js.undefined
  var lastTraversedObject: js.Any
  var traversedPath: js.Array[String]
  var value: js.UndefOr[js.Any] = js.undefined
}

object GetPath {
  @scala.inline
  def apply(
    lastTraversedObject: js.Any,
    traversedPath: js.Array[String],
    hasEndProp: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): GetPath = {
    val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
    if (!js.isUndefined(hasEndProp)) __obj.updateDynamic("hasEndProp")(hasEndProp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPath]
  }
}

@JSImport("expect/build/utils", "getPath")
@js.native
object getPath extends js.Object {
  def apply(`object`: Record[String, _], propertyPath: String): GetPath = js.native
  def apply(`object`: Record[String, _], propertyPath: js.Array[String]): GetPath = js.native
}

