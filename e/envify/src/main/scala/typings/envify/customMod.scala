package typings.envify

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("envify/custom", JSImport.Namespace)
@js.native
object customMod extends js.Object {
  def apply(environment: StringDictionary[js.Any]): js.Function2[/* file */ String, /* environment */ StringDictionary[js.Any], ReadWriteStream] = js.native
}

