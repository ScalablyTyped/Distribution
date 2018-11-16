package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "IndicesQuery")
@js.native
class IndicesQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.IndicesQuery {
  /*
       A configurable query that is dependent on the index name.
       */
  def this(qry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query, indices: java.lang.String) = this()
  /*
       A configurable query that is dependent on the index name.
       */
  def this(qry: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Query, indices: js.Array[java.lang.String]) = this()
}

