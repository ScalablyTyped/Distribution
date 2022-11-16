package typings.fluentuiMergeStyles

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIstyleMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiMergeStyles.libIstyleMod.IStyleBase
    - typings.fluentuiMergeStyles.libIstyleMod.IStyleBaseArray
  */
  type IStyle = js.UndefOr[_IStyle | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiMergeStyles.libIrawstyleMod.IRawStyle
    - java.lang.String
    - typings.fluentuiMergeStyles.fluentuiMergeStylesBooleans.`false`
    - scala.Null
    - scala.Unit
  */
  type IStyleBase = js.UndefOr[_IStyleBase | String | Null]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type IStyleBaseArray = std.Array<@fluentui/merge-styles.@fluentui/merge-styles/lib/IStyle.IStyle>
  }}}
  to avoid circular code involving: 
  - @fluentui/merge-styles.@fluentui/merge-styles/lib/IStyle.IStyle
  - @fluentui/merge-styles.@fluentui/merge-styles/lib/IStyle.IStyleBaseArray
  */
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
