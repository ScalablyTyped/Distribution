package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief zip 文件访问对象
	* @detail 
	*/

@JSGlobal("Class_ZipFile")
@js.native
class Class_ZipFile () extends Class__object {
  /**
  	 * 
  	 * @brief 关闭打开的zip文件
  	 * 
  	 * @async
  	 */
  def close(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 解压指定文件
  	 * @param member 指定要解压的文件名
  	 * @param path 指定要解压到的路径
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def extract(member: java.lang.String, path: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 解压指定文件
  	 * @param member 指定要解压的文件名
  	 * @param path 指定要解压到的路径
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def extract(member: java.lang.String, path: java.lang.String, password: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 解压指定文件到流
  	 * @param member 指定要解压的文件名
  	 * @param strm 指定要解压到的流
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def extract(member: java.lang.String, strm: Class_SeekableStream): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 解压指定文件到流
  	 * @param member 指定要解压的文件名
  	 * @param strm 指定要解压到的流
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def extract(member: java.lang.String, strm: Class_SeekableStream, password: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 解压所有文件到指定路径
  	 * @param path 指定要解压到的路径
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def extractAll(path: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 解压所有文件到指定路径
  	 * @param path 指定要解压到的路径
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def extractAll(path: java.lang.String, password: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 获取文件信息
  	 * 文件信息包含字段有：filename, date, compress_type, compress_size, file_size, password, data
  	 * @param member 指定要获取信息的文件名
  	 * @return 返回文件信息对象
  	 * 
  	 * 
  	 * @async
  	 */
  def getinfo(member: java.lang.String): js.Any = js.native
  /**
  	 * 
  	 * @brief 获取文件信息列表
  	 * 文件信息包含字段有：filename, date, compress_type, compress_size, file_size, password, data
  	 * @return 返回包含文件信息的列表对象
  	 * 
  	 * 
  	 * @async
  	 */
  def infolist(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 获取文件名列表
  	 * @return 返回包含文件名的列表对象
  	 * 
  	 * 
  	 * @async
  	 */
  def namelist(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 返回从压缩文件读取的数据
  	 * @param member 指定要读取的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * @return 返回文件的所有数据
  	 * 
  	 * 
  	 * @async
  	 */
  def read(member: java.lang.String): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 返回从压缩文件读取的数据
  	 * @param member 指定要读取的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * @return 返回文件的所有数据
  	 * 
  	 * 
  	 * @async
  	 */
  def read(member: java.lang.String, password: java.lang.String): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 解压所有文件
  	 * @param password 解压密码, 默认没有密码
  	 * @return 包含所有文件数据及信息的列表
  	 * 
  	 * 
  	 * @async
  	 */
  def readAll(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 解压所有文件
  	 * @param password 解压密码, 默认没有密码
  	 * @return 包含所有文件数据及信息的列表
  	 * 
  	 * 
  	 * @async
  	 */
  def readAll(password: java.lang.String): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 写入指定文件到压缩文件
  	 * @param data 指定要写入的文件数据
  	 * @param inZipName 压缩在zip文件内的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def write(data: Class_Buffer, inZipName: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 写入指定文件到压缩文件
  	 * @param data 指定要写入的文件数据
  	 * @param inZipName 压缩在zip文件内的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def write(data: Class_Buffer, inZipName: java.lang.String, password: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 写入指定文件到压缩文件
  	 * @param filename 指定要写入的文件
  	 * @param inZipName 压缩在zip文件内的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def write(filename: java.lang.String, inZipName: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 写入指定文件到压缩文件
  	 * @param filename 指定要写入的文件
  	 * @param inZipName 压缩在zip文件内的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def write(filename: java.lang.String, inZipName: java.lang.String, password: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 写入指定文件到压缩文件
  	 * @param strm 指定要写入文件数据流
  	 * @param inZipName 压缩在zip文件内的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def write(strm: Class_SeekableStream, inZipName: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 写入指定文件到压缩文件
  	 * @param strm 指定要写入文件数据流
  	 * @param inZipName 压缩在zip文件内的文件名
  	 * @param password 解压密码, 默认没有密码
  	 * 
  	 * 
  	 * @async
  	 */
  def write(strm: Class_SeekableStream, inZipName: java.lang.String, password: java.lang.String): scala.Unit = js.native
}

