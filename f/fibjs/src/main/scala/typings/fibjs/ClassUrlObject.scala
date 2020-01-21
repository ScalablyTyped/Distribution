package typings.fibjs

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
class ClassUrlObject () extends ClassObject {
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
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的完整验证字符串，由 username 和 password 属性组装而成
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var auth: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的请求锚点（含“\#”）
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var hash: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的完整主机描述，由 hastname 和 port 组装而成
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var host: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的主机名
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var hostname: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的完整 url 地址描述，此描述由其他所有属性组装而成
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var href: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的验证密码
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var password: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的请求完整路径（含请求），由 pathname 和 query 组装而成
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var path: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的路径
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var pathname: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的端口号
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var port: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的协议名称
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var protocol: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的请求字符串（ 不含“?”）
  	 *
  	 *
  	 *
  	 * @type Value
  	 */
  var query: js.Any = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的请求字符串（含“?”），等效于“?”+query
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var search: String = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象是否包含双斜杠
  	 *
  	 *
  	 *
  	 * @type Boolean
  	 */
  var slashes: Boolean = js.native
  /**
  	 * class prop
  	 *
  	 *
  	 * @brief 查询和设置当前 UrlObject 对象中的验证用户
  	 *
  	 *
  	 *
  	 * @type String
  	 */
  var username: String = js.native
  /**
  	 *
  	 * @brief 使用指定的参数构造 UrlObject
  	 * @param args 指定构造参数的字典对象，支持的字段有：protocol, slashes, username, password, hostname, port, pathname, query, hash
  	 *
  	 *
  	 *
  	 */
  def format(args: js.Object): Unit = js.native
  /**
  	 *
  	 * @brief 标准化路径
  	 *
  	 *
  	 *
  	 */
  def normalize(): Unit = js.native
  /**
  	 *
  	 * @brief 解析一个 url 字符串
  	 * @param url 指定需要解析的 url 字符串
  	 * @param parseQueryString 指定是否解析 query
  	 * @param slashesDenoteHost  默认为false, 如果设置为true，则从字符串'//'之后到下一个'/'之前的字符串会被解析为host，例如'//foo/bar', 结果应该是{host: 'foo', pathname: '/bar'}而不是{pathname: '//foo/bar'}
  	 *
  	 *
  	 *
  	 */
  def parse(url: String): Unit = js.native
  def parse(url: String, parseQueryString: Boolean): Unit = js.native
  def parse(url: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Unit = js.native
  /**
  	 *
  	 * @brief 重定位 url 路径，自动识别新路径为相对路径还是绝对路径
  	 * @param url 指定新的路径
  	 * @return 返回包含重定位数据的对象
  	 *
  	 *
  	 *
  	 */
  def resolve(url: String): ClassUrlObject = js.native
}

