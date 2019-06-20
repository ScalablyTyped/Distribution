package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Linking: LinkingStatic = js.native
  val PROVIDER_DEFAULT: scala.Null = js.native
  val PROVIDER_GOOGLE: expoLib.expoLibStrings.google = js.native
  def registerRootComponent(component: reactLib.reactMod.ComponentType[js.Object]): scala.Unit = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactElement): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.ReactElement, options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.RefObject[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: reactLib.reactMod.RefObject[_], options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: scala.Double): js.Promise[java.lang.String] = js.native
  def takeSnapshotAsync(node: scala.Double, options: expoLib.Anon_Base64): js.Promise[java.lang.String] = js.native
}

