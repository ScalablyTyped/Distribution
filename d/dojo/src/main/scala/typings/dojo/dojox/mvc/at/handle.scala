package typings.dojo.dojox.mvc.at

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/at.handle.html
  *
  * A handle of data binding target (a dojo/Stateful property), which is used for start synchronization with data binding source (another dojo/Stateful property).
  *
  */
trait handle extends js.Object {
  /**
    * The data binding bindDirection, choose from: dojox/mvc/sync.from, dojox/mvc/sync.to or dojox/mvc/sync.both.
    *
    */
  var bindDirection: Double
  /**
    * Class/object containing the converter functions used when the data goes between data binding target (e.g. data model or controller) to data binding origin (e.g. widget).
    *
    */
  var converter: js.Object
  /**
    * The data binding literal or dojo/Stateful to be synchronized.
    *
    */
  var target: js.Object
  /**
    * The property name in target to be synchronized.
    *
    */
  var targetProp: String
  /**
    * Sets data binding bindDirection.
    *
    * @param bindDirection The data binding bindDirection, choose from: dojox/mvc/sync.from, dojox/mvc/sync.to or dojox/mvc/sync.both.
    */
  def direction(bindDirection: Double): Unit
  /**
    * Sets a function to check if a value has really been changed when source/target dojo/Stateful changes.
    *
    * @param equals The function to check for the change.Should take two arguments, and should return true when those two are considered equal.
    */
  def equals(equals: js.Function): Unit
  /**
    * Attach a data converter.
    *
    * @param converter Class/object containing the converter functions used when the data goes between data binding target (e.g. data model or controller) to data binding origin (e.g. widget).
    */
  def transform(converter: js.Object): Unit
}

/**
  * A handle of data binding target (a dojo/Stateful property), which is used for start synchronization with data binding source (another dojo/Stateful property).
  *
  */
@JSGlobal("dojox.mvc.at.handle")
@js.native
object handle
  extends TopLevel[js.Object]

