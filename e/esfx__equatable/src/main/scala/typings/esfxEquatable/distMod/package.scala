package typings.esfxEquatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object distMod {
  
  type Comparison[T] = js.Function2[/* x */ T, /* y */ T, scala.Double]
  
  type EqualityComparison[T] = js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  
  type HashGenerator[T] = js.Function1[/* x */ T, scala.Double]
}
