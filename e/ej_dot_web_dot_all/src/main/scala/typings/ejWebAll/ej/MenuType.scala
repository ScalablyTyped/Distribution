package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MenuType extends StObject
@JSGlobal("ej.MenuType")
@js.native
object MenuType extends StObject {
  
  //string
  @js.native
  sealed trait ContextMenu
    extends StObject
       with MenuType
  
  //string
  @js.native
  sealed trait NormalMenu
    extends StObject
       with MenuType
}
