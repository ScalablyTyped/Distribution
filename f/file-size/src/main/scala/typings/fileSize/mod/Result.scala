package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  def calculate(): Calculated = js.native
  def calculate(spec: Spec): Calculated = js.native
  
  def human(): String = js.native
  def human(spec: Spec): String = js.native
  
  def to(unit: Unit): String = js.native
  def to(unit: Unit, spec: Spec): String = js.native
}
