package typings.gherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends StObject {
  
  /* private */ var addError: js.Any = js.native
  
  /* private */ var build: js.Any = js.native
  
  /* private */ val builder: js.Any = js.native
  
  /* private */ var context: js.Any = js.native
  
  /* private */ var endRule: js.Any = js.native
  
  /* private */ var getResult: js.Any = js.native
  
  /* private */ var handleAstError: js.Any = js.native
  
  /* private */ var handleExternalError: js.Any = js.native
  
  /* private */ var lookahead_0: js.Any = js.native
  
  /* private */ var matchToken: js.Any = js.native
  
  /* private */ var matchTokenAt_0: js.Any = js.native
  
  /* private */ var matchTokenAt_1: js.Any = js.native
  
  /* private */ var matchTokenAt_10: js.Any = js.native
  
  /* private */ var matchTokenAt_11: js.Any = js.native
  
  /* private */ var matchTokenAt_12: js.Any = js.native
  
  /* private */ var matchTokenAt_13: js.Any = js.native
  
  /* private */ var matchTokenAt_14: js.Any = js.native
  
  /* private */ var matchTokenAt_15: js.Any = js.native
  
  /* private */ var matchTokenAt_16: js.Any = js.native
  
  /* private */ var matchTokenAt_17: js.Any = js.native
  
  /* private */ var matchTokenAt_18: js.Any = js.native
  
  /* private */ var matchTokenAt_19: js.Any = js.native
  
  /* private */ var matchTokenAt_2: js.Any = js.native
  
  /* private */ var matchTokenAt_20: js.Any = js.native
  
  /* private */ var matchTokenAt_21: js.Any = js.native
  
  /* private */ var matchTokenAt_22: js.Any = js.native
  
  /* private */ var matchTokenAt_23: js.Any = js.native
  
  /* private */ var matchTokenAt_24: js.Any = js.native
  
  /* private */ var matchTokenAt_25: js.Any = js.native
  
  /* private */ var matchTokenAt_26: js.Any = js.native
  
  /* private */ var matchTokenAt_27: js.Any = js.native
  
  /* private */ var matchTokenAt_28: js.Any = js.native
  
  /* private */ var matchTokenAt_29: js.Any = js.native
  
  /* private */ var matchTokenAt_3: js.Any = js.native
  
  /* private */ var matchTokenAt_30: js.Any = js.native
  
  /* private */ var matchTokenAt_31: js.Any = js.native
  
  /* private */ var matchTokenAt_32: js.Any = js.native
  
  /* private */ var matchTokenAt_33: js.Any = js.native
  
  /* private */ var matchTokenAt_34: js.Any = js.native
  
  /* private */ var matchTokenAt_35: js.Any = js.native
  
  /* private */ var matchTokenAt_36: js.Any = js.native
  
  /* private */ var matchTokenAt_37: js.Any = js.native
  
  /* private */ var matchTokenAt_38: js.Any = js.native
  
  /* private */ var matchTokenAt_39: js.Any = js.native
  
  /* private */ var matchTokenAt_4: js.Any = js.native
  
  /* private */ var matchTokenAt_40: js.Any = js.native
  
  /* private */ var matchTokenAt_42: js.Any = js.native
  
  /* private */ var matchTokenAt_43: js.Any = js.native
  
  /* private */ var matchTokenAt_44: js.Any = js.native
  
  /* private */ var matchTokenAt_45: js.Any = js.native
  
  /* private */ var matchTokenAt_46: js.Any = js.native
  
  /* private */ var matchTokenAt_47: js.Any = js.native
  
  /* private */ var matchTokenAt_48: js.Any = js.native
  
  /* private */ var matchTokenAt_49: js.Any = js.native
  
  /* private */ var matchTokenAt_5: js.Any = js.native
  
  /* private */ var matchTokenAt_6: js.Any = js.native
  
  /* private */ var matchTokenAt_7: js.Any = js.native
  
  /* private */ var matchTokenAt_8: js.Any = js.native
  
  /* private */ var matchTokenAt_9: js.Any = js.native
  
  /* private */ var match_BackgroundLine: js.Any = js.native
  
  /* private */ var match_Comment: js.Any = js.native
  
  /* private */ var match_DocStringSeparator: js.Any = js.native
  
  /* private */ var match_EOF: js.Any = js.native
  
  /* private */ var match_Empty: js.Any = js.native
  
  /* private */ var match_ExamplesLine: js.Any = js.native
  
  /* private */ var match_FeatureLine: js.Any = js.native
  
  /* private */ var match_Language: js.Any = js.native
  
  /* private */ var match_Other: js.Any = js.native
  
  /* private */ var match_RuleLine: js.Any = js.native
  
  /* private */ var match_ScenarioLine: js.Any = js.native
  
  /* private */ var match_StepLine: js.Any = js.native
  
  /* private */ var match_TableRow: js.Any = js.native
  
  /* private */ var match_TagLine: js.Any = js.native
  
  def parse(tokenScanner: String): js.Any = js.native
  def parse(tokenScanner: String, tokenMatcher: typings.gherkin.tokenMatcherMod.default): js.Any = js.native
  def parse(tokenScanner: typings.gherkin.tokenScannerMod.default): js.Any = js.native
  def parse(
    tokenScanner: typings.gherkin.tokenScannerMod.default,
    tokenMatcher: typings.gherkin.tokenMatcherMod.default
  ): js.Any = js.native
  
  /* private */ var readToken: js.Any = js.native
  
  /* private */ var startRule: js.Any = js.native
  
  var stopAtFirstError: Boolean = js.native
}
