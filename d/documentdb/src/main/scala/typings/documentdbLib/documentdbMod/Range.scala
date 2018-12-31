package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("documentdb", "Range")
@js.native
class Range protected () extends js.Object {
  /**
    * DEPRECATED
    *
    * Support for IPartitionResolver is now obsolete.
    * It's recommended that you use Partitioned Collections for higher storage and throughput.
    *
    * @deprecated
    * @param options -  The Range constructor options.
    */
  def this(options: RangeOptions) = this()
}

