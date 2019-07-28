package typings.gitconfiglocal

import org.scalablytyped.runtime.StringDictionary
import typings.gitconfiglocal.gitconfiglocalNumbers.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gitconfiglocalMod {
  type GitConfig = StringDictionary[js.Any]
  type callback = js.Function2[/* error */ Error | `false`, /* config */ GitConfig, Unit]
}
