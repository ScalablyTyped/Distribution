package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemPreferences extends EventEmitter {
  @JSName("addListener")
  def `addListener_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  def getAccentColor(): java.lang.String = js.native
  def getColor(
    color: electronLib.electronLibStrings.`3d-dark-shadow` | electronLib.electronLibStrings.`3d-face` | electronLib.electronLibStrings.`3d-highlight` | electronLib.electronLibStrings.`3d-light` | electronLib.electronLibStrings.`3d-shadow` | electronLib.electronLibStrings.`active-border` | electronLib.electronLibStrings.`active-caption` | electronLib.electronLibStrings.`active-caption-gradient` | electronLib.electronLibStrings.`app-workspace` | electronLib.electronLibStrings.`button-text` | electronLib.electronLibStrings.`caption-text` | electronLib.electronLibStrings.desktop | electronLib.electronLibStrings.`disabled-text` | electronLib.electronLibStrings.highlight | electronLib.electronLibStrings.`highlight-text` | electronLib.electronLibStrings.hotlight | electronLib.electronLibStrings.`inactive-border` | electronLib.electronLibStrings.`inactive-caption` | electronLib.electronLibStrings.`inactive-caption-gradient` | electronLib.electronLibStrings.`inactive-caption-text` | electronLib.electronLibStrings.`info-background` | electronLib.electronLibStrings.`info-text` | electronLib.electronLibStrings.menu | electronLib.electronLibStrings.`menu-highlight` | electronLib.electronLibStrings.menubar | electronLib.electronLibStrings.`menu-text` | electronLib.electronLibStrings.scrollbar | electronLib.electronLibStrings.window | electronLib.electronLibStrings.`window-frame` | electronLib.electronLibStrings.`window-text`
  ): java.lang.String = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_array(key: java.lang.String, `type`: electronLib.electronLibStrings.array): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_boolean(key: java.lang.String, `type`: electronLib.electronLibStrings.boolean): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_dictionary(key: java.lang.String, `type`: electronLib.electronLibStrings.dictionary): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_double(key: java.lang.String, `type`: electronLib.electronLibStrings.double): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_float(key: java.lang.String, `type`: electronLib.electronLibStrings.float): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_integer(key: java.lang.String, `type`: electronLib.electronLibStrings.integer): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_string(key: java.lang.String, `type`: electronLib.electronLibStrings.string): js.Any = js.native
  /**
       * Some popular key and types are:
       */
  @JSName("getUserDefault")
  def getUserDefault_url(key: java.lang.String, `type`: electronLib.electronLibStrings.url): js.Any = js.native
  /**
       * An example of using it to determine if you should create a transparent window or
       * not (transparent windows won't work correctly when DWM composition is disabled):
       */
  def isAeroGlassEnabled(): scala.Boolean = js.native
  def isDarkMode(): scala.Boolean = js.native
  def isInvertedColorScheme(): scala.Boolean = js.native
  def isSwipeTrackingFromScrollEventsEnabled(): scala.Boolean = js.native
  // Docs: http://electron.atom.io/docs/api/system-preferences
  @JSName("on")
  def `on_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
       * Posts event as native notifications of macOS. The userInfo is an Object that
       * contains the user information dictionary sent along with the notification.
       */
  def postLocalNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
       * Posts event as native notifications of macOS. The userInfo is an Object that
       * contains the user information dictionary sent along with the notification.
       */
  def postNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
       * Posts event as native notifications of macOS. The userInfo is an Object that
       * contains the user information dictionary sent along with the notification.
       */
  def postWorkspaceNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
       * Add the specified defaults to your application's NSUserDefaults.
       */
  def registerDefaults(defaults: js.Any): scala.Unit = js.native
  @JSName("removeListener")
  def `removeListener_accent-color-changed`(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_color-changed`(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_inverted-color-scheme-changed`(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
       * Removes the key in NSUserDefaults. This can be used to restore the default or
       * global value of a key previously set with setUserDefault.
       */
  def removeUserDefault(key: java.lang.String): scala.Unit = js.native
  /**
       * Set the value of key in NSUserDefaults. Note that type should match actual type
       * of value. An exception is thrown if they don't. Some popular key and types are:
       */
  def setUserDefault(key: java.lang.String, `type`: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * Same as subscribeNotification, but uses NSNotificationCenter for local defaults.
       * This is necessary for events such as NSUserDefaultsDidChangeNotification.
       */
  def subscribeLocalNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Subscribes to native notifications of macOS, callback will be called with
       * callback(event, userInfo) when the corresponding event happens. The userInfo is
       * an Object that contains the user information dictionary sent along with the
       * notification. The id of the subscriber is returned, which can be used to
       * unsubscribe the event. Under the hood this API subscribes to
       * NSDistributedNotificationCenter, example values of event are:
       */
  def subscribeNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Same as subscribeNotification, but uses
       * NSWorkspace.sharedWorkspace.notificationCenter. This is necessary for events
       * such as NSWorkspaceDidActivateApplicationNotification.
       */
  def subscribeWorkspaceNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Same as unsubscribeNotification, but removes the subscriber from
       * NSNotificationCenter.
       */
  def unsubscribeLocalNotification(id: scala.Double): scala.Unit = js.native
  /**
       * Removes the subscriber with id.
       */
  def unsubscribeNotification(id: scala.Double): scala.Unit = js.native
  /**
       * Same as unsubscribeNotification, but removes the subscriber from
       * NSWorkspace.sharedWorkspace.notificationCenter.
       */
  def unsubscribeWorkspaceNotification(id: scala.Double): scala.Unit = js.native
}

