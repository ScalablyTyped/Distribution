package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  /**
    * [descr:Query.aggregate(seed, step, finalize)]
    */
  def aggregate(seed: js.Any, step: js.Function, finalize: js.Function): Promise[_] with JQueryPromise[_] = js.native
  /**
    * [descr:Query.aggregate(step)]
    */
  def aggregate(step: js.Function): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:Query.avg()]
    */
  def avg(): Promise[Double] with JQueryPromise[Double] = js.native
  /**
    * [descr:Query.avg(getter)]
    */
  def avg(getter: js.Any): Promise[Double] with JQueryPromise[Double] = js.native
  
  /**
    * [descr:Query.count()]
    */
  def count(): Promise[Double] with JQueryPromise[Double] = js.native
  
  /**
    * [descr:Query.enumerate()]
    */
  def enumerate(): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:Query.filter(criteria)]
    */
  def filter(criteria: js.Array[_]): Query = js.native
  /**
    * [descr:Query.filter(predicate)]
    */
  def filter(predicate: js.Function): Query = js.native
  
  /**
    * [descr:Query.groupBy(getter)]
    */
  def groupBy(getter: js.Any): Query = js.native
  
  /**
    * [descr:Query.max()]
    */
  def max(): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /**
    * [descr:Query.max(getter)]
    */
  def max(getter: js.Any): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  
  /**
    * [descr:Query.min()]
    */
  def min(): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /**
    * [descr:Query.min(getter)]
    */
  def min(getter: js.Any): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  
  /**
    * [descr:Query.select(getter)]
    */
  def select(getter: js.Any): Query = js.native
  
  /**
    * [descr:Query.slice(skip, take)]
    */
  def slice(skip: Double): Query = js.native
  def slice(skip: Double, take: Double): Query = js.native
  
  /**
    * [descr:Query.sortBy(getter)]
    */
  def sortBy(getter: js.Any): Query = js.native
  /**
    * [descr:Query.sortBy(getter, desc)]
    */
  def sortBy(getter: js.Any, desc: Boolean): Query = js.native
  
  /**
    * [descr:Query.sum()]
    */
  def sum(): Promise[Double] with JQueryPromise[Double] = js.native
  /**
    * [descr:Query.sum(getter)]
    */
  def sum(getter: js.Any): Promise[Double] with JQueryPromise[Double] = js.native
  
  /**
    * [descr:Query.thenBy(getter)]
    */
  def thenBy(getter: js.Any): Query = js.native
  /**
    * [descr:Query.thenBy(getter, desc)]
    */
  def thenBy(getter: js.Any, desc: Boolean): Query = js.native
  
  /**
    * [descr:Query.toArray()]
    */
  def toArray(): js.Array[_] = js.native
}
