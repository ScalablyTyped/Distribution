package typings.electronStore

import typings.electronStore.anon.Name
import typings.electronStore.electronStoreStrings.configName
import typings.electronStore.electronStoreStrings.projectName
import typings.electronStore.electronStoreStrings.projectSuffix
import typings.electronStore.electronStoreStrings.projectVersion
import typings.std.Record
import typings.typeFest.anon.RequireExactProps
import typings.typeFest.sourceExceptMod.Except
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
  open class ^[T /* <: Record[String, Any] */] ()
    extends StObject
       with ElectronStore[T] {
    def this(options: Options[T]) = this()
    
    /**
    	Open the storage file in the user's editor.
    	*/
    /* CompleteClass */
    override def openInEditor(): Unit = js.native
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
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Conf<T> * / any */ trait ElectronStore[T /* <: Record[String, Any] */] extends StObject {
    
    /**
    	Open the storage file in the user's editor.
    	*/
    def openInEditor(): Unit
  }
  object ElectronStore {
    
    inline def apply[T /* <: Record[String, Any] */](openInEditor: () => Unit): ElectronStore[T] = {
      val __obj = js.Dynamic.literal(openInEditor = js.Any.fromFunction0(openInEditor))
      __obj.asInstanceOf[ElectronStore[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElectronStore[?], T /* <: Record[String, Any] */] (val x: Self & ElectronStore[T]) extends AnyVal {
      
      inline def setOpenInEditor(value: () => Unit): Self = StObject.set(x, "openInEditor", js.Any.fromFunction0(value))
    }
  }
  
  type Options[T /* <: Record[String, Any] */] = (Except[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfOptions<T> */ Any, 
    configName | projectName | projectVersion | projectSuffix, 
    RequireExactProps
  ]) & Name
  
  type Schema[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfSchema<T> */ Any
}
