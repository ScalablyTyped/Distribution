package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gitignore extends js.Object {
  /**
  	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
  	@returns A `Promise` for a filter function indicating whether a given path is ignored via a `.gitignore` file.
  	@example
  	```
  	import {gitignore} from 'globby';
  	(async () => {
  		const isIgnored = await gitignore();
  		console.log(isIgnored('some/file'));
  	})();
  	```
  	*/
  def apply(): js.Promise[globbyLib.globbyMod.globbyNs.FilterFunction] = js.native
  def apply(options: globbyLib.globbyMod.globbyNs.GitignoreOptions): js.Promise[globbyLib.globbyMod.globbyNs.FilterFunction] = js.native
  /**
  	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
  	*/
  def sync(): globbyLib.globbyMod.globbyNs.FilterFunction = js.native
  def sync(options: globbyLib.globbyMod.globbyNs.GitignoreOptions): globbyLib.globbyMod.globbyNs.FilterFunction = js.native
}

