package typings.fluentuiMergeStyles

import org.scalablytyped.runtime.TopLevel
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object istylesetMod {
  
  type Diff[T /* <: /* keyof any */ String */, U /* <: /* keyof any */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  
  @js.native
  trait IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @fluentui/merge-styles.@fluentui/merge-styles/lib/IStyleFunction.IStyleFunction<any, any>}
      */ typings.fluentuiMergeStyles.fluentuiMergeStylesStrings.IConcatenatedStyleSet & TopLevel[Any]
      ] = js.native
  }
  
  @js.native
  trait IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var subComponentStyles: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @fluentui/merge-styles.@fluentui/merge-styles/lib/IStyleSet.__MapToFunctionType<TStyleSet['subComponentStyles'] extends infer J? P extends keyof any? any[P] : never : never>}
      */ typings.fluentuiMergeStyles.fluentuiMergeStylesStrings.IProcessedStyleSet & TopLevel[Any] = js.native
  }
  
  @js.native
  trait IStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @fluentui/merge-styles.@fluentui/merge-styles/lib/IStyleFunction.IStyleFunctionOrObject<any, any>}
      */ typings.fluentuiMergeStyles.fluentuiMergeStylesStrings.IStyleSet & TopLevel[Any]
      ] = js.native
  }
  
  type MapToFunctionType[T] = (Extract[T, js.Function]) | (js.Function1[/* repeated */ Any, Partial[T]])
  
  type Omit[U, K /* <: /* keyof U */ String */] = Pick[U, Diff[/* keyof U */ String, K]]
}
