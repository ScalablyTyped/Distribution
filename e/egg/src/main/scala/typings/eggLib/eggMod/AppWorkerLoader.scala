package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "AppWorkerLoader")
@js.native
class AppWorkerLoader ()
  extends eggDashCoreLib.eggDashCoreMod.EggLoader[
      eggDashCoreLib.eggDashCoreMod.EggCore[eggDashCoreLib.eggDashCoreMod.PlainObject[js.Any]], 
      js.Any
    ] {
  def load(): scala.Unit = js.native
}

