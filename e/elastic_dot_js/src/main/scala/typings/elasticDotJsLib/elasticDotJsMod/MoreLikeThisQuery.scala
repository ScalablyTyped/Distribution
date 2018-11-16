package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MoreLikeThisQuery")
@js.native
class MoreLikeThisQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.MoreLikeThisQuery {
  /*
       Constructs a query where each documents returned are “like” provided text
       */
  def this(fields: java.lang.String, likeText: java.lang.String) = this()
  /*
       Constructs a query where each documents returned are “like” provided text
       */
  def this(fields: js.Array[java.lang.String], likeText: java.lang.String) = this()
}

