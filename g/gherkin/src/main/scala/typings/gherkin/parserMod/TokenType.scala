package typings.gherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("gherkin/dist/src/Parser", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
  
  @js.native
  sealed trait BackgroundLine
    extends StObject
       with TokenType
  /* 7 */ val BackgroundLine: typings.gherkin.parserMod.TokenType.BackgroundLine & Double = js.native
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenType
  /* 3 */ val Comment: typings.gherkin.parserMod.TokenType.Comment & Double = js.native
  
  @js.native
  sealed trait DocStringSeparator
    extends StObject
       with TokenType
  /* 11 */ val DocStringSeparator: typings.gherkin.parserMod.TokenType.DocStringSeparator & Double = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with TokenType
  /* 1 */ val EOF: typings.gherkin.parserMod.TokenType.EOF & Double = js.native
  
  @js.native
  sealed trait Empty
    extends StObject
       with TokenType
  /* 2 */ val Empty: typings.gherkin.parserMod.TokenType.Empty & Double = js.native
  
  @js.native
  sealed trait ExamplesLine
    extends StObject
       with TokenType
  /* 9 */ val ExamplesLine: typings.gherkin.parserMod.TokenType.ExamplesLine & Double = js.native
  
  @js.native
  sealed trait FeatureLine
    extends StObject
       with TokenType
  /* 5 */ val FeatureLine: typings.gherkin.parserMod.TokenType.FeatureLine & Double = js.native
  
  @js.native
  sealed trait Language
    extends StObject
       with TokenType
  /* 13 */ val Language: typings.gherkin.parserMod.TokenType.Language & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TokenType
  /* 0 */ val None: typings.gherkin.parserMod.TokenType.None & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with TokenType
  /* 14 */ val Other: typings.gherkin.parserMod.TokenType.Other & Double = js.native
  
  @js.native
  sealed trait RuleLine
    extends StObject
       with TokenType
  /* 6 */ val RuleLine: typings.gherkin.parserMod.TokenType.RuleLine & Double = js.native
  
  @js.native
  sealed trait ScenarioLine
    extends StObject
       with TokenType
  /* 8 */ val ScenarioLine: typings.gherkin.parserMod.TokenType.ScenarioLine & Double = js.native
  
  @js.native
  sealed trait StepLine
    extends StObject
       with TokenType
  /* 10 */ val StepLine: typings.gherkin.parserMod.TokenType.StepLine & Double = js.native
  
  @js.native
  sealed trait TableRow
    extends StObject
       with TokenType
  /* 12 */ val TableRow: typings.gherkin.parserMod.TokenType.TableRow & Double = js.native
  
  @js.native
  sealed trait TagLine
    extends StObject
       with TokenType
  /* 4 */ val TagLine: typings.gherkin.parserMod.TokenType.TagLine & Double = js.native
}
