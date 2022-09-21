package typings.direction

import typings.direction.directionStrings.ltr
import typings.direction.directionStrings.neutral
import typings.direction.directionStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("direction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def direction(value: String): rtl | ltr | neutral = ^.asInstanceOf[js.Dynamic].applyDynamic("direction")(value.asInstanceOf[js.Any]).asInstanceOf[rtl | ltr | neutral]
}
