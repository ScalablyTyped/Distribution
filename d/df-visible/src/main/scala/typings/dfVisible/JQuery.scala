package typings.dfVisible

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def visible(
    partial: js.UndefOr[scala.Nothing],
    hidden: js.UndefOr[scala.Nothing],
    direction: js.UndefOr[scala.Nothing],
    container: JQuery
  ): Boolean = js.native
  def visible(partial: js.UndefOr[scala.Nothing], hidden: js.UndefOr[scala.Nothing], direction: Direction): Boolean = js.native
  def visible(
    partial: js.UndefOr[scala.Nothing],
    hidden: js.UndefOr[scala.Nothing],
    direction: Direction,
    container: JQuery
  ): Boolean = js.native
  def visible(partial: js.UndefOr[scala.Nothing], hidden: Boolean): Boolean = js.native
  def visible(
    partial: js.UndefOr[scala.Nothing],
    hidden: Boolean,
    direction: js.UndefOr[scala.Nothing],
    container: JQuery
  ): Boolean = js.native
  def visible(partial: js.UndefOr[scala.Nothing], hidden: Boolean, direction: Direction): Boolean = js.native
  def visible(partial: js.UndefOr[scala.Nothing], hidden: Boolean, direction: Direction, container: JQuery): Boolean = js.native
  def visible(partial: Boolean): Boolean = js.native
  def visible(
    partial: Boolean,
    hidden: js.UndefOr[scala.Nothing],
    direction: js.UndefOr[scala.Nothing],
    container: JQuery
  ): Boolean = js.native
  def visible(partial: Boolean, hidden: js.UndefOr[scala.Nothing], direction: Direction): Boolean = js.native
  def visible(partial: Boolean, hidden: js.UndefOr[scala.Nothing], direction: Direction, container: JQuery): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: js.UndefOr[scala.Nothing], container: JQuery): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Direction): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Direction, container: JQuery): Boolean = js.native
}
