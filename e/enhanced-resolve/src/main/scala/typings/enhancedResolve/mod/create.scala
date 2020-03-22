package typings.enhancedResolve.mod

import typings.enhancedResolve.FnCall
import typings.enhancedResolve.FnCallContextPathRequestCallback
import typings.enhancedResolve.mod.ResolverFactory.ResolverOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "create")
@js.native
object create extends js.Object {
  def apply(options: ResolverOption): FnCallContextPathRequestCallback = js.native
  def sync(options: ResolverOption): FnCall = js.native
}

