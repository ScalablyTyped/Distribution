package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object expoModMembers extends js.Object {
  val Linking: LinkingStatic = js.native
  def registerRootComponent(component: reactLib.reactMod.ReactNs.ComponentType[js.Object]): scala.Unit = js.native
  def takeSnapshotAsync(): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(view: reactLib.reactMod.ReactNs.ReactElement[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(view: reactLib.reactMod.ReactNs.ReactElement[_], options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(view: scala.Double): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(view: scala.Double, options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
}

