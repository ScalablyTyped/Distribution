package typings.dotnetDepsParser.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependencies extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var `type`: String
}

object Dependencies {
  @scala.inline
  def apply(`type`: String, dependencies: StringDictionary[String] = null): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencies]
  }
}

