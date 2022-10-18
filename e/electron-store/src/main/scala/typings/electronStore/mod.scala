package typings.electronStore

import typings.conf.distSourceTypesMod.BeforeEachMigrationCallback
import typings.conf.distSourceTypesMod.BeforeEachMigrationContext
import typings.conf.distSourceTypesMod.Deserialize
import typings.conf.distSourceTypesMod.Migrations
import typings.conf.distSourceTypesMod.Serialize
import typings.conf.mod.default
import typings.node.NodeJS.TypedArray
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Simple data persistence for your [Electron](https://electronjs.org) app or module - Save and load user preferences, app state, cache, etc.
  */
  @JSImport("electron-store", JSImport.Namespace)
  @js.native
  /**
  	Changes are written to disk atomically, so if the process crashes during a write, it will not corrupt the existing store.
  	@example
  	```
  	import Store = require('electron-store');
  	type StoreType = {
  		isRainbow: boolean,
  		unicorn?: string
  	}
  	const store = new Store<StoreType>({
  		defaults: {
  			isRainbow: true
  		}
  	});
  	store.get('isRainbow');
  	//=> true
  	store.set('unicorn', '🦄');
  	console.log(store.get('unicorn'));
  	//=> '🦄'
  	store.delete('unicorn');
  	console.log(store.get('unicorn'));
  	//=> undefined
  	```
  	*/
  open class ^[T /* <: Record[String, Any] */] () extends ElectronStore[T] {
    def this(options: Options[T]) = this()
  }
  @JSImport("electron-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Initializer to set up the required `ipc` communication channels for the module when a `Store` instance is not created in the main process and you are creating a `Store` instance in the Electron renderer process only.
  	*/
  /* static member */
  inline def initRenderer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initRenderer")().asInstanceOf[Unit]
  
  /**
  Simple data persistence for your [Electron](https://electronjs.org) app or module - Save and load user preferences, app state, cache, etc.
  */
  @js.native
  trait ElectronStore[T /* <: Record[String, Any] */] extends default[T] {
    
    /**
    	Open the storage file in the user's editor.
    	*/
    def openInEditor(): Unit = js.native
  }
  
  /* Inlined type-fest.type-fest.Except<conf.conf.Options<T>, 'configName' | 'projectName' | 'projectVersion' | 'projectSuffix'> & { readonly name :string | undefined} */
  trait Options[T /* <: Record[String, Any] */] extends StObject {
    
    var accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.undefined
    
    var beforeEachMigration: js.UndefOr[BeforeEachMigrationCallback[T]] = js.undefined
    
    var clearInvalidConfig: js.UndefOr[Boolean] = js.undefined
    
    var configFileMode: js.UndefOr[Double] = js.undefined
    
    var configName: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var defaults: js.UndefOr[T] = js.undefined
    
    var deserialize: js.UndefOr[Deserialize[T]] = js.undefined
    
    var encryptionKey: js.UndefOr[String | Buffer | TypedArray | js.typedarray.DataView] = js.undefined
    
    var fileExtension: js.UndefOr[String] = js.undefined
    
    var migrations: js.UndefOr[Migrations[T]] = js.undefined
    
    /**
    		Name of the storage file (without extension).
    		This is useful if you want multiple storage files for your app. Or if you're making a reusable Electron module that persists some data, in which case you should **not** use the name `config`.
    		@default 'config'
    		*/
    val name: js.UndefOr[String] = js.undefined
    
    var projectName: js.UndefOr[String] = js.undefined
    
    var projectSuffix: js.UndefOr[String] = js.undefined
    
    var projectVersion: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[typings.conf.distSourceTypesMod.Schema[T]] = js.undefined
    
    var serialize: js.UndefOr[Serialize[T]] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: Record[String, Any] */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T /* <: Record[String, Any] */](x: Self & Options[T]) {
      
      inline def setAccessPropertiesByDotNotation(value: Boolean): Self = StObject.set(x, "accessPropertiesByDotNotation", value.asInstanceOf[js.Any])
      
      inline def setAccessPropertiesByDotNotationUndefined: Self = StObject.set(x, "accessPropertiesByDotNotation", js.undefined)
      
      inline def setBeforeEachMigration(value: (/* store */ default[T], /* context */ BeforeEachMigrationContext) => Unit): Self = StObject.set(x, "beforeEachMigration", js.Any.fromFunction2(value))
      
      inline def setBeforeEachMigrationUndefined: Self = StObject.set(x, "beforeEachMigration", js.undefined)
      
      inline def setClearInvalidConfig(value: Boolean): Self = StObject.set(x, "clearInvalidConfig", value.asInstanceOf[js.Any])
      
      inline def setClearInvalidConfigUndefined: Self = StObject.set(x, "clearInvalidConfig", js.undefined)
      
      inline def setConfigFileMode(value: Double): Self = StObject.set(x, "configFileMode", value.asInstanceOf[js.Any])
      
      inline def setConfigFileModeUndefined: Self = StObject.set(x, "configFileMode", js.undefined)
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDefaults(value: T): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDeserialize(value: /* text */ String => T): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setEncryptionKey(value: String | Buffer | TypedArray | js.typedarray.DataView): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      inline def setMigrations(value: Migrations[T]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
      
      inline def setProjectSuffix(value: String): Self = StObject.set(x, "projectSuffix", value.asInstanceOf[js.Any])
      
      inline def setProjectSuffixUndefined: Self = StObject.set(x, "projectSuffix", js.undefined)
      
      inline def setProjectVersion(value: String): Self = StObject.set(x, "projectVersion", value.asInstanceOf[js.Any])
      
      inline def setProjectVersionUndefined: Self = StObject.set(x, "projectVersion", js.undefined)
      
      inline def setSchema(value: typings.conf.distSourceTypesMod.Schema[T]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSerialize(value: T => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Schema[T] = typings.conf.distSourceTypesMod.Schema[T]
}
