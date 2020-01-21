package typings.findUp

import typings.findUp.mod.Match
import typings.findUp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirectory extends js.Object {
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
  def apply(matcher: js.Function1[/* directory */ String, Match]): js.UndefOr[String] = js.native
  def apply(matcher: js.Function1[/* directory */ String, Match], options: Options): js.UndefOr[String] = js.native
  /**
  		Synchronously find a file or directory by walking up parent directories.
  		@param name - Name of the file or directory to find. Can be multiple.
  		@returns The first path found (by respecting the order of `name`s) or `undefined` if none could be found.
  		*/
  def apply(name: String): js.UndefOr[String] = js.native
  def apply(name: String, options: Options): js.UndefOr[String] = js.native
  def apply(name: js.Array[String]): js.UndefOr[String] = js.native
  def apply(name: js.Array[String], options: Options): js.UndefOr[String] = js.native
  /**
  		Synchronously check if a path exists.
  		@param path - Path to the file or directory.
  		@returns Whether the path exists.
  		@example
  		```
  		import findUp = require('find-up');
  		console.log(findUp.sync.exists('/Users/sindresorhus/unicorn.png'));
  		//=> true
  		```
  		*/
  def exists(path: String): Boolean = js.native
}

