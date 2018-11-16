package typings
package genericDashPoolLib.genericDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("generic-pool", JSImport.Namespace)
@js.native
object genericDashPoolModMembers extends js.Object {
  def createPool[T](factory: Factory[T]): Pool[T] = js.native
  def createPool[T](factory: Factory[T], opts: Options): Pool[T] = js.native
}

