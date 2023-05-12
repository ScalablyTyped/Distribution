package typings.eslintCommunityRegexpp

import typings.eslintCommunityRegexpp.astMod.Node
import typings.eslintCommunityRegexpp.astMod.RegExpLiteral
import typings.eslintCommunityRegexpp.parserMod.RegExpParser.Options
import typings.eslintCommunityRegexpp.visitorMod.RegExpVisitor.Handlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@eslint-community/regexpp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@eslint-community/regexpp", "RegExpParser")
  @js.native
  /**
    * Initialize this parser.
    * @param options The options of parser.
    */
  open class RegExpParser ()
    extends typings.eslintCommunityRegexpp.parserMod.RegExpParser {
    def this(options: Options) = this()
  }
  
  @JSImport("@eslint-community/regexpp", "RegExpValidator")
  @js.native
  /**
    * Initialize this validator.
    * @param options The options of validator.
    */
  open class RegExpValidator ()
    extends typings.eslintCommunityRegexpp.validatorMod.RegExpValidator {
    def this(options: typings.eslintCommunityRegexpp.validatorMod.RegExpValidator.Options) = this()
  }
  
  inline def parseRegExpLiteral(source: String): RegExpLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any]).asInstanceOf[RegExpLiteral]
  inline def parseRegExpLiteral(source: String, options: Options): RegExpLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExpLiteral]
  inline def parseRegExpLiteral(source: js.RegExp): RegExpLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any]).asInstanceOf[RegExpLiteral]
  inline def parseRegExpLiteral(source: js.RegExp, options: Options): RegExpLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRegExpLiteral")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExpLiteral]
  
  inline def validateRegExpLiteral(source: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRegExpLiteral")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateRegExpLiteral(source: String, options: typings.eslintCommunityRegexpp.validatorMod.RegExpValidator.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRegExpLiteral")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def visitRegExpAST(node: Node, handlers: Handlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitRegExpAST")(node.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
