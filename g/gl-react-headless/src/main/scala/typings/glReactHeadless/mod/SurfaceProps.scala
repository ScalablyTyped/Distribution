package typings.glReactHeadless.mod

import typings.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceProps
  extends typings.glReact.mod.SurfaceProps
     with GLViewHeadlessProps

object SurfaceProps {
  @scala.inline
  def apply(height: Double, width: Double): SurfaceProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

