package typings
package gitconfiglocalLib.gitconfiglocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gitconfigNs {
  type callback = js.Function2[
    /* error */ stdLib.Error | gitconfiglocalLib.gitconfiglocalLibNumbers.`false`, 
    /* config */ GitConfig, 
    scala.Unit
  ]
}
