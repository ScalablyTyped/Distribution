package typings.geokdbush

import typings.kdbush.mod.KDBush
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geokdbush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def around[T](index: KDBush, longitude: Double, latitude: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](index: KDBush, longitude: Double, latitude: Double, maxResults: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](index: KDBush, longitude: Double, latitude: Double, maxResults: Double, maxDistance: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](
    index: KDBush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Double,
    filterFn: Any
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](
    index: KDBush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Unit,
    filterFn: Any
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](index: KDBush, longitude: Double, latitude: Double, maxResults: Unit, maxDistance: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](
    index: KDBush,
    longitude: Double,
    latitude: Double,
    maxResults: Unit,
    maxDistance: Double,
    filterFn: Any
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def around[T](
    index: KDBush,
    longitude: Double,
    latitude: Double,
    maxResults: Unit,
    maxDistance: Unit,
    filterFn: Any
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def distance(longitude1: Double, latitude1: Double, longitude2: Double, latitude2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(longitude1.asInstanceOf[js.Any], latitude1.asInstanceOf[js.Any], longitude2.asInstanceOf[js.Any], latitude2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
