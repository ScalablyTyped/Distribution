package typings.dotObject

import org.scalablytyped.runtime.TopLevel
import typings.dotObject.DotObject.Dot
import typings.dotObject.DotObject.DotConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dot")
@js.native
class dot protected () extends Dot {
  def this(separator: String) = this()
}

@JSGlobal("dot")
@js.native
object dot extends TopLevel[DotConstructor]

