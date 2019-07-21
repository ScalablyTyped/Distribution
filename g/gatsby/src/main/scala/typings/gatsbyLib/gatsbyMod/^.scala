package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gatsby", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val navigate: atReachRouterLib.atReachRouterMod.NavigateFn = js.native
  def graphql(query: stdLib.TemplateStringsArray): scala.Unit = js.native
  def navigateTo(to: java.lang.String): scala.Unit = js.native
  def parsePath(path: java.lang.String): atReachRouterLib.atReachRouterMod.WindowLocation = js.native
  def prefetchPathname(path: java.lang.String): scala.Unit = js.native
  def push(to: java.lang.String): scala.Unit = js.native
  def replace(to: java.lang.String): scala.Unit = js.native
  def useStaticQuery[TData](query: js.Any): TData = js.native
  def withAssetPrefix(path: java.lang.String): java.lang.String = js.native
  def withPrefix(path: java.lang.String): java.lang.String = js.native
}

