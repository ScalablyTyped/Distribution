package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library extends js.Object {
  def add(definitions: IconDefinitionOrPack*): Unit
  def reset(): Unit
}

object Library {
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => Unit, reset: () => Unit): Library = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Library]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "library")
@js.native
object library extends TopLevel[Library]

