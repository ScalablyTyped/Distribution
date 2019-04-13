package typings
package gitconfiglocalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gitconfiglocalMod {
  type GitConfig = org.scalablytyped.runtime.StringDictionary[js.Any]
  type callback = js.Function2[
    /* error */ stdLib.Error | gitconfiglocalLib.gitconfiglocalLibNumbers.`false`, 
    /* config */ GitConfig, 
    scala.Unit
  ]
}
