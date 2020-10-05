package typings.express.mod

import typings.express.anon.Typeofm
import typings.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
  */
@JSImport("express", "static")
@js.native
object static extends js.Object {
  var mime: Typeofm = js.native
  def apply(root: String): typings.expressServeStaticCore.mod.Handler = js.native
  def apply(root: String, options: ServeStaticOptions): typings.expressServeStaticCore.mod.Handler = js.native
  def serveStatic(root: String): typings.expressServeStaticCore.mod.Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): typings.expressServeStaticCore.mod.Handler = js.native
}

