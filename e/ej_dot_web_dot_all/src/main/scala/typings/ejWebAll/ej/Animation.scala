package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Animation extends StObject
@JSGlobal("ej.Animation")
@js.native
object Animation extends StObject {
  
  @js.native
  sealed trait Fade
    extends StObject
       with Animation
  
  @js.native
  sealed trait None
    extends StObject
       with Animation
  
  @js.native
  sealed trait Slide
    extends StObject
       with Animation
}
