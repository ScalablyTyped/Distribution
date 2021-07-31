package typings.generateJsonWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generate-json-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Plugin {
    def this(fileName: String, value: js.Object) = this()
    def this(
      fileName: String,
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any]
    ) = this()
    def this(
      fileName: String,
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any],
      space: String
    ) = this()
    def this(
      fileName: String,
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any],
      space: Double
    ) = this()
    def this(fileName: String, value: js.Object, replacer: Unit, space: String) = this()
    def this(fileName: String, value: js.Object, replacer: Unit, space: Double) = this()
  }
  
  type GenerateJsonWebpackPlugin = Plugin
}
