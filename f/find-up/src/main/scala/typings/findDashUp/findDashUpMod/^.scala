package typings.findDashUp.findDashUpMod

import typings.findDashUp.Anon_Directory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-up", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Return this in a `matcher` function to stop the search and force `findUp` to immediately return `undefined`.
  	*/
  val stop: StopSymbol = js.native
  @JSName("sync")
  var sync_Original: Anon_Directory = js.native
  /**
  	Find a file or directory by walking up parent directories.
  	@param matcher - Called for each directory in the search. Return a path or `findUp.stop` to stop the search.
  	@returns The first path found or `undefined` if none could be found.
  	@example
  	```
  	import path = require('path');
  	import findUp = require('find-up');
  	(async () => {
  		console.log(await findUp(async directory => {
  			const hasUnicorns = await findUp.exists(path.join(directory, 'unicorn.png'));
  			return hasUnicorns && directory;
  		}, {type: 'directory'}));
  		//=> '/Users/sindresorhus'
  	})();
  	```
  	*/
  def apply(matcher: js.Function1[/* directory */ String, Match | js.Promise[Match]]): js.Promise[js.UndefOr[String]] = js.native
  def apply(matcher: js.Function1[/* directory */ String, Match | js.Promise[Match]], options: Options): js.Promise[js.UndefOr[String]] = js.native
  /**
  	Find a file or directory by walking up parent directories.
  	@param name - Name of the file or directory to find. Can be multiple.
  	@returns The first path found (by respecting the order of `name`s) or `undefined` if none could be found.
  	@example
  	```
  	// /
  	// └── Users
  	//     └── sindresorhus
  	//         ├── unicorn.png
  	//         └── foo
  	//             └── bar
  	//                 ├── baz
  	//                 └── example.js
  	// example.js
  	import findUp = require('find-up');
  	(async () => {
  		console.log(await findUp('unicorn.png'));
  		//=> '/Users/sindresorhus/unicorn.png'
  		console.log(await findUp(['rainbow.png', 'unicorn.png']));
  		//=> '/Users/sindresorhus/unicorn.png'
  	})();
  	```
  	*/
  def apply(name: String): js.Promise[js.UndefOr[String]] = js.native
  def apply(name: String, options: Options): js.Promise[js.UndefOr[String]] = js.native
  def apply(name: js.Array[String]): js.Promise[js.UndefOr[String]] = js.native
  def apply(name: js.Array[String], options: Options): js.Promise[js.UndefOr[String]] = js.native
  /**
  	Check if a path exists.
  	@param path - Path to a file or directory.
  	@returns Whether the path exists.
  	@example
  	```
  	import findUp = require('find-up');
  	(async () => {
  		console.log(await findUp.exists('/Users/sindresorhus/unicorn.png'));
  		//=> true
  	})();
  	```
  	*/
  def exists(path: String): js.Promise[Boolean] = js.native
  /**
  		Synchronously find a file or directory by walking up parent directories.
  		@param matcher - Called for each directory in the search. Return a path or `findUp.stop` to stop the search.
  		@returns The first path found or `undefined` if none could be found.
  		@example
  		```
  		import path = require('path');
  		import findUp = require('find-up');
  		console.log(findUp.sync(directory => {
  			const hasUnicorns = findUp.sync.exists(path.join(directory, 'unicorn.png'));
  			return hasUnicorns && directory;
  		}, {type: 'directory'}));
  		//=> '/Users/sindresorhus'
  		```
  		*/
  def sync(matcher: js.Function1[/* directory */ String, Match]): js.UndefOr[String] = js.native
  def sync(matcher: js.Function1[/* directory */ String, Match], options: Options): js.UndefOr[String] = js.native
  /**
  		Synchronously find a file or directory by walking up parent directories.
  		@param name - Name of the file or directory to find. Can be multiple.
  		@returns The first path found (by respecting the order of `name`s) or `undefined` if none could be found.
  		*/
  def sync(name: String): js.UndefOr[String] = js.native
  def sync(name: String, options: Options): js.UndefOr[String] = js.native
  def sync(name: js.Array[String]): js.UndefOr[String] = js.native
  def sync(name: js.Array[String], options: Options): js.UndefOr[String] = js.native
}

