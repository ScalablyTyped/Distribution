package typings.downshift.downshiftMod

import typings.downshift.Fn_Abort
import typings.downshift.Fn_AbortAfterprint
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var addEventListener: Fn_Abort
  var document: Document
  var removeEventListener: Fn_AbortAfterprint
}

object Environment {
  @scala.inline
  def apply(addEventListener: Fn_Abort, document: Document, removeEventListener: Fn_AbortAfterprint): Environment = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, document = document, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[Environment]
  }
}

