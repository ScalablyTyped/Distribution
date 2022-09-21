package typings.fluentBundle

import typings.fluentBundle.astMod.Message
import typings.fluentBundle.astMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("@fluent/bundle/esm/resource", "FluentResource")
  @js.native
  open class FluentResource protected () extends StObject {
    def this(source: String) = this()
    
    var body: js.Array[Message | Term] = js.native
  }
}
