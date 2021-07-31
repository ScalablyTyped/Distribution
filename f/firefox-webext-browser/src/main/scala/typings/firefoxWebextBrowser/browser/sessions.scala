package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.tabs.Tab
import typings.firefoxWebextBrowser.browser.windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
  *
  * Permissions: `sessions`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object sessions {
  
  trait Device extends StObject {
    
    /** The name of the foreign device. */
    var deviceName: String
    
    var info: String
    
    /**
      * A list of open window sessions for the foreign device, sorted from most recently to least recently modified session.
      */
    var sessions: js.Array[Session]
  }
  object Device {
    
    @scala.inline
    def apply(deviceName: String, info: String, sessions: js.Array[Session]): Device = {
      val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessions(value: js.Array[Session]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value :_*))
    }
  }
  
  /* sessions types */
  trait Filter extends StObject {
    
    /**
      * The maximum number of entries to be fetched in the requested list. Omit this parameter to fetch the maximum number of entries (`sessions.MAX_SESSION_RESULTS`).
      */
    var maxResults: js.UndefOr[Double] = js.undefined
  }
  object Filter {
    
    @scala.inline
    def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
  
  trait Session extends StObject {
    
    /** The time when the window or tab was closed or modified, represented in milliseconds since the epoch. */
    var lastModified: Double
    
    /** The `tabs.Tab`, if this entry describes a tab. Either this or `sessions.Session.window` will be set. */
    var tab: js.UndefOr[Tab] = js.undefined
    
    /**
      * The `windows.Window`, if this entry describes a window. Either this or `sessions.Session.tab` will be set.
      */
    var window: js.UndefOr[Window] = js.undefined
  }
  object Session {
    
    @scala.inline
    def apply(lastModified: Double): Session = {
      val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      @scala.inline
      def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
