package typings
package formidableLib.formidableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait File extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var name: java.lang.String
  var path: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  def toJSON(): js.Object
}

