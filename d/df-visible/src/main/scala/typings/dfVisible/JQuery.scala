package typings.dfVisible

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    * @param callback The callback parameter should be a function that looks like this:
    * function(object details) {...};
    */
  def visible(): Boolean = js.native
  def visible(partial: Boolean): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Unit, container: JQuery): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Direction): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Direction, container: JQuery): Boolean = js.native
  def visible(partial: Boolean, hidden: Unit, direction: Unit, container: JQuery): Boolean = js.native
  def visible(partial: Boolean, hidden: Unit, direction: Direction): Boolean = js.native
  def visible(partial: Boolean, hidden: Unit, direction: Direction, container: JQuery): Boolean = js.native
  def visible(partial: Unit, hidden: Boolean): Boolean = js.native
  def visible(partial: Unit, hidden: Boolean, direction: Unit, container: JQuery): Boolean = js.native
  def visible(partial: Unit, hidden: Boolean, direction: Direction): Boolean = js.native
  def visible(partial: Unit, hidden: Boolean, direction: Direction, container: JQuery): Boolean = js.native
  def visible(partial: Unit, hidden: Unit, direction: Unit, container: JQuery): Boolean = js.native
  def visible(partial: Unit, hidden: Unit, direction: Direction): Boolean = js.native
  def visible(partial: Unit, hidden: Unit, direction: Direction, container: JQuery): Boolean = js.native
}
