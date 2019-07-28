package typings.flaggedDashRespawn

import typings.node.NodeJSNs.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object flaggedDashRespawnMod {
  type Callback = js.Function3[/* ready */ Boolean, /* proc */ Process, /* argv */ js.Array[String], Unit]
}
