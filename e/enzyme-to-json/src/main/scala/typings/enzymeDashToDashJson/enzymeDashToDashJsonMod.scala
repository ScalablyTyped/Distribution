package typings.enzymeDashToDashJson

import typings.cheerio.Cheerio
import typings.enzyme.enzymeMod.ReactWrapper
import typings.enzyme.enzymeMod.ShallowWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-to-json", JSImport.Namespace)
@js.native
object enzymeDashToDashJsonMod extends js.Object {
  def default[P, S](wrapper: Cheerio): js.Object = js.native
  def default[P, S](wrapper: ReactWrapper[P, S, Component[js.Object, js.Object, _]]): js.Object = js.native
  def default[P, S](wrapper: ShallowWrapper[P, S, Component[js.Object, js.Object, _]]): js.Object = js.native
}

