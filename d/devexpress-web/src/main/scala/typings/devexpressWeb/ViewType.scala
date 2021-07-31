package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewType extends StObject
/**
  * Lists values specifying the Rich Edit's document view type.
  */
@JSGlobal("ViewType")
@js.native
object ViewType extends StObject {
  
  /**
    * The print layout is enabled.
    */
  @js.native
  sealed trait PrintLayout
    extends StObject
       with ViewType
  
  /**
    * The simple view is enabled.
    */
  @js.native
  sealed trait Simple
    extends StObject
       with ViewType
}
