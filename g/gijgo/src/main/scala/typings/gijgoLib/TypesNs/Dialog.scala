package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog
  extends gijgoLib.JQuery {
  def close(): Dialog = js.native
  def content(constent: java.lang.String): java.lang.String | Dialog = js.native
  def destroy(keepHtml: scala.Boolean): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): Dialog = js.native
}

