package typings
package expressLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
  */
@JSImport("express", "static")
@js.native
object static extends js.Object {
  var mime: expressLib.Typeofm = js.native
  def apply(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def apply(root: java.lang.String, options: serveDashStaticLib.serveDashStaticMod.ServeStaticOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def serveStatic(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def serveStatic(root: java.lang.String, options: serveDashStaticLib.serveDashStaticMod.ServeStaticOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
}

