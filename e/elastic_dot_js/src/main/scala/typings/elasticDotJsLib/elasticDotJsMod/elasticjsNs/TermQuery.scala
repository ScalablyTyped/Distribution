package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TermQuery extends Query {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets the boost value for documents matching the Query.
       */
  def boost(boost: stdLib.Number): TermQuery
  /*
       Sets the fields to query against.
       */
  def field(f: java.lang.String): TermQuery
  /*
       Sets the term.
       */
  def term(t: java.lang.String): TermQuery
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
}

