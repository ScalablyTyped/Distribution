package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResponse[T] extends js.Object {
  var _id: java.lang.String
  var _index: java.lang.String
  var _routing: js.UndefOr[java.lang.String] = js.undefined
  var _source: T
  var _type: java.lang.String
  var _version: scala.Double
  var found: scala.Boolean
}

