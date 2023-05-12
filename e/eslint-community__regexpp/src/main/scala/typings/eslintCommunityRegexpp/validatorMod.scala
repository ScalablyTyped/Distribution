package typings.eslintCommunityRegexpp

import typings.eslintCommunityRegexpp.anon.DotAll
import typings.eslintCommunityRegexpp.ecmaVersionsMod.EcmaVersion
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.any
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.digit
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.end
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.lookahead
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.lookbehind
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.property
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.space
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.start
import typings.eslintCommunityRegexpp.eslintCommunityRegexppStrings.word
import typings.eslintCommunityRegexpp.validatorMod.RegExpValidator.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorMod {
  
  @JSImport("@eslint-community/regexpp/validator", "RegExpValidator")
  @js.native
  /**
    * Initialize this validator.
    * @param options The options of validator.
    */
  open class RegExpValidator () extends StObject {
    def this(options: Options) = this()
    
    /**
      * Validate a regular expression flags. E.g. "gim"
      * @param source The source code to validate.
      * @param start The start index in the source code.
      * @param end The end index in the source code.
      */
    def validateFlags(source: String): Unit = js.native
    def validateFlags(source: String, start: Double): Unit = js.native
    def validateFlags(source: String, start: Double, end: Double): Unit = js.native
    def validateFlags(source: String, start: Unit, end: Double): Unit = js.native
    
    /**
      * Validate a regular expression literal. E.g. "/abc/g"
      * @param source The source code to validate.
      * @param start The start index in the source code.
      * @param end The end index in the source code.
      */
    def validateLiteral(source: String): Unit = js.native
    def validateLiteral(source: String, start: Double): Unit = js.native
    def validateLiteral(source: String, start: Double, end: Double): Unit = js.native
    def validateLiteral(source: String, start: Unit, end: Double): Unit = js.native
    
    /**
      * Validate a regular expression pattern. E.g. "abc"
      * @param source The source code to validate.
      * @param start The start index in the source code.
      * @param end The end index in the source code.
      * @param uFlag The flag to set unicode mode.
      */
    def validatePattern(source: String): Unit = js.native
    def validatePattern(source: String, start: Double): Unit = js.native
    def validatePattern(source: String, start: Double, end: Double): Unit = js.native
    def validatePattern(source: String, start: Double, end: Double, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Double, end: Unit, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Unit, end: Double): Unit = js.native
    def validatePattern(source: String, start: Unit, end: Double, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Unit, end: Unit, uFlag: Boolean): Unit = js.native
  }
  object RegExpValidator {
    
    /**
      * The options for RegExpValidator construction.
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
        * A function that is called when the validator entered an alternative.
        * @param start The 0-based index of the first character.
        * @param index The 0-based index of alternatives in a disjunction.
        */
      var onAlternativeEnter: js.UndefOr[js.Function2[/* start */ Double, /* index */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left an alternative.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param index The 0-based index of alternatives in a disjunction.
        */
      var onAlternativeLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* index */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found a dot.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param kind The kind of the character set.
        */
      var onAnyCharacterSet: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, any, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found a backreference.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param ref The key of the referred capturing group.
        */
      var onBackreference: js.UndefOr[
            js.Function3[/* start */ Double, /* end */ Double, /* ref */ Double | String, Unit]
          ] = js.undefined
      
      /**
        * A function that is called when the validator entered a capturing group.
        * @param start The 0-based index of the first character.
        * @param name The group name.
        */
      var onCapturingGroupEnter: js.UndefOr[js.Function2[/* start */ Double, /* name */ String | Null, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left a capturing group.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param name The group name.
        */
      var onCapturingGroupLeave: js.UndefOr[
            js.Function3[/* start */ Double, /* end */ Double, /* name */ String | Null, Unit]
          ] = js.undefined
      
      /**
        * A function that is called when the validator found a character.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param value The code point of the character.
        */
      var onCharacter: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* value */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator entered a character class.
        * @param start The 0-based index of the first character.
        * @param negate The flag which represents that the character class is negative.
        */
      var onCharacterClassEnter: js.UndefOr[js.Function2[/* start */ Double, /* negate */ Boolean, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left a character class.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param negate The flag which represents that the character class is negative.
        */
      var onCharacterClassLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* negate */ Boolean, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found a character class range.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param min The minimum code point of the range.
        * @param max The maximum code point of the range.
        */
      var onCharacterClassRange: js.UndefOr[
            js.Function4[/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, Unit]
          ] = js.undefined
      
      /**
        * A function that is called when the validator entered a disjunction.
        * @param start The 0-based index of the first character.
        */
      var onDisjunctionEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left a disjunction.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        */
      var onDisjunctionLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found an edge boundary assertion.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param kind The kind of the assertion.
        */
      var onEdgeAssertion: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* kind */ end | start, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found a character set escape.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param kind The kind of the character set.
        * @param negate The flag which represents that the character set is negative.
        */
      var onEscapeCharacterSet: js.UndefOr[
            js.Function4[
              /* start */ Double, 
              /* end */ Double, 
              /* kind */ digit | space | word, 
              /* negate */ Boolean, 
              Unit
            ]
          ] = js.undefined
      
      /**
        * A function that is called when the validator found flags.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param global `g` flag.
        * @param ignoreCase `i` flag.
        * @param multiline `m` flag.
        * @param unicode `u` flag.
        * @param sticky `y` flag.
        * @param dotAll `s` flag.
        * @param hasIndices `d` flag.
        *
        * @deprecated Use `onRegExpFlags` instead.
        */
      var onFlags: js.UndefOr[
            js.Function9[
              /* start */ Double, 
              /* end */ Double, 
              /* global */ Boolean, 
              /* ignoreCase */ Boolean, 
              /* multiline */ Boolean, 
              /* unicode */ Boolean, 
              /* sticky */ Boolean, 
              /* dotAll */ Boolean, 
              /* hasIndices */ Boolean, 
              Unit
            ]
          ] = js.undefined
      
      /**
        * A function that is called when the validator entered an uncapturing group.
        * @param start The 0-based index of the first character.
        */
      var onGroupEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left an uncapturing group.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        */
      var onGroupLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator entered a RegExp literal.
        * @param start The 0-based index of the first character.
        */
      var onLiteralEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left a RegExp literal.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        */
      var onLiteralLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator entered a lookahead/lookbehind assertion.
        * @param start The 0-based index of the first character.
        * @param kind The kind of the assertion.
        * @param negate The flag which represents that the assertion is negative.
        */
      var onLookaroundAssertionEnter: js.UndefOr[
            js.Function3[/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean, Unit]
          ] = js.undefined
      
      /**
        * A function that is called when the validator left a lookahead/lookbehind assertion.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param kind The kind of the assertion.
        * @param negate The flag which represents that the assertion is negative.
        */
      var onLookaroundAssertionLeave: js.UndefOr[
            js.Function4[
              /* start */ Double, 
              /* end */ Double, 
              /* kind */ lookahead | lookbehind, 
              /* negate */ Boolean, 
              Unit
            ]
          ] = js.undefined
      
      /**
        * A function that is called when the validator entered a pattern.
        * @param start The 0-based index of the first character.
        */
      var onPatternEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator left a pattern.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        */
      var onPatternLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found a quantifier.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param min The minimum number of repeating.
        * @param max The maximum number of repeating.
        * @param greedy The flag to choose the longest matching.
        */
      var onQuantifier: js.UndefOr[
            js.Function5[
              /* start */ Double, 
              /* end */ Double, 
              /* min */ Double, 
              /* max */ Double, 
              /* greedy */ Boolean, 
              Unit
            ]
          ] = js.undefined
      
      /**
        * A function that is called when the validator found flags.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param flags.global `g` flag.
        * @param flags.ignoreCase `i` flag.
        * @param flags.multiline `m` flag.
        * @param flags.unicode `u` flag.
        * @param flags.sticky `y` flag.
        * @param flags.dotAll `s` flag.
        * @param flags.hasIndices `d` flag.
        */
      var onRegExpFlags: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* flags */ DotAll, Unit]] = js.undefined
      
      /**
        * A function that is called when the validator found a Unicode proerty escape.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param kind The kind of the character set.
        * @param key The property name.
        * @param value The property value.
        * @param negate The flag which represents that the character set is negative.
        */
      var onUnicodePropertyCharacterSet: js.UndefOr[
            js.Function6[
              /* start */ Double, 
              /* end */ Double, 
              property, 
              /* key */ String, 
              /* value */ String | Null, 
              /* negate */ Boolean, 
              Unit
            ]
          ] = js.undefined
      
      /**
        * A function that is called when the validator found a word boundary assertion.
        * @param start The 0-based index of the first character.
        * @param end The next 0-based index of the last character.
        * @param kind The kind of the assertion.
        * @param negate The flag which represents that the assertion is negative.
        */
      var onWordBoundaryAssertion: js.UndefOr[
            js.Function4[/* start */ Double, /* end */ Double, word, /* negate */ Boolean, Unit]
          ] = js.undefined
      
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
        
        inline def setOnAlternativeEnter(value: (/* start */ Double, /* index */ Double) => Unit): Self = StObject.set(x, "onAlternativeEnter", js.Any.fromFunction2(value))
        
        inline def setOnAlternativeEnterUndefined: Self = StObject.set(x, "onAlternativeEnter", js.undefined)
        
        inline def setOnAlternativeLeave(value: (/* start */ Double, /* end */ Double, /* index */ Double) => Unit): Self = StObject.set(x, "onAlternativeLeave", js.Any.fromFunction3(value))
        
        inline def setOnAlternativeLeaveUndefined: Self = StObject.set(x, "onAlternativeLeave", js.undefined)
        
        inline def setOnAnyCharacterSet(value: (/* start */ Double, /* end */ Double, any) => Unit): Self = StObject.set(x, "onAnyCharacterSet", js.Any.fromFunction3(value))
        
        inline def setOnAnyCharacterSetUndefined: Self = StObject.set(x, "onAnyCharacterSet", js.undefined)
        
        inline def setOnBackreference(value: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Unit): Self = StObject.set(x, "onBackreference", js.Any.fromFunction3(value))
        
        inline def setOnBackreferenceUndefined: Self = StObject.set(x, "onBackreference", js.undefined)
        
        inline def setOnCapturingGroupEnter(value: (/* start */ Double, /* name */ String | Null) => Unit): Self = StObject.set(x, "onCapturingGroupEnter", js.Any.fromFunction2(value))
        
        inline def setOnCapturingGroupEnterUndefined: Self = StObject.set(x, "onCapturingGroupEnter", js.undefined)
        
        inline def setOnCapturingGroupLeave(value: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Unit): Self = StObject.set(x, "onCapturingGroupLeave", js.Any.fromFunction3(value))
        
        inline def setOnCapturingGroupLeaveUndefined: Self = StObject.set(x, "onCapturingGroupLeave", js.undefined)
        
        inline def setOnCharacter(value: (/* start */ Double, /* end */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "onCharacter", js.Any.fromFunction3(value))
        
        inline def setOnCharacterClassEnter(value: (/* start */ Double, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onCharacterClassEnter", js.Any.fromFunction2(value))
        
        inline def setOnCharacterClassEnterUndefined: Self = StObject.set(x, "onCharacterClassEnter", js.undefined)
        
        inline def setOnCharacterClassLeave(value: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onCharacterClassLeave", js.Any.fromFunction3(value))
        
        inline def setOnCharacterClassLeaveUndefined: Self = StObject.set(x, "onCharacterClassLeave", js.undefined)
        
        inline def setOnCharacterClassRange(value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Unit): Self = StObject.set(x, "onCharacterClassRange", js.Any.fromFunction4(value))
        
        inline def setOnCharacterClassRangeUndefined: Self = StObject.set(x, "onCharacterClassRange", js.undefined)
        
        inline def setOnCharacterUndefined: Self = StObject.set(x, "onCharacter", js.undefined)
        
        inline def setOnDisjunctionEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onDisjunctionEnter", js.Any.fromFunction1(value))
        
        inline def setOnDisjunctionEnterUndefined: Self = StObject.set(x, "onDisjunctionEnter", js.undefined)
        
        inline def setOnDisjunctionLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onDisjunctionLeave", js.Any.fromFunction2(value))
        
        inline def setOnDisjunctionLeaveUndefined: Self = StObject.set(x, "onDisjunctionLeave", js.undefined)
        
        inline def setOnEdgeAssertion(value: (/* start */ Double, /* end */ Double, /* kind */ end | start) => Unit): Self = StObject.set(x, "onEdgeAssertion", js.Any.fromFunction3(value))
        
        inline def setOnEdgeAssertionUndefined: Self = StObject.set(x, "onEdgeAssertion", js.undefined)
        
        inline def setOnEscapeCharacterSet(
          value: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onEscapeCharacterSet", js.Any.fromFunction4(value))
        
        inline def setOnEscapeCharacterSetUndefined: Self = StObject.set(x, "onEscapeCharacterSet", js.undefined)
        
        inline def setOnFlags(
          value: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean, /* hasIndices */ Boolean) => Unit
        ): Self = StObject.set(x, "onFlags", js.Any.fromFunction9(value))
        
        inline def setOnFlagsUndefined: Self = StObject.set(x, "onFlags", js.undefined)
        
        inline def setOnGroupEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onGroupEnter", js.Any.fromFunction1(value))
        
        inline def setOnGroupEnterUndefined: Self = StObject.set(x, "onGroupEnter", js.undefined)
        
        inline def setOnGroupLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onGroupLeave", js.Any.fromFunction2(value))
        
        inline def setOnGroupLeaveUndefined: Self = StObject.set(x, "onGroupLeave", js.undefined)
        
        inline def setOnLiteralEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onLiteralEnter", js.Any.fromFunction1(value))
        
        inline def setOnLiteralEnterUndefined: Self = StObject.set(x, "onLiteralEnter", js.undefined)
        
        inline def setOnLiteralLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onLiteralLeave", js.Any.fromFunction2(value))
        
        inline def setOnLiteralLeaveUndefined: Self = StObject.set(x, "onLiteralLeave", js.undefined)
        
        inline def setOnLookaroundAssertionEnter(value: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onLookaroundAssertionEnter", js.Any.fromFunction3(value))
        
        inline def setOnLookaroundAssertionEnterUndefined: Self = StObject.set(x, "onLookaroundAssertionEnter", js.undefined)
        
        inline def setOnLookaroundAssertionLeave(
          value: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onLookaroundAssertionLeave", js.Any.fromFunction4(value))
        
        inline def setOnLookaroundAssertionLeaveUndefined: Self = StObject.set(x, "onLookaroundAssertionLeave", js.undefined)
        
        inline def setOnPatternEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onPatternEnter", js.Any.fromFunction1(value))
        
        inline def setOnPatternEnterUndefined: Self = StObject.set(x, "onPatternEnter", js.undefined)
        
        inline def setOnPatternLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onPatternLeave", js.Any.fromFunction2(value))
        
        inline def setOnPatternLeaveUndefined: Self = StObject.set(x, "onPatternLeave", js.undefined)
        
        inline def setOnQuantifier(
          value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Unit
        ): Self = StObject.set(x, "onQuantifier", js.Any.fromFunction5(value))
        
        inline def setOnQuantifierUndefined: Self = StObject.set(x, "onQuantifier", js.undefined)
        
        inline def setOnRegExpFlags(value: (/* start */ Double, /* end */ Double, /* flags */ DotAll) => Unit): Self = StObject.set(x, "onRegExpFlags", js.Any.fromFunction3(value))
        
        inline def setOnRegExpFlagsUndefined: Self = StObject.set(x, "onRegExpFlags", js.undefined)
        
        inline def setOnUnicodePropertyCharacterSet(
          value: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onUnicodePropertyCharacterSet", js.Any.fromFunction6(value))
        
        inline def setOnUnicodePropertyCharacterSetUndefined: Self = StObject.set(x, "onUnicodePropertyCharacterSet", js.undefined)
        
        inline def setOnWordBoundaryAssertion(value: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onWordBoundaryAssertion", js.Any.fromFunction4(value))
        
        inline def setOnWordBoundaryAssertionUndefined: Self = StObject.set(x, "onWordBoundaryAssertion", js.undefined)
        
        inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
