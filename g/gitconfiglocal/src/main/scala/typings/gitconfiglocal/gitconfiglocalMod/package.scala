package typings.gitconfiglocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gitconfiglocalMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.gitconfiglocal.gitconfiglocalBooleans.`false`
  import typings.std.Error

  type GitConfig = StringDictionary[js.Any]
  type callback = js.Function2[/* error */ Error | `false`, /* config */ GitConfig, Unit]
}
