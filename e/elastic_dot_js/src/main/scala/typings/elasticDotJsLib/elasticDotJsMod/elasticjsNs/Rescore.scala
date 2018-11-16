package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Rescore extends js.Object {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets the weight assigned to the original query of the rescoring.
       */
  def queryWeight(weight: stdLib.Number): Rescore
  /*
       Sets the query used by the rescoring.
       */
  def rescoreQuery(someQuery: Query): Rescore
  /*
       Sets the weight assigned to the query used to rescore the original query.
       */
  def rescoreQueryWeight(weight: stdLib.Number): Rescore
  /*
       Sets the scoring mode.  Valid values are:
  
       total - default mode, the scores combined
       multiply - the scores multiplied
       min - the lowest of the scores
       max - the highest score
       avg - the average of the scores
       */
  def scoreMode(s: java.lang.String): Rescore
  /*
       Retrieves the internal script object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
  /*
       Sets the window_size parameter of the rescoring.
       */
  def windowSize(size: stdLib.Number): Rescore
}

