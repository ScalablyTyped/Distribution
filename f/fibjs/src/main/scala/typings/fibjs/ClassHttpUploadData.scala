package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 包含 multipart 的一个条目数据
  * @detail
  */
@js.native
trait ClassHttpUploadData
  extends StObject
     with ClassObject {
  
  /**
    * class prop
    *
    *
    * @brief 包含本条目数据部分的流对象
    *
    * @readonly
    * @type SeekableStream
    */
  var body: ClassSeekableStream = js.native
  
  /**
    * class prop
    *
    *
    * @brief 包含本条目数据的传输编码类型
    *
    * @readonly
    *
    */
  var contentTransferEncoding: String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 包含本条目数据的类型
    *
    * @readonly
    *
    */
  var contentType: String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 包含本条目数据的文件名
    *
    * @readonly
    *
    */
  var fileName: String = js.native
}
