package typings.fluentuiMergeStyles

import typings.fluentuiMergeStyles.deepPartialMod.DeepPartial
import typings.fluentuiMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.fluentuiMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatStyleSetsWithPropsMod {
  
  @JSImport("@fluentui/merge-styles/lib/concatStyleSetsWithProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSetsWithProps")(List(styleProps.asInstanceOf[js.Any]).`++`(allStyles.asInstanceOf[Seq[js.Any]])*).asInstanceOf[DeepPartial[TStyleSet]]
}
