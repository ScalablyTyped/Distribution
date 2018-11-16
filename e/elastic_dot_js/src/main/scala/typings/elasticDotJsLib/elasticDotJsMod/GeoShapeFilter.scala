package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoShapeFilter")
@js.native
class GeoShapeFilter ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enable or disable caching of the filter
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Sets the field to filter against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Sets the indexed shape.  Use this if you already have shape definitions
       already indexed.
       */
  /* CompleteClass */
  override def indexedShape(indexedShape: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Sets the shape relation type.  A relationship between a Query Shape
       and indexed Shapes that will be used to determine if a Document
       should be matched or not.  Valid values are:  intersects, disjoint,
       and within.
       */
  /* CompleteClass */
  override def relation(indexedShape: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Sets the shape
       */
  /* CompleteClass */
  override def shape(shape: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
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
  /* CompleteClass */
  override def strategy(strategy: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeFilter = js.native
}

