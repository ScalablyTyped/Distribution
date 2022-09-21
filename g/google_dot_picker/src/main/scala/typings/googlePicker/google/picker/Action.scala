package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Action extends StObject
@JSGlobal("google.picker.Action")
@js.native
object Action extends StObject {
  
  @js.native
  sealed trait CANCEL
    extends StObject
       with Action
  
  @js.native
  sealed trait PICKED
    extends StObject
       with Action
}
