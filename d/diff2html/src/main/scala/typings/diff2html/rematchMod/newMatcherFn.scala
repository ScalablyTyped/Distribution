package typings.diff2html.rematchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html/lib/rematch", "newMatcherFn")
@js.native
object newMatcherFn extends js.Object {
  
  def apply[T](distance: js.Function2[/* x */ T, /* y */ T, Double]): MatcherFn[T] = js.native
}
