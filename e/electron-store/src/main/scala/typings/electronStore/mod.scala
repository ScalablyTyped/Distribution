package typings.electronStore

import typings.conf.mod.default
import typings.conf.typesMod.Deserialize
import typings.conf.typesMod.Migrations
import typings.conf.typesMod.Serialize
import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.DataView
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
  class ^[T /* <: Record[String, js.Any] */] () extends ElectronStore[T] {
    def this(options: Options[T]) = this()
  }
  
  /**
  Simple data persistence for your [Electron](https://electronjs.org) app or module - Save and load user preferences, app state, cache, etc.
  */
  @js.native
  trait ElectronStore[T /* <: Record[String, js.Any] */] extends default[T] {
    
    /**
    	Open the storage file in the user's editor.
    	*/
    def openInEditor(): Unit = js.native
  }
  
  /* Inlined type-fest.type-fest.Except<conf.conf.Options<T>, 'configName' | 'projectName' | 'projectVersion' | 'projectSuffix'> & { readonly name :string | undefined} */
  trait Options[T] extends StObject {
    
    var accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.undefined
    
    var clearInvalidConfig: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var defaults: js.UndefOr[T] = js.undefined
    
    var deserialize: js.UndefOr[Deserialize[T]] = js.undefined
    
    var encryptionKey: js.UndefOr[String | Buffer | TypedArray | DataView] = js.undefined
    
    var fileExtension: js.UndefOr[String] = js.undefined
    
    var migrations: js.UndefOr[Migrations[T]] = js.undefined
    
    /**
    		Name of the storage file (without extension).
    		This is useful if you want multiple storage files for your app. Or if you're making a reusable Electron module that persists some data, in which case you should **not** use the name `config`.
    		@default 'config'
    		*/
    val name: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[typings.conf.typesMod.Schema[T]] = js.undefined
    
    var serialize: js.UndefOr[Serialize[T]] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      @scala.inline
      def setAccessPropertiesByDotNotation(value: Boolean): Self = StObject.set(x, "accessPropertiesByDotNotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPropertiesByDotNotationUndefined: Self = StObject.set(x, "accessPropertiesByDotNotation", js.undefined)
      
      @scala.inline
      def setClearInvalidConfig(value: Boolean): Self = StObject.set(x, "clearInvalidConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearInvalidConfigUndefined: Self = StObject.set(x, "clearInvalidConfig", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDefaults(value: T): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDeserialize(value: /* text */ String => T): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      @scala.inline
      def setEncryptionKey(value: String | Buffer | TypedArray | DataView): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      @scala.inline
      def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      @scala.inline
      def setMigrations(value: Migrations[T]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSchema(value: typings.conf.typesMod.Schema[T]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSerialize(value: T => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Schema[T] = typings.conf.typesMod.Schema[T]
}
