package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atFortawesomeFontawesomeDashSvgDashCore.Anon_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOM extends js.Object {
  def css(): String = js.native
  def i2svg(): js.Promise[Unit] = js.native
  def i2svg(params: Anon_Callback): js.Promise[Unit] = js.native
  def insertCss(): String = js.native
  def watch(): Unit = js.native
}

@JSImport("@fortawesome/fontawesome-svg-core", "dom")
@js.native
object dom extends TopLevel[DOM]

