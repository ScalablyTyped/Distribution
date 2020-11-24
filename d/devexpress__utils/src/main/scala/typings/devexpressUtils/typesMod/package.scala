package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CmpFunc[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  
  type EqualFunc[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  
  type SimpleConverter[T] = js.Function1[/* value */ T, T]
}
