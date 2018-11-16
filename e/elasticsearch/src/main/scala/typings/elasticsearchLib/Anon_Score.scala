package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Score[T] extends js.Object {
  var _explanation: js.UndefOr[elasticsearchLib.elasticsearchMod.Explanation] = js.undefined
  var _id: java.lang.String
  var _index: java.lang.String
  var _score: scala.Double
  var _source: T
  var _type: java.lang.String
  var _version: js.UndefOr[scala.Double] = js.undefined
  var fields: js.UndefOr[js.Any] = js.undefined
  var highlight: js.UndefOr[js.Any] = js.undefined
  var inner_hits: js.UndefOr[js.Any] = js.undefined
  var matched_queries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

