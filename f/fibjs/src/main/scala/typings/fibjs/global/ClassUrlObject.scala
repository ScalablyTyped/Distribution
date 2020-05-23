package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief Url 处理对象
  * @detail 基础模块。提供 url 的格式化，解析与拼装,```JavaScript,var url = new net.Url('http://www.xici.net/');,var url = new net.Url({protocol: 'http:', hostname:'www.xici.net', pathname:'/'});,```
  */
@JSGlobal("Class_UrlObject")
@js.native
/**
  *
  * @brief UrlObject 对象构造函数，使用 url 字符串构造
  * @param url 指定构造 url 字符串
  * @param parseQueryString 指定是否解析 query
  * @param slashesDenoteHost  默认为false, 如果设置为true，则从字符串'//'之后到下一个'/'之前的字符串会被解析为host，例如'//foo/bar', 结果应该是{host: 'foo', pathname: '/bar'}而不是{pathname: '//foo/bar'}
  *
  *
  *
  */
class ClassUrlObject ()
  extends typings.fibjs.ClassUrlObject {
  /**
    *
    * @brief UrlObject 对象构造函数，使用参数构造
    * @param args 指定构造参数的字典对象，支持的字段有：protocol, slashes, username, password, hostname, port, pathname, query, hash
    *
    *
    *
    */
  def this(args: js.Object) = this()
  def this(url: String) = this()
  def this(url: String, parseQueryString: Boolean) = this()
  def this(url: String, parseQueryString: Boolean, slashesDenoteHost: Boolean) = this()
}

