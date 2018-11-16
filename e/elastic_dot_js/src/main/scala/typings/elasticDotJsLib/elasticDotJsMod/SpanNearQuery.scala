package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanNearQuery")
@js.native
class SpanNearQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SpanNearQuery {
  /*
       Matches spans which are near one another.
       */
  def this(clauses: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query, slop: scala.Double) = this()
  /*
       Matches spans which are near one another.
       */
  def this(clauses: js.Array[elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query], slop: scala.Double) = this()
}

