package typings.enhancedResolve.mod

import typings.enhancedResolve.FnCallback
import typings.enhancedResolve.FnContext
import typings.enhancedResolve.mod.ResolverFactory.ResolverOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "create")
@js.native
object create extends js.Object {
  def apply(options: ResolverOption): FnCallback = js.native
  def sync(options: ResolverOption): FnContext = js.native
}

