package typings.gatsby.gatsbyMod

import typings.atReachRouter.atReachRouterMod.NavigateFn
import typings.atReachRouter.atReachRouterMod.WindowLocation
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gatsby", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val navigate: NavigateFn = js.native
  def graphql(query: TemplateStringsArray): Unit = js.native
  def navigateTo(to: String): Unit = js.native
  def parsePath(path: String): WindowLocation = js.native
  def prefetchPathname(path: String): Unit = js.native
  def push(to: String): Unit = js.native
  def replace(to: String): Unit = js.native
  def useStaticQuery[TData](query: js.Any): TData = js.native
  def withAssetPrefix(path: String): String = js.native
  def withPrefix(path: String): String = js.native
}

