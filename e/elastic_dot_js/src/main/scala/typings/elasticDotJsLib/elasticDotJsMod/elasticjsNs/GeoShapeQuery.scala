package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeoShapeQuery extends Query {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets the boost value for documents matching the Query.
       */
  def boost(boost: stdLib.Number): GeoShapeQuery
  /*
       Sets the field to query against.
       */
  def field(f: java.lang.String): GeoShapeQuery
  /*
       Sets the indexed shape.  Use this if you already have shape definitions
       already indexed.
       */
  def indexedShape(indexedShape: java.lang.String): GeoShapeQuery
  /*
       Sets the shape relation type.  A relationship between a Query Shape
       and indexed Shapes that will be used to determine if a Document
       should be matched or not.  Valid values are:  intersects, disjoint,
       and within.
       */
  def relation(indexedShape: java.lang.String): GeoShapeQuery
  /*
       Sets the shape
       */
  def shape(shape: java.lang.String): GeoShapeQuery
  /*
       Sets the spatial strategy.
       Valid values are:
  
  
       recursive - default, recursively traverse nodes in
       the spatial prefix tree.  This strategy has support for
       searching non-point shapes.
       term - uses a large TermsFilter on each node
       in the spatial prefix tree.  It only supports the search of
       indexed Point shapes.
  
  
       This is an advanced setting, use with care.
       */
  def strategy(strategy: java.lang.String): GeoShapeQuery
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
}

