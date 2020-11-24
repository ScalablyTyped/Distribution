package typings.gherkin.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends js.Object {
  
  var addError: js.Any = js.native
  
  var build: js.Any = js.native
  
  val builder: js.Any = js.native
  
  var context: js.Any = js.native
  
  var endRule: js.Any = js.native
  
  var getResult: js.Any = js.native
  
  var handleAstError: js.Any = js.native
  
  var handleExternalError: js.Any = js.native
  
  var lookahead_0: js.Any = js.native
  
  var matchToken: js.Any = js.native
  
  var matchTokenAt_0: js.Any = js.native
  
  var matchTokenAt_1: js.Any = js.native
  
  var matchTokenAt_10: js.Any = js.native
  
  var matchTokenAt_11: js.Any = js.native
  
  var matchTokenAt_12: js.Any = js.native
  
  var matchTokenAt_13: js.Any = js.native
  
  var matchTokenAt_14: js.Any = js.native
  
  var matchTokenAt_15: js.Any = js.native
  
  var matchTokenAt_16: js.Any = js.native
  
  var matchTokenAt_17: js.Any = js.native
  
  var matchTokenAt_18: js.Any = js.native
  
  var matchTokenAt_19: js.Any = js.native
  
  var matchTokenAt_2: js.Any = js.native
  
  var matchTokenAt_20: js.Any = js.native
  
  var matchTokenAt_21: js.Any = js.native
  
  var matchTokenAt_22: js.Any = js.native
  
  var matchTokenAt_23: js.Any = js.native
  
  var matchTokenAt_24: js.Any = js.native
  
  var matchTokenAt_25: js.Any = js.native
  
  var matchTokenAt_26: js.Any = js.native
  
  var matchTokenAt_27: js.Any = js.native
  
  var matchTokenAt_28: js.Any = js.native
  
  var matchTokenAt_29: js.Any = js.native
  
  var matchTokenAt_3: js.Any = js.native
  
  var matchTokenAt_30: js.Any = js.native
  
  var matchTokenAt_31: js.Any = js.native
  
  var matchTokenAt_32: js.Any = js.native
  
  var matchTokenAt_33: js.Any = js.native
  
  var matchTokenAt_34: js.Any = js.native
  
  var matchTokenAt_35: js.Any = js.native
  
  var matchTokenAt_36: js.Any = js.native
  
  var matchTokenAt_37: js.Any = js.native
  
  var matchTokenAt_38: js.Any = js.native
  
  var matchTokenAt_39: js.Any = js.native
  
  var matchTokenAt_4: js.Any = js.native
  
  var matchTokenAt_40: js.Any = js.native
  
  var matchTokenAt_42: js.Any = js.native
  
  var matchTokenAt_43: js.Any = js.native
  
  var matchTokenAt_44: js.Any = js.native
  
  var matchTokenAt_45: js.Any = js.native
  
  var matchTokenAt_46: js.Any = js.native
  
  var matchTokenAt_47: js.Any = js.native
  
  var matchTokenAt_48: js.Any = js.native
  
  var matchTokenAt_49: js.Any = js.native
  
  var matchTokenAt_5: js.Any = js.native
  
  var matchTokenAt_6: js.Any = js.native
  
  var matchTokenAt_7: js.Any = js.native
  
  var matchTokenAt_8: js.Any = js.native
  
  var matchTokenAt_9: js.Any = js.native
  
  var match_BackgroundLine: js.Any = js.native
  
  var match_Comment: js.Any = js.native
  
  var match_DocStringSeparator: js.Any = js.native
  
  var match_EOF: js.Any = js.native
  
  var match_Empty: js.Any = js.native
  
  var match_ExamplesLine: js.Any = js.native
  
  var match_FeatureLine: js.Any = js.native
  
  var match_Language: js.Any = js.native
  
  var match_Other: js.Any = js.native
  
  var match_RuleLine: js.Any = js.native
  
  var match_ScenarioLine: js.Any = js.native
  
  var match_StepLine: js.Any = js.native
  
  var match_TableRow: js.Any = js.native
  
  var match_TagLine: js.Any = js.native
  
  def parse(tokenScanner: String): js.Any = js.native
  def parse(tokenScanner: String, tokenMatcher: typings.gherkin.tokenMatcherMod.default): js.Any = js.native
  def parse(tokenScanner: typings.gherkin.tokenScannerMod.default): js.Any = js.native
  def parse(
    tokenScanner: typings.gherkin.tokenScannerMod.default,
    tokenMatcher: typings.gherkin.tokenMatcherMod.default
  ): js.Any = js.native
  
  var readToken: js.Any = js.native
  
  var startRule: js.Any = js.native
  
  var stopAtFirstError: Boolean = js.native
}
