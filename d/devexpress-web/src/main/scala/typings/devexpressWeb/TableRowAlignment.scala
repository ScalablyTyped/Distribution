package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableRowAlignment extends StObject
/**
  * Lists alignments allowed for the table row.
  */
@JSGlobal("TableRowAlignment")
@js.native
object TableRowAlignment extends StObject {
  
  /**
    * Justified.
    */
  @js.native
  sealed trait Both
    extends StObject
       with TableRowAlignment
  
  /**
    * Align center.
    */
  @js.native
  sealed trait Center
    extends StObject
       with TableRowAlignment
  
  /**
    * Distribute all characters equally.
    */
  @js.native
  sealed trait Distribute
    extends StObject
       with TableRowAlignment
  
  /**
    * Align left.
    */
  @js.native
  sealed trait Left
    extends StObject
       with TableRowAlignment
  
  /**
    * Align to the list tab.
    */
  @js.native
  sealed trait NumTab
    extends StObject
       with TableRowAlignment
  
  /**
    * Align right.
    */
  @js.native
  sealed trait Right
    extends StObject
       with TableRowAlignment
}
