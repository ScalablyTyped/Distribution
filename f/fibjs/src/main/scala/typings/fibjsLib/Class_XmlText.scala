package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_XmlText")
@js.native
class Class_XmlText () extends Class_XmlCharacterData {
  /**
  	 * 
  	 * @brief 按照指定的 offset 把文本节点分割为两个节点
  	 * 
  	 * 该方法将在指定的 offset 处把 XmlText 节点分割成两个节点。原始的 XmlText 节点将被修改，使它包含 offset 指定的位置之前的文本内容（但不包括文本内容）。新的 XmlText 节点将被创建，用于存放从 offset 位置（包括该位置上的字符）到原字符结尾的所有字符。新的 XmlText 节点是该方法的返回值。此外，如果原始的 XmlText 节点具有 parentNode，新的 XmlText 节点将插入这个父节点，紧邻在原始节点之后。
  	 * 
  	 * XmlCDATASection 接口继承了 XmlText 接口， XmlCDATASection 节点也可以使用该方法 ，只是新创建的节点是 XmlCDATASection 节点，而不是 XmlText 节点。
  	 * @param offset 规定在何处分割文本节点。开始值以 0 开始
  	 * @return 从当前节点分割出的 Text 节点
  	 * 
  	 * 
  	 * 
  	 */
  def splitText(offset: scala.Double): Class_XmlText = js.native
}

