package typings
package detoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DetoxNs {
  type DetoxAny = Element with Actions[_] with WaitFor
  type Direction = detoxLib.detoxLibStrings.left | detoxLib.detoxLibStrings.right | detoxLib.detoxLibStrings.top | detoxLib.detoxLibStrings.bottom | detoxLib.detoxLibStrings.up | detoxLib.detoxLibStrings.down
  type Orientation = detoxLib.detoxLibStrings.portrait | detoxLib.detoxLibStrings.landscape
  type Speed = detoxLib.detoxLibStrings.fast | detoxLib.detoxLibStrings.slow
}
