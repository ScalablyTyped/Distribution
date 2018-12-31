package typings
package ejsLib.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def get(key: java.lang.String): js.UndefOr[TemplateFunction]
  def set(key: java.lang.String, `val`: TemplateFunction): scala.Unit
}

