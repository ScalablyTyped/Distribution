package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MultiSelectMode extends StObject
@JSGlobal("ej.MultiSelectMode")
@js.native
object MultiSelectMode extends StObject {
  
  //can select multiple items and it's separated by delimiterChar
  @js.native
  sealed trait Delimiter
    extends StObject
       with MultiSelectMode
  
  //can select only single item in DropDownList
  @js.native
  sealed trait None
    extends StObject
       with MultiSelectMode
  
  //can select multiple items and it's show's like visual box in textbox
  @js.native
  sealed trait VisualMode
    extends StObject
       with MultiSelectMode
}
