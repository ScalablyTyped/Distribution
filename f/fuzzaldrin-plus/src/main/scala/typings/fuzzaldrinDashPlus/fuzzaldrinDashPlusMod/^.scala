package typings.fuzzaldrinDashPlus.fuzzaldrinDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzaldrin-plus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filter[T](data: js.Array[T], query: String): js.Array[T] = js.native
  def filter[T](data: js.Array[T], query: String, options: IFilterOptions): js.Array[T] = js.native
  def `match`(str: String, query: String): js.Array[Double] = js.native
  def `match`(str: String, query: String, options: IOptions): js.Array[Double] = js.native
  def prepareQuery(query: String): Query = js.native
  def prepareQuery(query: String, options: IOptions): Query = js.native
  def score(str: String, query: String): Double = js.native
  def score(str: String, query: String, options: IOptions): Double = js.native
  def wrap(str: String, query: String): String = js.native
  def wrap(str: String, query: String, options: IOptions): String = js.native
}

