package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait headerOption extends StObject
@JSGlobal("ej.headerOption")
@js.native
object headerOption extends StObject {
  
  @js.native
  sealed trait row
    extends StObject
       with headerOption
  
  @js.native
  sealed trait tHead
    extends StObject
       with headerOption
}
