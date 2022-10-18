package typings.fluentuiMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`0`
import typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`1`
import typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`2`
import typings.fluentuiMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesheetMod {
  
  /* Inlined {  none :0,   insertNode :1,   appendChild :2}[keyof {  none :0,   insertNode :1,   appendChild :2}] */
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`0`
    - typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`1`
    - typings.fluentuiMergeStyles.fluentuiMergeStylesInts.`2`
  */
  trait InjectionMode extends StObject
  object InjectionMode {
    
    @JSImport("@fluentui/merge-styles/lib/Stylesheet", "InjectionMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends rules using appendChild.
      */
    @JSImport("@fluentui/merge-styles/lib/Stylesheet", "InjectionMode.appendChild")
    @js.native
    def appendChild: `2` = js.native
    inline def appendChild_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(x.asInstanceOf[js.Any])
    
    /**
      * Inserts rules using the insertRule api.
      */
    @JSImport("@fluentui/merge-styles/lib/Stylesheet", "InjectionMode.insertNode")
    @js.native
    def insertNode: `1` = js.native
    inline def insertNode_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(x.asInstanceOf[js.Any])
    
    /**
      * Avoids style injection, use getRules() to read the styles.
      */
    @JSImport("@fluentui/merge-styles/lib/Stylesheet", "InjectionMode.none")
    @js.native
    def none: `0` = js.native
    inline def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fluentui/merge-styles/lib/Stylesheet", "Stylesheet")
  @js.native
  open class Stylesheet () extends StObject {
    def this(config: IStyleSheetConfig) = this()
    def this(config: Unit, serializedStylesheet: ISerializedStylesheet) = this()
    def this(config: IStyleSheetConfig, serializedStylesheet: ISerializedStylesheet) = this()
    
    /* private */ var _classNameToArgs: Any = js.native
    
    /* private */ var _config: Any = js.native
    
    /* private */ var _counter: Any = js.native
    
    /* private */ var _createStyleElement: Any = js.native
    
    /* private */ var _findPlaceholderStyleTag: Any = js.native
    
    /* private */ var _getStyleElement: Any = js.native
    
    /* private */ var _keyToClassName: Any = js.native
    
    /* private */ var _lastStyleElement: Any = js.native
    
    /* private */ var _onInsertRuleCallbacks: Any = js.native
    
    /* private */ var _onResetCallbacks: Any = js.native
    
    /* private */ var _preservedRules: Any = js.native
    
    /* private */ var _rules: Any = js.native
    
    /* private */ var _styleElement: Any = js.native
    
    /**
      * Gets the arguments associated with a given classname which was
      * previously registered using cacheClassName.
      */
    def argsFromClassName(className: String): js.UndefOr[js.Array[IStyle]] = js.native
    
    /**
      * Used internally to cache information about a class which was
      * registered with the stylesheet.
      */
    def cacheClassName(className: String, key: String, args: js.Array[IStyle], rules: js.Array[String]): Unit = js.native
    
    /**
      * Gets the appropriate classname given a key which was previously
      * registered using cacheClassName.
      */
    def classNameFromKey(key: String): js.UndefOr[String] = js.native
    
    /**
      * Generates a unique classname.
      *
      * @param displayName - Optional value to use as a prefix.
      */
    def getClassName(): String = js.native
    def getClassName(displayName: String): String = js.native
    
    /**
      * Gets all classnames cache with the stylesheet.
      */
    def getClassNameCache(): StringDictionary[String] = js.native
    
    /**
      * Gets all rules registered with the stylesheet; only valid when
      * using InsertionMode.none.
      */
    def getRules(): String = js.native
    def getRules(includePreservedRules: Boolean): String = js.native
    
    /**
      * Inserts a css rule into the stylesheet.
      * @param preserve - Preserves the rule beyond a reset boundary.
      */
    def insertRule(rule: String): Unit = js.native
    def insertRule(rule: String, preserve: Boolean): Unit = js.native
    
    /**
      * Gets the rules associated with a given classname which was
      * previously registered using cacheClassName.
      */
    def insertedRulesFromClassName(className: String): js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Configures an insert rule callback.
      *
      * @param callback - A callback which will be called when a rule is inserted.
      * @returns function which when called un-registers provided callback.
      */
    def onInsertRule(callback: js.Function): js.Function = js.native
    
    /**
      * Configures a reset callback.
      *
      * @param callback - A callback which will be called when the Stylesheet is reset.
      * @returns function which when called un-registers provided callback.
      */
    def onReset(callback: js.Function): js.Function = js.native
    
    /**
      * Resets the internal state of the stylesheet. Only used in server
      * rendered scenarios where we're using InsertionMode.none.
      */
    def reset(): Unit = js.native
    
    def resetKeys(): Unit = js.native
    
    /**
      * Serializes the Stylesheet instance into a format which allows rehydration on creation.
      * @returns string representation of `ISerializedStylesheet` interface.
      */
    def serialize(): String = js.native
    
    /**
      * Configures the stylesheet.
      */
    def setConfig(): Unit = js.native
    def setConfig(config: IStyleSheetConfig): Unit = js.native
  }
  /* static members */
  object Stylesheet {
    
    @JSImport("@fluentui/merge-styles/lib/Stylesheet", "Stylesheet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the singleton instance.
      */
    inline def getInstance(): Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Stylesheet]
  }
  
  trait ICSPSettings extends StObject {
    
    /**
      * Nonce to inject into script tag
      */
    var nonce: js.UndefOr[String] = js.undefined
  }
  object ICSPSettings {
    
    inline def apply(): ICSPSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICSPSettings]
    }
    
    extension [Self <: ICSPSettings](x: Self) {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  trait ISerializedStylesheet extends StObject {
    
    var classNameToArgs: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_classNameToArgs'] */ js.Any
    
    var counter: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_counter'] */ js.Any
    
    var keyToClassName: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_keyToClassName'] */ js.Any
    
    var preservedRules: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_preservedRules'] */ js.Any
    
    var rules: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_rules'] */ js.Any
  }
  object ISerializedStylesheet {
    
    inline def apply(
      classNameToArgs: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_classNameToArgs'] */ js.Any,
      counter: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_counter'] */ js.Any,
      keyToClassName: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_keyToClassName'] */ js.Any,
      preservedRules: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_preservedRules'] */ js.Any,
      rules: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_rules'] */ js.Any
    ): ISerializedStylesheet = {
      val __obj = js.Dynamic.literal(classNameToArgs = classNameToArgs.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], keyToClassName = keyToClassName.asInstanceOf[js.Any], preservedRules = preservedRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISerializedStylesheet]
    }
    
    extension [Self <: ISerializedStylesheet](x: Self) {
      
      inline def setClassNameToArgs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_classNameToArgs'] */ js.Any
      ): Self = StObject.set(x, "classNameToArgs", value.asInstanceOf[js.Any])
      
      inline def setCounter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_counter'] */ js.Any
      ): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setKeyToClassName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_keyToClassName'] */ js.Any
      ): Self = StObject.set(x, "keyToClassName", value.asInstanceOf[js.Any])
      
      inline def setPreservedRules(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_preservedRules'] */ js.Any
      ): Self = StObject.set(x, "preservedRules", value.asInstanceOf[js.Any])
      
      inline def setRules(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @fluentui/merge-styles.@fluentui/merge-styles/lib/Stylesheet.Stylesheet['_rules'] */ js.Any
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStyleSheetConfig extends StObject {
    
    /**
      * Initial value for classnames cache. Key is serialized css rules associated with a classname.
      */
    var classNameCache: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * CSP settings
      */
    var cspSettings: js.UndefOr[ICSPSettings] = js.undefined
    
    /**
      * Default 'displayName' to use for a className.
      * @defaultvalue 'css'
      */
    var defaultPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Injection mode for how rules are inserted.
      */
    var injectionMode: js.UndefOr[InjectionMode] = js.undefined
    
    /**
      * Default 'namespace' to attach before the className.
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * Callback executed when a rule is inserted.
      * @deprecated Use `Stylesheet.onInsertRule` instead.
      */
    var onInsertRule: js.UndefOr[js.Function1[/* rule */ String, Unit]] = js.undefined
    
    /**
      * Defines the default direction of rules for auto-rtlifying things.
      * While typically this is represented as a DIR attribute in the markup,
      * the DIR is not enough to control whether padding goes on the left or
      * right. Use this to set the default direction when rules are registered.
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
  }
  object IStyleSheetConfig {
    
    inline def apply(): IStyleSheetConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyleSheetConfig]
    }
    
    extension [Self <: IStyleSheetConfig](x: Self) {
      
      inline def setClassNameCache(value: StringDictionary[String]): Self = StObject.set(x, "classNameCache", value.asInstanceOf[js.Any])
      
      inline def setClassNameCacheUndefined: Self = StObject.set(x, "classNameCache", js.undefined)
      
      inline def setCspSettings(value: ICSPSettings): Self = StObject.set(x, "cspSettings", value.asInstanceOf[js.Any])
      
      inline def setCspSettingsUndefined: Self = StObject.set(x, "cspSettings", js.undefined)
      
      inline def setDefaultPrefix(value: String): Self = StObject.set(x, "defaultPrefix", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrefixUndefined: Self = StObject.set(x, "defaultPrefix", js.undefined)
      
      inline def setInjectionMode(value: InjectionMode): Self = StObject.set(x, "injectionMode", value.asInstanceOf[js.Any])
      
      inline def setInjectionModeUndefined: Self = StObject.set(x, "injectionMode", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOnInsertRule(value: /* rule */ String => Unit): Self = StObject.set(x, "onInsertRule", js.Any.fromFunction1(value))
      
      inline def setOnInsertRuleUndefined: Self = StObject.set(x, "onInsertRule", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
}
