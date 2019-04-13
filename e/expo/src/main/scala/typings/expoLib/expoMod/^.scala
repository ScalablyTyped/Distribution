package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Linking: LinkingStatic = js.native
  def registerRootComponent(component: reactLib.reactMod.ComponentType[js.Object]): scala.Unit = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactElement[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactElement[_], options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.RefObject[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.RefObject[_], options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: scala.Double): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: scala.Double, options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
}

