package typings.gatsbyDashLink.gatsbyDashLinkMod

import typings.atReachRouter.atReachRouterMod.NavigateFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gatsby-link", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val navigate: NavigateFn = js.native
  def navigateTo(to: String): Unit = js.native
  def push(to: String): Unit = js.native
  def replace(to: String): Unit = js.native
  def withAssetPrefix(path: String): String = js.native
  def withPrefix(path: String): String = js.native
}

