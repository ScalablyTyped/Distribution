package typings.electronSettings

import org.scalablytyped.runtime.StringDictionary
import typings.electronSettings.anon.Fn0
import typings.electronSettings.anon.Fn1
import typings.electronSettings.anon.FnCall
import typings.electronSettings.anon.FnCallKeyPath
import typings.electronSettings.anon.FnCallKeyPathObj
import typings.electronSettings.anon.FnCallKeyPathValue
import typings.electronSettings.anon.PartialConfig
import typings.electronSettings.anon.TypeofElectron
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("electron-settings", "configure")
  @js.native
  def configure: js.Function1[/* customConfig */ PartialConfig, Unit] = js.native
  inline def configure(customConfig: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(customConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure_=(x: js.Function1[/* customConfig */ PartialConfig, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
  
  inline def file(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[String]
  @JSImport("electron-settings", "file")
  @js.native
  def file_Fmod: js.Function0[String] = js.native
  
  inline def file_Fmod_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("file")(x.asInstanceOf[js.Any])
  
  inline def get(): js.Promise[SettingsObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[SettingsObject]]
  inline def get(keyPath: KeyPath): js.Promise[SettingsValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(keyPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SettingsValue]]
  
  inline def getSync(): SettingsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")().asInstanceOf[SettingsObject]
  inline def getSync(keyPath: KeyPath): SettingsValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(keyPath.asInstanceOf[js.Any]).asInstanceOf[SettingsValue]
  @JSImport("electron-settings", "getSync")
  @js.native
  def getSync_Fmod: FnCallKeyPath = js.native
  
  inline def getSync_Fmod_=(x: FnCallKeyPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSync")(x.asInstanceOf[js.Any])
  
  @JSImport("electron-settings", "get")
  @js.native
  def get_Fmod: FnCall = js.native
  
  inline def get_Fmod_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  @JSImport("electron-settings", "has")
  @js.native
  def has: js.Function1[/* keyPath */ KeyPath, js.Promise[Boolean]] = js.native
  inline def has(keyPath: KeyPath): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(keyPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("electron-settings", "hasSync")
  @js.native
  def hasSync: js.Function1[/* keyPath */ KeyPath, Boolean] = js.native
  inline def hasSync(keyPath: KeyPath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSync")(keyPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasSync_=(x: js.Function1[/* keyPath */ KeyPath, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasSync")(x.asInstanceOf[js.Any])
  
  inline def has_=(x: js.Function1[/* keyPath */ KeyPath, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("has")(x.asInstanceOf[js.Any])
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  @JSImport("electron-settings", "reset")
  @js.native
  def reset_Fmod: js.Function0[Unit] = js.native
  
  inline def reset_Fmod_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
  
  @JSImport("electron-settings", "set")
  @js.native
  def set: FnCallKeyPathObj = js.native
  inline def set(keyPath: KeyPath, obj: SettingsValue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(keyPath.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def set(obj: SettingsObject): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("electron-settings", "setSync")
  @js.native
  def setSync: FnCallKeyPathValue = js.native
  inline def setSync(keyPath: KeyPath, value: SettingsValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSync")(keyPath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSync(obj: SettingsObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSync")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setSync_=(x: FnCallKeyPathValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSync")(x.asInstanceOf[js.Any])
  
  inline def set_=(x: FnCallKeyPathObj): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
  
  inline def unset(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unset")().asInstanceOf[js.Promise[Unit]]
  inline def unset(keyPath: KeyPath): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unset")(keyPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unsetSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetSync")().asInstanceOf[Unit]
  inline def unsetSync(keyPath: KeyPath): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetSync")(keyPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @JSImport("electron-settings", "unsetSync")
  @js.native
  def unsetSync_Fmod: Fn1 = js.native
  
  inline def unsetSync_Fmod_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unsetSync")(x.asInstanceOf[js.Any])
  
  @JSImport("electron-settings", "unset")
  @js.native
  def unset_Fmod: Fn0 = js.native
  
  inline def unset_Fmod_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unset")(x.asInstanceOf[js.Any])
  
  /**
    * `Config` types contain all the configuration options for
    * Electron Settings that can be set using
    * [[configure|configure()]].
    */
  trait Config extends StObject {
    
    /**
      * Whether or not to save the settings file atomically.
      */
    var atomicSave: Boolean
    
    /**
      * The path to the settings directory. Defaults to your
      * app's user data direcory.
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * A custom Electron instance to use. Great for testing!
      */
    var electron: js.UndefOr[TypeofElectron] = js.undefined
    
    /**
      * The name of the settings file that will be saved to
      * the disk.
      */
    var fileName: String
    
    /**
      * The number of spaces to use when stringifying the data
      * before saving to disk if `prettify` is set to `true`.
      */
    var numSpaces: Double
    
    /**
      * Whether or not to prettify the data when it's saved to
      * disk.
      */
    var prettify: Boolean
  }
  object Config {
    
    inline def apply(atomicSave: Boolean, fileName: String, numSpaces: Double, prettify: Boolean): Config = {
      val __obj = js.Dynamic.literal(atomicSave = atomicSave.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], numSpaces = numSpaces.asInstanceOf[js.Any], prettify = prettify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAtomicSave(value: Boolean): Self = StObject.set(x, "atomicSave", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setElectron(value: TypeofElectron): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setNumSpaces(value: Double): Self = StObject.set(x, "numSpaces", value.asInstanceOf[js.Any])
      
      inline def setPrettify(value: Boolean): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyPath = String | (js.Array[String | Double])
  
  /**
    * A `SettingsObject` is an object whose property values
    * are of the type `SettingsValue`.
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SettingsObject = {[key: string] : electron-settings.electron-settings.SettingsValue}
  }}}
  to avoid circular code involving: 
  - electron-settings.electron-settings.SettingsObject
  - electron-settings.electron-settings.SettingsValue
  */
  trait SettingsObject
    extends StObject
       with /* key */ StringDictionary[SettingsValue]
  object SettingsObject {
    
    inline def apply(): SettingsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsObject]
    }
  }
  
  /**
    * `SettingsValue` types are the datatypes supported by
    * Electron Settings. Since Electron Settings reads and
    * writes to a JSON file, any value you set must be a valid
    * JSON value. This does however mean that `Date` types are
    * _not_ supported.
    *
    * Either simply store a numeric unix timestamp using
    * `Date.now()`, or convert dates back into `Date` types
    * using `new Date()`:
    *
    *     await settings.set('user.lastLogin', new Date());
    *
    *     const lastLogin = await settings.get('user.lastLogin');
    *     const lastLoginDate = new Date(lastLogin);
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SettingsValue = null | boolean | string | number | electron-settings.electron-settings.SettingsObject | std.Array<electron-settings.electron-settings.SettingsValue>
  }}}
  to avoid circular code involving: 
  - electron-settings.electron-settings.SettingsValue
  */
  type SettingsValue = Null | Boolean | String | Double | SettingsObject | js.Array[Any]
}
