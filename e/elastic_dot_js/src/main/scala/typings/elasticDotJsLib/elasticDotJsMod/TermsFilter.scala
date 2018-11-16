package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermsFilter")
@js.native
class TermsFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.TermsFilter {
  /*
       A Filter that matches documents containing provided terms.
       */
  def this(field: java.lang.String, terms: java.lang.String) = this()
  /*
       A Filter that matches documents containing provided terms.
       */
  def this(field: java.lang.String, terms: js.Array[java.lang.String]) = this()
}

