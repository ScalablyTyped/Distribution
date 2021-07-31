package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Script {
  
  /**
    * An enumeration that identifies which categories of authorized services Apps Script is able to
    * execute through a triggered function. These values are exposed in triggered functions as the authMode
    * property of the event parameter, e. For
    * more information, see the guide to the
    * authorization lifecycle for add-ons.
    *
    *     function onOpen(e) {
    *       var menu = SpreadsheetApp.getUi().createAddonMenu();
    *       if (e && e.authMode == ScriptApp.AuthMode.NONE) {
    *         // Add a normal menu item (works in all authorization modes).
    *         menu.addItem('Start workflow', 'startWorkflow');
    *       } else {
    *         // Add a menu item based on properties (doesn't work in AuthMode.NONE).
    *         var properties = PropertiesService.getDocumentProperties();
    *         var workflowStarted = properties.getProperty('workflowStarted');
    *         if (workflowStarted) {
    *           menu.addItem('Check workflow status', 'checkWorkflow');
    *         } else {
    *           menu.addItem('Start workflow', 'startWorkflow');
    *         }
    *         // Record analytics.
    *         UrlFetchApp.fetch('http://www.example.com/analytics?event=open');
    *       }
    *       menu.addToUi();
    *     }
    */
  @JSGlobal("GoogleAppsScript.Script.AuthMode")
  @js.native
  object AuthMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Script.AuthMode & Double] = js.native
    
    /* 1 */ val CUSTOM_FUNCTION: typings.googleAppsScript.GoogleAppsScript.Script.AuthMode.CUSTOM_FUNCTION & Double = js.native
    
    /* 3 */ val FULL: typings.googleAppsScript.GoogleAppsScript.Script.AuthMode.FULL & Double = js.native
    
    /* 2 */ val LIMITED: typings.googleAppsScript.GoogleAppsScript.Script.AuthMode.LIMITED & Double = js.native
    
    /* 0 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Script.AuthMode.NONE & Double = js.native
  }
  
  /**
    * An enumeration denoting the authorization status of a script.
    */
  @JSGlobal("GoogleAppsScript.Script.AuthorizationStatus")
  @js.native
  object AuthorizationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Script.AuthorizationStatus & Double] = js.native
    
    /* 1 */ val NOT_REQUIRED: typings.googleAppsScript.GoogleAppsScript.Script.AuthorizationStatus.NOT_REQUIRED & Double = js.native
    
    /* 0 */ val REQUIRED: typings.googleAppsScript.GoogleAppsScript.Script.AuthorizationStatus.REQUIRED & Double = js.native
  }
  
  /**
    * An enumeration denoting the type of triggered event.
    */
  @JSGlobal("GoogleAppsScript.Script.EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Script.EventType & Double] = js.native
    
    /* 0 */ val CLOCK: typings.googleAppsScript.GoogleAppsScript.Script.EventType.CLOCK & Double = js.native
    
    /* 4 */ val ON_CHANGE: typings.googleAppsScript.GoogleAppsScript.Script.EventType.ON_CHANGE & Double = js.native
    
    /* 2 */ val ON_EDIT: typings.googleAppsScript.GoogleAppsScript.Script.EventType.ON_EDIT & Double = js.native
    
    /* 5 */ val ON_EVENT_UPDATED: typings.googleAppsScript.GoogleAppsScript.Script.EventType.ON_EVENT_UPDATED & Double = js.native
    
    /* 3 */ val ON_FORM_SUBMIT: typings.googleAppsScript.GoogleAppsScript.Script.EventType.ON_FORM_SUBMIT & Double = js.native
    
    /* 1 */ val ON_OPEN: typings.googleAppsScript.GoogleAppsScript.Script.EventType.ON_OPEN & Double = js.native
  }
  
  /**
    * An enumeration that indicates how the script came to be installed as an add-on for the current
    * user.
    */
  @JSGlobal("GoogleAppsScript.Script.InstallationSource")
  @js.native
  object InstallationSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Script.InstallationSource & Double] = js.native
    
    /* 0 */ val APPS_MARKETPLACE_DOMAIN_ADD_ON: typings.googleAppsScript.GoogleAppsScript.Script.InstallationSource.APPS_MARKETPLACE_DOMAIN_ADD_ON & Double = js.native
    
    /* 1 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Script.InstallationSource.NONE & Double = js.native
    
    /* 2 */ val WEB_STORE_ADD_ON: typings.googleAppsScript.GoogleAppsScript.Script.InstallationSource.WEB_STORE_ADD_ON & Double = js.native
  }
  
  /**
    * An enumeration denoting the source of the event that causes the trigger to fire.
    */
  @JSGlobal("GoogleAppsScript.Script.TriggerSource")
  @js.native
  object TriggerSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Script.TriggerSource & Double] = js.native
    
    /* 4 */ val CALENDAR: typings.googleAppsScript.GoogleAppsScript.Script.TriggerSource.CALENDAR & Double = js.native
    
    /* 1 */ val CLOCK: typings.googleAppsScript.GoogleAppsScript.Script.TriggerSource.CLOCK & Double = js.native
    
    /* 3 */ val DOCUMENTS: typings.googleAppsScript.GoogleAppsScript.Script.TriggerSource.DOCUMENTS & Double = js.native
    
    /* 2 */ val FORMS: typings.googleAppsScript.GoogleAppsScript.Script.TriggerSource.FORMS & Double = js.native
    
    /* 0 */ val SPREADSHEETS: typings.googleAppsScript.GoogleAppsScript.Script.TriggerSource.SPREADSHEETS & Double = js.native
  }
}
