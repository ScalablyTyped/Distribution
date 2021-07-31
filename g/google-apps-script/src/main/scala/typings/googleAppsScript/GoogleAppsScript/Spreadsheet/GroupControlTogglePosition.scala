package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupControlTogglePosition extends StObject
/**
  * An enumeration representing the possible positions that a group control toggle can have.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
@js.native
object GroupControlTogglePosition extends StObject {
  
  @js.native
  sealed trait AFTER
    extends StObject
       with GroupControlTogglePosition
  
  @js.native
  sealed trait BEFORE
    extends StObject
       with GroupControlTogglePosition
}
