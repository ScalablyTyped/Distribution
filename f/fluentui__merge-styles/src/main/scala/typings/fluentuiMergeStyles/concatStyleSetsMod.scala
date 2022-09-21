package typings.fluentuiMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiMergeStyles.fluentuiMergeStylesBooleans.`false`
import typings.fluentuiMergeStyles.istylesetMod.IConcatenatedStyleSet
import typings.fluentuiMergeStyles.istylesetMod.IStyleSet
import typings.fluentuiMergeStyles.objectOnlyMod.ObjectOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatStyleSetsMod {
  
  @JSImport("@fluentui/merge-styles/lib/concatStyleSets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatStyleSets[TStyleSet](): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")().asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  inline def concatStyleSets[TStyleSet](styleSet: TStyleSet): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet.asInstanceOf[js.Any]).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet]]]
  inline def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  inline def concatStyleSets[TStyleSet1, TStyleSet2](styleSet1: Unit, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatStyleSets")(styleSet1.asInstanceOf[js.Any], styleSet2.asInstanceOf[js.Any])).asInstanceOf[IConcatenatedStyleSet[ObjectOnly[TStyleSet1] & ObjectOnly[TStyleSet2]]]
  
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
}
