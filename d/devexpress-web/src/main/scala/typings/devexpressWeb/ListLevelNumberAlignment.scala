package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListLevelNumberAlignment extends StObject
/**
  * Lists values that specify the paragraph text alignment within numbered list levels.
  */
@JSGlobal("ListLevelNumberAlignment")
@js.native
object ListLevelNumberAlignment extends StObject {
  
  /**
    * Text is aligned to the center of the list level's paragraph.
    */
  @js.native
  sealed trait Center
    extends StObject
       with ListLevelNumberAlignment
  
  /**
    * Text is aligned to the left of the list level's paragraph.
    */
  @js.native
  sealed trait Left
    extends StObject
       with ListLevelNumberAlignment
  
  /**
    * Text is aligned to the right of the list level's paragraph.
    */
  @js.native
  sealed trait Right
    extends StObject
       with ListLevelNumberAlignment
}
