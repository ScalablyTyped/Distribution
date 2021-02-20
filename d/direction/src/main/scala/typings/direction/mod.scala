package typings.direction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Detect direction: left-to-right, right-to-left, or neutral.
    *
    * @example
    * ```
    * direction('anglais') // => 'ltr'
    * direction('بسيطة') // => 'rtl'
    * direction('?') // => 'neutral'
    * ```
    */
  @JSImport("direction", JSImport.Namespace)
  @js.native
  def apply(value: String): Direction = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.direction.directionStrings.ltr
    - typings.direction.directionStrings.rtl
    - typings.direction.directionStrings.neutral
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def ltr: typings.direction.directionStrings.ltr = "ltr".asInstanceOf[typings.direction.directionStrings.ltr]
    
    @scala.inline
    def neutral: typings.direction.directionStrings.neutral = "neutral".asInstanceOf[typings.direction.directionStrings.neutral]
    
    @scala.inline
    def rtl: typings.direction.directionStrings.rtl = "rtl".asInstanceOf[typings.direction.directionStrings.rtl]
  }
}
