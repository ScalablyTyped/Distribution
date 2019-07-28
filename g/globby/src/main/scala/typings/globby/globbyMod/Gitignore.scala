package typings.globby.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gitignore extends js.Object {
  /**
  	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
  	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
  	@example
  	```
  	import {gitignore} from 'globby';
  	(async () => {
  		const isIgnored = await gitignore();
  		console.log(isIgnored('some/file'));
  	})();
  	```
  	*/
  def apply(): js.Promise[FilterFunction] = js.native
  def apply(options: GitignoreOptions): js.Promise[FilterFunction] = js.native
  /**
  	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
  	*/
  def sync(): FilterFunction = js.native
  def sync(options: GitignoreOptions): FilterFunction = js.native
}

