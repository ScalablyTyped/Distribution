package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
@JSGlobal("ej.Direction")
@js.native
object Direction extends StObject {
  
  //string
  @js.native
  sealed trait Left
    extends StObject
       with Direction
  
  //string
  @js.native
  sealed trait None
    extends StObject
       with Direction
  
  //string
  @js.native
  sealed trait Right
    extends StObject
       with Direction
}
