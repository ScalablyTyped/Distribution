package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 包含 multipart 的一个条目数据
	* @detail 
	*/
@JSGlobal("Class_HttpUploadData")
@js.native
class Class_HttpUploadData () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 包含本条目数据部分的流对象
  	 * 
  	 * @readonly
  	 * @type SeekableStream
  	 */
  var body: Class_SeekableStream = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 包含本条目数据的传输编码类型
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var contentTransferEncoding: String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 包含本条目数据的类型
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var contentType: String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 包含本条目数据的文件名
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var fileName: String = js.native
}

