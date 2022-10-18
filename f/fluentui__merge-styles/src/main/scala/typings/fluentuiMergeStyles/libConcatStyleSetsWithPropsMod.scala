package typings.fluentuiMergeStyles

import typings.fluentuiMergeStyles.libDeepPartialMod.DeepPartial
import typings.fluentuiMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.fluentuiMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConcatStyleSetsWithPropsMod {
  
  @JSImport("@fluentui/merge-styles/lib/concatStyleSetsWithProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSetsWithProps")(scala.List(styleProps.asInstanceOf[js.Any]).`++`(allStyles.asInstanceOf[Seq[js.Any]])*).asInstanceOf[DeepPartial[TStyleSet]]
}
