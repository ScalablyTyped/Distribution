package typings.enhancedResolve.mod

import typings.enhancedResolve.commonTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "sync")
@js.native
object sync extends js.Object {
  def apply(context: ResolveContext, path: String, request: String): String = js.native
  def apply(path: String, request: String): String = js.native
}

