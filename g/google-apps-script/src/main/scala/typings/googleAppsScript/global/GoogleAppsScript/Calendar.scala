package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  /**
    * An enum representing the named colors available in the Calendar service.
    */
  @JSGlobal("GoogleAppsScript.Calendar.Color")
  @js.native
  object Color extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Calendar.Color & Double] = js.native
    
    /* 0 */ val BLUE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.BLUE & Double = js.native
    
    /* 1 */ val BROWN: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.BROWN & Double = js.native
    
    /* 2 */ val CHARCOAL: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.CHARCOAL & Double = js.native
    
    /* 3 */ val CHESTNUT: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.CHESTNUT & Double = js.native
    
    /* 4 */ val GRAY: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.GRAY & Double = js.native
    
    /* 5 */ val GREEN: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.GREEN & Double = js.native
    
    /* 6 */ val INDIGO: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.INDIGO & Double = js.native
    
    /* 7 */ val LIME: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.LIME & Double = js.native
    
    /* 8 */ val MUSTARD: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.MUSTARD & Double = js.native
    
    /* 9 */ val OLIVE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.OLIVE & Double = js.native
    
    /* 10 */ val ORANGE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.ORANGE & Double = js.native
    
    /* 11 */ val PINK: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.PINK & Double = js.native
    
    /* 12 */ val PLUM: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.PLUM & Double = js.native
    
    /* 13 */ val PURPLE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.PURPLE & Double = js.native
    
    /* 14 */ val RED: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.RED & Double = js.native
    
    /* 15 */ val RED_ORANGE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.RED_ORANGE & Double = js.native
    
    /* 16 */ val SEA_BLUE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.SEA_BLUE & Double = js.native
    
    /* 17 */ val SLATE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.SLATE & Double = js.native
    
    /* 18 */ val TEAL: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.TEAL & Double = js.native
    
    /* 19 */ val TURQOISE: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.TURQOISE & Double = js.native
    
    /* 20 */ val YELLOW: typings.googleAppsScript.GoogleAppsScript.Calendar.Color.YELLOW & Double = js.native
  }
  
  /**
    * An enum representing the named event colors available in the Calendar service.
    */
  @JSGlobal("GoogleAppsScript.Calendar.EventColor")
  @js.native
  object EventColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor & Double] = js.native
    
    /* 8 */ val BLUE: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.BLUE & Double = js.native
    
    /* 6 */ val CYAN: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.CYAN & Double = js.native
    
    /* 7 */ val GRAY: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.GRAY & Double = js.native
    
    /* 9 */ val GREEN: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.GREEN & Double = js.native
    
    /* 2 */ val MAUVE: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.MAUVE & Double = js.native
    
    /* 5 */ val ORANGE: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.ORANGE & Double = js.native
    
    /* 0 */ val PALE_BLUE: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.PALE_BLUE & Double = js.native
    
    /* 1 */ val PALE_GREEN: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.PALE_GREEN & Double = js.native
    
    /* 3 */ val PALE_RED: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.PALE_RED & Double = js.native
    
    /* 10 */ val RED: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.RED & Double = js.native
    
    /* 4 */ val YELLOW: typings.googleAppsScript.GoogleAppsScript.Calendar.EventColor.YELLOW & Double = js.native
  }
  
  /**
    * An enum representing the statuses a guest can have for an event.
    */
  @JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
  @js.native
  object GuestStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus & Double] = js.native
    
    /* 0 */ val INVITED: typings.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.INVITED & Double = js.native
    
    /* 1 */ val MAYBE: typings.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.MAYBE & Double = js.native
    
    /* 2 */ val NO: typings.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.NO & Double = js.native
    
    /* 3 */ val OWNER: typings.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.OWNER & Double = js.native
    
    /* 4 */ val YES: typings.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.YES & Double = js.native
  }
  
  /**
    * An enum representing the visibility of an event.
    */
  @JSGlobal("GoogleAppsScript.Calendar.Visibility")
  @js.native
  object Visibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Calendar.Visibility & Double] = js.native
    
    /* 0 */ val CONFIDENTIAL: typings.googleAppsScript.GoogleAppsScript.Calendar.Visibility.CONFIDENTIAL & Double = js.native
    
    /* 1 */ val DEFAULT: typings.googleAppsScript.GoogleAppsScript.Calendar.Visibility.DEFAULT & Double = js.native
    
    /* 2 */ val PRIVATE: typings.googleAppsScript.GoogleAppsScript.Calendar.Visibility.PRIVATE & Double = js.native
    
    /* 3 */ val PUBLIC: typings.googleAppsScript.GoogleAppsScript.Calendar.Visibility.PUBLIC & Double = js.native
  }
}
