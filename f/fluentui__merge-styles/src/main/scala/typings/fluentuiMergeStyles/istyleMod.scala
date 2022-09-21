package typings.fluentuiMergeStyles

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object istyleMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiMergeStyles.istyleMod.IStyleBase
    - typings.fluentuiMergeStyles.istyleMod.IStyleBaseArray
  */
  type IStyle = js.UndefOr[_IStyle | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiMergeStyles.irawstyleMod.IRawStyle
    - java.lang.String
    - typings.fluentuiMergeStyles.fluentuiMergeStylesBooleans.`false`
    - scala.Null
    - scala.Unit
  */
  type IStyleBase = js.UndefOr[_IStyleBase | String | Null]
  
  @js.native
  trait IStyleBaseArray
    extends StObject
       with Array[IStyle]
       with _IStyle
  
  trait _IStyle extends StObject
  
  trait _IStyleBase
    extends StObject
       with _IStyle
}
