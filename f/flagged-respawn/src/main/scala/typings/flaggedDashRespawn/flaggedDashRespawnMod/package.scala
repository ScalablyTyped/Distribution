package typings.flaggedDashRespawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object flaggedDashRespawnMod {
  import typings.node.NodeJSNs.Process

  type Callback = js.Function3[/* ready */ Boolean, /* proc */ Process, /* argv */ js.Array[String], Unit]
}
