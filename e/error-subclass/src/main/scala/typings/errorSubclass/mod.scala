package typings.errorSubclass

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("error-subclass", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default () extends Error
  /* static members */
  @js.native
  object default extends js.Object {
    
    var displayName: String = js.native
  }
  
  type ErrorSubclass = Error
}
