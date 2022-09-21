package typings.endsWithString

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ends-with-string/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String, string: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(input: Buffer, string: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
