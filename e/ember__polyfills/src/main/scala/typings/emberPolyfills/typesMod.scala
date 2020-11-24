package typings.emberPolyfills

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/polyfills/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  type Mix[A, B] = A with B
  
  type Mix3[A, B, C] = A with B with C
  
  type Mix4[A, B, C, D] = A with B with C with D
}
