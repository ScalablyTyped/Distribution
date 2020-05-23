package typings.enzymeToJson

import typings.cheerio.Cheerio
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-to-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[P, S](wrapper: Cheerio): js.Object = js.native
  def default[P, S](wrapper: ReactWrapper[P, S, Component[js.Object, js.Object, _]]): js.Object = js.native
  def default[P, S](wrapper: ShallowWrapper[P, S, Component[js.Object, js.Object, _]]): js.Object = js.native
}

