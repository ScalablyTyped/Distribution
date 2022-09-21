package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on groups.
  */
@JSGlobal("BootstrapClientAccordionGroupEventArgs")
@js.native
open class BootstrapClientAccordionGroupEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.BootstrapClientAccordionGroupEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionGroupEventArgs type with the specified value.
    * @param group An BootstrapAccordionGroup object representing the group related to the event.
    */
  def this(group: typings.devexpressWeb.BootstrapClientAccordionGroup) = this()
  
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  var group: typings.devexpressWeb.BootstrapClientAccordionGroup = js.native
}
