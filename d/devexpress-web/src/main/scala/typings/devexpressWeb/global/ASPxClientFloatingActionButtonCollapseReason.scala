package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values specifying whether the user action or APIs has collapsed the action group.
  */
@JSGlobal("ASPxClientFloatingActionButtonCollapseReason")
@js.native
class ASPxClientFloatingActionButtonCollapseReason ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFloatingActionButtonCollapseReason {
  
  /**
    * The action group is collapsed using APIs.
    */
  /* CompleteClass */
  var API: String = js.native
  
  /**
    * The action group is collapsed by clicking on the action item.
    */
  /* CompleteClass */
  var ActionItem: String = js.native
  
  /**
    * The action group is collapsed using the collapse button.
    */
  /* CompleteClass */
  var CollapseButton: String = js.native
}
