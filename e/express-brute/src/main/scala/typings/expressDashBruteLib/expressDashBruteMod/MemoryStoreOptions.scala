package typings
package expressDashBruteLib.expressDashBruteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStoreOptions extends js.Object {
  /**
    * @summary Key prefix.
    * @type {string}
    */
  var prefix: java.lang.String
}

object MemoryStoreOptions {
  @scala.inline
  def apply(prefix: java.lang.String): MemoryStoreOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix)
  
    __obj.asInstanceOf[MemoryStoreOptions]
  }
}

