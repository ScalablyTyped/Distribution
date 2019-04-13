package typings
package fkillLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  def apply(input: java.lang.String): js.Promise[scala.Unit] = js.native
  def apply(input: java.lang.String, options: fkillLib.fkillMod.Options): js.Promise[scala.Unit] = js.native
  def apply(input: js.Array[java.lang.String | scala.Double]): js.Promise[scala.Unit] = js.native
  def apply(input: js.Array[java.lang.String | scala.Double], options: fkillLib.fkillMod.Options): js.Promise[scala.Unit] = js.native
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
  def apply(input: scala.Double): js.Promise[scala.Unit] = js.native
  def apply(input: scala.Double, options: fkillLib.fkillMod.Options): js.Promise[scala.Unit] = js.native
}

