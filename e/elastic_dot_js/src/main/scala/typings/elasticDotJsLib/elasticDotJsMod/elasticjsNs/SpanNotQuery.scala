package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpanNotQuery extends Query {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets the boost value for documents matching the Query.
       */
  def boost(boost: scala.Double): SpanNotQuery
  /*
       Sets the span query whose matches must not overlap those returned.
       */
  def exclude(spanQuery: js.Object): SpanNotQuery
  /*
       Set the span query whose matches are filtered.
       */
  def include(spanQuery: js.Object): SpanNotQuery
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
}

