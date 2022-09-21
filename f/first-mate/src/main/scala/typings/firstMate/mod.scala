package typings.firstMate

import typings.eventKit.mod.Disposable
import typings.firstMate.anon.MaxLineLength
import typings.firstMate.firstMateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("first-mate", "Grammar")
  @js.native
  open class Grammar protected () extends StObject {
    def this(registry: GrammarRegistry) = this()
    def this(registry: GrammarRegistry, options: GrammarOptions) = this()
    
    var fileTypes: js.Array[String] = js.native
    
    var maxLineLength: Double = js.native
    
    var maxTokensPerLine: Double = js.native
    
    var name: String = js.native
    
    // Event Subscription
    def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
    
    var scopeName: String = js.native
    
    /**
      *  Tokenizes the line of text.
      *  @param line A string of text to tokenize.
      *  @param ruleStack An optional array of rules previously returned from this
      *  method. This should be null when tokenizing the first line in the file.
      *  @param firstLine A optional boolean denoting whether this is the first line
      *  in the file which defaults to `false`.
      *  @return An object representing the result of the tokenize.
      */
    def tokenizeLine(line: String): TokenizeLineResult = js.native
    /**
      *  Tokenizes the line of text.
      *  @param line A string of text to tokenize.
      *  @param ruleStack An optional array of rules previously returned from this
      *  method. This should be null when tokenizing the first line in the file.
      *  @param firstLine A optional boolean denoting whether this is the first line
      *  in the file which defaults to `false`.
      *  @return An object representing the result of the tokenize.
      */
    def tokenizeLine(line: String, ruleStack: js.Array[GrammarRule]): TokenizeLineResult = js.native
    def tokenizeLine(line: String, ruleStack: Null, firstLine: Boolean): TokenizeLineResult = js.native
    def tokenizeLine(line: String, ruleStack: Unit, firstLine: Boolean): TokenizeLineResult = js.native
    @JSName("tokenizeLine")
    def tokenizeLine_false(line: String, ruleStack: js.Array[GrammarRule], firstLine: `false`): TokenizeLineResult = js.native
    
    // Tokenizing
    /**
      *  Tokenize all lines in the given text.
      *  @param text A string containing one or more lines.
      *  @return An array of token arrays for each line tokenized.
      */
    def tokenizeLines(text: String): js.Array[js.Array[GrammarToken]] = js.native
  }
  
  @JSImport("first-mate", "GrammarRegistry")
  @js.native
  open class GrammarRegistry () extends StObject {
    def this(options: MaxLineLength) = this()
    
    /**
      *  Add a grammar to this registry.
      *  A 'grammar-added' event is emitted after the grammar is added.
      *  @param grammar The Grammar to add. This should be a value previously returned
      *  from ::readGrammar or ::readGrammarSync.
      *  @return Returns a Disposable on which `.dispose()` can be called to remove
      *  the grammar.
      */
    def addGrammar(grammar: Grammar): Disposable = js.native
    
    /**
      *  Convert compact tags representation into convenient, space-inefficient tokens.
      *  @param lineText The text of the tokenized line.
      *  @param tags The tags returned from a call to Grammar::tokenizeLine().
      *  @return An array of Token instances decoded from the given tags.
      */
    def decodeTokens(lineText: String, tags: js.Array[Double | String]): js.Array[GrammarToken] = js.native
    
    // Managing Grammars
    /**
      *  Get all the grammars in this registry.
      *  @return A non-empty array of Grammar instances.
      */
    def getGrammars(): js.Array[Grammar] = js.native
    
    /**
      *  Get a grammar with the given scope name.
      *  @param scopeName A string such as `source.js`.
      *  @return A Grammar or undefined.
      */
    def grammarForScopeName(scopeName: String): js.UndefOr[Grammar] = js.native
    
    /**
      *  Read a grammar asynchronously and add it to the registry.
      *  @param grammarPath The absolute file path to the grammar.
      *  @param callback The function to be invoked once the Grammar has been read in
      *  and added to the registry.
      */
    def loadGrammar(
      grammarPath: String,
      callback: js.Function2[/* error */ js.Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]
    ): Unit = js.native
    
    /**
      *  Read a grammar synchronously and add it to this registry.
      *  @param grammarPath The absolute file path to the grammar.
      *  @return The newly loaded Grammar.
      */
    def loadGrammarSync(grammarPath: String): Grammar = js.native
    
    var maxLineLength: Double = js.native
    
    var maxTokensPerLine: Double = js.native
    
    // Event Subscription
    /**
      *  Invoke the given callback when a grammar is added to the registry.
      *  @param callback The callback to be invoked whenever a grammar is added.
      *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
      */
    def onDidAddGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable = js.native
    
    /**
      *  Invoke the given callback when a grammar is updated due to a grammar it
      *  depends on being added or removed from the registry.
      *  @param callback The callback to be invoked whenever a grammar is updated.
      *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
      */
    def onDidUpdateGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable = js.native
    
    /**
      *  Read a grammar asynchronously but don't add it to the registry.
      *  @param grammarPath The absolute file path to the grammar.
      *  @param callback The function to be invoked once the Grammar has been read in.
      */
    def readGrammar(
      grammarPath: String,
      callback: js.Function2[/* error */ js.Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]
    ): Unit = js.native
    
    /**
      *  Read a grammar synchronously but don't add it to the registry.
      *  @param grammarPath The absolute file path to a grammar.
      *  @return The newly loaded Grammar.
      */
    def readGrammarSync(grammarPath: String): Grammar = js.native
    
    /**
      *  Remove the given grammar from this registry.
      *  @param grammar The grammar to remove. This should be a grammar previously
      *  added to the registry from ::addGrammar.
      */
    def removeGrammar(grammar: Grammar): Unit = js.native
    
    /**
      *  Remove the grammar with the given scope name.
      *  @param scopeName A string such as `source.js`.
      *  @return Returns the removed Grammar or undefined.
      */
    def removeGrammarForScopeName(scopeName: String): js.UndefOr[Grammar] = js.native
  }
  
  @JSImport("first-mate", "ScopeSelector")
  @js.native
  open class ScopeSelector protected () extends StObject {
    /**
      *  Create a new scope selector.
      *  @param source The string to parse as a scope selector.
      *  @return A newly constructed ScopeSelector.
      */
    def this(source: String) = this()
    
    /**
      *  Gets the prefix of this scope selector.
      *  @param scopes The scopes to match a prefix against.
      *  @return The matching prefix, if there is one.
      */
    def getPrefix(scopes: String): js.UndefOr[String] = js.native
    def getPrefix(scopes: js.Array[String]): js.UndefOr[String] = js.native
    
    /**
      *  Check if this scope selector matches the scopes.
      *  @param scopes A single scope or an array of them to be compared against.
      *  @return A boolean indicating whether or not this ScopeSelector matched.
      */
    def matches(scopes: String): Boolean = js.native
    def matches(scopes: js.Array[String]): Boolean = js.native
    
    /**
      *  Convert this TextMate scope selector to a CSS selector.
      *  @return A string with the CSSSelector representation of this ScopeSelector.
      */
    def toCssSelector(): String = js.native
    
    /**
      *  Convert this TextMate scope selector to a CSS selector, prefixing scopes
      *  with `syntax--`.
      *  @return A string with the syntax-specific CSSSelector representation of this
      *  ScopeSelector.
      */
    def toCssSyntaxSelector(): String = js.native
  }
  
  trait GrammarOptions extends StObject {
    
    var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var firstLineMatch: js.UndefOr[Boolean] = js.undefined
    
    var foldingStopMarker: js.UndefOr[String] = js.undefined
    
    var injectionSelector: js.UndefOr[ScopeSelector] = js.undefined
    
    var injections: js.UndefOr[js.Object] = js.undefined
    
    var maxLineLength: js.UndefOr[Double] = js.undefined
    
    var maxTokensPerLine: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var patterns: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var repository: js.UndefOr[js.Object] = js.undefined
    
    var scopeName: js.UndefOr[String] = js.undefined
  }
  object GrammarOptions {
    
    inline def apply(): GrammarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrammarOptions]
    }
    
    extension [Self <: GrammarOptions](x: Self) {
      
      inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
      
      inline def setFirstLineMatch(value: Boolean): Self = StObject.set(x, "firstLineMatch", value.asInstanceOf[js.Any])
      
      inline def setFirstLineMatchUndefined: Self = StObject.set(x, "firstLineMatch", js.undefined)
      
      inline def setFoldingStopMarker(value: String): Self = StObject.set(x, "foldingStopMarker", value.asInstanceOf[js.Any])
      
      inline def setFoldingStopMarkerUndefined: Self = StObject.set(x, "foldingStopMarker", js.undefined)
      
      inline def setInjectionSelector(value: ScopeSelector): Self = StObject.set(x, "injectionSelector", value.asInstanceOf[js.Any])
      
      inline def setInjectionSelectorUndefined: Self = StObject.set(x, "injectionSelector", js.undefined)
      
      inline def setInjections(value: js.Object): Self = StObject.set(x, "injections", value.asInstanceOf[js.Any])
      
      inline def setInjectionsUndefined: Self = StObject.set(x, "injections", js.undefined)
      
      inline def setMaxLineLength(value: Double): Self = StObject.set(x, "maxLineLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLengthUndefined: Self = StObject.set(x, "maxLineLength", js.undefined)
      
      inline def setMaxTokensPerLine(value: Double): Self = StObject.set(x, "maxTokensPerLine", value.asInstanceOf[js.Any])
      
      inline def setMaxTokensPerLineUndefined: Self = StObject.set(x, "maxTokensPerLine", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPatterns(value: js.Array[js.Object]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: js.Object*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setRepository(value: js.Object): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
      
      inline def setScopeNameUndefined: Self = StObject.set(x, "scopeName", js.undefined)
    }
  }
  
  trait GrammarRule extends StObject {
    
    var contentScopeName: String
    
    // https://github.com/atom/first-mate/blob/v7.0.7/src/rule.coffee
    // This is private. Don't go down the rabbit hole.
    var rule: js.Object
    
    var scopeName: String
  }
  object GrammarRule {
    
    inline def apply(contentScopeName: String, rule: js.Object, scopeName: String): GrammarRule = {
      val __obj = js.Dynamic.literal(contentScopeName = contentScopeName.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrammarRule]
    }
    
    extension [Self <: GrammarRule](x: Self) {
      
      inline def setContentScopeName(value: String): Self = StObject.set(x, "contentScopeName", value.asInstanceOf[js.Any])
      
      inline def setRule(value: js.Object): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GrammarToken extends StObject {
    
    var scopes: js.Array[String]
    
    var value: String
  }
  object GrammarToken {
    
    inline def apply(scopes: js.Array[String], value: String): GrammarToken = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrammarToken]
    }
    
    extension [Self <: GrammarToken](x: Self) {
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizeLineResult extends StObject {
    
    /** The string of text that was tokenized. */
    var line: String
    
    /**
      *  An array of rules representing the tokenized state at the end of the line.
      *  These should be passed back into this method when tokenizing the next line
      *  in the file.
      */
    var ruleStack: js.Array[GrammarRule]
    
    /**
      *  An array of integer scope ids and strings. Positive ids indicate the
      *  beginning of a scope, and negative tags indicate the end. To resolve ids
      *  to scope names, call GrammarRegistry::scopeForId with the absolute
      *  value of the id.
      */
    var tags: js.Array[Double | String]
    
    /**
      *  This is a dynamic property. Invoking it will incur additional overhead,
      *  but will automatically translate the `tags` into token objects with `value`
      *  and `scopes` properties.
      */
    var tokens: js.Array[GrammarToken]
  }
  object TokenizeLineResult {
    
    inline def apply(
      line: String,
      ruleStack: js.Array[GrammarRule],
      tags: js.Array[Double | String],
      tokens: js.Array[GrammarToken]
    ): TokenizeLineResult = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ruleStack = ruleStack.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeLineResult]
    }
    
    extension [Self <: TokenizeLineResult](x: Self) {
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setRuleStack(value: js.Array[GrammarRule]): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
      
      inline def setRuleStackVarargs(value: GrammarRule*): Self = StObject.set(x, "ruleStack", js.Array(value*))
      
      inline def setTags(value: js.Array[Double | String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: (Double | String)*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTokens(value: js.Array[GrammarToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: GrammarToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
