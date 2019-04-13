package typings
package flaggedDashRespawnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object flaggedDashRespawnMod {
  type Callback = js.Function3[
    /* ready */ scala.Boolean, 
    /* proc */ nodeLib.NodeJSNs.Process, 
    /* argv */ js.Array[java.lang.String], 
    scala.Unit
  ]
}
