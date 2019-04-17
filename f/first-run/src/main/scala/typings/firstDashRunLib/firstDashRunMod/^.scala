package typings
package firstDashRunLib.firstDashRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("first-run", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Check if it's the first time the process is run.
  	@example
  	```
  	// x.js
  	import firstRun = require('first-run');
  	console.log(firstRun());
  	// $ node x.js
  	// true
  	// $ node x.js
  	// false
  	```
  	*/
  def apply(): scala.Boolean = js.native
  def apply(options: Options): scala.Boolean = js.native
  /**
  	Clear the state.
  	*/
  def clear(): scala.Unit = js.native
  def clear(options: Options): scala.Unit = js.native
}

