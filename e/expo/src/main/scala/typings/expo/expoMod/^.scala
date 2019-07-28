package typings.expo.expoMod

import typings.expo.Anon_Base64
import typings.expo.expoStrings.google
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Linking: LinkingStatic = js.native
  val PROVIDER_DEFAULT: Null = js.native
  val PROVIDER_GOOGLE: google = js.native
  def registerRootComponent(component: ComponentType[js.Object]): Unit = js.native
  def takeSnapshotAsync(node: Double): js.Promise[String] = js.native
  def takeSnapshotAsync(node: Double, options: Anon_Base64): js.Promise[String] = js.native
  def takeSnapshotAsync(node: ReactElement): js.Promise[String] = js.native
  def takeSnapshotAsync(node: ReactElement, options: Anon_Base64): js.Promise[String] = js.native
  def takeSnapshotAsync(node: RefObject[_]): js.Promise[String] = js.native
  def takeSnapshotAsync(node: RefObject[_], options: Anon_Base64): js.Promise[String] = js.native
}

