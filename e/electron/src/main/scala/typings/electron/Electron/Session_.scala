package typings.electron.Electron

import typings.electron.electronStrings.`clipboard-read`
import typings.electron.electronStrings.`display-capture`
import typings.electron.electronStrings.`extension-loaded`
import typings.electron.electronStrings.`extension-ready`
import typings.electron.electronStrings.`extension-unloaded`
import typings.electron.electronStrings.`hid-device-added`
import typings.electron.electronStrings.`hid-device-removed`
import typings.electron.electronStrings.`hid-device-revoked`
import typings.electron.electronStrings.`select-hid-device`
import typings.electron.electronStrings.`select-serial-port`
import typings.electron.electronStrings.`serial-port-added`
import typings.electron.electronStrings.`serial-port-removed`
import typings.electron.electronStrings.`spellcheck-dictionary-download-begin`
import typings.electron.electronStrings.`spellcheck-dictionary-download-failure`
import typings.electron.electronStrings.`spellcheck-dictionary-download-success`
import typings.electron.electronStrings.`spellcheck-dictionary-initialized`
import typings.electron.electronStrings.`will-download`
import typings.electron.electronStrings.fullscreen
import typings.electron.electronStrings.geolocation
import typings.electron.electronStrings.media
import typings.electron.electronStrings.mediaKeySystem
import typings.electron.electronStrings.midi
import typings.electron.electronStrings.midiSysex
import typings.electron.electronStrings.notifications
import typings.electron.electronStrings.openExternal
import typings.electron.electronStrings.pointerLock
import typings.electron.electronStrings.preconnect
import typings.electron.electronStrings.unknown_
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session_ extends EventEmitter {
  
  @JSName("addListener")
  def addListener_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event, 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  
  /**
    * Whether the word was successfully written to the custom dictionary. This API
    * will not work on non-persistent (in-memory) sessions.
    *
    * **Note:** On macOS and Windows 10 this word will be written to the OS custom
    * dictionary as well
    */
  def addWordToSpellCheckerDictionary(word: String): Boolean = js.native
  
  /**
    * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
    * authentication.
    */
  def allowNTLMCredentialsForDomains(domains: String): Unit = js.native
  
  /**
    * A `string[]` array which consists of all the known available spell checker
    * languages.  Providing a language code to the `setSpellCheckerLanguages` API that
    * isn't in this array will result in an error.
    *
    */
  val availableSpellCheckerLanguages: js.Array[String] = js.native
  
  /**
    * resolves when the session’s HTTP authentication cache has been cleared.
    */
  def clearAuthCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the cache clear operation is complete.
    *
    * Clears the session’s HTTP cache.
    */
  def clearCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the code cache clear operation is complete.
    */
  def clearCodeCaches(options: ClearCodeCachesOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves when the operation is complete.
    *
    * Clears the host resolver cache.
    */
  def clearHostResolverCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the storage data has been cleared.
    */
  def clearStorageData(): js.Promise[Unit] = js.native
  def clearStorageData(options: ClearStorageDataOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves when all connections are closed.
    *
    * **Note:** It will terminate / fail all requests currently in flight.
    */
  def closeAllConnections(): js.Promise[Unit] = js.native
  
  /**
    * A `Cookies` object for this session.
    *
    */
  val cookies: Cookies = js.native
  
  /**
    * Allows resuming `cancelled` or `interrupted` downloads from previous `Session`.
    * The API will generate a DownloadItem that can be accessed with the will-download
    * event. The DownloadItem will not have any `WebContents` associated with it and
    * the initial state will be `interrupted`. The download will start only when the
    * `resume` API is called on the DownloadItem.
    */
  def createInterruptedDownload(options: CreateInterruptedDownloadOptions): Unit = js.native
  
  /**
    * Disables any network emulation already active for the `session`. Resets to the
    * original network configuration.
    */
  def disableNetworkEmulation(): Unit = js.native
  
  /**
    * Initiates a download of the resource at `url`. The API will generate a
    * DownloadItem that can be accessed with the will-download event.
    *
    * **Note:** This does not perform any security checks that relate to a page's
    * origin, unlike `webContents.downloadURL`.
    */
  def downloadURL(url: String): Unit = js.native
  
  /**
    * Emulates network with the given configuration for the `session`.
    */
  def enableNetworkEmulation(options: EnableNetworkEmulationOptions): Unit = js.native
  
  /**
    * Writes any unwritten DOMStorage data to disk.
    */
  def flushStorageData(): Unit = js.native
  
  /**
    * Resolves when the all internal states of proxy service is reset and the latest
    * proxy configuration is reapplied if it's already available. The pac script will
    * be fetched from `pacScript` again if the proxy mode is `pac_script`.
    */
  def forceReloadProxyConfig(): js.Promise[Unit] = js.native
  
  /**
    * A list of all loaded extensions.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def getAllExtensions(): js.Array[Extension] = js.native
  
  /**
    * resolves with blob data.
    */
  def getBlobData(identifier: String): js.Promise[Buffer] = js.native
  
  /**
    * the session's current cache size, in bytes.
    */
  def getCacheSize(): js.Promise[Double] = js.native
  
  /**
    * | `null` - The loaded extension with the given ID.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def getExtension(extensionId: String): Extension = js.native
  
  /**
    * an array of paths to preload scripts that have been registered.
    */
  def getPreloads(): js.Array[String] = js.native
  
  /**
    * An array of language codes the spellchecker is enabled for.  If this list is
    * empty the spellchecker will fallback to using `en-US`.  By default on launch if
    * this setting is an empty list Electron will try to populate this setting with
    * the current OS locale.  This setting is persisted across restarts.
    *
    * **Note:** On macOS the OS spellchecker is used and has its own list of
    * languages. On macOS, this API will return whichever languages have been
    * configured by the OS.
    */
  def getSpellCheckerLanguages(): js.Array[String] = js.native
  
  /**
    * The absolute file system path where data for this session is persisted on disk.
    * For in memory sessions this returns `null`.
    */
  def getStoragePath(): String | Null = js.native
  
  /**
    * The user agent for this session.
    */
  def getUserAgent(): String = js.native
  
  /**
    * Whether or not this session is a persistent one. The default `webContents`
    * session of a `BrowserWindow` is persistent. When creating a session from a
    * partition, session prefixed with `persist:` will be persistent, while others
    * will be temporary.
    */
  def isPersistent(): Boolean = js.native
  
  /**
    * Whether the builtin spell checker is enabled.
    */
  def isSpellCheckerEnabled(): Boolean = js.native
  
  /**
    * An array of all words in app's custom dictionary. Resolves when the full
    * dictionary is loaded from disk.
    */
  def listWordsInSpellCheckerDictionary(): js.Promise[js.Array[String]] = js.native
  
  /**
    * resolves when the extension is loaded.
    *
    * This method will raise an exception if the extension could not be loaded. If
    * there are warnings when installing the extension (e.g. if the extension requests
    * an API that Electron does not support) then they will be logged to the console.
    *
    * Note that Electron does not support the full range of Chrome extensions APIs.
    * See Supported Extensions APIs for more details on what is supported.
    *
    * Note that in previous versions of Electron, extensions that were loaded would be
    * remembered for future runs of the application. This is no longer the case:
    * `loadExtension` must be called on every boot of your app if you want the
    * extension to be loaded.
    *
    * This API does not support loading packed (.crx) extensions.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Note:** Loading extensions into in-memory (non-persistent) sessions is not
    * supported and will throw an error.
    */
  def loadExtension(path: String): js.Promise[Extension] = js.native
  def loadExtension(path: String, options: LoadExtensionOptions): js.Promise[Extension] = js.native
  
  /**
    * A `NetLog` object for this session.
    *
    */
  val netLog: NetLog = js.native
  
  /**
    * Emitted after an extension is loaded. This occurs whenever an extension is added
    * to the "enabled" set of extensions. This includes:
    *
    * * Extensions being loaded from `Session.loadExtension`.
    * * Extensions being reloaded:
    *   * from a crash.
    *   * if the extension requested it (`chrome.runtime.reload()`).
    */
  @JSName("on")
  def on_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  /**
    * Emitted after an extension is loaded and all necessary browser state is
    * initialized to support the start of the extension's background page.
    */
  @JSName("on")
  def on_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  /**
    * Emitted after an extension is unloaded. This occurs when
    * `Session.removeExtension` is called.
    */
  @JSName("on")
  def on_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  /**
    * Emitted after `navigator.hid.requestDevice` has been called and
    * `select-hid-device` has fired if a new device becomes available before the
    * callback from `select-hid-device` is called.  This event is intended for use
    * when using a UI to ask users to pick a device so that the UI can be updated with
    * the newly added device.
    */
  @JSName("on")
  def on_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted after `navigator.hid.requestDevice` has been called and
    * `select-hid-device` has fired if a device has been removed before the callback
    * from `select-hid-device` is called.  This event is intended for use when using a
    * UI to ask users to pick a device so that the UI can be updated to remove the
    * specified device.
    */
  @JSName("on")
  def on_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted after `HIDDevice.forget()` has been called.  This event can be used to
    * help maintain persistent storage of permissions when
    * `setDevicePermissionHandler` is used.
    */
  @JSName("on")
  def on_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when a render process requests preconnection to a URL, generally due to
    * a resource hint.
    */
  @JSName("on")
  def on_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when a HID device needs to be selected when a call to
    * `navigator.hid.requestDevice` is made. `callback` should be called with
    * `deviceId` to be selected; passing no arguments to `callback` will cancel the
    * request.  Additionally, permissioning on `navigator.hid` can be further managed
    * by using ses.setPermissionCheckHandler(handler) and
    * ses.setDevicePermissionHandler(handler)`.
    */
  @JSName("on")
  def on_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a serial port needs to be selected when a call to
    * `navigator.serial.requestPort` is made. `callback` should be called with
    * `portId` to be selected, passing an empty string to `callback` will cancel the
    * request.  Additionally, permissioning on `navigator.serial` can be managed by
    * using ses.setPermissionCheckHandler(handler) with the `serial` permission.
    */
  @JSName("on")
  def on_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event, 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after `navigator.serial.requestPort` has been called and
    * `select-serial-port` has fired if a new serial port becomes available before the
    * callback from `select-serial-port` is called.  This event is intended for use
    * when using a UI to ask users to pick a port so that the UI can be updated with
    * the newly added port.
    */
  @JSName("on")
  def on_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  /**
    * Emitted after `navigator.serial.requestPort` has been called and
    * `select-serial-port` has fired if a serial port has been removed before the
    * callback from `select-serial-port` is called.  This event is intended for use
    * when using a UI to ask users to pick a port so that the UI can be updated to
    * remove the specified port.
    */
  @JSName("on")
  def on_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file starts downloading
    */
  @JSName("on")
  def on_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file download fails.  For details on the
    * failure you should collect a netlog and inspect the download request.
    */
  @JSName("on")
  def on_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file has been successfully downloaded
    */
  @JSName("on")
  def on_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file has been successfully initialized. This
    * occurs after the file has been downloaded.
    */
  @JSName("on")
  def on_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when Electron is about to download `item` in `webContents`.
    *
    * Calling `event.preventDefault()` will cancel the download and `item` will not be
    * available from next tick of the process.
    */
  @JSName("on")
  def on_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event, 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  
  /**
    * Preconnects the given number of sockets to an origin.
    */
  def preconnect(options: PreconnectOptions): Unit = js.native
  
  /**
    * A `Protocol` object for this session.
    *
    */
  val protocol: Protocol = js.native
  
  /**
    * Unloads an extension.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def removeExtension(extensionId: String): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event, /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event, /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event, 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[/* event */ Event, /* port */ SerialPort, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event, /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  
  /**
    * Whether the word was successfully removed from the custom dictionary. This API
    * will not work on non-persistent (in-memory) sessions.
    *
    * **Note:** On macOS and Windows 10 this word will be removed from the OS custom
    * dictionary as well
    */
  def removeWordFromSpellCheckerDictionary(word: String): Boolean = js.native
  
  /**
    * Resolves with the proxy information for `url`.
    */
  def resolveProxy(url: String): js.Promise[String] = js.native
  
  /**
    * A `ServiceWorkers` object for this session.
    *
    */
  val serviceWorkers: ServiceWorkers = js.native
  
  /**
    * Sets a handler to respond to Bluetooth pairing requests. This handler allows
    * developers to handle devices that require additional validation before pairing.
    * When a handler is not defined, any pairing on Linux or Windows that requires
    * additional validation will be automatically cancelled. macOS does not require a
    * handler because macOS handles the pairing automatically.  To clear the handler,
    * call `setBluetoothPairingHandler(null)`.
    *
    * @platform win32,linux
    */
  def setBluetoothPairingHandler(): Unit = js.native
  def setBluetoothPairingHandler(
    handler: js.Function2[
      /* details */ BluetoothPairingHandlerHandlerDetails, 
      /* callback */ js.Function1[/* response */ Response, Unit], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sets the certificate verify proc for `session`, the `proc` will be called with
    * `proc(request, callback)` whenever a server certificate verification is
    * requested. Calling `callback(0)` accepts the certificate, calling `callback(-2)`
    * rejects it.
    *
    * Calling `setCertificateVerifyProc(null)` will revert back to default certificate
    * verify proc.
    *
    * > **NOTE:** The result of this procedure is cached by the network service.
    */
  def setCertificateVerifyProc(): Unit = js.native
  def setCertificateVerifyProc(
    proc: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* verificationResult */ Double, Unit], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sets the directory to store the generated JS code cache for this session. The
    * directory is not required to be created by the user before this call, the
    * runtime will create if it does not exist otherwise will use the existing
    * directory. If directory cannot be created, then code cache will not be used and
    * all operations related to code cache will fail silently inside the runtime. By
    * default, the directory will be `Code Cache` under the respective user data
    * folder.
    */
  def setCodeCachePath(path: String): Unit = js.native
  
  /**
    * Sets the handler which can be used to respond to device permission checks for
    * the `session`. Returning `true` will allow the device to be permitted and
    * `false` will reject it. To clear the handler, call
    * `setDevicePermissionHandler(null)`. This handler can be used to provide default
    * permissioning to devices without first calling for permission to devices (eg via
    * `navigator.hid.requestDevice`).  If this handler is not defined, the default
    * device permissions as granted through device selection (eg via
    * `navigator.hid.requestDevice`) will be used. Additionally, the default behavior
    * of Electron is to store granted device permision in memory. If longer term
    * storage is needed, a developer can store granted device permissions (eg when
    * handling the `select-hid-device` event) and then read from that storage with
    * `setDevicePermissionHandler`.
    */
  def setDevicePermissionHandler(): Unit = js.native
  def setDevicePermissionHandler(handler: js.Function1[/* details */ DevicePermissionHandlerHandlerDetails, Boolean]): Unit = js.native
  
  /**
    * Sets download saving directory. By default, the download directory will be the
    * `Downloads` under the respective app folder.
    */
  def setDownloadPath(path: String): Unit = js.native
  
  /**
    * Sets the handler which can be used to respond to permission checks for the
    * `session`. Returning `true` will allow the permission and `false` will reject
    * it.  Please note that you must also implement `setPermissionRequestHandler` to
    * get complete permission handling. Most web APIs do a permission check and then
    * make a permission request if the check is denied. To clear the handler, call
    * `setPermissionCheckHandler(null)`.
    */
  def setPermissionCheckHandler(): Unit = js.native
  def setPermissionCheckHandler(
    handler: js.Function4[
      /* webContents */ WebContents_ | Null, 
      /* permission */ String, 
      /* requestingOrigin */ String, 
      /* details */ PermissionCheckHandlerHandlerDetails, 
      Boolean
    ]
  ): Unit = js.native
  
  /**
    * Sets the handler which can be used to respond to permission requests for the
    * `session`. Calling `callback(true)` will allow the permission and
    * `callback(false)` will reject it. To clear the handler, call
    * `setPermissionRequestHandler(null)`.  Please note that you must also implement
    * `setPermissionCheckHandler` to get complete permission handling. Most web APIs
    * do a permission check and then make a permission request if the check is denied.
    */
  def setPermissionRequestHandler(): Unit = js.native
  def setPermissionRequestHandler(
    handler: js.Function4[
      /* webContents */ WebContents_, 
      /* permission */ `clipboard-read` | media | `display-capture` | mediaKeySystem | geolocation | notifications | midi | midiSysex | pointerLock | fullscreen | openExternal | unknown_, 
      /* callback */ js.Function1[/* permissionGranted */ Boolean, Unit], 
      /* details */ PermissionRequestHandlerHandlerDetails, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Adds scripts that will be executed on ALL web contents that are associated with
    * this session just before normal `preload` scripts run.
    */
  def setPreloads(preloads: js.Array[String]): Unit = js.native
  
  /**
    * Resolves when the proxy setting process is complete.
    *
    * Sets the proxy settings.
    *
    * When `mode` is unspecified, `pacScript` and `proxyRules` are provided together,
    * the `proxyRules` option is ignored and `pacScript` configuration is applied.
    *
    * You may need `ses.closeAllConnections` to close currently in flight connections
    * to prevent pooled sockets using previous proxy from being reused by future
    * requests.
    *
    * The `proxyRules` has to follow the rules below:
    *
    * For example:
    *
    * * `http=foopy:80;ftp=foopy2` - Use HTTP proxy `foopy:80` for `http://` URLs, and
    * HTTP proxy `foopy2:80` for `ftp://` URLs.
    * * `foopy:80` - Use HTTP proxy `foopy:80` for all URLs.
    * * `foopy:80,bar,direct://` - Use HTTP proxy `foopy:80` for all URLs, failing
    * over to `bar` if `foopy:80` is unavailable, and after that using no proxy.
    * * `socks4://foopy` - Use SOCKS v4 proxy `foopy:1080` for all URLs.
    * * `http=foopy,socks5://bar.com` - Use HTTP proxy `foopy` for http URLs, and fail
    * over to the SOCKS5 proxy `bar.com` if `foopy` is unavailable.
    * * `http=foopy,direct://` - Use HTTP proxy `foopy` for http URLs, and use no
    * proxy if `foopy` is unavailable.
    * * `http=foopy;socks=foopy2` - Use HTTP proxy `foopy` for http URLs, and use
    * `socks4://foopy2` for all other URLs.
    *
    * The `proxyBypassRules` is a comma separated list of rules described below:
    *
    * * `[ URL_SCHEME "://" ] HOSTNAME_PATTERN [ ":" <port> ]`
    *
    * Match all hostnames that match the pattern HOSTNAME_PATTERN.
    *
    * Examples: "foobar.com", "*foobar.com", "*.foobar.com", "*foobar.com:99",
    * "https://x.*.y.com:99"
    * * `"." HOSTNAME_SUFFIX_PATTERN [ ":" PORT ]`
    *
    * Match a particular domain suffix.
    *
    * Examples: ".google.com", ".com", "http://.google.com"
    * * `[ SCHEME "://" ] IP_LITERAL [ ":" PORT ]`
    *
    * Match URLs which are IP address literals.
    *
    * Examples: "127.0.1", "[0:0::1]", "[::1]", "http://[::1]:99"
    * * `IP_LITERAL "/" PREFIX_LENGTH_IN_BITS`
    *
    * Match any URL that is to an IP literal that falls between the given range. IP
    * range is specified using CIDR notation.
    *
    * Examples: "192.168.1.1/16", "fefe:13::abc/33".
    * * `<local>`
    *
    * Match local addresses. The meaning of `<local>` is whether the host matches one
    * of: "127.0.0.1", "::1", "localhost".
    */
  def setProxy(config: Config): js.Promise[Unit] = js.native
  
  /**
    * Sets the SSL configuration for the session. All subsequent network requests will
    * use the new configuration. Existing network connections (such as WebSocket
    * connections) will not be terminated, but old sockets in the pool will not be
    * reused for new connections.
    */
  def setSSLConfig(config: SSLConfigConfig): Unit = js.native
  
  /**
    * By default Electron will download hunspell dictionaries from the Chromium CDN.
    * If you want to override this behavior you can use this API to point the
    * dictionary downloader at your own hosted version of the hunspell dictionaries.
    * We publish a `hunspell_dictionaries.zip` file with each release which contains
    * the files you need to host here.
    *
    * The file server must be **case insensitive**. If you cannot do this, you must
    * upload each file twice: once with the case it has in the ZIP file and once with
    * the filename as all lowercase.
    *
    * If the files present in `hunspell_dictionaries.zip` are available at
    * `https://example.com/dictionaries/language-code.bdic` then you should call this
    * api with
    * `ses.setSpellCheckerDictionaryDownloadURL('https://example.com/dictionaries/')`.
    *  Please note the trailing slash.  The URL to the dictionaries is formed as
    * `${url}${filename}`.
    *
    * **Note:** On macOS the OS spellchecker is used and therefore we do not download
    * any dictionary files.  This API is a no-op on macOS.
    */
  def setSpellCheckerDictionaryDownloadURL(url: String): Unit = js.native
  
  /**
    * Sets whether to enable the builtin spell checker.
    */
  def setSpellCheckerEnabled(enable: Boolean): Unit = js.native
  
  /**
    * The built in spellchecker does not automatically detect what language a user is
    * typing in.  In order for the spell checker to correctly check their words you
    * must call this API with an array of language codes.  You can get the list of
    * supported language codes with the `ses.availableSpellCheckerLanguages` property.
    *
    * **Note:** On macOS the OS spellchecker is used and will detect your language
    * automatically.  This API is a no-op on macOS.
    */
  def setSpellCheckerLanguages(languages: js.Array[String]): Unit = js.native
  
  /**
    * Overrides the `userAgent` and `acceptLanguages` for this session.
    *
    * The `acceptLanguages` must a comma separated ordered list of language codes, for
    * example `"en-US,fr,de,ko,zh-CN,ja"`.
    *
    * This doesn't affect existing `WebContents`, and each `WebContents` can use
    * `webContents.setUserAgent` to override the session-wide user agent.
    */
  def setUserAgent(userAgent: String): Unit = js.native
  def setUserAgent(userAgent: String, acceptLanguages: String): Unit = js.native
  
  /**
    * A `boolean` indicating whether builtin spell checker is enabled.
    */
  var spellCheckerEnabled: Boolean = js.native
  
  /**
    * A `string | null` indicating the absolute file system path where data for this
    * session is persisted on disk.  For in memory sessions this returns `null`.
    *
    */
  val storagePath: String | Null = js.native
  
  /**
    * A `WebRequest` object for this session.
    *
    */
  val webRequest: WebRequest = js.native
}
