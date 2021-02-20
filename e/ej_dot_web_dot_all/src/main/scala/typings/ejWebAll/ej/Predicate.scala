package typings.ejWebAll.ej

import typings.ejWebAll.anon.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends StObject {
  
  def and(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean): Predicate = js.native
  def and(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  
  def or(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean): Predicate = js.native
  def or(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  def or(predicate: js.Array[_]): js.Any = js.native
  
  def toJSON(): Condition = js.native
  
  def validate(record: js.Any): Boolean = js.native
}
