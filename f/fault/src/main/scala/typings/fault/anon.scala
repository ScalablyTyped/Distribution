package typings.fault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[Fault /* <: js.Error */] extends StObject {
    
    def apply(format: String, values: Any*): Fault = js.native
    def apply(format: Null, values: Any*): Fault = js.native
    def apply(format: Unit, values: Any*): Fault = js.native
    
    /** @type {string} */
    var displayName: String = js.native
  }
  
  @js.native
  trait DisplayName extends StObject {
    
    def apply(format: String, values: Any*): js.Error = js.native
    def apply(format: Null, values: Any*): js.Error = js.native
    def apply(format: Unit, values: Any*): js.Error = js.native
    
    /** @type {string} */
    var displayName: String = js.native
  }
}
