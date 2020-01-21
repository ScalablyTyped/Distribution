package typings.dojo.dijit.base

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/wai.html
  *
  * Deprecated methods for setting/getting wai roles and states.
  * New code should call setAttribute()/getAttribute() directly.
  * 
  * Also loads hccss to apply dj_a11y class to root node if machine is in high-contrast mode.
  * 
  */
trait wai extends js.Object {
  /**
    * Gets the role for an element (which should be a wai role).
    * 
    * @param elem             
    */
  def getWaiRole(elem: HTMLElement): js.Any
  /**
    * Gets the value of a state on an element.
    * Checks for an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def getWaiState(elem: HTMLElement, state: String): js.Any
  /**
    * Determines if an element has a particular role.
    * 
    * @param elem             
    * @param role               Optional            
    */
  def hasWaiRole(elem: HTMLElement, role: String): js.Any
  /**
    * Determines if an element has a given state.
    * Checks for an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def hasWaiState(elem: HTMLElement, state: String): js.Any
  /**
    * Removes the specified role from an element.
    * Removes role attribute if no specific role provided (for backwards compat.)
    * 
    * @param elem             
    * @param role             
    */
  def removeWaiRole(elem: HTMLElement, role: String): Unit
  /**
    * Removes a state from an element.
    * Sets an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def removeWaiState(elem: HTMLElement, state: String): Unit
  /**
    * Sets the role on an element.
    * Replace existing role attribute with new role.
    * 
    * @param elem             
    * @param role             
    */
  def setWaiRole(elem: HTMLElement, role: String): Unit
  /**
    * Sets a state on an element.
    * Sets an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    * @param value             
    */
  def setWaiState(elem: HTMLElement, state: String, value: String): Unit
}

object wai {
  @scala.inline
  def apply(
    getWaiRole: HTMLElement => js.Any,
    getWaiState: (HTMLElement, String) => js.Any,
    hasWaiRole: (HTMLElement, String) => js.Any,
    hasWaiState: (HTMLElement, String) => js.Any,
    removeWaiRole: (HTMLElement, String) => Unit,
    removeWaiState: (HTMLElement, String) => Unit,
    setWaiRole: (HTMLElement, String) => Unit,
    setWaiState: (HTMLElement, String, String) => Unit
  ): wai = {
    val __obj = js.Dynamic.literal(getWaiRole = js.Any.fromFunction1(getWaiRole), getWaiState = js.Any.fromFunction2(getWaiState), hasWaiRole = js.Any.fromFunction2(hasWaiRole), hasWaiState = js.Any.fromFunction2(hasWaiState), removeWaiRole = js.Any.fromFunction2(removeWaiRole), removeWaiState = js.Any.fromFunction2(removeWaiState), setWaiRole = js.Any.fromFunction2(setWaiRole), setWaiState = js.Any.fromFunction3(setWaiState))
  
    __obj.asInstanceOf[wai]
  }
}

