package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSGlobal("ej.Type")
@js.native
object Type extends StObject {
  
  @js.native
  sealed trait Overlay
    extends StObject
       with Type
  
  @js.native
  sealed trait Slide
    extends StObject
       with Type
}
