package typings.fastifyStatic.mod

import typings.fastifyStatic.fastifyStaticStrings.html
import typings.fastifyStatic.fastifyStaticStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOptions extends js.Object {
  
  var format: json | html = js.native
  
  var names: js.Array[String] = js.native
  
  def render(dirs: js.Array[ListDir], files: js.Array[ListFile]): String = js.native
  @JSName("render")
  var render_Original: ListRender = js.native
}
