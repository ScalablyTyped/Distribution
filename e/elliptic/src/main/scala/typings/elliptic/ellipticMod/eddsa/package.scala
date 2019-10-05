package typings.elliptic.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eddsa {
  import typings.elliptic.ellipticMod.curve.base.BasePoint
  import typings.node.Buffer

  type Bytes = String | Buffer
  type Point = BasePoint
}
