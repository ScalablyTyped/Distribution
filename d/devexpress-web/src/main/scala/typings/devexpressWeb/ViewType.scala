package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewType extends js.Object
/**
  * Lists values specifying the Rich Edit's document view type.
  */
@JSGlobal("ViewType")
@js.native
object ViewType extends js.Object {
  
  /**
    * The print layout is enabled.
    */
  @js.native
  sealed trait PrintLayout extends ViewType
  
  /**
    * The simple view is enabled.
    */
  @js.native
  sealed trait Simple extends ViewType
}
