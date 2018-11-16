package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MultiMatchQuery")
@js.native
class MultiMatchQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MultiMatchQuery {
  /*
       A Query that allow to more easily build a MatchQuery
       over multiple fields
       */
  def this(fields: java.lang.String, qstr: java.lang.String) = this()
  /*
       A Query that allow to more easily build a MatchQuery
       over multiple fields
       */
  def this(fields: js.Array[java.lang.String], qstr: java.lang.String) = this()
}

