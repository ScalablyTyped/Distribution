package typings
package firefoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DOMRequest[T] extends js.Object {
  var error: stdLib.DOMError
  var onerror: js.Function
  var onsuccess: js.Function
  var readyState: java.lang.String
   // "done" or "pending"
  var result: T
}

