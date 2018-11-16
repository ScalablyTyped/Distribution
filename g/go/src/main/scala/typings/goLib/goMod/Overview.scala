package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An Overview is a Diagram that displays all of a different diagram,
    * with a rectangular box showing the viewport displayed by that other diagram.
    * All you need to do is set Overview.observed.
    */
@JSImport("go", "Overview")
@js.native
class Overview ()
  extends goLib.goMod.goNs.Overview {
  /**
          * @param {HTMLDivElement} div A reference to a DIV element in the DOM.
          */
  def this(div: stdLib.HTMLDivElement) = this()
  /**
          * @param {string} id A reference to a DIV by its ID as a string.
          */
  def this(id: java.lang.String) = this()
}

