package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Linking: expoLib.expoMod.LinkingStatic = js.native
  def registerRootComponent(component: reactLib.reactMod.ReactNs.ComponentType[js.Object]): scala.Unit = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactNs.ReactElement[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactNs.ReactElement[_], options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactNs.RefObject[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactNs.RefObject[_], options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: scala.Double): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: scala.Double, options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
}

