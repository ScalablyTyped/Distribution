package typings
package firefoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait App extends js.Object {
  var installOrigin: java.lang.String
  var installTime: scala.Double
  var manifest: js.Any
  var manifestURL: java.lang.String
  var origin: java.lang.String
  var receipts: js.Array[_]
  def checkForUpdate(): DOMRequest[_]
  def launch(): scala.Unit
}

