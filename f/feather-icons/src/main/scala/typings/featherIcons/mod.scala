package typings.featherIcons

import org.scalablytyped.runtime.StringDictionary
import typings.featherIcons.anon.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("feather-icons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def replace(): Unit = js.native
  def replace(options: FeatherAttributes): Unit = js.native
  @js.native
  object icons extends /* key */ StringDictionary[Attrs]
  
  type FeatherAttributes = StringDictionary[String | Double]
}

