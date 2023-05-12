package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassXmlDocument
  extends StObject
     with ClassXmlNode {
  
  /**
    * class prop
    *
    *
    * @brief 返回 HTML 文档的 body 节点，仅在 html 模式有效
    *
    *
    * @readonly
    * @type XmlElement
    */
  var body: ClassXmlElement = js.native
  
  /**
    *
    * @brief 创建 XmlCDATASection 节点
    * @param data 指定此节点规定 CDATA 数据
    * @return 返回新创建的 XmlCDATASection 节点，内容为指定的 data
    *
    *
    *
    */
  def createCDATASection(data: String): ClassXmlCDATASection = js.native
  
  /**
    *
    * @brief 创建注释节点
    * @param data 指定此节点的注释文本
    * @return 返回新创建的 XmlComment 节点，注释文本为指定的 data
    *
    *
    *
    */
  def createComment(data: String): ClassXmlComment = js.native
  
  /**
    *
    * @brief 创建元素节点
    * @param tagName 指定元素节点规定名称
    * @return 返回新创建的 XmlElement 节点，具有指定的标签名
    *
    *
    *
    */
  def createElement(tagName: String): ClassXmlElement = js.native
  
  /**
    *
    * @brief 创建带有指定命名空间的元素节点
    * @param namespaceURI 指定元素节点命名空间 URI
    * @param qualifiedName 指定元素节点规定名称
    * @return 返回新创建的 XmlElement 节点，具有指定的标签名
    *
    *
    *
    */
  def createElementNS(namespaceURI: String, qualifiedName: String): ClassXmlElement = js.native
  
  /**
    *
    * @brief 创建 XmlProcessingInstruction 节点
    * @param target 指定处理指令的目标
    * @param data 指定处理指令的内容文本
    * @return 新创建的 ProcessingInstruction 节点
    *
    *
    *
    */
  def createProcessingInstruction(target: String, data: String): ClassXmlProcessingInstruction = js.native
  
  /**
    *
    * @brief 创建文本节点
    * @param data 指定此节点的文本
    * @return 返回新创建的 XmlText 节点，表示指定的 data 字符串
    *
    *
    *
    */
  def createTextNode(data: String): ClassXmlText = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回与文档相关的文档类型声明（Document Type Declaration）
    *
    * 对于没有 DTD 的 XML 文档，则返回 null。此属性可提供对 XmlDocumentType 对象（ XmlDocument 的一个子节点）的直接访问。
    *
    *
    * @readonly
    * @type XmlDocumentType
    */
  var doctype: ClassXmlDocumentType = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回文档的根节点
    *
    *
    * @readonly
    * @type XmlElement
    */
  var documentElement: ClassXmlElement = js.native
  
  /**
    *
    * @brief 返回拥有指定 id 属性的元素
    *
    * 该方法将遍历文档的子孙节点，返回一个 XmlElement 节点对象，表示第一个具有指定 id 属性的文档元素。。
    * @param id 需检索的 id
    * @return 节点树中具有指定 id 属性的 XmlElement 节点
    *
    *
    *
    */
  def getElementById(id: String): ClassXmlElement = js.native
  
  /**
    *
    * @brief 返回带有指定 class 名称的所有元素的一个节点列表
    *
    * 该方法将返回一个 XmlNodeList 对象（可以作为只读数组处理），该对象存放文档中具有指定 class 名的所有 XmlElement 节点，它们存放的顺序就是在源文档中出现的顺序。 XmlNodeList 对象是“活”的，即如果在文档中添加或删除了指定标签名的元素，它的内容会自动进行必要的更新。
    * @param className 需检索的 class 名称
    * @return 文档树中具有指定 class 名的 XmlElement 节点的 XmlNodeList 集合。返回的元素节点的顺序就是它们在源文档中出现的顺序。
    *
    *
    *
    */
  def getElementsByClassName(className: String): ClassXmlNodeList = js.native
  
  /**
    *
    * @brief 返回带有指定名称的所有元素的一个节点列表
    *
    * 该方法将返回一个 XmlNodeList 对象（可以作为只读数组处理），该对象存放文档中具有指定标签名的所有 XmlElement 节点，它们存放的顺序就是在源文档中出现的顺序。 XmlNodeList 对象是“活”的，即如果在文档中添加或删除了指定标签名的元素，它的内容会自动进行必要的更新。
    * @param tagName 需检索的标签名。值 "*" 匹配所有的标签
    * @return 文档树中具有指定标记的 XmlElement 节点的 XmlNodeList 集合。返回的元素节点的顺序就是它们在源文档中出现的顺序。
    *
    *
    *
    */
  def getElementsByTagName(tagName: String): ClassXmlNodeList = js.native
  
  /**
    *
    * @brief 返回带有指定命名空间和名称的所有元素的一个节点列表
    *
    * 该方法与 getElementsByTagName() 方法相似，只是它根据命名空间和名称来检索元素。
    * @param namespaceURI 指定检索的命名空间 URI。值 "*" 可匹配所有的标签
    * @param localName 需检索的标签名。值 "*" 匹配所有的标签
    * @return 文档树中具有指定标记的 XmlElement 节点的 XmlNodeList 集合。返回的元素节点的顺序就是它们在源文档中出现的顺序。
    *
    *
    *
    */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): ClassXmlNodeList = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回 HTML 文档的 head 节点，仅在 html 模式有效
    *
    *
    * @readonly
    * @type XmlElement
    */
  var head: ClassXmlElement = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回用于文档的编码（在解析时）
    *
    *
    * @readonly
    *
    */
  var inputEncoding: String = js.native
  
  /**
    *
    * @brief 通过解析一个 XML/HTML 字符串来组成该文档，不支持多语种
    * @param source 要解析的 XML/HTML 文本，取决于文档创建时的类型
    *
    *
    *
    */
  def load(source: String): Unit = js.native
  /**
    *
    * @brief 通过解析一个二进制 XML/HTML 字符串来组成该文档，并根据语种自动转换
    * @param source 要解析的 XML/HTML 文本，取决于文档创建时的类型
    *
    *
    *
    */
  def load(source: ClassBuffer): Unit = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回 HTML 文档的 title 节点的内容，仅在 html 模式有效
    *
    *
    * @readonly
    *
    */
  var title: String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 设置或返回文档是否为 standalone
    *
    *
    *
    * @type Boolean
    */
  var xmlStandalone: Boolean = js.native
  
  /**
    * class prop
    *
    *
    * @brief 设置或返回文档的 XML 版本
    *
    *
    *
    *
    */
  var xmlVersion: String = js.native
}
