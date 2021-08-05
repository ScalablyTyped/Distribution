package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XMLService {
  
  @js.native
  sealed trait ContentType extends StObject
  /**
    * An enumeration representing the types of XML content nodes.
    */
  @JSGlobal("GoogleAppsScript.XML_Service.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @js.native
    sealed trait CDATA
      extends StObject
         with ContentType
    
    @js.native
    sealed trait COMMENT
      extends StObject
         with ContentType
    
    @js.native
    sealed trait DOCTYPE
      extends StObject
         with ContentType
    
    @js.native
    sealed trait ELEMENT
      extends StObject
         with ContentType
    
    @js.native
    sealed trait ENTITYREF
      extends StObject
         with ContentType
    
    @js.native
    sealed trait PROCESSINGINSTRUCTION
      extends StObject
         with ContentType
    
    @js.native
    sealed trait TEXT
      extends StObject
         with ContentType
  }
  
  /**
    * A representation of an XML attribute.
    *
    *     // Reads the first and last name of each person and adds a new attribute with the full name.
    *     var xml = '<roster>'
    *         + '<person first="John" last="Doe"/>'
    *         + '<person first="Mary" last="Smith"/>'
    *         + '</roster>';
    *     var document = XmlService.parse(xml);
    *     var people = document.getRootElement().getChildren('person');
    *     for (var i = 0; i < people.length; i++) {
    *       var person = people[i];
    *       var firstName = person.getAttribute('first').getValue();
    *       var lastName = person.getAttribute('last').getValue();
    *       person.setAttribute('full', firstName + ' ' + lastName);
    *     }
    *     xml = XmlService.getPrettyFormat().format(document);
    *     Logger.log(xml);
    */
  trait Attribute extends StObject {
    
    def getName(): String
    
    def getNamespace(): Namespace
    
    def getValue(): String
    
    def setName(name: String): Attribute
    
    def setNamespace(namespace: Namespace): Attribute
    
    def setValue(value: String): Attribute
  }
  object Attribute {
    
    inline def apply(
      getName: () => String,
      getNamespace: () => Namespace,
      getValue: () => String,
      setName: String => Attribute,
      setNamespace: Namespace => Attribute,
      setValue: String => Attribute
    ): Attribute = {
      val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getNamespace = js.Any.fromFunction0(getNamespace), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setNamespace = js.Any.fromFunction1(setNamespace), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNamespace(value: () => Namespace): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setSetName(value: String => Attribute): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNamespace(value: Namespace => Attribute): Self = StObject.set(x, "setNamespace", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: String => Attribute): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML CDATASection node.
    *
    *     // Create and log an XML document that shows how special characters like '<', '>', and '&' are
    *     // stored in a CDATASection node as compared to in a Text node.
    *     var illegalCharacters = '<em>The Amazing Adventures of Kavalier & Clay</em>';
    *     var cdata = XmlService.createCdata(illegalCharacters);
    *     var text = XmlService.createText(illegalCharacters);
    *     var root = XmlService.createElement('root').addContent(cdata).addContent(text);
    *     var document = XmlService.createDocument(root);
    *     var xml = XmlService.getPrettyFormat().format(document);
    *     Logger.log(xml);
    */
  trait Cdata
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def append(text: String): Text
    
    def getText(): String
    
    def setText(text: String): Text
  }
  object Cdata {
    
    inline def apply(
      append: String => Text,
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getParentElement: () => Element,
      getText: () => String,
      getType: () => ContentType,
      getValue: () => String,
      setText: String => Text
    ): Cdata = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[Cdata]
    }
    
    extension [Self <: Cdata](x: Self) {
      
      inline def setAppend(value: String => Text): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setSetText(value: String => Text): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML Comment node.
    */
  trait Comment
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getText(): String
    
    def setText(text: String): Comment
  }
  object Comment {
    
    inline def apply(
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getParentElement: () => Element,
      getText: () => String,
      getType: () => ContentType,
      getValue: () => String,
      setText: String => Comment
    ): Comment = {
      val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setSetText(value: String => Comment): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of a generic XML node.
    * Implementing classes
    *
    * NameBrief description
    *
    * CdataA representation of an XML CDATASection node.
    *
    * CommentA representation of an XML Comment node.
    *
    * DocTypeA representation of an XML DocumentType node.
    *
    * ElementA representation of an XML Element node.
    *
    * EntityRefA representation of an XML EntityReference node.
    *
    * ProcessingInstructionA representation of an XML ProcessingInstruction node.
    *
    * TextA representation of an XML Text node.
    */
  trait Content extends StObject {
    
    def asCdata(): Cdata
    
    def asComment(): Comment
    
    def asDocType(): DocType
    
    def asElement(): Element
    
    def asEntityRef(): EntityRef
    
    def asProcessingInstruction(): ProcessingInstruction
    
    def asText(): Text
    
    def detach(): typings.googleAppsScript.GoogleAppsScript.XMLService.Content
    
    def getParentElement(): Element
    
    def getType(): ContentType
    
    def getValue(): String
  }
  object Content {
    
    inline def apply(
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getParentElement: () => Element,
      getType: () => ContentType,
      getValue: () => String
    ): typings.googleAppsScript.GoogleAppsScript.XMLService.Content = {
      val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.XMLService.Content]
    }
    
    extension [Self <: typings.googleAppsScript.GoogleAppsScript.XMLService.Content](x: Self) {
      
      inline def setAsCdata(value: () => Cdata): Self = StObject.set(x, "asCdata", js.Any.fromFunction0(value))
      
      inline def setAsComment(value: () => Comment): Self = StObject.set(x, "asComment", js.Any.fromFunction0(value))
      
      inline def setAsDocType(value: () => DocType): Self = StObject.set(x, "asDocType", js.Any.fromFunction0(value))
      
      inline def setAsElement(value: () => Element): Self = StObject.set(x, "asElement", js.Any.fromFunction0(value))
      
      inline def setAsEntityRef(value: () => EntityRef): Self = StObject.set(x, "asEntityRef", js.Any.fromFunction0(value))
      
      inline def setAsProcessingInstruction(value: () => ProcessingInstruction): Self = StObject.set(x, "asProcessingInstruction", js.Any.fromFunction0(value))
      
      inline def setAsText(value: () => Text): Self = StObject.set(x, "asText", js.Any.fromFunction0(value))
      
      inline def setDetach(value: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      inline def setGetParentElement(value: () => Element): Self = StObject.set(x, "getParentElement", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => ContentType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A representation of an XML DocumentType node.
    */
  trait DocType
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getElementName(): String
    
    def getInternalSubset(): String
    
    def getPublicId(): String
    
    def getSystemId(): String
    
    def setElementName(name: String): DocType
    
    def setInternalSubset(data: String): DocType
    
    def setPublicId(id: String): DocType
    
    def setSystemId(id: String): DocType
  }
  object DocType {
    
    inline def apply(
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getElementName: () => String,
      getInternalSubset: () => String,
      getParentElement: () => Element,
      getPublicId: () => String,
      getSystemId: () => String,
      getType: () => ContentType,
      getValue: () => String,
      setElementName: String => DocType,
      setInternalSubset: String => DocType,
      setPublicId: String => DocType,
      setSystemId: String => DocType
    ): DocType = {
      val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getElementName = js.Any.fromFunction0(getElementName), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setElementName = js.Any.fromFunction1(setElementName), setInternalSubset = js.Any.fromFunction1(setInternalSubset), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
      __obj.asInstanceOf[DocType]
    }
    
    extension [Self <: DocType](x: Self) {
      
      inline def setGetElementName(value: () => String): Self = StObject.set(x, "getElementName", js.Any.fromFunction0(value))
      
      inline def setGetInternalSubset(value: () => String): Self = StObject.set(x, "getInternalSubset", js.Any.fromFunction0(value))
      
      inline def setGetPublicId(value: () => String): Self = StObject.set(x, "getPublicId", js.Any.fromFunction0(value))
      
      inline def setGetSystemId(value: () => String): Self = StObject.set(x, "getSystemId", js.Any.fromFunction0(value))
      
      inline def setSetElementName(value: String => DocType): Self = StObject.set(x, "setElementName", js.Any.fromFunction1(value))
      
      inline def setSetInternalSubset(value: String => DocType): Self = StObject.set(x, "setInternalSubset", js.Any.fromFunction1(value))
      
      inline def setSetPublicId(value: String => DocType): Self = StObject.set(x, "setPublicId", js.Any.fromFunction1(value))
      
      inline def setSetSystemId(value: String => DocType): Self = StObject.set(x, "setSystemId", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML document.
    */
  @js.native
  trait Document extends StObject {
    
    def addContent(content: typings.googleAppsScript.GoogleAppsScript.XMLService.Content): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    def addContent(index: Integer, content: typings.googleAppsScript.GoogleAppsScript.XMLService.Content): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def cloneContent(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def detachRootElement(): Element = js.native
    
    def getAllContent(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getContent(index: Integer): typings.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def getContentSize(): Integer = js.native
    
    def getDescendants(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getDocType(): DocType = js.native
    
    def getRootElement(): Element = js.native
    
    def hasRootElement(): Boolean = js.native
    
    def removeContent(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    def removeContent(content: typings.googleAppsScript.GoogleAppsScript.XMLService.Content): Boolean = js.native
    def removeContent(index: Integer): typings.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def setDocType(docType: DocType): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def setRootElement(element: Element): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
  }
  
  /**
    * A representation of an XML Element node.
    *
    *     // Adds up the values listed in a sample XML document and adds a new element with the total.
    *     var xml = '<things>'
    *         + '<plates>12</plates>'
    *         + '<bowls>18</bowls>'
    *         + '<cups>25</cups>'
    *         + '</things>';
    *     var document = XmlService.parse(xml);
    *     var root = document.getRootElement();
    *     var items = root.getChildren();
    *     var total = 0;
    *     for (var i = 0; i < items.length; i++) {
    *       total += Number(items[i].getText());
    *     }
    *     var totalElement = XmlService.createElement('total').setText(total);
    *     root.addContent(totalElement);
    *     xml = XmlService.getPrettyFormat().format(document);
    *     Logger.log(xml);
    */
  @js.native
  trait Element
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def addContent(content: typings.googleAppsScript.GoogleAppsScript.XMLService.Content): Element = js.native
    def addContent(index: Integer, content: typings.googleAppsScript.GoogleAppsScript.XMLService.Content): Element = js.native
    
    def cloneContent(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getAllContent(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getAttribute(name: String): Attribute = js.native
    def getAttribute(name: String, namespace: Namespace): Attribute = js.native
    
    def getAttributes(): js.Array[Attribute] = js.native
    
    def getChild(name: String): Element = js.native
    def getChild(name: String, namespace: Namespace): Element = js.native
    
    def getChildText(name: String): String = js.native
    def getChildText(name: String, namespace: Namespace): String = js.native
    
    def getChildren(): js.Array[Element] = js.native
    def getChildren(name: String): js.Array[Element] = js.native
    def getChildren(name: String, namespace: Namespace): js.Array[Element] = js.native
    
    def getContent(index: Integer): typings.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def getContentSize(): Integer = js.native
    
    def getDescendants(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getDocument(): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def getName(): String = js.native
    
    def getNamespace(): Namespace = js.native
    def getNamespace(prefix: String): Namespace = js.native
    
    def getQualifiedName(): String = js.native
    
    def getText(): String = js.native
    
    def isAncestorOf(other: Element): Boolean = js.native
    
    def isRootElement(): Boolean = js.native
    
    def removeAttribute(attributeName: String): Boolean = js.native
    def removeAttribute(attributeName: String, namespace: Namespace): Boolean = js.native
    def removeAttribute(attribute: Attribute): Boolean = js.native
    
    def removeContent(): js.Array[typings.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    def removeContent(content: typings.googleAppsScript.GoogleAppsScript.XMLService.Content): Boolean = js.native
    def removeContent(index: Integer): typings.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def setAttribute(attribute: Attribute): Element = js.native
    def setAttribute(name: String, value: String): Element = js.native
    def setAttribute(name: String, value: String, namespace: Namespace): Element = js.native
    
    def setName(name: String): Element = js.native
    
    def setNamespace(namespace: Namespace): Element = js.native
    
    def setText(text: String): Element = js.native
  }
  
  /**
    * A representation of an XML EntityReference node.
    */
  trait EntityRef
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getName(): String
    
    def getPublicId(): String
    
    def getSystemId(): String
    
    def setName(name: String): EntityRef
    
    def setPublicId(id: String): EntityRef
    
    def setSystemId(id: String): EntityRef
  }
  object EntityRef {
    
    inline def apply(
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getName: () => String,
      getParentElement: () => Element,
      getPublicId: () => String,
      getSystemId: () => String,
      getType: () => ContentType,
      getValue: () => String,
      setName: String => EntityRef,
      setPublicId: String => EntityRef,
      setSystemId: String => EntityRef
    ): EntityRef = {
      val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getName = js.Any.fromFunction0(getName), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
      __obj.asInstanceOf[EntityRef]
    }
    
    extension [Self <: EntityRef](x: Self) {
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetPublicId(value: () => String): Self = StObject.set(x, "getPublicId", js.Any.fromFunction0(value))
      
      inline def setGetSystemId(value: () => String): Self = StObject.set(x, "getSystemId", js.Any.fromFunction0(value))
      
      inline def setSetName(value: String => EntityRef): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetPublicId(value: String => EntityRef): Self = StObject.set(x, "setPublicId", js.Any.fromFunction1(value))
      
      inline def setSetSystemId(value: String => EntityRef): Self = StObject.set(x, "setSystemId", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A formatter for outputting an XML document, with three pre-defined formats that can be further
    * customized.
    *
    *     // Log an XML document with specified formatting options.
    *     var xml = '<root><a><b>Text!</b><b>More text!</b></a></root>';
    *     var document = XmlService.parse(xml);
    *     var output = XmlService.getCompactFormat()
    *         .setLineSeparator('\n')
    *         .setEncoding('UTF-8')
    *         .setIndent('   ')
    *         .format(document);
    *     Logger.log(output);
    */
  @js.native
  trait Format extends StObject {
    
    def format(document: typings.googleAppsScript.GoogleAppsScript.XMLService.Document): String = js.native
    def format(element: Element): String = js.native
    
    def setEncoding(encoding: String): Format = js.native
    
    def setIndent(indent: String): Format = js.native
    
    def setLineSeparator(separator: String): Format = js.native
    
    def setOmitDeclaration(omitDeclaration: Boolean): Format = js.native
    
    def setOmitEncoding(omitEncoding: Boolean): Format = js.native
  }
  
  /**
    * A representation of an XML namespace.
    */
  trait Namespace extends StObject {
    
    def getPrefix(): String
    
    def getURI(): String
  }
  object Namespace {
    
    inline def apply(getPrefix: () => String, getURI: () => String): Namespace = {
      val __obj = js.Dynamic.literal(getPrefix = js.Any.fromFunction0(getPrefix), getURI = js.Any.fromFunction0(getURI))
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setGetPrefix(value: () => String): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      inline def setGetURI(value: () => String): Self = StObject.set(x, "getURI", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A representation of an XML ProcessingInstruction node.
    */
  trait ProcessingInstruction
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getData(): String
    
    def getTarget(): String
  }
  object ProcessingInstruction {
    
    inline def apply(
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getData: () => String,
      getParentElement: () => Element,
      getTarget: () => String,
      getType: () => ContentType,
      getValue: () => String
    ): ProcessingInstruction = {
      val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getData = js.Any.fromFunction0(getData), getParentElement = js.Any.fromFunction0(getParentElement), getTarget = js.Any.fromFunction0(getTarget), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[ProcessingInstruction]
    }
    
    extension [Self <: ProcessingInstruction](x: Self) {
      
      inline def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetTarget(value: () => String): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A representation of an XML Text node.
    */
  trait Text
    extends StObject
       with typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def append(text: String): Text
    
    def getText(): String
    
    def setText(text: String): Text
  }
  object Text {
    
    inline def apply(
      append: String => Text,
      asCdata: () => Cdata,
      asComment: () => Comment,
      asDocType: () => DocType,
      asElement: () => Element,
      asEntityRef: () => EntityRef,
      asProcessingInstruction: () => ProcessingInstruction,
      asText: () => Text,
      detach: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content,
      getParentElement: () => Element,
      getText: () => String,
      getType: () => ContentType,
      getValue: () => String,
      setText: String => Text
    ): Text = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setAppend(value: String => Text): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setSetText(value: String => Text): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * This service allows scripts to parse, navigate, and programmatically create XML documents.
    *
    *     // Log the title and labels for the first page of blog posts on the G Suite Developer blog.
    *     function parseXml() {
    *       var url = 'https://gsuite-developers.googleblog.com/atom.xml';
    *       var xml = UrlFetchApp.fetch(url).getContentText();
    *       var document = XmlService.parse(xml);
    *       var root = document.getRootElement();
    *       var atom = XmlService.getNamespace('http://www.w3.org/2005/Atom');
    *
    *       var entries = root.getChildren('entry', atom);
    *       for (var i = 0; i < entries.length; i++) {
    *         var title = entries[i].getChild('title', atom).getText();
    *         var categoryElements = entries[i].getChildren('category', atom);
    *         var labels = [];
    *         for (var j = 0; j < categoryElements.length; j++) {
    *           labels.push(categoryElements[j].getAttribute('term').getValue());
    *         }
    *         Logger.log('%s (%s)', title, labels.join(', '));
    *       }
    *     }
    *
    *     // Create and log an XML representation of the threads in your Gmail inbox.
    *     function createXml() {
    *       var root = XmlService.createElement('threads');
    *       var threads = GmailApp.getInboxThreads();
    *       for (var i = 0; i < threads.length; i++) {
    *         var child = XmlService.createElement('thread')
    *             .setAttribute('messageCount', threads[i].getMessageCount())
    *             .setAttribute('isUnread', threads[i].isUnread())
    *             .setText(threads[i].getFirstMessageSubject());
    *         root.addContent(child);
    *       }
    *       var document = XmlService.createDocument(root);
    *       var xml = XmlService.getPrettyFormat().format(document);
    *       Logger.log(xml);
    *     }
    */
  @js.native
  trait XmlService extends StObject {
    
    var ContentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any = js.native
    
    def createCdata(text: String): Cdata = js.native
    
    def createComment(text: String): Comment = js.native
    
    def createDocType(elementName: String): DocType = js.native
    def createDocType(elementName: String, publicId: String, systemId: String): DocType = js.native
    def createDocType(elementName: String, systemId: String): DocType = js.native
    
    def createDocument(): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    def createDocument(rootElement: Element): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def createElement(name: String): Element = js.native
    def createElement(name: String, namespace: Namespace): Element = js.native
    
    def createText(text: String): Text = js.native
    
    def getCompactFormat(): Format = js.native
    
    def getNamespace(prefix: String, uri: String): Namespace = js.native
    def getNamespace(uri: String): Namespace = js.native
    
    def getNoNamespace(): Namespace = js.native
    
    def getPrettyFormat(): Format = js.native
    
    def getRawFormat(): Format = js.native
    
    def getXmlNamespace(): Namespace = js.native
    
    def parse(xml: String): typings.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
  }
}
