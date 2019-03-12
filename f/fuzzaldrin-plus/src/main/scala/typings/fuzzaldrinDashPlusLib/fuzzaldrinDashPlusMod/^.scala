package typings
package fuzzaldrinDashPlusLib.fuzzaldrinDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzaldrin-plus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filter[T](data: js.Array[T], query: java.lang.String): js.Array[T] = js.native
  def filter[T](data: js.Array[T], query: java.lang.String, options: IFilterOptions): js.Array[T] = js.native
  def `match`(str: java.lang.String, query: java.lang.String): js.Array[scala.Double] = js.native
  def `match`(str: java.lang.String, query: java.lang.String, options: IOptions): js.Array[scala.Double] = js.native
  def prepareQuery(query: java.lang.String): Query = js.native
  def prepareQuery(query: java.lang.String, options: IOptions): Query = js.native
  def score(str: java.lang.String, query: java.lang.String): scala.Double = js.native
  def score(str: java.lang.String, query: java.lang.String, options: IOptions): scala.Double = js.native
  def wrap(str: java.lang.String, query: java.lang.String): java.lang.String = js.native
  def wrap(str: java.lang.String, query: java.lang.String, options: IOptions): java.lang.String = js.native
}

