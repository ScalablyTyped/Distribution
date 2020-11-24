package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.fetchKml")
@js.native
object fetchKml extends js.Object {
  
  def apply(
    pluginInstance: typings.googleEarth.google.earth.GEPlugin,
    url: String,
    completionCallback: js.Function1[/* feature */ typings.googleEarth.google.earth.KmlFeature, Unit]
  ): Unit = js.native
}
