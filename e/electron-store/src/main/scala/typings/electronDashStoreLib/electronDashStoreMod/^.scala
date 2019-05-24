package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-store", JSImport.Namespace)
@js.native
/**
	Simple data persistence for your [Electron](https://electronjs.org) app or module - Save and load user preferences, app state, cache, etc.
	Changes are written to disk atomically, so if the process crashes during a write, it will not corrupt the existing config.
	@example
	```
	import Store = require('electron-store');
	const store = new Store();
	store.set('unicorn', '🦄');
	console.log(store.get('unicorn'));
	//=> '🦄'
	// Use dot-notation to access nested properties
	store.set('foo.bar', true);
	console.log(store.get('foo'));
	//=> {bar: true}
	store.delete('unicorn');
	console.log(store.get('unicorn'));
	//=> undefined
	```
	*/
class ^[T] () extends ElectronStore[T] {
  def this(options: Options[T]) = this()
}

