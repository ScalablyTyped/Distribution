package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceId extends StObject
@JSGlobal("google.picker.ServiceId")
@js.native
object ServiceId extends StObject {
  
  @js.native
  sealed trait DOCS
    extends StObject
       with ServiceId
  
  @js.native
  sealed trait MAPS
    extends StObject
       with ServiceId
  
  @js.native
  sealed trait PHOTOS
    extends StObject
       with ServiceId
  
  @js.native
  sealed trait SEARCH_API
    extends StObject
       with ServiceId
  
  @js.native
  sealed trait URL
    extends StObject
       with ServiceId
  
  @js.native
  sealed trait YOUTUBE
    extends StObject
       with ServiceId
}
