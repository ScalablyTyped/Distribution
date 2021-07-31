package typings.elasticJs.mod

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "GeoShapeQuery")
@js.native
/*
  A Query to find documents with a geo_shapes matching a specific shape.
  */
class GeoShapeQuery ()
  extends StObject
     with Query {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Number): GeoShapeQuery = js.native
  
  /*
    Sets the field to query against.
    */
  def field(f: String): GeoShapeQuery = js.native
  
  /*
    Sets the indexed shape.  Use this if you already have shape definitions
    already indexed.
    */
  def indexedShape(indexedShape: String): GeoShapeQuery = js.native
  
  /*
    Sets the shape relation type.  A relationship between a Query Shape
    and indexed Shapes that will be used to determine if a Document
    should be matched or not.  Valid values are:  intersects, disjoint,
    and within.
    */
  def relation(indexedShape: String): GeoShapeQuery = js.native
  
  /*
    Sets the shape
    */
  def shape(shape: String): GeoShapeQuery = js.native
  
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
  def strategy(strategy: String): GeoShapeQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
