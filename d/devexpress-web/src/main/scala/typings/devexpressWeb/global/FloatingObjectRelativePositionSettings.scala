package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains relative position settings for floating objects.
  */
@JSGlobal("FloatingObjectRelativePositionSettings")
@js.native
class FloatingObjectRelativePositionSettings ()
  extends StObject
     with typings.devexpressWeb.FloatingObjectRelativePositionSettings {
  
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  /* CompleteClass */
  var horizontalPositionType: typings.devexpressWeb.FloatingObjectHorizontalPositionType = js.native
  
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.horizontalRelativePosition property
    */
  /* CompleteClass */
  var horizontalRelativePosition: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  /* CompleteClass */
  var verticalPositionType: typings.devexpressWeb.FloatingObjectVerticalPositionType = js.native
  
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.verticalRelativePosition property
    */
  /* CompleteClass */
  var verticalRelativePosition: Double = js.native
}
