package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaQuery extends js.Object {
  var current: java.lang.String
  var queries: js.Array[java.lang.String]
  def atLeast(size: java.lang.String): scala.Boolean
  def get(size: java.lang.String): java.lang.String
}

