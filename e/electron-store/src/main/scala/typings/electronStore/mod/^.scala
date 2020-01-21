package typings.electronStore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class ^[T] () extends ElectronStore[T] {
  def this(options: Options[T]) = this()
}

