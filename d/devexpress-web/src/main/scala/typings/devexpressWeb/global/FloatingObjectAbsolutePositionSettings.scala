package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains page margin settings.
  */
@JSGlobal("FloatingObjectAbsolutePositionSettings")
@js.native
open class FloatingObjectAbsolutePositionSettings ()
  extends StObject
     with typings.devexpressWeb.FloatingObjectAbsolutePositionSettings {
  
  /**
    * Gets or sets a floating object's horizontal position relative to an element specified by the FloatingObjectAbsolutePositionSettings.horizontalPositionType property.
    */
  /* CompleteClass */
  var horizontalAbsolutePosition: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  /* CompleteClass */
  var horizontalPositionType: typings.devexpressWeb.FloatingObjectHorizontalPositionType = js.native
  
  /**
    * Gets or sets a floating object's vertical position relative to an element specified by the FloatingObjectAbsolutePositionSettings.verticalPositionType property.
    */
  /* CompleteClass */
  var verticalAbsolutePosition: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  /* CompleteClass */
  var verticalPositionType: typings.devexpressWeb.FloatingObjectVerticalPositionType = js.native
}
