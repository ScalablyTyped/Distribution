package typings.exponentialBackoff

import typings.exponentialBackoff.distOptionsMod.JitterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentialBackoffStrings {
  
  @js.native
  sealed trait full
    extends StObject
       with JitterType
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait none
    extends StObject
       with JitterType
  inline def none: none = "none".asInstanceOf[none]
}
