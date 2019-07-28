package typings.fkill

import typings.fkill.fkillMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  def apply(input: String): js.Promise[Unit] = js.native
  def apply(input: String, options: Options): js.Promise[Unit] = js.native
  def apply(input: js.Array[String | Double]): js.Promise[Unit] = js.native
  def apply(input: js.Array[String | Double], options: Options): js.Promise[Unit] = js.native
  /**
  	Fabulously kill processes. Cross-platform.
  	@param input - One or more process IDs/names/ports to kill. To kill a port, prefix it with a colon. For example: `:8080`.
  	@example
  	```
  	import fkill = require('fkill');
  	(async () => {
  		await fkill(1337);
  		console.log('Killed process');
  	})();
  	fkill('Safari');
  	fkill(':8080');
  	fkill([1337, 'Safari', ':8080']);
  	```
  	*/
  def apply(input: Double): js.Promise[Unit] = js.native
  def apply(input: Double, options: Options): js.Promise[Unit] = js.native
}

