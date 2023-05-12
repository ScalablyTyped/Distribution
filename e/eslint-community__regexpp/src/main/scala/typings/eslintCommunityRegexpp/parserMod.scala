package typings.eslintCommunityRegexpp

import typings.eslintCommunityRegexpp.astMod.Flags
import typings.eslintCommunityRegexpp.astMod.Pattern
import typings.eslintCommunityRegexpp.astMod.RegExpLiteral
import typings.eslintCommunityRegexpp.ecmaVersionsMod.EcmaVersion
import typings.eslintCommunityRegexpp.parserMod.RegExpParser.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@eslint-community/regexpp/parser", "RegExpParser")
  @js.native
  /**
    * Initialize this parser.
    * @param options The options of parser.
    */
  open class RegExpParser () extends StObject {
    def this(options: Options) = this()
    
    /**
      * Parse a regular expression flags. E.g. "gim"
      * @param source The source code to parse.
      * @param start The start index in the source code.
      * @param end The end index in the source code.
      * @returns The AST of the given flags.
      */
    def parseFlags(source: String): Flags = js.native
    def parseFlags(source: String, start: Double): Flags = js.native
    def parseFlags(source: String, start: Double, end: Double): Flags = js.native
    def parseFlags(source: String, start: Unit, end: Double): Flags = js.native
    
    /**
      * Parse a regular expression literal. E.g. "/abc/g"
      * @param source The source code to parse.
      * @param start The start index in the source code.
      * @param end The end index in the source code.
      * @returns The AST of the given regular expression.
      */
    def parseLiteral(source: String): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Double): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Double, end: Double): RegExpLiteral = js.native
    def parseLiteral(source: String, start: Unit, end: Double): RegExpLiteral = js.native
    
    /**
      * Parse a regular expression pattern. E.g. "abc"
      * @param source The source code to parse.
      * @param start The start index in the source code.
      * @param end The end index in the source code.
      * @param uFlag The flag to set unicode mode.
      * @returns The AST of the given pattern.
      */
    def parsePattern(source: String): Pattern = js.native
    def parsePattern(source: String, start: Double): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Double): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Double, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Double, end: Unit, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Unit, end: Double): Pattern = js.native
    def parsePattern(source: String, start: Unit, end: Double, uFlag: Boolean): Pattern = js.native
    def parsePattern(source: String, start: Unit, end: Unit, uFlag: Boolean): Pattern = js.native
  }
  object RegExpParser {
    
    /**
      * The options for RegExpParser construction.
      */
    trait Options extends StObject {
      
      /**
        * ECMAScript version. Default is `2023`.
        * - `2015` added `u` and `y` flags.
        * - `2018` added `s` flag, Named Capturing Group, Lookbehind Assertion,
        *   and Unicode Property Escape.
        * - `2019`, `2020`, and `2021` added more valid Unicode Property Escapes.
        * - `2022` added `d` flag.
        * - `2023` added more valid Unicode Property Escapes.
        */
      var ecmaVersion: js.UndefOr[EcmaVersion] = js.undefined
      
      /**
        * The flag to disable Annex B syntax. Default is `false`.
        */
      var strict: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setEcmaVersion(value: EcmaVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
        
        inline def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
        
        inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
