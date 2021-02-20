package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableHeightUnitType extends StObject
/**
  * Lists values that specify unit types for the table height.
  */
@JSGlobal("TableHeightUnitType")
@js.native
object TableHeightUnitType extends StObject {
  
  /**
    * The height increases automatically to accommodate the content.
    */
  @js.native
  sealed trait Auto extends TableHeightUnitType
  
  /**
    * The exact height as specified. If the text cannot fit the height, it will appear truncated.
    */
  @js.native
  sealed trait Exact extends TableHeightUnitType
  
  /**
    * The minimum height will be the specified height. The height can be increased, if needed, to accommodate the content.
    */
  @js.native
  sealed trait Minimum extends TableHeightUnitType
}
