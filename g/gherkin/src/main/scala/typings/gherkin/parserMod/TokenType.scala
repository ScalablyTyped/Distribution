package typings.gherkin.parserMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends js.Object
@JSImport("gherkin/dist/src/Parser", "TokenType")
@js.native
object TokenType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  
  @js.native
  sealed trait BackgroundLine extends TokenType
  /* 7 */ @js.native
  object BackgroundLine extends TopLevel[BackgroundLine with Double]
  
  @js.native
  sealed trait Comment extends TokenType
  /* 3 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  @js.native
  sealed trait DocStringSeparator extends TokenType
  /* 11 */ @js.native
  object DocStringSeparator extends TopLevel[DocStringSeparator with Double]
  
  @js.native
  sealed trait EOF extends TokenType
  /* 1 */ @js.native
  object EOF extends TopLevel[EOF with Double]
  
  @js.native
  sealed trait Empty extends TokenType
  /* 2 */ @js.native
  object Empty extends TopLevel[Empty with Double]
  
  @js.native
  sealed trait ExamplesLine extends TokenType
  /* 9 */ @js.native
  object ExamplesLine extends TopLevel[ExamplesLine with Double]
  
  @js.native
  sealed trait FeatureLine extends TokenType
  /* 5 */ @js.native
  object FeatureLine extends TopLevel[FeatureLine with Double]
  
  @js.native
  sealed trait Language extends TokenType
  /* 13 */ @js.native
  object Language extends TopLevel[Language with Double]
  
  @js.native
  sealed trait None extends TokenType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Other extends TokenType
  /* 14 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  @js.native
  sealed trait RuleLine extends TokenType
  /* 6 */ @js.native
  object RuleLine extends TopLevel[RuleLine with Double]
  
  @js.native
  sealed trait ScenarioLine extends TokenType
  /* 8 */ @js.native
  object ScenarioLine extends TopLevel[ScenarioLine with Double]
  
  @js.native
  sealed trait StepLine extends TokenType
  /* 10 */ @js.native
  object StepLine extends TopLevel[StepLine with Double]
  
  @js.native
  sealed trait TableRow extends TokenType
  /* 12 */ @js.native
  object TableRow extends TopLevel[TableRow with Double]
  
  @js.native
  sealed trait TagLine extends TokenType
  /* 4 */ @js.native
  object TagLine extends TopLevel[TagLine with Double]
}
