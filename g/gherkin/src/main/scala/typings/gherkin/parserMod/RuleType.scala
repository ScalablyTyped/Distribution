package typings.gherkin.parserMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleType extends js.Object
@JSImport("gherkin/dist/src/Parser", "RuleType")
@js.native
object RuleType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
  
  @js.native
  sealed trait Background extends RuleType
  /* 20 */ @js.native
  object Background extends TopLevel[Background with Double]
  
  @js.native
  sealed trait DataTable extends RuleType
  /* 28 */ @js.native
  object DataTable extends TopLevel[DataTable with Double]
  
  @js.native
  sealed trait Description extends RuleType
  /* 32 */ @js.native
  object Description extends TopLevel[Description with Double]
  
  @js.native
  sealed trait DescriptionHelper extends RuleType
  /* 31 */ @js.native
  object DescriptionHelper extends TopLevel[DescriptionHelper with Double]
  
  @js.native
  sealed trait DocString extends RuleType
  /* 29 */ @js.native
  object DocString extends TopLevel[DocString with Double]
  
  @js.native
  sealed trait Examples extends RuleType
  /* 24 */ @js.native
  object Examples extends TopLevel[Examples with Double]
  
  @js.native
  sealed trait ExamplesDefinition extends RuleType
  /* 23 */ @js.native
  object ExamplesDefinition extends TopLevel[ExamplesDefinition with Double]
  
  @js.native
  sealed trait ExamplesTable extends RuleType
  /* 25 */ @js.native
  object ExamplesTable extends TopLevel[ExamplesTable with Double]
  
  @js.native
  sealed trait Feature extends RuleType
  /* 16 */ @js.native
  object Feature extends TopLevel[Feature with Double]
  
  @js.native
  sealed trait FeatureHeader extends RuleType
  /* 17 */ @js.native
  object FeatureHeader extends TopLevel[FeatureHeader with Double]
  
  @js.native
  sealed trait GherkinDocument extends RuleType
  /* 15 */ @js.native
  object GherkinDocument extends TopLevel[GherkinDocument with Double]
  
  @js.native
  sealed trait None extends RuleType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Rule extends RuleType
  /* 18 */ @js.native
  object Rule extends TopLevel[Rule with Double]
  
  @js.native
  sealed trait RuleHeader extends RuleType
  /* 19 */ @js.native
  object RuleHeader extends TopLevel[RuleHeader with Double]
  
  @js.native
  sealed trait Scenario extends RuleType
  /* 22 */ @js.native
  object Scenario extends TopLevel[Scenario with Double]
  
  @js.native
  sealed trait ScenarioDefinition extends RuleType
  /* 21 */ @js.native
  object ScenarioDefinition extends TopLevel[ScenarioDefinition with Double]
  
  @js.native
  sealed trait Step extends RuleType
  /* 26 */ @js.native
  object Step extends TopLevel[Step with Double]
  
  @js.native
  sealed trait StepArg extends RuleType
  /* 27 */ @js.native
  object StepArg extends TopLevel[StepArg with Double]
  
  @js.native
  sealed trait Tags extends RuleType
  /* 30 */ @js.native
  object Tags extends TopLevel[Tags with Double]
  
  @js.native
  sealed trait _BackgroundLine extends RuleType
  /* 7 */ @js.native
  object _BackgroundLine extends TopLevel[_BackgroundLine with Double]
  
  @js.native
  sealed trait _Comment extends RuleType
  /* 3 */ @js.native
  object _Comment extends TopLevel[_Comment with Double]
  
  @js.native
  sealed trait _DocStringSeparator extends RuleType
  /* 11 */ @js.native
  object _DocStringSeparator extends TopLevel[_DocStringSeparator with Double]
  
  @js.native
  sealed trait _EOF extends RuleType
  /* 1 */ @js.native
  object _EOF extends TopLevel[_EOF with Double]
  
  @js.native
  sealed trait _Empty extends RuleType
  /* 2 */ @js.native
  object _Empty extends TopLevel[_Empty with Double]
  
  @js.native
  sealed trait _ExamplesLine extends RuleType
  /* 9 */ @js.native
  object _ExamplesLine extends TopLevel[_ExamplesLine with Double]
  
  @js.native
  sealed trait _FeatureLine extends RuleType
  /* 5 */ @js.native
  object _FeatureLine extends TopLevel[_FeatureLine with Double]
  
  @js.native
  sealed trait _Language extends RuleType
  /* 13 */ @js.native
  object _Language extends TopLevel[_Language with Double]
  
  @js.native
  sealed trait _Other extends RuleType
  /* 14 */ @js.native
  object _Other extends TopLevel[_Other with Double]
  
  @js.native
  sealed trait _RuleLine extends RuleType
  /* 6 */ @js.native
  object _RuleLine extends TopLevel[_RuleLine with Double]
  
  @js.native
  sealed trait _ScenarioLine extends RuleType
  /* 8 */ @js.native
  object _ScenarioLine extends TopLevel[_ScenarioLine with Double]
  
  @js.native
  sealed trait _StepLine extends RuleType
  /* 10 */ @js.native
  object _StepLine extends TopLevel[_StepLine with Double]
  
  @js.native
  sealed trait _TableRow extends RuleType
  /* 12 */ @js.native
  object _TableRow extends TopLevel[_TableRow with Double]
  
  @js.native
  sealed trait _TagLine extends RuleType
  /* 4 */ @js.native
  object _TagLine extends TopLevel[_TagLine with Double]
}
