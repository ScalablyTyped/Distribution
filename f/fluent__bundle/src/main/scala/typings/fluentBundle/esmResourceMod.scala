package typings.fluentBundle

import typings.fluentBundle.esmAstMod.Message
import typings.fluentBundle.esmAstMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmResourceMod {
  
  @JSImport("@fluent/bundle/esm/resource", "FluentResource")
  @js.native
  open class FluentResource protected () extends StObject {
    def this(source: String) = this()
    
    var body: js.Array[Message | Term] = js.native
  }
}
