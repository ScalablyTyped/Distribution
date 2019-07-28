package typings.dotenvDashExpand.dotenvDashExpandMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvResult extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
}

object DotenvResult {
  @scala.inline
  def apply(error: Error = null, parsed: StringDictionary[String] = null): DotenvResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[DotenvResult]
  }
}

