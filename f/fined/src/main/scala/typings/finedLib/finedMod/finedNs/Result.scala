package typings
package finedLib.finedMod.finedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var extension: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var path: java.lang.String
}

object Result {
  @scala.inline
  def apply(
    extension: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String],
    path: java.lang.String
  ): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Result]
  }
}

