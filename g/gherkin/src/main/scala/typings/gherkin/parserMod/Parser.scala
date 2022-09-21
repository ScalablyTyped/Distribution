package typings.gherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends StObject {
  
  /* private */ var addError: Any = js.native
  
  /* private */ var build: Any = js.native
  
  /* private */ val builder: Any = js.native
  
  /* private */ var context: Any = js.native
  
  /* private */ var endRule: Any = js.native
  
  /* private */ var getResult: Any = js.native
  
  /* private */ var handleAstError: Any = js.native
  
  /* private */ var handleExternalError: Any = js.native
  
  /* private */ var lookahead_0: Any = js.native
  
  /* private */ var matchToken: Any = js.native
  
  /* private */ var matchTokenAt_0: Any = js.native
  
  /* private */ var matchTokenAt_1: Any = js.native
  
  /* private */ var matchTokenAt_10: Any = js.native
  
  /* private */ var matchTokenAt_11: Any = js.native
  
  /* private */ var matchTokenAt_12: Any = js.native
  
  /* private */ var matchTokenAt_13: Any = js.native
  
  /* private */ var matchTokenAt_14: Any = js.native
  
  /* private */ var matchTokenAt_15: Any = js.native
  
  /* private */ var matchTokenAt_16: Any = js.native
  
  /* private */ var matchTokenAt_17: Any = js.native
  
  /* private */ var matchTokenAt_18: Any = js.native
  
  /* private */ var matchTokenAt_19: Any = js.native
  
  /* private */ var matchTokenAt_2: Any = js.native
  
  /* private */ var matchTokenAt_20: Any = js.native
  
  /* private */ var matchTokenAt_21: Any = js.native
  
  /* private */ var matchTokenAt_22: Any = js.native
  
  /* private */ var matchTokenAt_23: Any = js.native
  
  /* private */ var matchTokenAt_24: Any = js.native
  
  /* private */ var matchTokenAt_25: Any = js.native
  
  /* private */ var matchTokenAt_26: Any = js.native
  
  /* private */ var matchTokenAt_27: Any = js.native
  
  /* private */ var matchTokenAt_28: Any = js.native
  
  /* private */ var matchTokenAt_29: Any = js.native
  
  /* private */ var matchTokenAt_3: Any = js.native
  
  /* private */ var matchTokenAt_30: Any = js.native
  
  /* private */ var matchTokenAt_31: Any = js.native
  
  /* private */ var matchTokenAt_32: Any = js.native
  
  /* private */ var matchTokenAt_33: Any = js.native
  
  /* private */ var matchTokenAt_34: Any = js.native
  
  /* private */ var matchTokenAt_35: Any = js.native
  
  /* private */ var matchTokenAt_36: Any = js.native
  
  /* private */ var matchTokenAt_37: Any = js.native
  
  /* private */ var matchTokenAt_38: Any = js.native
  
  /* private */ var matchTokenAt_39: Any = js.native
  
  /* private */ var matchTokenAt_4: Any = js.native
  
  /* private */ var matchTokenAt_40: Any = js.native
  
  /* private */ var matchTokenAt_42: Any = js.native
  
  /* private */ var matchTokenAt_43: Any = js.native
  
  /* private */ var matchTokenAt_44: Any = js.native
  
  /* private */ var matchTokenAt_45: Any = js.native
  
  /* private */ var matchTokenAt_46: Any = js.native
  
  /* private */ var matchTokenAt_47: Any = js.native
  
  /* private */ var matchTokenAt_48: Any = js.native
  
  /* private */ var matchTokenAt_49: Any = js.native
  
  /* private */ var matchTokenAt_5: Any = js.native
  
  /* private */ var matchTokenAt_6: Any = js.native
  
  /* private */ var matchTokenAt_7: Any = js.native
  
  /* private */ var matchTokenAt_8: Any = js.native
  
  /* private */ var matchTokenAt_9: Any = js.native
  
  /* private */ var match_BackgroundLine: Any = js.native
  
  /* private */ var match_Comment: Any = js.native
  
  /* private */ var match_DocStringSeparator: Any = js.native
  
  /* private */ var match_EOF: Any = js.native
  
  /* private */ var match_Empty: Any = js.native
  
  /* private */ var match_ExamplesLine: Any = js.native
  
  /* private */ var match_FeatureLine: Any = js.native
  
  /* private */ var match_Language: Any = js.native
  
  /* private */ var match_Other: Any = js.native
  
  /* private */ var match_RuleLine: Any = js.native
  
  /* private */ var match_ScenarioLine: Any = js.native
  
  /* private */ var match_StepLine: Any = js.native
  
  /* private */ var match_TableRow: Any = js.native
  
  /* private */ var match_TagLine: Any = js.native
  
  def parse(tokenScanner: String): Any = js.native
  def parse(tokenScanner: String, tokenMatcher: typings.gherkin.tokenMatcherMod.default): Any = js.native
  def parse(tokenScanner: typings.gherkin.tokenScannerMod.default): Any = js.native
  def parse(
    tokenScanner: typings.gherkin.tokenScannerMod.default,
    tokenMatcher: typings.gherkin.tokenMatcherMod.default
  ): Any = js.native
  
  /* private */ var readToken: Any = js.native
  
  /* private */ var startRule: Any = js.native
  
  var stopAtFirstError: Boolean = js.native
}
