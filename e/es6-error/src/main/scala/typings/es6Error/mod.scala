package typings.es6Error

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("es6-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default () extends Error
  
  type ExtendableError = Error
}
