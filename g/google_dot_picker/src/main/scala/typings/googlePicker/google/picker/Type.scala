package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSGlobal("google.picker.Type")
@js.native
object Type extends StObject {
  
  /** @deprecated */
  @js.native
  sealed trait ALBUM
    extends StObject
       with Type
  
  @js.native
  sealed trait DOCUMENT
    extends StObject
       with Type
  
  @js.native
  sealed trait LOCATION
    extends StObject
       with Type
  
  @js.native
  sealed trait PHOTO
    extends StObject
       with Type
  
  @js.native
  sealed trait URL
    extends StObject
       with Type
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with Type
}
