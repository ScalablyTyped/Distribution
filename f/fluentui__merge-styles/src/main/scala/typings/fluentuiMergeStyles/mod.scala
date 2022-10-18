package typings.fluentuiMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiMergeStyles.fluentuiMergeStylesBooleans.`false`
import typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`0`
import typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`1`
import typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`2`
import typings.fluentuiMergeStyles.libDeepPartialMod.DeepPartial
import typings.fluentuiMergeStyles.libIkeyframesMod.IKeyframes
import typings.fluentuiMergeStyles.libIrawstylebaseMod.IFontFace
import typings.fluentuiMergeStyles.libIstyleMod.IStyle
import typings.fluentuiMergeStyles.libIstyleMod.IStyleBaseArray
import typings.fluentuiMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.fluentuiMergeStyles.libIstyleoptionsMod.IStyleOptions
import typings.fluentuiMergeStyles.libIstylesetMod.IConcatenatedStyleSet
import typings.fluentuiMergeStyles.libIstylesetMod.IProcessedStyleSet
import typings.fluentuiMergeStyles.libIstylesetMod.IStyleSet
import typings.fluentuiMergeStyles.libObjectOnlyMod.ObjectOnly
import typings.fluentuiMergeStyles.libStylesheetMod.ISerializedStylesheet
import typings.fluentuiMergeStyles.libStylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/merge-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object InjectionMode {
    
    @JSImport("@fluentui/merge-styles", "InjectionMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends rules using appendChild.
      */
    @JSImport("@fluentui/merge-styles", "InjectionMode.appendChild")
    @js.native
    def appendChild: `2` = js.native
    inline def appendChild_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(x.asInstanceOf[js.Any])
    
    /**
      * Inserts rules using the insertRule api.
      */
    @JSImport("@fluentui/merge-styles", "InjectionMode.insertNode")
    @js.native
    def insertNode: `1` = js.native
    inline def insertNode_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(x.asInstanceOf[js.Any])
    
    /**
      * Avoids style injection, use getRules() to read the styles.
      */
    @JSImport("@fluentui/merge-styles", "InjectionMode.none")
    @js.native
    def none: `0` = js.native
    inline def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fluentui/merge-styles", "Stylesheet")
  @js.native
  open class Stylesheet ()
    extends typings.fluentuiMergeStyles.libStylesheetMod.Stylesheet {
    def this(config: IStyleSheetConfig) = this()
    def this(config: Unit, serializedStylesheet: ISerializedStylesheet) = this()
    def this(config: IStyleSheetConfig, serializedStylesheet: ISerializedStylesheet) = this()
  }
  /* static members */
  object Stylesheet {
    
    @JSImport("@fluentui/merge-styles", "Stylesheet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the singleton instance.
      */
    inline def getInstance(): typings.fluentuiMergeStyles.libStylesheetMod.Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.fluentuiMergeStyles.libStylesheetMod.Stylesheet]
  }
  
  inline def concatStyleSets[TStyleSet](): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")().asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  inline def concatStyleSets[TStyleSet](styleSet: TStyleSet): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  inline def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  inline def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSetsWithProps")(scala.List(styleProps.asInstanceOf[js.Any]).`++`(allStyles.asInstanceOf[Seq[js.Any]])*).asInstanceOf[DeepPartial[TStyleSet]]
  
  inline def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")().asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  inline def concatStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[Any]] | `false` | Null])*): IConcatenatedStyleSet[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSets.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IConcatenatedStyleSet[Any]]
  inline def concatStyleSets_false[TStyleSet](styleSet: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any], styleSet5.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5]
  ]]
  inline def concatStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4, TStyleSet5, TStyleSet6](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null],
    styleSet6: js.UndefOr[TStyleSet6 | `false` | Null]
  ): IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5] & ObjectOnly[TStyleSet6]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any], styleSet5.asInstanceOf[js.Any], styleSet6.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4] & ObjectOnly[TStyleSet5] & ObjectOnly[TStyleSet6]
  ]]
  
  inline def concatStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  inline def fontFace(font: IFontFace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fontFace")(font.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def keyframes(timeline: IKeyframes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(timeline.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeCss(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")().asInstanceOf[String]
  inline def mergeCss(args: Null, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss(args: Unit, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss(args: IStyle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss(args: IStyleBaseArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss(args: IStyleBaseArray, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss(args: IStyle, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]]): IProcessedStyleSet[TStyleSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[TStyleSet]]
  inline def mergeCssSets_false[TStyleSet](styleSets: js.Array[js.UndefOr[TStyleSet | `false` | Null]], options: IStyleOptions): IProcessedStyleSet[TStyleSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[TStyleSet]]
  inline def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]]
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2]]
  inline def mergeCssSets_false[TStyleSet1, TStyleSet2](
    styleSets: js.Tuple2[js.UndefOr[TStyleSet1 | `false` | Null], js.UndefOr[TStyleSet2 | `false` | Null]],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2]]
  inline def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ]
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3]]
  inline def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSets: js.Tuple3[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[TStyleSet1 & TStyleSet2 & TStyleSet3]]
  inline def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSets: js.Tuple4[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null], 
      js.UndefOr[TStyleSet4 | `false` | Null]
    ]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  inline def mergeCssSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSets: js.Tuple4[
      js.UndefOr[TStyleSet1 | `false` | Null], 
      js.UndefOr[TStyleSet2 | `false` | Null], 
      js.UndefOr[TStyleSet3 | `false` | Null], 
      js.UndefOr[TStyleSet4 | `false` | Null]
    ],
    options: IStyleOptions
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCssSets")(styleSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  
  inline def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]], options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeCss_false(args: `false`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mergeCss_false(args: `false`, options: IStyleOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCss")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeStyleSets[TStyleSet](): IProcessedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")().asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet]]]
  inline def mergeStyleSets[TStyleSet](styleSet: TStyleSet): IProcessedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet]]]
  inline def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  inline def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")().asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  inline def mergeStyleSets_false(styleSets: (js.UndefOr[IStyleSet[StringDictionary[Any]] | `false` | Null])*): IProcessedStyleSet[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSets.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IProcessedStyleSet[Any]]
  inline def mergeStyleSets_false[TStyleSet](styleSet: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null]
  ): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3]]]
  inline def mergeStyleSets_false[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null]
  ): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any], styleSet3.asInstanceOf[js.Any], styleSet4.asInstanceOf[js.Any])).asInstanceOf[IProcessedStyleSet[
    ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2] & ObjectOnly[TStyleSet3] & ObjectOnly[TStyleSet4]
  ]]
  
  inline def mergeStyleSets_false_TStyleSet1TStyleSet2[TStyleSet1, TStyleSet2](styleSet1: `false`): IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyleSets")(styleSet1.asInstanceOf[js.Any]).asInstanceOf[IProcessedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
  inline def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def setRTL(isRTL: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRTL")(isRTL.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
