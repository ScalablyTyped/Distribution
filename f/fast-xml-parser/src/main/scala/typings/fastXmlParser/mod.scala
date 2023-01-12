package typings.fastXmlParser

import typings.fastXmlParser.anon.Code
import typings.fastXmlParser.fastXmlParserBooleans.`false`
import typings.fastXmlParser.fastXmlParserBooleans.`true`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-xml-parser", "XMLBuilder")
  @js.native
  open class XMLBuilder protected () extends StObject {
    def this(options: XmlBuilderOptionsOptional) = this()
    
    def build(jObj: Any): Any = js.native
  }
  
  @JSImport("fast-xml-parser", "XMLParser")
  @js.native
  open class XMLParser () extends StObject {
    def this(options: X2jOptionsOptional) = this()
    
    /**
      * Add Entity which is not by default supported by this library
      * @param entityIndentifier {string} Eg: 'ent' for &ent;
      * @param entityValue {string} Eg: '\r'
      */
    def addEntity(entityIndentifier: String, entityValue: String): Unit = js.native
    
    def parse(xmlData: String): Any = js.native
    def parse(xmlData: String, validationOptions: Boolean): Any = js.native
    def parse(xmlData: String, validationOptions: validationOptionsOptional): Any = js.native
    def parse(xmlData: Buffer): Any = js.native
    def parse(xmlData: Buffer, validationOptions: Boolean): Any = js.native
    def parse(xmlData: Buffer, validationOptions: validationOptionsOptional): Any = js.native
  }
  
  @JSImport("fast-xml-parser", "XMLValidator")
  @js.native
  open class XMLValidator () extends StObject
  /* static members */
  object XMLValidator {
    
    @JSImport("fast-xml-parser", "XMLValidator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def validate(xmlData: String): `true` | ValidationError = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(xmlData.asInstanceOf[js.Any]).asInstanceOf[`true` | ValidationError]
    inline def validate(xmlData: String, options: validationOptionsOptional): `true` | ValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(xmlData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[`true` | ValidationError]
  }
  
  type ESchema = String | js.Object | (js.Array[String | js.Object])
  
  trait ValidationError extends StObject {
    
    var err: Code
  }
  object ValidationError {
    
    inline def apply(err: Code): ValidationError = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setErr(value: Code): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    }
  }
  
  trait X2jOptions extends StObject {
    
    var allowBooleanAttributes: Boolean
    
    var alwaysCreateTextNode: Boolean
    
    var attributeNamePrefix: String
    
    def attributeValueProcessor(attrName: String, attrValue: String, jPath: String): String
    
    var attributesGroupName: `false` | String
    
    var cdataPropName: `false` | String
    
    var commentPropName: `false` | String
    
    var htmlEntities: Boolean
    
    var ignoreAttributes: Boolean
    
    var ignoreDeclaration: Boolean
    
    var ignorePiTags: Boolean
    
    def isArray(tagName: String, jPath: String, isLeafNode: Boolean, isAttribute: Boolean): Boolean
    
    var numberParseOptions: strnumOptions
    
    var parseAttributeValue: Boolean
    
    var parseTagValue: Boolean
    
    var preserveOrder: Boolean
    
    var processEntities: Boolean
    
    var removeNSPrefix: Boolean
    
    var stopNodes: js.Array[String]
    
    /**
    Control how tag value should be parsed. Called only if tag value is not empty
    @returns {undefined|null} `undefined` or `null` to set original value.
    @returns {unknown} 
    1. Different value or value with different data type to set new value. <br>
    2. Same value to set parsed value if `parseTagValue: true`.
      */
    def tagValueProcessor(tagName: String, tagValue: String, jPath: String, hasAttributes: Boolean, isLeafNode: Boolean): Any
    
    var textNodeName: String
    
    var transformTagName: (js.Function1[/* tagName */ String, String]) | `false`
    
    var trimValues: Boolean
    
    var unpairedTags: js.Array[String]
  }
  object X2jOptions {
    
    inline def apply(
      allowBooleanAttributes: Boolean,
      alwaysCreateTextNode: Boolean,
      attributeNamePrefix: String,
      attributeValueProcessor: (String, String, String) => String,
      attributesGroupName: `false` | String,
      cdataPropName: `false` | String,
      commentPropName: `false` | String,
      htmlEntities: Boolean,
      ignoreAttributes: Boolean,
      ignoreDeclaration: Boolean,
      ignorePiTags: Boolean,
      isArray: (String, String, Boolean, Boolean) => Boolean,
      numberParseOptions: strnumOptions,
      parseAttributeValue: Boolean,
      parseTagValue: Boolean,
      preserveOrder: Boolean,
      processEntities: Boolean,
      removeNSPrefix: Boolean,
      stopNodes: js.Array[String],
      tagValueProcessor: (String, String, String, Boolean, Boolean) => Any,
      textNodeName: String,
      transformTagName: (js.Function1[/* tagName */ String, String]) | `false`,
      trimValues: Boolean,
      unpairedTags: js.Array[String]
    ): X2jOptions = {
      val __obj = js.Dynamic.literal(allowBooleanAttributes = allowBooleanAttributes.asInstanceOf[js.Any], alwaysCreateTextNode = alwaysCreateTextNode.asInstanceOf[js.Any], attributeNamePrefix = attributeNamePrefix.asInstanceOf[js.Any], attributeValueProcessor = js.Any.fromFunction3(attributeValueProcessor), attributesGroupName = attributesGroupName.asInstanceOf[js.Any], cdataPropName = cdataPropName.asInstanceOf[js.Any], commentPropName = commentPropName.asInstanceOf[js.Any], htmlEntities = htmlEntities.asInstanceOf[js.Any], ignoreAttributes = ignoreAttributes.asInstanceOf[js.Any], ignoreDeclaration = ignoreDeclaration.asInstanceOf[js.Any], ignorePiTags = ignorePiTags.asInstanceOf[js.Any], isArray = js.Any.fromFunction4(isArray), numberParseOptions = numberParseOptions.asInstanceOf[js.Any], parseAttributeValue = parseAttributeValue.asInstanceOf[js.Any], parseTagValue = parseTagValue.asInstanceOf[js.Any], preserveOrder = preserveOrder.asInstanceOf[js.Any], processEntities = processEntities.asInstanceOf[js.Any], removeNSPrefix = removeNSPrefix.asInstanceOf[js.Any], stopNodes = stopNodes.asInstanceOf[js.Any], tagValueProcessor = js.Any.fromFunction5(tagValueProcessor), textNodeName = textNodeName.asInstanceOf[js.Any], transformTagName = transformTagName.asInstanceOf[js.Any], trimValues = trimValues.asInstanceOf[js.Any], unpairedTags = unpairedTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[X2jOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X2jOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setAlwaysCreateTextNode(value: Boolean): Self = StObject.set(x, "alwaysCreateTextNode", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueProcessor(value: (String, String, String) => String): Self = StObject.set(x, "attributeValueProcessor", js.Any.fromFunction3(value))
      
      inline def setAttributesGroupName(value: `false` | String): Self = StObject.set(x, "attributesGroupName", value.asInstanceOf[js.Any])
      
      inline def setCdataPropName(value: `false` | String): Self = StObject.set(x, "cdataPropName", value.asInstanceOf[js.Any])
      
      inline def setCommentPropName(value: `false` | String): Self = StObject.set(x, "commentPropName", value.asInstanceOf[js.Any])
      
      inline def setHtmlEntities(value: Boolean): Self = StObject.set(x, "htmlEntities", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDeclaration(value: Boolean): Self = StObject.set(x, "ignoreDeclaration", value.asInstanceOf[js.Any])
      
      inline def setIgnorePiTags(value: Boolean): Self = StObject.set(x, "ignorePiTags", value.asInstanceOf[js.Any])
      
      inline def setIsArray(value: (String, String, Boolean, Boolean) => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction4(value))
      
      inline def setNumberParseOptions(value: strnumOptions): Self = StObject.set(x, "numberParseOptions", value.asInstanceOf[js.Any])
      
      inline def setParseAttributeValue(value: Boolean): Self = StObject.set(x, "parseAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setParseTagValue(value: Boolean): Self = StObject.set(x, "parseTagValue", value.asInstanceOf[js.Any])
      
      inline def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      inline def setProcessEntities(value: Boolean): Self = StObject.set(x, "processEntities", value.asInstanceOf[js.Any])
      
      inline def setRemoveNSPrefix(value: Boolean): Self = StObject.set(x, "removeNSPrefix", value.asInstanceOf[js.Any])
      
      inline def setStopNodes(value: js.Array[String]): Self = StObject.set(x, "stopNodes", value.asInstanceOf[js.Any])
      
      inline def setStopNodesVarargs(value: String*): Self = StObject.set(x, "stopNodes", js.Array(value*))
      
      inline def setTagValueProcessor(value: (String, String, String, Boolean, Boolean) => Any): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction5(value))
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setTransformTagName(value: (js.Function1[/* tagName */ String, String]) | `false`): Self = StObject.set(x, "transformTagName", value.asInstanceOf[js.Any])
      
      inline def setTransformTagNameFunction1(value: /* tagName */ String => String): Self = StObject.set(x, "transformTagName", js.Any.fromFunction1(value))
      
      inline def setTrimValues(value: Boolean): Self = StObject.set(x, "trimValues", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTags(value: js.Array[String]): Self = StObject.set(x, "unpairedTags", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTagsVarargs(value: String*): Self = StObject.set(x, "unpairedTags", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<fast-xml-parser.fast-xml-parser.X2jOptions> */
  trait X2jOptionsOptional extends StObject {
    
    var allowBooleanAttributes: js.UndefOr[Boolean] = js.undefined
    
    var alwaysCreateTextNode: js.UndefOr[Boolean] = js.undefined
    
    var attributeNamePrefix: js.UndefOr[String] = js.undefined
    
    var attributeValueProcessor: js.UndefOr[
        js.Function3[/* attrName */ String, /* attrValue */ String, /* jPath */ String, String]
      ] = js.undefined
    
    var attributesGroupName: js.UndefOr[`false` | String] = js.undefined
    
    var cdataPropName: js.UndefOr[`false` | String] = js.undefined
    
    var commentPropName: js.UndefOr[`false` | String] = js.undefined
    
    var htmlEntities: js.UndefOr[Boolean] = js.undefined
    
    var ignoreAttributes: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDeclaration: js.UndefOr[Boolean] = js.undefined
    
    var ignorePiTags: js.UndefOr[Boolean] = js.undefined
    
    var isArray: js.UndefOr[
        js.Function4[
          /* tagName */ String, 
          /* jPath */ String, 
          /* isLeafNode */ Boolean, 
          /* isAttribute */ Boolean, 
          Boolean
        ]
      ] = js.undefined
    
    var numberParseOptions: js.UndefOr[strnumOptions] = js.undefined
    
    var parseAttributeValue: js.UndefOr[Boolean] = js.undefined
    
    var parseTagValue: js.UndefOr[Boolean] = js.undefined
    
    var preserveOrder: js.UndefOr[Boolean] = js.undefined
    
    var processEntities: js.UndefOr[Boolean] = js.undefined
    
    var removeNSPrefix: js.UndefOr[Boolean] = js.undefined
    
    var stopNodes: js.UndefOr[js.Array[String]] = js.undefined
    
    var tagValueProcessor: js.UndefOr[
        js.Function5[
          /* tagName */ String, 
          /* tagValue */ String, 
          /* jPath */ String, 
          /* hasAttributes */ Boolean, 
          /* isLeafNode */ Boolean, 
          Any
        ]
      ] = js.undefined
    
    var textNodeName: js.UndefOr[String] = js.undefined
    
    var transformTagName: js.UndefOr[(js.Function1[/* tagName */ String, String]) | `false`] = js.undefined
    
    var trimValues: js.UndefOr[Boolean] = js.undefined
    
    var unpairedTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object X2jOptionsOptional {
    
    inline def apply(): X2jOptionsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X2jOptionsOptional]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X2jOptionsOptional] (val x: Self) extends AnyVal {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowBooleanAttributesUndefined: Self = StObject.set(x, "allowBooleanAttributes", js.undefined)
      
      inline def setAlwaysCreateTextNode(value: Boolean): Self = StObject.set(x, "alwaysCreateTextNode", value.asInstanceOf[js.Any])
      
      inline def setAlwaysCreateTextNodeUndefined: Self = StObject.set(x, "alwaysCreateTextNode", js.undefined)
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamePrefixUndefined: Self = StObject.set(x, "attributeNamePrefix", js.undefined)
      
      inline def setAttributeValueProcessor(value: (/* attrName */ String, /* attrValue */ String, /* jPath */ String) => String): Self = StObject.set(x, "attributeValueProcessor", js.Any.fromFunction3(value))
      
      inline def setAttributeValueProcessorUndefined: Self = StObject.set(x, "attributeValueProcessor", js.undefined)
      
      inline def setAttributesGroupName(value: `false` | String): Self = StObject.set(x, "attributesGroupName", value.asInstanceOf[js.Any])
      
      inline def setAttributesGroupNameUndefined: Self = StObject.set(x, "attributesGroupName", js.undefined)
      
      inline def setCdataPropName(value: `false` | String): Self = StObject.set(x, "cdataPropName", value.asInstanceOf[js.Any])
      
      inline def setCdataPropNameUndefined: Self = StObject.set(x, "cdataPropName", js.undefined)
      
      inline def setCommentPropName(value: `false` | String): Self = StObject.set(x, "commentPropName", value.asInstanceOf[js.Any])
      
      inline def setCommentPropNameUndefined: Self = StObject.set(x, "commentPropName", js.undefined)
      
      inline def setHtmlEntities(value: Boolean): Self = StObject.set(x, "htmlEntities", value.asInstanceOf[js.Any])
      
      inline def setHtmlEntitiesUndefined: Self = StObject.set(x, "htmlEntities", js.undefined)
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
      
      inline def setIgnoreDeclaration(value: Boolean): Self = StObject.set(x, "ignoreDeclaration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDeclarationUndefined: Self = StObject.set(x, "ignoreDeclaration", js.undefined)
      
      inline def setIgnorePiTags(value: Boolean): Self = StObject.set(x, "ignorePiTags", value.asInstanceOf[js.Any])
      
      inline def setIgnorePiTagsUndefined: Self = StObject.set(x, "ignorePiTags", js.undefined)
      
      inline def setIsArray(
        value: (/* tagName */ String, /* jPath */ String, /* isLeafNode */ Boolean, /* isAttribute */ Boolean) => Boolean
      ): Self = StObject.set(x, "isArray", js.Any.fromFunction4(value))
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setNumberParseOptions(value: strnumOptions): Self = StObject.set(x, "numberParseOptions", value.asInstanceOf[js.Any])
      
      inline def setNumberParseOptionsUndefined: Self = StObject.set(x, "numberParseOptions", js.undefined)
      
      inline def setParseAttributeValue(value: Boolean): Self = StObject.set(x, "parseAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setParseAttributeValueUndefined: Self = StObject.set(x, "parseAttributeValue", js.undefined)
      
      inline def setParseTagValue(value: Boolean): Self = StObject.set(x, "parseTagValue", value.asInstanceOf[js.Any])
      
      inline def setParseTagValueUndefined: Self = StObject.set(x, "parseTagValue", js.undefined)
      
      inline def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveOrderUndefined: Self = StObject.set(x, "preserveOrder", js.undefined)
      
      inline def setProcessEntities(value: Boolean): Self = StObject.set(x, "processEntities", value.asInstanceOf[js.Any])
      
      inline def setProcessEntitiesUndefined: Self = StObject.set(x, "processEntities", js.undefined)
      
      inline def setRemoveNSPrefix(value: Boolean): Self = StObject.set(x, "removeNSPrefix", value.asInstanceOf[js.Any])
      
      inline def setRemoveNSPrefixUndefined: Self = StObject.set(x, "removeNSPrefix", js.undefined)
      
      inline def setStopNodes(value: js.Array[String]): Self = StObject.set(x, "stopNodes", value.asInstanceOf[js.Any])
      
      inline def setStopNodesUndefined: Self = StObject.set(x, "stopNodes", js.undefined)
      
      inline def setStopNodesVarargs(value: String*): Self = StObject.set(x, "stopNodes", js.Array(value*))
      
      inline def setTagValueProcessor(
        value: (/* tagName */ String, /* tagValue */ String, /* jPath */ String, /* hasAttributes */ Boolean, /* isLeafNode */ Boolean) => Any
      ): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction5(value))
      
      inline def setTagValueProcessorUndefined: Self = StObject.set(x, "tagValueProcessor", js.undefined)
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setTextNodeNameUndefined: Self = StObject.set(x, "textNodeName", js.undefined)
      
      inline def setTransformTagName(value: (js.Function1[/* tagName */ String, String]) | `false`): Self = StObject.set(x, "transformTagName", value.asInstanceOf[js.Any])
      
      inline def setTransformTagNameFunction1(value: /* tagName */ String => String): Self = StObject.set(x, "transformTagName", js.Any.fromFunction1(value))
      
      inline def setTransformTagNameUndefined: Self = StObject.set(x, "transformTagName", js.undefined)
      
      inline def setTrimValues(value: Boolean): Self = StObject.set(x, "trimValues", value.asInstanceOf[js.Any])
      
      inline def setTrimValuesUndefined: Self = StObject.set(x, "trimValues", js.undefined)
      
      inline def setUnpairedTags(value: js.Array[String]): Self = StObject.set(x, "unpairedTags", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTagsUndefined: Self = StObject.set(x, "unpairedTags", js.undefined)
      
      inline def setUnpairedTagsVarargs(value: String*): Self = StObject.set(x, "unpairedTags", js.Array(value*))
    }
  }
  
  trait XmlBuilderOptions extends StObject {
    
    var arrayNodeName: String
    
    var attributeNamePrefix: String
    
    def attributeValueProcessor(name: String, value: String): String
    
    var attributesGroupName: `false` | String
    
    var cdataPropName: `false` | String
    
    var commentPropName: `false` | String
    
    var format: Boolean
    
    var ignoreAttributes: Boolean
    
    var indentBy: String
    
    var preserveOrder: Boolean
    
    var processEntities: Boolean
    
    var stopNodes: js.Array[String]
    
    var suppressBooleanAttributes: Boolean
    
    var suppressEmptyNode: Boolean
    
    var suppressUnpairedNode: Boolean
    
    def tagValueProcessor(name: String, value: String): String
    
    var textNodeName: String
    
    var unpairedTags: js.Array[String]
  }
  object XmlBuilderOptions {
    
    inline def apply(
      arrayNodeName: String,
      attributeNamePrefix: String,
      attributeValueProcessor: (String, String) => String,
      attributesGroupName: `false` | String,
      cdataPropName: `false` | String,
      commentPropName: `false` | String,
      format: Boolean,
      ignoreAttributes: Boolean,
      indentBy: String,
      preserveOrder: Boolean,
      processEntities: Boolean,
      stopNodes: js.Array[String],
      suppressBooleanAttributes: Boolean,
      suppressEmptyNode: Boolean,
      suppressUnpairedNode: Boolean,
      tagValueProcessor: (String, String) => String,
      textNodeName: String,
      unpairedTags: js.Array[String]
    ): XmlBuilderOptions = {
      val __obj = js.Dynamic.literal(arrayNodeName = arrayNodeName.asInstanceOf[js.Any], attributeNamePrefix = attributeNamePrefix.asInstanceOf[js.Any], attributeValueProcessor = js.Any.fromFunction2(attributeValueProcessor), attributesGroupName = attributesGroupName.asInstanceOf[js.Any], cdataPropName = cdataPropName.asInstanceOf[js.Any], commentPropName = commentPropName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], ignoreAttributes = ignoreAttributes.asInstanceOf[js.Any], indentBy = indentBy.asInstanceOf[js.Any], preserveOrder = preserveOrder.asInstanceOf[js.Any], processEntities = processEntities.asInstanceOf[js.Any], stopNodes = stopNodes.asInstanceOf[js.Any], suppressBooleanAttributes = suppressBooleanAttributes.asInstanceOf[js.Any], suppressEmptyNode = suppressEmptyNode.asInstanceOf[js.Any], suppressUnpairedNode = suppressUnpairedNode.asInstanceOf[js.Any], tagValueProcessor = js.Any.fromFunction2(tagValueProcessor), textNodeName = textNodeName.asInstanceOf[js.Any], unpairedTags = unpairedTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setArrayNodeName(value: String): Self = StObject.set(x, "arrayNodeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueProcessor(value: (String, String) => String): Self = StObject.set(x, "attributeValueProcessor", js.Any.fromFunction2(value))
      
      inline def setAttributesGroupName(value: `false` | String): Self = StObject.set(x, "attributesGroupName", value.asInstanceOf[js.Any])
      
      inline def setCdataPropName(value: `false` | String): Self = StObject.set(x, "cdataPropName", value.asInstanceOf[js.Any])
      
      inline def setCommentPropName(value: `false` | String): Self = StObject.set(x, "commentPropName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIndentBy(value: String): Self = StObject.set(x, "indentBy", value.asInstanceOf[js.Any])
      
      inline def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      inline def setProcessEntities(value: Boolean): Self = StObject.set(x, "processEntities", value.asInstanceOf[js.Any])
      
      inline def setStopNodes(value: js.Array[String]): Self = StObject.set(x, "stopNodes", value.asInstanceOf[js.Any])
      
      inline def setStopNodesVarargs(value: String*): Self = StObject.set(x, "stopNodes", js.Array(value*))
      
      inline def setSuppressBooleanAttributes(value: Boolean): Self = StObject.set(x, "suppressBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setSuppressEmptyNode(value: Boolean): Self = StObject.set(x, "suppressEmptyNode", value.asInstanceOf[js.Any])
      
      inline def setSuppressUnpairedNode(value: Boolean): Self = StObject.set(x, "suppressUnpairedNode", value.asInstanceOf[js.Any])
      
      inline def setTagValueProcessor(value: (String, String) => String): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction2(value))
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTags(value: js.Array[String]): Self = StObject.set(x, "unpairedTags", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTagsVarargs(value: String*): Self = StObject.set(x, "unpairedTags", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<fast-xml-parser.fast-xml-parser.XmlBuilderOptions> */
  trait XmlBuilderOptionsOptional extends StObject {
    
    var arrayNodeName: js.UndefOr[String] = js.undefined
    
    var attributeNamePrefix: js.UndefOr[String] = js.undefined
    
    var attributeValueProcessor: js.UndefOr[js.Function2[/* name */ String, /* value */ String, String]] = js.undefined
    
    var attributesGroupName: js.UndefOr[`false` | String] = js.undefined
    
    var cdataPropName: js.UndefOr[`false` | String] = js.undefined
    
    var commentPropName: js.UndefOr[`false` | String] = js.undefined
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var ignoreAttributes: js.UndefOr[Boolean] = js.undefined
    
    var indentBy: js.UndefOr[String] = js.undefined
    
    var preserveOrder: js.UndefOr[Boolean] = js.undefined
    
    var processEntities: js.UndefOr[Boolean] = js.undefined
    
    var stopNodes: js.UndefOr[js.Array[String]] = js.undefined
    
    var suppressBooleanAttributes: js.UndefOr[Boolean] = js.undefined
    
    var suppressEmptyNode: js.UndefOr[Boolean] = js.undefined
    
    var suppressUnpairedNode: js.UndefOr[Boolean] = js.undefined
    
    var tagValueProcessor: js.UndefOr[js.Function2[/* name */ String, /* value */ String, String]] = js.undefined
    
    var textNodeName: js.UndefOr[String] = js.undefined
    
    var unpairedTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object XmlBuilderOptionsOptional {
    
    inline def apply(): XmlBuilderOptionsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlBuilderOptionsOptional]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlBuilderOptionsOptional] (val x: Self) extends AnyVal {
      
      inline def setArrayNodeName(value: String): Self = StObject.set(x, "arrayNodeName", value.asInstanceOf[js.Any])
      
      inline def setArrayNodeNameUndefined: Self = StObject.set(x, "arrayNodeName", js.undefined)
      
      inline def setAttributeNamePrefix(value: String): Self = StObject.set(x, "attributeNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamePrefixUndefined: Self = StObject.set(x, "attributeNamePrefix", js.undefined)
      
      inline def setAttributeValueProcessor(value: (/* name */ String, /* value */ String) => String): Self = StObject.set(x, "attributeValueProcessor", js.Any.fromFunction2(value))
      
      inline def setAttributeValueProcessorUndefined: Self = StObject.set(x, "attributeValueProcessor", js.undefined)
      
      inline def setAttributesGroupName(value: `false` | String): Self = StObject.set(x, "attributesGroupName", value.asInstanceOf[js.Any])
      
      inline def setAttributesGroupNameUndefined: Self = StObject.set(x, "attributesGroupName", js.undefined)
      
      inline def setCdataPropName(value: `false` | String): Self = StObject.set(x, "cdataPropName", value.asInstanceOf[js.Any])
      
      inline def setCdataPropNameUndefined: Self = StObject.set(x, "cdataPropName", js.undefined)
      
      inline def setCommentPropName(value: `false` | String): Self = StObject.set(x, "commentPropName", value.asInstanceOf[js.Any])
      
      inline def setCommentPropNameUndefined: Self = StObject.set(x, "commentPropName", js.undefined)
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnoreAttributes(value: Boolean): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
      
      inline def setIndentBy(value: String): Self = StObject.set(x, "indentBy", value.asInstanceOf[js.Any])
      
      inline def setIndentByUndefined: Self = StObject.set(x, "indentBy", js.undefined)
      
      inline def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveOrderUndefined: Self = StObject.set(x, "preserveOrder", js.undefined)
      
      inline def setProcessEntities(value: Boolean): Self = StObject.set(x, "processEntities", value.asInstanceOf[js.Any])
      
      inline def setProcessEntitiesUndefined: Self = StObject.set(x, "processEntities", js.undefined)
      
      inline def setStopNodes(value: js.Array[String]): Self = StObject.set(x, "stopNodes", value.asInstanceOf[js.Any])
      
      inline def setStopNodesUndefined: Self = StObject.set(x, "stopNodes", js.undefined)
      
      inline def setStopNodesVarargs(value: String*): Self = StObject.set(x, "stopNodes", js.Array(value*))
      
      inline def setSuppressBooleanAttributes(value: Boolean): Self = StObject.set(x, "suppressBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setSuppressBooleanAttributesUndefined: Self = StObject.set(x, "suppressBooleanAttributes", js.undefined)
      
      inline def setSuppressEmptyNode(value: Boolean): Self = StObject.set(x, "suppressEmptyNode", value.asInstanceOf[js.Any])
      
      inline def setSuppressEmptyNodeUndefined: Self = StObject.set(x, "suppressEmptyNode", js.undefined)
      
      inline def setSuppressUnpairedNode(value: Boolean): Self = StObject.set(x, "suppressUnpairedNode", value.asInstanceOf[js.Any])
      
      inline def setSuppressUnpairedNodeUndefined: Self = StObject.set(x, "suppressUnpairedNode", js.undefined)
      
      inline def setTagValueProcessor(value: (/* name */ String, /* value */ String) => String): Self = StObject.set(x, "tagValueProcessor", js.Any.fromFunction2(value))
      
      inline def setTagValueProcessorUndefined: Self = StObject.set(x, "tagValueProcessor", js.undefined)
      
      inline def setTextNodeName(value: String): Self = StObject.set(x, "textNodeName", value.asInstanceOf[js.Any])
      
      inline def setTextNodeNameUndefined: Self = StObject.set(x, "textNodeName", js.undefined)
      
      inline def setUnpairedTags(value: js.Array[String]): Self = StObject.set(x, "unpairedTags", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTagsUndefined: Self = StObject.set(x, "unpairedTags", js.undefined)
      
      inline def setUnpairedTagsVarargs(value: String*): Self = StObject.set(x, "unpairedTags", js.Array(value*))
    }
  }
  
  trait strnumOptions extends StObject {
    
    var hex: Boolean
    
    var leadingZeros: Boolean
    
    var skipLike: js.UndefOr[js.RegExp] = js.undefined
  }
  object strnumOptions {
    
    inline def apply(hex: Boolean, leadingZeros: Boolean): strnumOptions = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], leadingZeros = leadingZeros.asInstanceOf[js.Any])
      __obj.asInstanceOf[strnumOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: strnumOptions] (val x: Self) extends AnyVal {
      
      inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setLeadingZeros(value: Boolean): Self = StObject.set(x, "leadingZeros", value.asInstanceOf[js.Any])
      
      inline def setSkipLike(value: js.RegExp): Self = StObject.set(x, "skipLike", value.asInstanceOf[js.Any])
      
      inline def setSkipLikeUndefined: Self = StObject.set(x, "skipLike", js.undefined)
    }
  }
  
  trait validationOptions extends StObject {
    
    var allowBooleanAttributes: Boolean
    
    var unpairedTags: js.Array[String]
  }
  object validationOptions {
    
    inline def apply(allowBooleanAttributes: Boolean, unpairedTags: js.Array[String]): validationOptions = {
      val __obj = js.Dynamic.literal(allowBooleanAttributes = allowBooleanAttributes.asInstanceOf[js.Any], unpairedTags = unpairedTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[validationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: validationOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTags(value: js.Array[String]): Self = StObject.set(x, "unpairedTags", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTagsVarargs(value: String*): Self = StObject.set(x, "unpairedTags", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<fast-xml-parser.fast-xml-parser.validationOptions> */
  trait validationOptionsOptional extends StObject {
    
    var allowBooleanAttributes: js.UndefOr[Boolean] = js.undefined
    
    var unpairedTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object validationOptionsOptional {
    
    inline def apply(): validationOptionsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[validationOptionsOptional]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: validationOptionsOptional] (val x: Self) extends AnyVal {
      
      inline def setAllowBooleanAttributes(value: Boolean): Self = StObject.set(x, "allowBooleanAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowBooleanAttributesUndefined: Self = StObject.set(x, "allowBooleanAttributes", js.undefined)
      
      inline def setUnpairedTags(value: js.Array[String]): Self = StObject.set(x, "unpairedTags", value.asInstanceOf[js.Any])
      
      inline def setUnpairedTagsUndefined: Self = StObject.set(x, "unpairedTags", js.undefined)
      
      inline def setUnpairedTagsVarargs(value: String*): Self = StObject.set(x, "unpairedTags", js.Array(value*))
    }
  }
}
