package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.WebExtEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains types used by other schemas.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object types {
  
  /** Which setting to clear. */
  trait ClearDetails extends StObject {
    
    /** Where to clear the setting (default: regular). */
    var scope: js.UndefOr[SettingScope] = js.undefined
  }
  object ClearDetails {
    
    inline def apply(): ClearDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearDetails]
    }
    
    extension [Self <: ClearDetails](x: Self) {
      
      inline def setScope(value: SettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /** Which setting to consider. */
  trait GetDetails extends StObject {
    
    /** Whether to return the value that applies to the incognito session (default false). */
    var incognito: js.UndefOr[Boolean] = js.undefined
  }
  object GetDetails {
    
    inline def apply(): GetDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDetails]
    }
    
    extension [Self <: GetDetails](x: Self) {
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    }
  }
  
  /** Details of the currently effective value. */
  trait GetReturnDetails extends StObject {
    
    /**
      * Whether the effective value is specific to the incognito session.
      * This property will _only_ be present if the `incognito` property in the `details` parameter of `get()` was true.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /** The level of control of the setting. */
    var levelOfControl: LevelOfControl
    
    /** The value of the setting. */
    var value: js.Any
  }
  object GetReturnDetails {
    
    inline def apply(levelOfControl: LevelOfControl, value: js.Any): GetReturnDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReturnDetails]
    }
    
    extension [Self <: GetReturnDetails](x: Self) {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * One of
    *
    * *   `not_controllable`: cannot be controlled by any extension
    * *   `controlled_by_other_extensions`: controlled by extensions with higher precedence
    * *   `controllable_by_this_extension`: can be controlled by this extension
    * *   `controlled_by_this_extension`: controlled by this extension
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension
  */
  trait LevelOfControl extends StObject
  object LevelOfControl {
    
    inline def controllable_by_this_extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension]
    
    inline def controlled_by_other_extensions: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions]
    
    inline def controlled_by_this_extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension]
    
    inline def not_controllable: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable = "not_controllable".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable]
  }
  
  trait OnChangeDetails extends StObject {
    
    /**
      * Whether the value that has changed is specific to the incognito session.
      * This property will _only_ be present if the user has enabled the extension in incognito mode.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /** The level of control of the setting. */
    var levelOfControl: LevelOfControl
    
    /** The value of the setting after the change. */
    var value: js.Any
  }
  object OnChangeDetails {
    
    inline def apply(levelOfControl: LevelOfControl, value: js.Any): OnChangeDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeDetails]
    }
    
    extension [Self <: OnChangeDetails](x: Self) {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Which setting to change. */
  trait SetDetails extends StObject {
    
    /** Where to set the setting (default: regular). */
    var scope: js.UndefOr[SettingScope] = js.undefined
    
    /**
      * The value of the setting.
      * Note that every setting has a specific value type, which is described together with the setting. An extension should _not_ set a value of a different type.
      */
    var value: js.Any
  }
  object SetDetails {
    
    inline def apply(value: js.Any): SetDetails = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDetails]
    }
    
    extension [Self <: SetDetails](x: Self) {
      
      inline def setScope(value: SettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Setting extends StObject {
    
    /**
      * Clears the setting, restoring any default value.
      * @param details Which setting to clear.
      */
    def clear(details: ClearDetails): js.Promise[Unit]
    
    /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      */
    def get(details: GetDetails): js.Promise[GetReturnDetails]
    
    /** Fired after the setting changes. */
    var onChange: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]]
    
    /**
      * Sets the value of a setting.
      * @param details Which setting to change.
      */
    def set(details: SetDetails): js.Promise[Unit]
  }
  object Setting {
    
    inline def apply(
      clear: ClearDetails => js.Promise[Unit],
      get: GetDetails => js.Promise[GetReturnDetails],
      onChange: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]],
      set: SetDetails => js.Promise[Unit]
    ): Setting = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Setting]
    }
    
    extension [Self <: Setting](x: Self) {
      
      inline def setClear(value: ClearDetails => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setGet(value: GetDetails => js.Promise[GetReturnDetails]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SetDetails => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* types types */
  /**
    * The scope of the Setting. One of
    *
    * *   `regular`: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * *   `regular_only`: setting for the regular profile only (not inherited by the incognito profile),
    * *   `incognito_persistent`: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * *   `incognito_session_only`: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
    *
    * Only `regular` is supported by Firefox at this time.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular_only
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_persistent
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_session_only
  */
  trait SettingScope extends StObject
  object SettingScope {
    
    inline def incognito_persistent: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_persistent]
    
    inline def incognito_session_only: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_session_only]
    
    inline def regular: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular = "regular".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular]
    
    inline def regular_only: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular_only = "regular_only".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular_only]
  }
}
