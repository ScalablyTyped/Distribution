package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    sealed trait CDATA extends ContentType
    
    @js.native
    sealed trait COMMENT extends ContentType
    
    @js.native
    sealed trait DOCTYPE extends ContentType
    
    @js.native
    sealed trait ELEMENT extends ContentType
    
    @js.native
    sealed trait ENTITYREF extends ContentType
    
    @js.native
    sealed trait PROCESSINGINSTRUCTION extends ContentType
    
    @js.native
    sealed trait TEXT extends ContentType
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
  @js.native
  trait Attribute extends StObject {
    
    def getName(): String = js.native
    
    def getNamespace(): Namespace = js.native
    
    def getValue(): String = js.native
    
    def setName(name: String): Attribute = js.native
    
    def setNamespace(namespace: Namespace): Attribute = js.native
    
    def setValue(value: String): Attribute = js.native
  }
  object Attribute {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNamespace(value: () => Namespace): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetName(value: String => Attribute): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNamespace(value: Namespace => Attribute): Self = StObject.set(x, "setNamespace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValue(value: String => Attribute): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
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
  @js.native
  trait Cdata
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def append(text: String): Text = js.native
    
    def getText(): String = js.native
    
    def setText(text: String): Text = js.native
  }
  object Cdata {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CdataMutableBuilder[Self <: Cdata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: String => Text): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetText(value: String => Text): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML Comment node.
    */
  @js.native
  trait Comment
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getText(): String = js.native
    
    def setText(text: String): Comment = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetText(value: String => Comment): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
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
  @js.native
  trait Content extends StObject {
    
    def asCdata(): Cdata = js.native
    
    def asComment(): Comment = js.native
    
    def asDocType(): DocType = js.native
    
    def asElement(): Element = js.native
    
    def asEntityRef(): EntityRef = js.native
    
    def asProcessingInstruction(): ProcessingInstruction = js.native
    
    def asText(): Text = js.native
    
    def detach(): typings.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def getParentElement(): Element = js.native
    
    def getType(): ContentType = js.native
    
    def getValue(): String = js.native
  }
  object Content {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.XMLService.Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsCdata(value: () => Cdata): Self = StObject.set(x, "asCdata", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsComment(value: () => Comment): Self = StObject.set(x, "asComment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsDocType(value: () => DocType): Self = StObject.set(x, "asDocType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsElement(value: () => Element): Self = StObject.set(x, "asElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsEntityRef(value: () => EntityRef): Self = StObject.set(x, "asEntityRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsProcessingInstruction(value: () => ProcessingInstruction): Self = StObject.set(x, "asProcessingInstruction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsText(value: () => Text): Self = StObject.set(x, "asText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetach(value: () => typings.googleAppsScript.GoogleAppsScript.XMLService.Content): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentElement(value: () => Element): Self = StObject.set(x, "getParentElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => ContentType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A representation of an XML DocumentType node.
    */
  @js.native
  trait DocType
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getElementName(): String = js.native
    
    def getInternalSubset(): String = js.native
    
    def getPublicId(): String = js.native
    
    def getSystemId(): String = js.native
    
    def setElementName(name: String): DocType = js.native
    
    def setInternalSubset(data: String): DocType = js.native
    
    def setPublicId(id: String): DocType = js.native
    
    def setSystemId(id: String): DocType = js.native
  }
  object DocType {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DocTypeMutableBuilder[Self <: DocType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetElementName(value: () => String): Self = StObject.set(x, "getElementName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInternalSubset(value: () => String): Self = StObject.set(x, "getInternalSubset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPublicId(value: () => String): Self = StObject.set(x, "getPublicId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSystemId(value: () => String): Self = StObject.set(x, "getSystemId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetElementName(value: String => DocType): Self = StObject.set(x, "setElementName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetInternalSubset(value: String => DocType): Self = StObject.set(x, "setInternalSubset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPublicId(value: String => DocType): Self = StObject.set(x, "setPublicId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSystemId(value: String => DocType): Self = StObject.set(x, "setSystemId", js.Any.fromFunction1(value))
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
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
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
  @js.native
  trait EntityRef
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getName(): String = js.native
    
    def getPublicId(): String = js.native
    
    def getSystemId(): String = js.native
    
    def setName(name: String): EntityRef = js.native
    
    def setPublicId(id: String): EntityRef = js.native
    
    def setSystemId(id: String): EntityRef = js.native
  }
  object EntityRef {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EntityRefMutableBuilder[Self <: EntityRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPublicId(value: () => String): Self = StObject.set(x, "getPublicId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSystemId(value: () => String): Self = StObject.set(x, "getSystemId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetName(value: String => EntityRef): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPublicId(value: String => EntityRef): Self = StObject.set(x, "setPublicId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSystemId(value: String => EntityRef): Self = StObject.set(x, "setSystemId", js.Any.fromFunction1(value))
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
  @js.native
  trait Namespace extends StObject {
    
    def getPrefix(): String = js.native
    
    def getURI(): String = js.native
  }
  object Namespace {
    
    @scala.inline
    def apply(getPrefix: () => String, getURI: () => String): Namespace = {
      val __obj = js.Dynamic.literal(getPrefix = js.Any.fromFunction0(getPrefix), getURI = js.Any.fromFunction0(getURI))
      __obj.asInstanceOf[Namespace]
    }
    
    @scala.inline
    implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPrefix(value: () => String): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetURI(value: () => String): Self = StObject.set(x, "getURI", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A representation of an XML ProcessingInstruction node.
    */
  @js.native
  trait ProcessingInstruction
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getData(): String = js.native
    
    def getTarget(): String = js.native
  }
  object ProcessingInstruction {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ProcessingInstructionMutableBuilder[Self <: ProcessingInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetData(value: () => String): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTarget(value: () => String): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A representation of an XML Text node.
    */
  @js.native
  trait Text
    extends typings.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def append(text: String): Text = js.native
    
    def getText(): String = js.native
    
    def setText(text: String): Text = js.native
  }
  object Text {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: String => Text): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetText(value: String => Text): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
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
