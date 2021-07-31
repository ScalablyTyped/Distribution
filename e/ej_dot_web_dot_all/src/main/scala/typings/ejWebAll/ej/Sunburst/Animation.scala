package typings.ejWebAll.ej.Sunburst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Animation extends StObject
@JSGlobal("ej.Sunburst.Animation")
@js.native
object Animation extends StObject {
  
  //string
  @js.native
  sealed trait FadeIn
    extends StObject
       with Animation
  
  //string
  @js.native
  sealed trait Rotation
    extends StObject
       with Animation
}
