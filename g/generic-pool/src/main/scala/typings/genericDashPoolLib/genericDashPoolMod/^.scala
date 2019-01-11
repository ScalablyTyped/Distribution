package typings
package genericDashPoolLib.genericDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("generic-pool", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createPool[T](factory: genericDashPoolLib.genericDashPoolMod.Factory[T]): genericDashPoolLib.genericDashPoolMod.Pool[T] = js.native
  def createPool[T](
    factory: genericDashPoolLib.genericDashPoolMod.Factory[T],
    opts: genericDashPoolLib.genericDashPoolMod.Options
  ): genericDashPoolLib.genericDashPoolMod.Pool[T] = js.native
}

