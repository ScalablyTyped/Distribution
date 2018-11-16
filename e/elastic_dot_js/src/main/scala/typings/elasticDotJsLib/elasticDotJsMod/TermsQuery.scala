package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermsQuery")
@js.native
class TermsQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermsQuery {
  /*
       A Query that matches documents containing provided terms.
       */
  def this(field: java.lang.String, terms: java.lang.String) = this()
  /*
       A Query that matches documents containing provided terms.
       */
  def this(field: java.lang.String, terms: js.Array[java.lang.String]) = this()
}

