package typings.emberPolyfills

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Mix[A, B] = B & (Pick[A, Exclude[/* keyof A */ String, /* keyof B */ String]])
  
  type Mix3[A, B, C] = Mix[Mix[A, B], C]
  
  type Mix4[A, B, C, D] = Mix3[Mix[A, B], C, D]
}
