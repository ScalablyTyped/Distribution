package typings.enhancedResolve

import typings.enhancedResolve.commonTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnContext extends js.Object {
  def apply(context: ResolveContext, path: String, request: String): String = js.native
  def apply(path: String, request: String): String = js.native
}

