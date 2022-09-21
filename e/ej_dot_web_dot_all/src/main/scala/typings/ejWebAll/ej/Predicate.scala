package typings.ejWebAll.ej

import typings.ejWebAll.anon.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends StObject {
  
  def and(field: String, operator: Any, value: Any, ignoreCase: Boolean): Predicate = js.native
  def and(field: String, operator: Any, value: Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  
  def or(field: String, operator: Any, value: Any, ignoreCase: Boolean): Predicate = js.native
  def or(field: String, operator: Any, value: Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  def or(predicate: js.Array[Any]): Any = js.native
  
  def toJSON(): Condition = js.native
  
  def validate(record: Any): Boolean = js.native
}
