package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Response extends StObject
@JSGlobal("google.picker.Response")
@js.native
object Response extends StObject {
  
  @js.native
  sealed trait ACTION
    extends StObject
       with Response
  
  @js.native
  sealed trait DOCUMENTS
    extends StObject
       with Response
  
  @js.native
  sealed trait PARENTS
    extends StObject
       with Response
  
  @js.native
  sealed trait VIEW
    extends StObject
       with Response
}
